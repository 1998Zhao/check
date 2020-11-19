package com.goxda.check.util;

import cn.hutool.Hutool;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.HashUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import com.alibaba.druid.util.Base64;
import com.goxda.check.metadate.IMetadata;
import lombok.extern.slf4j.Slf4j;



import java.io.File;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.List;

@Slf4j
public class Utils {
    private Utils() {
    }

    public static String getMethodName(String name){
        String[] strs = name.split(" ");
        StringBuilder res = new StringBuilder("get");
        for (String str : strs) {
            str = StrUtil.upperFirst(str);
            res.append(str);
        }
        return res.toString();
    }
    /**
     * 根据文件绝对地址返回该文件的base64编码
     * @param aFilePath 文件绝对路径
     * @return
     */
    public static String getBase64str(String aFilePath) {
        String re = null;
        try {
            File file = new File(aFilePath);
            if (file.exists()) {
                re = Base64.byteArrayToBase64(FileUtil.readBytes(file));
            }
        } catch (Exception e) {
            log.error("read file to byte error", e);
        }
        return re;
    }
    public static void getFileByBase64(String base64,String filePath){
        try {
            byte[] bytes = Base64.base64ToByteArray(base64);
            FileUtil.writeBytes(bytes,filePath);
        } catch (Exception e) {
            log.error(e.toString());
        }
    }

    /**
     * 用于 用户获取密钥对 存于数据库
     * @param algorithm
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static String [] getKeyPair(String algorithm) throws NoSuchAlgorithmException {
        String [] keyPairStr = new String[2];
        // ----- 公私钥生成 --------
        // 实例化秘钥对生成器
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(algorithm);
        // 初始化，秘钥长度512~16384位，64倍数
        keyPairGenerator.initialize(512);
        // 生成秘钥对
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        // 公钥
        PublicKey publicKey = keyPair.getPublic();
        keyPairStr[0] = java.util.Base64.getEncoder().encodeToString(publicKey.getEncoded());
        System.out.println("RSA公钥: " + keyPairStr[0]);
        // 私钥
        PrivateKey privateKey = keyPair.getPrivate();
        keyPairStr[1] = java.util.Base64.getEncoder().encodeToString(privateKey.getEncoded());
        System.out.println("RSA私钥: " + java.util.Base64.getEncoder().encodeToString(privateKey.getEncoded()));
        return keyPairStr;
    }
    public static PublicKey getPublicKey(String publicKey) throws NoSuchAlgorithmException, InvalidKeySpecException {
        byte[] bytes = Base64.base64ToByteArray(publicKey);
        // 创建 已编码的公钥规格
        X509EncodedKeySpec encPubKeySpec = new X509EncodedKeySpec(bytes);

        // 获取指定算法的密钥工厂, 根据 已编码的公钥规格, 生成公钥对象
        return KeyFactory.getInstance("RSA").generatePublic(encPubKeySpec);
    }
    public static PrivateKey getPrivateKey(String k) throws NoSuchAlgorithmException, InvalidKeySpecException {
        byte[] bytes = Base64.base64ToByteArray(k);
        // 创建 已编码的私钥规格
        PKCS8EncodedKeySpec encPriKeySpec = new PKCS8EncodedKeySpec(bytes);
        // 获取指定算法的密钥工厂, 根据 已编码的私钥规格, 生成私钥对象
        return KeyFactory.getInstance("RSA").generatePrivate(encPriKeySpec);
    }
    /**
     * 数字签名算法 私钥加密 公钥解密
     * 签名
     * @param file file绝对路径
     * @param priKey 用户私钥
     * @return
     */
    public static String signByRsa(String value,String file, String priKey) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, InvalidKeySpecException {

        //对base64进行hash
        //value = String.valueOf(HashUtil.mixHash(value));
        value = SecureUtil.sha256(value);
        // 签名算法，RSA+SHA
        String signAlgorithm = "SHA256withRSA";

        // 私钥
        PrivateKey privateKey = getPrivateKey(priKey);
        // ----- 私钥加签 ---------
        // 获取签名对象
        Signature signature = Signature.getInstance(signAlgorithm);
        signature.initSign(privateKey);
        signature.update(value.getBytes());
        byte[] sign = signature.sign();
        String signValue = java.util.Base64.getEncoder().encodeToString(sign);
        System.out.println("签名值: " + java.util.Base64.getEncoder().encodeToString(sign));
        return signValue;
    }
    /**
     * 数字签名算法 验证
     *  文件决定路径 发送人公钥 签名值
     */
    public static boolean verify(String value,String file,String pubKey,String signatureV) throws InvalidKeySpecException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {

        // 非对称加密算法
        String algorithm = "RSA";
        //对base64进行hash
        value = SecureUtil.sha256(value);
        // 签名算法，RSA+SHA
        String signAlgorithm = "SHA256withRSA";
        // 私钥
        PublicKey publicKey = getPublicKey(pubKey);
        // ----- 私钥加签 ---------
        // 获取签名对象
        Signature signature = Signature.getInstance(signAlgorithm);
        // ----- 公钥验签 ---------
        signature.initVerify(publicKey);
        signature.update(value.getBytes());
        byte[] sign = Base64.base64ToByteArray(signatureV);
        boolean b = signature.verify(sign);
        System.out.println("验签结果: " + b);
        return b;
    }

    public static void main(String[] args) {

    }
}
