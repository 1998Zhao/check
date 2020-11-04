package com.goxda.check.metadate;

/**
 * 元数据
 * @author admin
 */
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

    public Provenance getProvenance() {
        return provenance;
    }

    public void setProvenance(Provenance provenance) {
        this.provenance = provenance;
    }

    public ArchivalCode getArchivalCode() {
        return archivalCode;
    }

    public void setArchivalCode(ArchivalCode archivalCode) {
        this.archivalCode = archivalCode;
    }

    public ContentDescription getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(ContentDescription contentDescription) {
        this.contentDescription = contentDescription;
    }

    public FormalCharacteristics getFormalCharacteristics() {
        return formalCharacteristics;
    }

    public void setFormalCharacteristics(FormalCharacteristics formalCharacteristics) {
        this.formalCharacteristics = formalCharacteristics;
    }

    public ElectronicAttributes getElectronicAttributes() {
        return electronicAttributes;
    }

    public void setElectronicAttributes(ElectronicAttributes electronicAttributes) {
        this.electronicAttributes = electronicAttributes;
    }

    public DigitizationAttributes getDigitizationAttributes() {
        return digitizationAttributes;
    }

    public void setDigitizationAttributes(DigitizationAttributes digitizationAttributes) {
        this.digitizationAttributes = digitizationAttributes;
    }

    public ElectronicSignature getElectronicSignature() {
        return electronicSignature;
    }

    public void setElectronicSignature(ElectronicSignature electronicSignature) {
        this.electronicSignature = electronicSignature;
    }

    public StorageLocation getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(StorageLocation storageLocation) {
        this.storageLocation = storageLocation;
    }

    public RightsManagement getRightsManagement() {
        return rightsManagement;
    }

    public void setRightsManagement(RightsManagement rightsManagement) {
        this.rightsManagement = rightsManagement;
    }

    public AggregationLevel getAggregationLevel() {
        return aggregationLevel;
    }

    public void setAggregationLevel(AggregationLevel aggregationLevel) {
        this.aggregationLevel = aggregationLevel;
    }

    public ElectronicRecordCode getElectronicRecordCode() {
        return electronicRecordCode;
    }

    public void setElectronicRecordCode(ElectronicRecordCode electronicRecordCode) {
        this.electronicRecordCode = electronicRecordCode;
    }

    public Annotation getAnnotation() {
        return annotation;
    }

    public void setAnnotation(Annotation annotation) {
        this.annotation = annotation;
    }
}
