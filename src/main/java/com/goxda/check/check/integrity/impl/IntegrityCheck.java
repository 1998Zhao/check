package com.goxda.check.check.integrity.impl;

import com.goxda.check.api.entity.inte.IMetadata;
import com.goxda.check.check.integrity.IIntegrityCheck;
import org.springframework.stereotype.Service;

/**
 * 电子文件数据总量检测 电子文件数据总量检测 电子文件内容完整性检测 归档信息包完整性检测
 * @author zgq
 * createTime 2020-10-27
 */
@Service
public class IntegrityCheck implements IIntegrityCheck {
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
    public boolean checkEleFilesCount(){
        return false;
    }
    public boolean checkEleFilesLength(){return false;}
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
     *
     * @return 是否通过
     */
    @Override
    public boolean archivePacketDetection() {
        return false;
    }
}
