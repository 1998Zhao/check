package com.goxda.check.check.integrity.impl;

import com.goxda.check.api.entity.Encodings;
import com.goxda.check.api.entity.inte.IMetadata;
import com.goxda.check.check.integrity.IIntegrityCheck;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.lang.reflect.Field;
import java.util.*;

/**
 * 电子文件数据总量检测 电子文件数据总量检测 电子文件内容完整性检测 归档信息包完整性检测
 * @author zgq
 * createTime 2020-10-27
 */
@Service
@Slf4j
public class IntegrityCheck implements IIntegrityCheck {
    IMetadata metadata;
    public static  <T> T getMetadataValue(IMetadata metadata ,String name) throws NoSuchFieldException, IllegalAccessException {
        Class<? extends IMetadata> clazz = metadata.getClass();
        Field field = clazz.getDeclaredField(name);
        return (T) field.get(metadata);
    }
    /**
     * 电子文件数据总量检测
     * 1.统计电子文件总件数，并和GB/T 18894-2016表A.1《电子文件归档登记表》中登记的归档电子文件数量比对
     * 2.统计电子文件总字节数，并和GB/T 18894-2016表A.1《电子文件归档登记表》中登记的归档电子文件总字节数比对
     * @return 是否通过
     */
    @Override
    public boolean electronicDocumentQuantityDetection() {
        return false;
    }
    public Map<String,String> checkEleFilesCount()  {
        Map<String,String> m  = new HashMap<>();
        String key = "电子文件数据总量检测";
        try{
            //获取文件夹 获取文件夹的文件数 再与数据库文件数对比
            List<Encodings> encodings = getMetadataValue(metadata,"encodings");
            if (encodings.isEmpty()){
                m.put(key,"文件数量为0");
            }
            else {
                String path = encodings.get(0).getComputerFileName();
                File file = new File(path);
                if (!file.exists()){
                    m.put(key,"文件不存在");
                }
                else {
                    if (Objects.requireNonNull(file.getParentFile().list()).length==encodings.size()){
                        return m;
                    }else {
                        m.put(key,"电子文件数量不匹配");
                    }
                }
            }
        }
        catch (Exception e){
            log.error(e.toString());
            m.put(key,"系统异常");
            return m;
        }
        return m;
    }
    public Map<String, String> checkEleFilesLength(){
        Map<String,String> m = new HashMap<>();
        String key = "电子文件大小总量检测";
        try{
            //获取文件夹 获取文件夹的文件数 再与数据库文件数对比
            List<Encodings> encodings = getMetadataValue(metadata,"encodings");
            if (encodings.isEmpty()){
                m.put(key,"文件数量为0");
            }
            else {
                long size = encodings.stream().mapToLong(en -> Long.parseLong(en.getComputerFileSize())).sum();
                String path = encodings.get(0).getComputerFileName();
                File file = new File(path);
                if (!file.exists()){
                    m.put(key,"文件不存在");
                    return m;
                }
                else {
                    if (Objects.requireNonNull(file.getParentFile()).length()==size){
                        return m;
                    }else {
                        m.put(key,"电子文件大小不匹配");
                    }
                }
            }

        }
        catch (Exception e){
            m.put(key,"系统异常");
            log.error(e.toString());
        }
        return m;
    }
    /**
     * 电子文件元数据完整性检测
     * 1.依据DA/T 46-2009中的元数据项或自定义的元数据项进行检测，判断电子文件元数据项是否存在缺项情况
     * @return 是否通过
     */
    @Override
    public boolean metadataIntegrityDetection() {
        return false;
    }

    /**
     * 缺项
     * @return
     */
    public boolean checkLacunarity(){
        return false;
    }
    public boolean checkBlank(){
        return false;
    }
    public boolean checkHandleInfo(){
        return false;
    }
    /**
     * 电子文件内容完整性检测
     * @return 是否通过
     */
    @Override
    public boolean contentIntegrityDetection() {

        return false;
    }

    /**
     * 归档信息包完整性检测
     * @return 是否通过
     */
    @Override
    public boolean archivePacketDetection() {
        return false;
    }
}
