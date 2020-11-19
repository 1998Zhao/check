package com.goxda.check.check.usability.impl;

import com.goxda.check.check.usability.IUsabilityCheck;
/**
 * 电子文件元数据可用性检测,
 * 电子文件内容可用性检测,
 * 电子文件软硬件环境检测,
 * 归档信息包可用性检测
 * @author zgq
 * createTime 2020-10-27
 */
public class UsabilityCheck implements IUsabilityCheck {
    /**
     * 电子文件元数据可用性检测
     *
     * @return 是否通过
     */
    @Override
    public boolean metadataUsabilityDetection() {
        return false;
    }

    /**
     * 电子文件内容可用性检测
     * @return 是否通过
     */
    @Override
    public boolean contentUsabilityDetection() {
        return false;
    }

    /**
     * 电子文件软硬件环境检测
     *
     * @return 是否通过
     */
    @Override
    public boolean softwareAndHardwareEnvironmentDetection() {
        return false;
    }

    /**
     * 归档信息包可用性检测
     *
     * @return 是否通过
     */
    @Override
    public boolean archivePacketDetection() {
        return false;
    }
}
