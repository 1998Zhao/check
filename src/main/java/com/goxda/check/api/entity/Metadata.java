package com.goxda.check.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
 * @since 2020-11-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Metadata implements Serializable,IMetadata {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String entryid;

    /**
     * 聚合层次
     */
    private String aggregationLevel;

    /**
     * 来源
     */
    private String provenance;

    /**
     * 档案馆名称
     */
    private String archivesName;

    /**
     * 档案馆代码
     */
    private String archivesIdentifier;

    /**
     * 全宗名称
     */
    private String fondsName;

    /**
     * 立档单位名称
     */
    private String fondsConstitutingUnitName;

    /**
     * 电子文件号
     */
    private String electronicRecordCode;

    /**
     * 档号
     */
    private String archivalCode;

    /**
     * 全宗号
     */
    private String fondsIdentifier;

    /**
     * 目录号
     */
    private String catalogueNumber;

    /**
     * 年度
     */
    private Integer year;

    /**
     * 保管期限
     */
    private String retentionPeriod;

    /**
     * 机构或问题
     */
    private String organizationalStructureOrFunction;

    /**
     * 类别号
     */
    private String categoryCode;

    /**
     * 室编案卷号
     */
    private String agencyFileNumber;

    /**
     * 馆编案卷号
     */
    private String archivesFileNumber;

    /**
     * 室编件号
     */
    private Integer agencyItemNumber;

    /**
     * 馆编件号
     */
    private Integer archivesItemNumber;

    /**
     * 文档序号
     */
    private String documentSequenceNumber;

    /**
     * 页号
     */
    private String pageNumber;

    /**
     * 内容描述
     */
    private String contentDescription;

    /**
     * 题名
     */
    private String title;

    /**
     * 并列题名
     */
    private String parallelTitle;

    /**
     * 副题名
     */
    private String alternativeTitle;

    /**
     * 说明题名文字
     */
    private String otherTitleInformation;

    /**
     * 主题词
     */
    private String descriptor;

    /**
     * 关键词
     */
    private String keyword;

    /**
     * 人名
     */
    private String personalName;

    /**
     * 摘要
     */
    private String abstractMsg;

    /**
     * 分类号
     */
    private String classCode;

    /**
     * 文件编号
     */
    private String documentNumber;

    /**
     * 责任者
     */
    private String author;

    /**
     * 日期
     */
    private String date;

    /**
     * 文种
     */
    private String documentType;

    /**
     * 紧急程度
     */
    private String precedence;

    /**
     * 主送
     */
    private String principalReceiver;

    /**
     * 抄送
     */
    private String otherReceivers;

    /**
     * 密级
     */
    private String securityClassification;

    /**
     * 保密期限
     */
    private String secrecyPeriod;

    /**
     * 形式特征
     */
    private String formalCharacteristics;

    /**
     * 文件组合类型
     */
    private String documentAggregationType;

    /**
     * 件数
     */
    private Integer totalNumberOfItems;

    /**
     * 页数
     */
    private Integer totalNumberOfPages;

    /**
     * 语种
     */
    private String language;

    /**
     * 稿本
     */
    private String manuscriptType;

    /**
     * 电子属性
     */
    private String electronicAttributes;

    /**
     * 格式信息
     */
    private String formatInformation;

    /**
     * 计算机文件名
     */
    private String computerFileName;

    /**
     * 计算机文件大小
     */
    private String computerFileSize;

    /**
     * 文档创建程序
     */
    private String documentCreatingApplication;

    /**
     * 信息系统描述
     */
    private String informationSystemDescription;

    /**
     * 数字化属性
     */
    private String digitizationAttributes;

    /**
     * 数字化对象形态
     */
    private String physicalRecordCharacteristics;

    /**
     * 扫描分辨率
     */
    private String scanningResolution;

    /**
     * 扫描色彩模式
     */
    private String scanningColorModel;

    /**
     * 图像压缩方案
     */
    private String imageCompressionScheme;

    /**
     * 电子签名
     */
    private String electronicSignature;

    /**
     * 签名规则
     */
    private String signatureRules;

    /**
     * 签名时间
     */
    private LocalDateTime signatureTime;

    /**
     * 签名人
     */
    private String signer;

    /**
     * 签名结果
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
     * 签名算法标识
     */
    private String signatureAlgorithmIdentifier;

    /**
     * 存储位置
     */
    private String storageLocation;

    /**
     * 当前位置
     */
    private String currentLocation;

    /**
     * 脱机载体编号
     */
    private String offlineMediumIdentifier;

    /**
     * 脱机载体存址
     */
    private String offlineMediumStorageLocation;

    /**
     * 缩微号
     */
    private String microformIdentifier;

    /**
     * 权限管理
     */
    private String rightsManagement;

    /**
     * 知识产权说明
     */
    private String intellectualPropertyStatement;

    /**
     * 授权对象
     */
    private String authorizedAgent;

    /**
     * 授权行为
     */
    private String permissionAssignment;

    /**
     * 控制标识
     */
    private String controlIdentifier;

    /**
     * 附注
     */
    private String annotation;

    /**
     * 机构人员类型
     */
    private String agentType;

    /**
     * 机构人员名称
     */
    private String agentName;

    /**
     * 组织机构代码
     */
    private String organizationCode;

    /**
     * 个人职位
     */
    private String positionName;

    /**
     * 业务状态
     */
    private String businessStatus;

    /**
     * 业务行为
     */
    private String businessActivity;

    /**
     * 行为时间
     */
    private String actionTime;

    /**
     * 行为依据
     */
    private String actionMandate;

    /**
     * 行为描述
     */
    private String actionDescription;

    /**
     * 实体标识符
     */
    private String entityIdentifier;

    /**
     * 关系类型
     */
    private String relationType;

    /**
     * 关系
     */
    private String relation;

    /**
     * 关系描述
     */
    private String relationDescription;

    public String getAbstract() {
        return abstractMsg;
    }
}
