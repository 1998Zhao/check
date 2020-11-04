package com.goxda.check.check.usability;
/**
 * 电子文件元数据可用性检测,电子文件内容可用性检测,电子文件软硬件环境检测,归档信息包可用性检测
 * @author zgq
 * createTime 2020-10-27
 */
public interface IUsabilityCheck {
    /**
     * 电子文件元数据可用性检测
     * @return 是否通过
     */
    boolean metadataUsabilityDetection();
    /**
     * 电子文件内容可用性检测
     * @return 是否通过
     */
    boolean contentUsabilityDetection();
    /**
     * 电子文件软硬件环境检测
     * @return  是否通过
     */
    boolean softwareAndHardwareEnvironmentDetection();
    /**
     * 归档信息包可用性检测
     * @return 是否通过
     */
    boolean archivePacketDetection();
}
