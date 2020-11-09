package com.goxda.check.util;

import org.apache.commons.codec.binary.Base64;
import javax.crypto.Cipher;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

public class RSAEncrypt {
    /**
     * 用于封装随机产生的公钥与私钥
     */
    private static final Map<Integer, String> KEY_MAP = new HashMap<>();
    static {

    }
    public static void main(String[] args) throws Exception {
        //生成公钥和私钥
        genKeyPair();
        //加密字符串
        System.out.println("随机生成的公钥为:" + KEY_MAP.get(0));
        System.out.println("随机生成的私钥为:" + KEY_MAP.get(1));
        encrypt("D:\\aa","22.docx");
    }

    /**
     * 随机生成密钥对
     * @throws NoSuchAlgorithmException
     */
    public static void genKeyPair() throws NoSuchAlgorithmException {
        // KeyPairGenerator类用于生成公钥和私钥对，基于RSA算法生成对象
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
        // 初始化密钥对生成器，密钥大小为96-1024位
        keyPairGen.initialize(1024,new SecureRandom());
        // 生成一个密钥对，保存在keyPair中
        KeyPair keyPair = keyPairGen.generateKeyPair();
        // 得到私钥
        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
        // 得到公钥
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
        String publicKeyString = new String(Base64.encodeBase64(publicKey.getEncoded()));
        // 得到私钥字符串
        String privateKeyString = new String(Base64.encodeBase64((privateKey.getEncoded())));
        // 将公钥和私钥保存到Map
        //0表示公钥
        KEY_MAP.put(0,publicKeyString);
        //1表示私钥
        KEY_MAP.put(1,privateKeyString);
    }
    /**
     * RSA公钥加密
     * @throws Exception
     *             加密过程中的异常信息
     *
     */
    public static void encrypt( String folder,String filename ) throws Exception{
        //base64编码的私钥
        byte[] decoded = Base64.decodeBase64(KEY_MAP.get(1));
        Signature signature = Signature.getInstance("RSA");
        RSAPrivateKey priKey = (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(decoded));
        signature.initSign(priKey);
        FileInputStream fis = new FileInputStream(folder+"\\"+filename);
        BufferedInputStream bufin = new BufferedInputStream(fis);
        byte[] buffer = new byte[1024];
        int len;
        while ((len = bufin.read(buffer)) >= 0) {
            signature.update(buffer, 0, len);

        }
        bufin.close();
        byte[] realSig = signature.sign();
        byte[] publickey = priKey.getEncoded();
        //GUARDAR LA FIRMA Y LA CLAVE PUBLICA EN FICHEROS
        FileOutputStream fos = new FileOutputStream(folder+"\\"+"signature.obj");
        fos.write(realSig);
        fos.close();
        fos = new FileOutputStream(folder+"\\"+"publicKey.obj");
        fos.write(publickey);
        fos.close();
        //RSA加密
//        Cipher cipher = Cipher.getInstance("RSA");
//        cipher.init(Cipher.ENCRYPT_MODE, priKey);
//        return Base64.encodeBase64String(cipher.doFinal(str.getBytes(StandardCharsets.UTF_8)));
    }

    /**
     * RSA私钥解密
     *
     * @param str
     * @param
     * @return 铭文
     * @throws Exception
     *             解密过程中的异常信息
     */
    public static boolean decrypt(String str,String filename) throws Exception{
        //base64编码的私钥
        byte[] decoded = Base64.decodeBase64(KEY_MAP.get(0));
        RSAPublicKey pubKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decoded));
        FileInputStream keyfis = new FileInputStream(str+"\\"+"publicKey.obj");
        byte[] encKey = new byte[keyfis.available()];
        keyfis.read(encKey);
        keyfis.close();
        //Importar la firma en bytes
        FileInputStream sigfis = new FileInputStream(str+"\\signature.obj");
        byte[] sigToVerify = new byte[sigfis.available()];
        sigfis.read(sigToVerify);
        sigfis.close();
        //Crear objeto Signature e inicializarlo con la clave publica
        Signature signature = Signature.getInstance("RSA");
        RSAPrivateKey priKey = (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(decoded));
        signature.initSign(priKey);
        //Actualizar y verificar
        FileInputStream datafis = new FileInputStream(str+"\\"+filename);
        BufferedInputStream bufin = new BufferedInputStream(datafis);
        byte[] buffer = new byte[1024];
        int len;
        while (bufin.available() != 0) {
            len = bufin.read(buffer);
            signature.update(buffer, 0, len);
        };
        bufin.close();

        return signature.verify(sigToVerify);
    }

}