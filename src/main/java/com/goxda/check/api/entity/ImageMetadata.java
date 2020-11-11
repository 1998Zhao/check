package com.goxda.check.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
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
public class ImageMetadata implements Serializable,IMetadata {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 文件标识符
     */
    private String recordIdentifier;

    /**
     * 档案门类代码
     */
    private String archivalCategoryCode;

    /**
     * 档案馆代码
     */
    private String archivesIdentifier;

    /**
     * 组织机构代码
     */
    private String organizationCode;

    /**
     * 聚合层次
     */
    private String aggregationLevel;

    /**
     * 档号
     */
    private String archivalCode;

    /**
     * 题名
     */
    @TableField("Title")
    private String Title;

    /**
     * 摄影者
     */
    @TableField("Photographer")
    private String Photographer;

    /**
     * 著录者
     */
    private String descriptedBy;

    /**
     * 审核者
     */
    @TableField("Reviewer")
    private String Reviewer;

    /**
     * 时间
     */
    @TableField("Datetime")
    private String Datetime;

    /**
     * 摄影时间
     */
    private String creationDate;

    /**
     * 数字化时间
     */
    private LocalDateTime digitizationDate;

    /**
     * 处理时间
     */
    private LocalDateTime modifiedDate;

    /**
     * 主题
     */
    private String subject;

    /**
     * 地点
     */
    private String place;

    /**
     * 人物
     */
    private String person;

    /**
     * 背景
     */
    private String background;

    /**
     * 拍摄位置
     */
    @TableField("Shooting_position")
    private String shootingPosition;

    /**
     * 全球定位系统版本
     */
    @TableField("GPS_version")
    private String gpsVersion;

    /**
     * 纬度基准
     */
    @TableField("GPS_latitude_reference")
    private String gpsLatitudeReference;

    /**
     * 纬度
     */
    private String latitude;

    /**
     * 经度基准
     */
    private String longitudeReference;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 海拔基准
     */
    private String altitudeReference;

    /**
     * 海拔
     */
    private String altitude;

    /**
     * 方向基准
     */
    private String imageDirectionReference;

    /**
     * 镜头方向
     */
    private String imageDirection;

    /**
     * 国际协调时间
     */
    @TableField("GPSDateStamp")
    private String GPSDateStamp;

    /**
     * 体裁
     */
    private String genre;

    /**
     * 文字说明
     */
    @TableField("Explanation")
    private String Explanation;

    /**
     * 保管期限
     */
    private String retentionPeriod;

    /**
     * 附注
     */
    private String annotation;

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
    private String offLine;

    /**
     * 外部文件标识符
     */
    private String sourceIdentifier;

    /**
     * 外部文件标识符值
     */
    @TableField("ExternalRecordidentifier")
    private String ExternalRecordidentifier;

    /**
     * 外部文件标识符类型
     */
    @TableField("ExternalRecordType")
    private String ExternalRecordType;

    /**
     * 捕获设备
     */
    private String captureDevice;

    /**
     * 设备类型
     */
    @TableField("Device_Type")
    private String deviceType;

    /**
     * 设备制造商
     */
    private String deviceManufacturer;

    /**
     * 设备型号
     */
    private String deviceModel;

    /**
     * 设备序列号
     */
    private String deviceModelSeriesNumber;

    /**
     * 设备感光器
     */
    private String deviceSensor;

    /**
     * 软件类型
     */
    private String softwareType;

    /**
     * 软件名称
     */
    @TableField("software_Name")
    private String softwareName;

    /**
     * 软件版本
     */
    @TableField("software_Version")
    private String softwareVersion;

    /**
     * 软件信息
     */
    @TableField("software_Manufacturer")
    private String softwareManufacturer;

    /**
     * 信息系统描述
     */
    @TableField("Electronic_records_management_system_description")
    private String electronicRecordsManagementSystemDescription;

    /**
     * 权限
     */
    private String rights;

    /**
     * 控制标识
     */
    private String controlIdentifier;

    /**
     * 版权信息
     */
    private String copyrightInformation;

    /**
     * 版权所有者
     */
    private String copyrightOwner;

    /**
     * 版权ID
     */
    @TableField("Copyright_identifier")
    private String copyrightIdentifier;

    /**
     * 版权期限
     */
    @TableField("CopyrightPeriod")
    private String CopyrightPeriod;

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
     * 电子档案名
     */
    private String electronicRecordsName;

    /**
     * 电子档案生成方式
     */
    private String electronicRecordsCreationWay;

    /**
     * 文件编码标识符
     */
    private Integer recordEncodingIdentifier;

    /**
     * 文件大小
     */
    private Integer documentSize;

    /**
     * 格式
     */
    private String format;

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
     * 格式转换于
     */
    @TableField("DocumentFormatConversionIn")
    private String DocumentFormatConversionIn;

    /**
     * 图像参数
     */
    private String imageParameter;

    /**
     * 水平分辨率
     */
    @TableField("X_resolution")
    private String xResolution;

    /**
     * 垂直分辨率
     */
    @TableField("Y_resolution")
    private String yResolution;

    /**
     * 图像高度
     */
    private String imageHeight;

    /**
     * 图像宽度
     */
    private String imageWidth;

    /**
     * 色彩空间
     */
    private String colorSpace;

    /**
     * 分量
     */
    @TableField("YCbCr")
    private String YCbCr;

    /**
     * 分量二次采样
     */
    @TableField("YcbCr_sampling")
    private String ycbcrSampling;

    /**
     * 分量配置
     */
    @TableField("yCbCr_positioning")
    private String ycbcrPositioning;

    /**
     * 分量系数
     */
    @TableField("yCbCr_coefficient")
    private String ycbcrCoefficient;

    /**
     * 长宽比
     */
    @TableField("AspectRatio")
    private String AspectRatio;

    /**
     * 位深度
     */
    @TableField("BitDepth")
    private String BitDepth;

    /**
     * 每样本位数
     */
    private String bitsPerSample;

    /**
     * 每样本位数值
     */
    private String bitsPerSampleValue;

    /**
     * 每样本位数单元
     */
    private String bitsPerSampleUnit;

    /**
     * 每像素样本数
     */
    private String samplesPerPixel;

    /**
     * 字节序
     */
    private String byteOrder;

    /**
     * 方向
     */
    private String orientation;

    /**
     * 头文件信息
     */
    private String headerInfo;

    /**
     * 压缩
     */
    private String compression;

    /**
     * 压缩方案
     */
    private String imageCompressionScheme;

    /**
     * 压缩率
     */
    private String imageCompressionRate;

    /**
     * 文件关联
     */
    private String recordRelationMetadata;

    /**
     * 关联文件标识符
     */
    private String relateRecordIdentifier;

    /**
     * 文件关系类型
     */
    private String recordsRelationType;

    /**
     * 文件关联
     */
    private String recordRelation;

    /**
     * 文件关系描述
     */
    private String recordRelationDescription;

    /**
     * 文件编码数据
     */
    @TableField("DocumentEncodingData")
    private String DocumentEncodingData;

    /**
     * 编码数字签名
     */
    @TableField("EncodingDescription")
    private String EncodingDescription;

    /**
     * 编码签名格式描述
     */
    @TableField("Encoding_signature_format_description")
    private String encodingSignatureFormatDescription;

    /**
     * 编码签名时间
     */
    @TableField("Encoding_signature_date")
    private LocalDateTime encodingSignatureDate;

    /**
     * 编码签名者
     */
    private String signer;

    /**
     * 编码签名
     */
    private String signature;

    /**
     * 编码证书
     */
    private String certificate;

    /**
     * 编码证书引证
     */
    private String certificateReference;

    /**
     * 编码签名算法
     */
    private String signatureAlgorithm;

    /**
     * 文件业务
     */
    private String recordBusiness;

    /**
     * 处置计划
     */
    private String disposalPlan;

    /**
     * 计划标识符
     */
    private String disposalPlanIdentifier;

    /**
     * 计划类型
     */
    private String disposalPlanType;

    /**
     * 计划时间
     */
    private String disposalDateDue;

    /**
     * 计划描述
     */
    private String disposalPlanDescription;

    /**
     * 计划状态
     */
    @TableField("Disposal_plan_status")
    private String disposalPlanStatus;

    /**
     * 处置历史
     */
    private String disposalHistory;

    /**
     * 处置标识符
     */
    private String disposalIdentifier;

    /**
     * 处置行为
     */
    private String disposalActs;

    /**
     * 处置时间
     */
    private LocalDateTime disposedDateTime;

    /**
     * 计划描述
     */
    private String disposalDescription;

    /**
     * 职能业务
     */
    private String functionBusiness;

    /**
     * 业务类型
     */
    private String businessCategory;

    /**
     * 业务名称
     */
    private String businessName;

    /**
     * 业务开始时间
     */
    private String businessBeginningDate;

    /**
     * 业务结束时间
     */
    private String businessEndDate;

    /**
     * 业务描述
     */
    private String businessDescription;

    /**
     * 机构人员标识符
     */
    private String agentSerialNumber;

    /**
     * 机构人员代码
     */
    private String agentIdentifier;

    /**
     * 机构人员类型
     */
    private String agentCategory;

    /**
     * 机构人员名称
     */
    private String agentName;

    /**
     * 机构人员隶属
     */
    private String agentBelongsTo;

    /**
     * 法规标识符
     */
    private String mandateSerialNumber;

    /**
     * 法规类型
     */
    private String mandateCategory;

    /**
     * 法规名称
     */
    private String mandateName;

    /**
     * 发布时间
     */
    private String issueDate;

    /**
     * 生效时间
     */
    private String effectDate;

    /**
     * 关联实体标识符
     */
    private String relatedEntitiesIdentifier;

    /**
     * 实体关系类型
     */
    private String entitiesRelationType;

    /**
     * 实体关系
     */
    private String relation;


}
