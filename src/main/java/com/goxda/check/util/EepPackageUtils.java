package com.goxda.check.util;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.StrUtil;
import com.alibaba.druid.util.Base64;
import com.goxda.check.encapsulation.*;
import com.goxda.check.metadate.IMetadata;
import org.apache.poi.ss.formula.functions.T;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
     */
    public static void packageIt(String [] folders, IMetadata m,String type) throws IOException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
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
        AgentEntityBlock aeb;
        AgentEntity agentEntity;
        AgentEntityRelation agentEntityRelation;
        RecordEntityBlock recordEntityBlock;
        BusinessEntityBlock businessEntityBlock;
        List<AgentEntity> agentEntities = new ArrayList<>();
        List<Object> objects = new ArrayList<>();
        if ("原始型".equals(type)){
            content = new EncapsulationContent();
            aeb = new AgentEntityBlock();
            agentEntity = new AgentEntity();
            agentEntityRelation = new AgentEntityRelation();
            aeb.setAgentEntity(agentEntities);
            recordEntityBlock = new RecordEntityBlock();
            businessEntityBlock = new BusinessEntityBlock();
            content.setBusinessEntityBlock(businessEntityBlock);
            content.setRecordEntityBlock(recordEntityBlock);
            content.setAgentEntityBlock(aeb);
        }
        else {
            so.setType(PackageEnum.MODIFIED);
            mc = new ModifiedEncapsulationContent();

        }
        so.setType(PackageEnum.PRIMITIVE);
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
    public static String getMetadataValue(IMetadata m,String key) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Field f = m.getClass().getField(key);
        return (String) f.get(m);
    }
    public static void setValue(IMetadata m, Object o ) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException, InstantiationException {
        Field[] fields = o.getClass().getDeclaredFields();
        String fieldName,v;
        Field[] f = m.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (ArrayUtil.contains(f,field.getName())){
                fieldName = field.getName();
                v = getMetadataValue(m,fieldName);
                field.set(o,v);
            }
            else {
                Class<?> type = field.getType();
                if (!type.equals(String.class)){
                    setValue(m,type.newInstance());
                }
            }
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
