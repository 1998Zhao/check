package com.goxda.check.check.integrity.impl;

import com.goxda.check.api.entity.inte.IMetadata;
import com.goxda.check.check.integrity.IIntegrityCheck;
/**
 * 电子文件数据总量检测 电子文件数据总量检测 电子文件内容完整性检测 归档信息包完整性检测
 * @author zgq
 * createTime 2020-10-27
 */
public class IntegrityCheck implements IIntegrityCheck {
    IMetadata metadata;
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
    /**
     * 电子文件元数据完整性检测
     *
     * @return 是否通过
     */
    @Override
    public boolean metadataIntegrityDetection() {
        return false;
    }

    /**
     * 电子文件内容完整性检测
     *
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
