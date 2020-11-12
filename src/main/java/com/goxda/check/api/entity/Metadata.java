package com.goxda.check.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
 * @since 2020-11-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Metadata implements Serializable, IMetadata {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    protected String entryid;

    /**
     * 聚合层次
     */
    protected String aggregationLevel;

    /**
     * 来源
     */
    protected String provenance;

    /**
     * 档案馆名称
     */
    protected String archivesName;

    /**
     * 档案馆代码
     */
    protected String archivesIdentifier;

    /**
     * 全宗名称
     */
    protected String fondsName;

    /**
     * 立档单位名称
     */
    protected String fondsConstitutingUnitName;

    /**
     * 电子文件号
     */
    protected String electronicRecordCode;

    /**
     * 档号
     */
    protected String archivalCode;

    /**
     * 全宗号
     */
    protected String fondsIdentifier;

    /**
     * 目录号
     */
    protected String catalogueNumber;

    /**
     * 年度
     */
    protected Integer year;

    /**
     * 保管期限
     */
    protected String retentionPeriod;

    /**
     * 机构或问题
     */
    protected String organizationalStructureOrFunction;

    /**
     * 类别号
     */
    protected String categoryCode;

    /**
     * 室编案卷号
     */
    protected String agencyFileNumber;

    /**
     * 馆编案卷号
     */
    protected String archivesFileNumber;

    /**
     * 室编件号
     */
    protected Integer agencyItemNumber;

    /**
     * 馆编件号
     */
    protected Integer archivesItemNumber;

    /**
     * 文档序号
     */
    protected String documentSequenceNumber;

    /**
     * 页号
     */
    protected String pageNumber;

    /**
     * 内容描述
     */
    protected String contentDescription;

    /**
     * 题名
     */
    protected String title;

    /**
     * 并列题名
     */
    protected String parallelTitle;

    /**
     * 副题名
     */
    protected String alternativeTitle;

    /**
     * 说明题名文字
     */
    protected String otherTitleInformation;

    /**
     * 主题词
     */
    protected String descriptor;

    /**
     * 关键词
     */
    protected String keyword;

    /**
     * 人名
     */
    protected String personalName;

    /**
     * 摘要
     */
    protected String abstractMsg;

    /**
     * 分类号
     */
    protected String classCode;

    /**
     * 文件编号
     */
    protected String documentNumber;

    /**
     * 责任者
     */
    protected String author;

    /**
     * 日期
     */
    protected String date;

    /**
     * 文种
     */
    protected String documentType;

    /**
     * 紧急程度
     */
    protected String precedence;

    /**
     * 主送
     */
    protected String principalReceiver;

    /**
     * 抄送
     */
    protected String otherReceivers;

    /**
     * 密级
     */
    protected String securityClassification;

    /**
     * 保密期限
     */
    protected String secrecyPeriod;

    /**
     * 形式特征
     */
    protected String formalCharacteristics;

    /**
     * 文件组合类型
     */
    protected String documentAggregationType;

    /**
     * 件数
     */
    protected Integer totalNumberOfItems;

    /**
     * 页数
     */
    protected Integer totalNumberOfPages;

    /**
     * 语种
     */
    protected String language;

    /**
     * 稿本
     */
    protected String manuscriptType;

    /**
     * 电子属性
     */
    protected String electronicAttributes;

    /**
     * 格式信息
     */
    protected String formatInformation;

    /**
     * 计算机文件名
     */
    protected String computerFileName;

    /**
     * 计算机文件大小
     */
    protected String computerFileSize;

    /**
     * 文档创建程序
     */
    protected String documentCreatingApplication;

    /**
     * 信息系统描述
     */
    protected String informationSystemDescription;

    /**
     * 数字化属性
     */
    protected String digitizationAttributes;

    /**
     * 数字化对象形态
     */
    protected String physicalRecordCharacteristics;

    /**
     * 扫描分辨率
     */
    protected String scanningResolution;

    /**
     * 扫描色彩模式
     */
    protected String scanningColorModel;

    /**
     * 图像压缩方案
     */
    protected String imageCompressionScheme;

    /**
     * 电子签名
     */
    protected String electronicSignature;

    /**
     * 签名规则
     */
    protected String signatureRules;

    /**
     * 签名时间
     */
    protected LocalDateTime signatureTime;

    /**
     * 签名人
     */
    protected String signer;

    /**
     * 签名结果
     */
    protected String signature;

    /**
     * 证书
     */
    protected String certificate;

    /**
     * 证书引证
     */
    protected String certificateReference;

    /**
     * 签名算法标识
     */
    protected String signatureAlgorithmIdentifier;

    /**
     * 存储位置
     */
    protected String storageLocation;

    /**
     * 当前位置
     */
    protected String currentLocation;

    /**
     * 脱机载体编号
     */
    protected String offlineMediumIdentifier;

    /**
     * 脱机载体存址
     */
    protected String offlineMediumStorageLocation;

    /**
     * 缩微号
     */
    protected String microformIdentifier;

    /**
     * 权限管理
     */
    protected String rightsManagement;

    /**
     * 知识产权说明
     */
    protected String intellectualPropertyStatement;

    /**
     * 授权对象
     */
    protected String authorizedAgent;

    /**
     * 授权行为
     */
    protected String permissionAssignment;

    /**
     * 控制标识
     */
    protected String controlIdentifier;

    /**
     * 附注
     */
    protected String annotation;

    /**
     * 机构人员类型
     */
    protected String agentType;

    /**
     * 机构人员名称
     */
    protected String agentName;

    /**
     * 组织机构代码
     */
    protected String organizationCode;

    /**
     * 个人职位
     */
    protected String positionName;

    /**
     * 业务状态
     */
    protected String businessStatus;

    /**
     * 业务行为
     */
    protected String businessActivity;

    /**
     * 行为时间
     */
    protected String actionTime;

    /**
     * 行为依据
     */
    protected String actionMandate;

    /**
     * 行为描述
     */
    protected String actionDescription;

    /**
     * 实体标识符
     */
    protected String entityIdentifier;

    /**
     * 关系类型
     */
    protected String relationType;

    /**
     * 关系
     */
    protected String relation;

    /**
     * 关系描述
     */
    protected String relationDescription;

    public String getAbstract() {
        return abstractMsg;
    }
}
