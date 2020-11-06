package com.goxda.check.metadate;

import lombok.Data;

import java.util.Date;

/**
 * 元数据
 * @author admin
 */
@Data
public class Metadata {
    /**
     * 聚合层次
     * 电子文件在分类、整理、著录、保管和提供利用时，作为个体和特定群体的控制层次。如宗、目、卷、件等
     */
    private AggregationLevel aggregationLevel;
    /**
     * * 来源
     * 档案馆名称（M3）
     * 档案馆代码（M4）
     * 全宗名称（M5）
     * 立档单位名称（M6）
     * 提供电子文件的背景信息，利于对电子文件的理解、管理和利用

     */
    private Provenance provenance;
    /**
     * * 电子文件号
     * 为电子文件（包括文件和案卷）提供惟一标识；在电子文件之间、电子文件与其传统载体档案之间提供关联标识
     */
    private ElectronicRecordCode electronicRecordCode;
    /**
     * 档号
     */
    private ArchivalCode archivalCode;
    /**
     * * 内容描述
     * 题名（M22）
     * 并列题名（M23）
     * 副题名（M24）
     * 说明题名文字（M25）
     * 主题词（M26）
     * 关键词（M27）
     * 人名（M28）
     * 摘要（M29）
     * 分类号（M30）
     * 文件编号（M31）
     * 责任者（M32）
     * 日期（M33）
     * 文种（M34）
     * 紧急程度（M35）
     * 主送（M36）
     * 抄送（M37）
     * 密级（M38）
     * 保密期限（M39）
     * 对电子文件题名、主题、编号等内容特征的描述
     */
    private ContentDescription contentDescription;
    /**
     * * 形式特征
     * 记录电子文件形式特征信息，利于电子文件的统计和利用
     * 文件组合类型（M41）
     * 件数（M42）
     * 页数（M43）
     * 语种（M44）
     * 稿本（M45）
     */
    private FormalCharacteristics formalCharacteristics;
    /**
     *电子属性
     * 电子文件作为计算机文件所具有的一组特征
     */
    private ElectronicAttributes electronicAttributes;
    /**
     * 数字化属性
     * 文件或档案数字化的一组关键特征描述
     */
    private DigitizationAttributes digitizationAttributes;
    /**
     * 电子签名
     * 对电子文件电子签名的一组描述信息
     */
    private ElectronicSignature electronicSignature;
    /**
     * 存储位置
     * 对电子文件物理和逻辑存址的一组描述信息
     */
    private StorageLocation storageLocation;
    /**
     * 权限管理
     * 对电子文件内容涉及或具有的权益以及被赋予权限的一组描述信息
     */
    private RightsManagement rightsManagement;
    /**
     * 附注
     * 电子文件和元数据中需要解释和补充说明的事项
     */
    private Annotation annotation;
    private String agentType;
    private String agentName;
    private String organizationCode;
    private String positionName;
    private String businessStatus;
    private String businessActivity;
    private String actionTime;
    private String actionMandate;
    private String actionDescription;
    private String entityIdentifier;
    private String relationType;
    private String relation;
    private String relationDescription;
    public String getArchivalCodeRule(){
        return archivalCode.getArchivalCodeRule();
    }
    public String getAggregationLevel() {
        return aggregationLevel.getAggregationLevel();
    }
    public String getProvenance() {
        return provenance.getProvenance();
    }

    public String getArchivesName() {
        return provenance.getArchivesName();
    }

    public String getArchivesIdentifier() {
        return provenance.getArchivesIdentifier();
    }

    public String getFondsName() {
        return provenance.getFondsName();
    }

    public String getFondsConstitutingUnitName() {
        return provenance.getFondsConstitutingUnitName();
    }
    public String getElectronicRecordCode() {
        return electronicRecordCode.getElectronicRecordCode();
    }

    public String getArchivalCode() {
        return archivalCode.getArchivalCode();
    }

    public String getFondsIdentifier() {
        return archivalCode.getFondsIdentifier();
    }

    public String getCatalogueNumber() {
        return archivalCode.getCatalogueNumber();
    }

    public String getYear() {
        return archivalCode.getYear();
    }

    public String getRetentionPeriod() {
        return archivalCode.getRetentionPeriod();
    }

    public String getOrganizationalStructureOrFunction() {
        return archivalCode.getOrganizationalStructureOrFunction();
    }

    public String getCategoryCode() {
        return archivalCode.getCategoryCode();
    }

    public String getAgencyFileNumber() {
        return archivalCode.getAgencyFileNumber();
    }

    public String getArchivesFileNumber() {
        return archivalCode.getArchivesFileNumber();
    }

    public int getAgencyItemNumber() {
        return archivalCode.getAgencyItemNumber();
    }

    public int getArchivesItemNumber() {
        return archivalCode.getArchivesItemNumber();
    }

    public String getDocumentSequenceNumber() {
        return archivalCode.getDocumentSequenceNumber();
    }

    public String getPageNumber() {
        return archivalCode.getPageNumber();
    }
    public String getContentDescription() {
        return contentDescription.getContentDescription();
    }


    public String getTitle() {
        return contentDescription.getTitle();
    }


    public String getParallelTitle() {
        return contentDescription.getParallelTitle();
    }


    public String getAlternativeTitle() {
        return contentDescription.getAlternativeTitle();
    }


    public String getOtherTitleInformation() {
        return contentDescription.getOtherTitleInformation();
    }

    public String getDescriptor() {
        return contentDescription.getDescriptor();
    }


    public String getKeyword() {
        return contentDescription.getKeyword();
    }

    public String getPersonalName() {
        return contentDescription.getPersonalName();
    }

    public String getAbstracts() {
        return contentDescription.getAbstracts();
    }


    public String getClassCode() {
        return contentDescription.getClassCode();
    }


    public String getDocumentNumber() {
        return contentDescription.getDocumentNumber();
    }


    public String getAuthor() {
        return contentDescription.getAuthor();
    }

    public String getDate() {
        return contentDescription.getDate();
    }


    public String getDocumentType() {
        return contentDescription.getDocumentType();
    }


    public String getPrecedence() {
        return contentDescription.getPrecedence();
    }


    public String getPrincipalReceiver() {
        return contentDescription.getPrincipalReceiver();
    }


    public String getOtherReceivers() {
        return contentDescription.getOtherReceivers();
    }


    public String getSecurityClassification() {
        return contentDescription.getSecurityClassification();
    }


    public String getSecrecyPeriod() {
        return contentDescription.getSecrecyPeriod();
    }
    public String getFormalCharacteristics() {
        return formalCharacteristics.getFormalCharacteristics();
    }

    public String getDocumentAggregationType() {
        return formalCharacteristics.getDocumentAggregationType();
    }

    public int getTotalNumberOfItems() {
        return formalCharacteristics.getTotalNumberOfItems();
    }

    public int getTotalNumberOfPages() {
        return formalCharacteristics.getTotalNumberOfPages();
    }

    public String getLanguage() {
        return formalCharacteristics.getLanguage();
    }

    public String getManuscriptType() {
        return formalCharacteristics.getManuscriptType();
    }
    public String getElectronicAttributes() {
        return electronicAttributes.getElectronicAttributes();
    }

    public String getFormatInformation() {
        return electronicAttributes.getFormatInformation();
    }

    public String getComputerFileName() {
        return electronicAttributes.getComputerFileName();
    }

    public String getComputerFileSize() {
        return electronicAttributes.getComputerFileSize();
    }

    public String getDocumentCreatingApplication() {
        return electronicAttributes.getDocumentCreatingApplication();
    }

    public String getInformationSystemDescription() {
        return electronicAttributes.getInformationSystemDescription();
    }
    public String getDigitizationAttributes() {
        return digitizationAttributes.getDigitizationAttributes();
    }

    public String getPhysicalRecordCharacteristics() {
        return digitizationAttributes.getPhysicalRecordCharacteristics();
    }

    public String getScanningResolution() {
        return digitizationAttributes.getScanningResolution();
    }

    public String getScanningColorModel() {
        return digitizationAttributes.getScanningColorModel();
    }

    public String getImageCompressionScheme() {
        return digitizationAttributes.getImageCompressionScheme();
    }
    public String getSignatureRules() {
        return electronicSignature.getSignatureRules();
    }

    public Date getSignatureTime() {
        return electronicSignature.getSignatureTime();
    }

    public String getSigner() {
        return electronicAttributes.getComputerFileName();
    }

    public String getSignature() {
        return electronicSignature.getSignature();
    }

    public String getCertificate() {
        return electronicAttributes.getComputerFileName();
    }

    public String getCertificateReference() {
        return electronicAttributes.getComputerFileName();
    }

    public String getSignatureAlgorithmIdentifier() {
        return electronicSignature.getSignatureAlgorithmIdentifier();
    }
    public String getStorageLocation() {
        return storageLocation.getStorageLocation();
    }

    public String getCurrentLocation() {
        return storageLocation.getCurrentLocation();
    }

    public String getOfflineMediumIdentifier() {
        return storageLocation.getOfflineMediumIdentifier();
    }

    public String getOfflineMediumStorageLocation() {
        return storageLocation.getOfflineMediumStorageLocation();
    }

    public String getMicroformIdentifier() {
        return storageLocation.getMicroformIdentifier();
    }
    public String getRightsManagement() {
        return rightsManagement.getRightsManagement();
    }

    public String getIntellectualPropertyStatement() {
        return rightsManagement.getIntellectualPropertyStatement();
    }

    public String getAuthorizedAgent() {
        return rightsManagement.getAuthorizedAgent();
    }

    public String getPermissionAssignment() {
        return rightsManagement.getPermissionAssignment();
    }

    public String getControlIdentifier() {
        return rightsManagement.getControlIdentifier();
    }
    public String getAnnotation() {
        return annotation.getAnnotation();
    }
}
