package com.goxda.check.util;

import cn.hutool.core.io.FileUtil;
import com.alibaba.druid.util.Base64;
import com.goxda.check.encapsulation.*;
import com.goxda.check.metadate.IMetadata;

import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author zgq
 */
public class EepPackageUtils {
    /**
     * 此处打包 可将归档的n个条目下的n个电子文件打包
     * @param folders 对应的条目id数组
     * @param type 类型
     * @throws IOException
     * @throws InvalidKeySpecException
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeyException
     * @throws SignatureException
     */
    public static void packageIt(String [] folders, List<IMetadata> metadata,String type) throws IOException, InvalidKeySpecException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        ElectronicDocumentsEncapsulationPackage pkg = new ElectronicDocumentsEncapsulationPackage();
        pkg.setVersion("2009");
        pkg.setFormatDescription("本EEP根据中华人民共和国档案行业标准DA/T 48-2009《基于XML的电子文件封装规范》生成");
        SignedObject so = new SignedObject();
        pkg.setSignedObject(so);
        ElectronicSignatureBlock block = new ElectronicSignatureBlock();
        pkg.setElectronicSignatureBlock(block);
        LockSignature lockSignature = new LockSignature();
        pkg.setLockSignature(lockSignature);
        so.setPackageCreator("中国人民银行福州中心支行");
        so.setPackageCreationTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-ddThh:mm:ss")));
        EncapsulationContent content;
        ModifiedEncapsulationContent mc;
        if ("原始型".equals(type)){
            so.setType(PackageEnum.PRIMITIVE);
            content = new EncapsulationContent();
            AgentEntityBlock aeb = new AgentEntityBlock();
            AgentEntity ae = new AgentEntity();
            ae.setAgentName("");
            aeb.setAgentEntity(ae);
            content.setAgentEntityBlock(aeb);

        }
        else {
            so.setType(PackageEnum.MODIFIED);
            mc = new ModifiedEncapsulationContent();

        }
        //此处模拟 文件夹获取
        //List<String> folders = getAllFolder("folder");
        List<String> files = new ArrayList<>();
        for (String s : folders) {
            files.addAll(getAllFiles(s));
        }
        List<Encoding> encodings = new ArrayList<>();
        String v;
        File f ;
        Encoding encoding ;
        encoding = new Encoding();
        ElectronicAttributes electronicAttributes;
        DigitizationAttributes digitizationAttributes;
        for (String file : files) {
            electronicAttributes = new ElectronicAttributes();
            digitizationAttributes = new DigitizationAttributes();
            f = new File(file);
            electronicAttributes.setComputerFileName(f.getName());
            electronicAttributes.setComputerFileSize(String.valueOf(f.length()));
            electronicAttributes.setFormatInformation(FileUtil.getType(f));
            encoding.setDigitizationAttributes(digitizationAttributes);
            encoding.setElectronicAttributes(electronicAttributes);
            //文档的Base64值
            v= Utils.getBase64str(file);
            encoding.setRenderingKeyword("关键字");
            encoding.setEncodingDescription("描述");
            encoding.setEncodingData(v);
            encodings.add(encoding);
        }


    }
    public static List<String> getAllFolder(String folder) throws IOException {
        File file = new File(folder);
        List<String>res = new ArrayList<>();
        if (file.exists()){
            File[] folders = file.listFiles();
            List<File> f = new ArrayList<>();
            if (folders!=null){
                f=Arrays.stream(folders).filter(File::isDirectory).collect(Collectors.toList());
            }
            for (File file1 : f) {
                if (FileUtil.isNotEmpty(file1)){
                    res.add(file1.getCanonicalPath());
                }
            }
        }
        return res;
    }
    public static List<String> getAllFiles(String folder) throws IOException {
        File file = new File(folder);
        List<String>res = new ArrayList<>();
        for (File listFile : Objects.requireNonNull(file.listFiles())) {
            res.add(listFile.getCanonicalPath());
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
