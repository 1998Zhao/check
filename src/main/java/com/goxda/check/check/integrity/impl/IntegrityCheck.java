package com.goxda.check.check.integrity.impl;

import com.goxda.check.check.integrity.IIntegrityCheck;
/**
 * 电子文件数据总量检测 电子文件数据总量检测 电子文件内容完整性检测 归档信息包完整性检测
 * @author zgq
 * createTime 2020-10-27
 */
public class IntegrityCheck implements IIntegrityCheck {
    /**
     * 电子文件数据总量检测
     *
     * @return 是否通过
     */
    @Override
    public boolean electronicDocumentQuantityDetection() {
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
