package com.goxda.check.check.security.impl;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import com.goxda.check.check.security.ISecurityCheck;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * 归档信息包病毒检测,归档载体安全性检测,归档过程安全性检测
 * @author zgq
 * createTime 2020-10-27
 */
@Slf4j
@Service
public class SecurityCheck implements ISecurityCheck {
    @Value("${godox.360sd}")
    private String sd;
    @Value("${godox.360log}")
    private String logF;
    /**
     * 归档信息包病毒检测
     * @return 是否通过
     */
    @Override
    public Map<String,String> virusOfArchivePackageDetection(String filepath) {
        Map<String,String> map = new HashMap<>();
        BufferedReader br = null;
        BufferedReader brError =null;
        try {
            File f = new File(filepath);
            //执行exe  cmd可以为字符串(exe存放路径)也可为数组，调用exe时需要传入参数时，可以传数组调用(参数有顺序要求)
            Process p = Runtime.getRuntime().exec(new String[]{sd,filepath});
            String line = null;
            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            brError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            while ((line = br.readLine()) != null  || (line = brError.readLine()) != null) {
                //输出exe输出的信息以及错误信息
                log.error(line);
                map.put("归档信息包病毒检测",line);
            }
            File file = new File(logF);
            List<String> ff = new ArrayList<>();
            while (true){
                String da =LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmm"));
                boolean  b = false;
                String [] fs = file.list();
                for (String s : fs) {
                    if (s.indexOf(da)==0){
                        ff.add(s) ;
                        b=true;
                        break;
                    }
                }
                if (b){
                    break;
                }
                Thread.sleep(1000);
            }
            for (String s : ff) {
                String log = logF+ File.separator+s;
                if (ansiRead(log).contains(f.getName())){
                    String content = ansiRead(log);
                    int i = content.indexOf("扫描内容");
                    String str = content.substring(i);
                    str = str.replaceAll("-","").replaceAll("\n"," ").replaceAll("=","").replace("白名单设置",";");
                    StringBuilder sb = new StringBuilder(str);
                    sb.insert(4,":");
                    sb.insert(sb.indexOf("扫描结果")+4,":");
                    if (!sb.toString().contains("未发现威胁文件")){
                        map.put("归档信息包病毒检测",sb.substring(sb.indexOf("扫描结果:")));
                    }
                }
            }

        } catch (Exception e) {
            log.error(e.getMessage());
            map.put("归档信息包病毒检测",e.toString());
            return map;
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    log.error(e.getMessage());
                    map.put("归档信息包病毒检测",e.toString());
                }
            }
        }
        return map;
    }
    private static String ansiRead(String file) throws IOException {
        File f = new File(file);
        InputStreamReader read = new InputStreamReader(new FileInputStream(f),
                "GBK");
        BufferedReader reader = new BufferedReader(read);
        String line;
        StringBuilder s = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            s.append(line).append("\n");
        }
        return s.toString();
    }
    /**
     * 归档载体安全性检测
     * @return 是否通过
     */
    @Override
    public boolean vectorSecurityDetection() {
        return false;
    }

    /**
     * 归档过程安全性检测
     * @return 是否通过
     */
    @Override
    public boolean processSecurityDetection() {
        return false;
    }
}
