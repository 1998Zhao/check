package com.goxda.check.util;

import cn.hutool.core.io.FileUtil;
import com.alibaba.druid.util.Base64;
import com.goxda.check.encapsulation.DigitizationAttributes;
import com.goxda.check.encapsulation.ElectronicAttributes;
import com.goxda.check.encapsulation.Encoding;
import com.goxda.check.encapsulation.RecordData;

import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author zgq
 */
public class EepPackageUtils {
    public static void packageIt(String folder,String priK) throws IOException, InvalidKeySpecException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        List<String> folders = getAllFolder(folder);
        List<String> files = new ArrayList<>();
        for (String s : folders) {
            files.addAll(getAllFiles(s));
        }

        List<String> base = new ArrayList<>();
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
            base.add(v);
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
