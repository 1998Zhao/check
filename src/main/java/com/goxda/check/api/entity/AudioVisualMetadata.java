package com.goxda.check.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.goxda.check.api.entity.inte.IMetadata;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ah
 * @since 2020-11-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class AudioVisualMetadata implements Serializable, IMetadata {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 档案馆代码
     */
    private String archivesIdentifier;

    /**
     * 档案门类代码
     */
    private String archivalCategoryCode;

    /**
     * 聚合层次
     */
    private String aggregationLevel;

    /**
     * 唯一标识符
     */
    private String uniqueIdentifier;

    /**
     * 档号
     */
    private String archivalCode;

    /**
     * 题名
     */
    private String title;

    /**
     * 责任者
     */
    private String author;

    /**
     * 摄录者
     */
    private String recordist;

    /**
     * 编辑者
     */
    private String editor;

    /**
     * 著录者
     */
    private String describedBy;

    /**
     * 数字化责任信息
     */
    private String digitizationAuthorInformation;

    /**
     * 时间
     */
    private String dateTime;

    /**
     * 摄录时间
     */
    private String recordDate;

    /**
     * 编辑时间
     */
    private String editTime;

    /**
     * 数字化时间
     */
    private String digitizationTime;

    /**
     * 时间长度
     */
    private String duration;

    /**
     * 总帧数
     */
    private String totalFrames;

    /**
     * 主题
     */
    private String subject;

    /**
     * 内容描述
     */
    private String contentStatement;

    /**
     * 内容起始时间
     */
    private String beginningTime;

    /**
     * 内容结束时间
     */
    private String endingTime;

    /**
     * 来源
     */
    private String provenance;

    /**
     * 获取方式
     */
    private String acquisitionApproaches;

    /**
     * 来源名称
     */
    private String provenanceName;

    /**
     * 源文件标识符
     */
    private String sourceIdentifier;

    /**
     * 保管期限
     */
    private String retentionPeriod;

    /**
     * 权限
     */
    private String rights;

    /**
     * 密级
     */
    private String securityClassification;

    /**
     * 控制标识
     */
    private String controlIdentifier;

    /**
     * 版权信息
     */
    private String copyrightInformation;

    /**
     * 附注
     */
    @TableField("Annotation")
    private String Annotation;

    /**
     * 存储
     */
    private String storage;

    /**
     * 在线存址
     */
    private String onlineLocation;

    /**
     * 离线存址
     */
    private String offlineLocation;

    /**
     * 原始载体
     */
    @TableField("Original_carrie")
    private String originalCarrie;

    /**
     * 原始载体类型
     */
    @TableField("Original_carrie_type")
    private String originalCarrieType;

    /**
     * 原始载体型号
     */
    @TableField("Original_carrie_model")
    private String originalCarrieModel;

    /**
     * 生成方式
     */
    private String creationWay;

    /**
     * 捕获设备
     */
    private String captureDevice;

    /**
     * 设备类型
     */
    private String deviceType;

    /**
     * 设备制造商
     */
    private String deviceManufacturer;

    /**
     * 设备型号
     */
    private String deviceModelNumber;

    /**
     * 软件信息
     */
    @TableField("Software_information")
    private String softwareInformation;

    /**
     * 管理系统描述
     */
    private String informationSystemDescription;

    /**
     * 计算机文件名
     */
    private String computerFileName;

    /**
     * 计算机文件大小
     */
    private String computerFileSize;

    /**
     * 格式信息
     */
    private String formatInformation;

    /**
     * 格式名称
     */
    private String formatName;

    /**
     * 格式版本
     */
    private String formatVersion;

    /**
     * 格式描述
     */
    private String formatDescription;

    /**
     * 视频参数
     */
    private String videoParmeter;

    /**
     * 视频编码标准
     */
    private String videoEncodingStandard;

    /**
     * 色彩空间
     */
    private String colorSpace;

    /**
     * 分辨率
     */
    private String resolution;

    /**
     * 帧率
     */
    private String framesPerSecond;

    /**
     * 视频比特率
     */
    private String videoBitRate;

    /**
     * 色度采样率
     */
    private String videoSampleSize;

    /**
     * 视频量化位数
     */
    private String videoSamplingPrecision;

    /**
     * 画面高宽比
     */
    private String aspectRatio;

    /**
     * 音频参数
     */
    private String audioParameter;

    /**
     * 音频编码标准
     */
    private String audioEncodeStandard;

    /**
     * 音频比特率
     */
    private String audioBitRate;

    /**
     * 音频采样率
     */
    private String audioSamplingrate;

    /**
     * 音频量化位数
     */
    @TableField("Audio_sampling_precision")
    private String audioSamplingPrecision;

    /**
     * 声道
     */
    private String audioChannels;

    /**
     * 参见号
     */
    private String relatedRecordsIdentifier;

    /**
     * 数字签名
     */
    private String digitalSignature;

    /**
     * 签名格式描述
     */
    private String signatureFormatDiscription;

    /**
     * 签名时间
     */
    private String signatureDate;

    /**
     * 签名者
     */
    private String signer;

    /**
     * 签名
     */
    private String signature;

    /**
     * 证书
     */
    private String certificate;

    /**
     * 证书引证
     */
    private String certificateReference;

    /**
     * 签名算法
     */
    private String signatureAlgorithm;


}
