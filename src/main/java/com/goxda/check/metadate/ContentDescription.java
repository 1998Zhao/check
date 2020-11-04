package com.goxda.check.metadate;

/**
 *  内容描述
 * @author zgq
 */
public class ContentDescription implements IMetadata{
    /**
     * 内容描述
     */
    private String contentDescription;
    /**
     * 题名 又称标题、题目，是表达电子文件中心内容和形式特征的名称
     */
    private String title;
    /**
     * 并列题名 以第二种语言文字书写的与题名对照并列的题名
     */
    private String parallelTitle;
    /**
     * 副题名
     * 解释或从属于题名的另一题名
     */
    private String alternativeTitle;
    /**
     * 说明题名文字
     * 题名前后对电子文件内容、范围、用途等的说明文字
     */
    private String otherTitleInformation;
    /**
     * 主题词
     * 在标引和检索中用以表达电子文件主题的规范化的词或词组
     */
    private String descriptor;
    /**
     * 关键词
     * 在标引和检索过程中，取自电子文件题名或正文用以表达主题并具有检索意义的非规范化的词或词组
     */
    private String keyword;
    /**
     * 人名
     * 文件内容涉及的具有检索意义的人物姓名
     */
    private String personalName;
    /**
     * 摘要
     * 对电子文件核心内容的简短陈述
     */
    private String abstracts;
    /**
     * 分类号
     * 采用《中国档案分类法》对电子文件进行主题分析，并依照电子文件的内容和特点分门别类后形成的类目标记符号
     */
    private String classCode;
    /**
     * 文件编号
     * 文件制发过程中由制发机关、团体或个人赋予文件的顺序号，也称文号
     */
    private String documentNumber;
    /**
     * 责任者
     * 对电子文件内容进行创造、负有责任的团体或个人
     */
    private String author;
    /**
     * 日期
     * 文件形成的日期或者案卷内文件的起止日期
     */
    private String date;
    /**
     * 文种
     * 按性质和用途确定的文件种类的名称
     */
    private String documentType;
    /**
     * 紧急程度
     * 公文送达和办理时间要求的急缓等级
     */
    private String precedence;
    /**
     * 主送
     * 文件的主要受理者
     */
    private String principalReceiver;
    /**
     * 抄送
     * 除主送者以外需要执行或知晓文件的其他受文者
     */
    private String otherReceivers;
    /**
     * 密级
     * 电子文件保密程度的等级
     */
    private String securityClassification;
    /**
     * 保密期限
     * 对电子文件密级时效的规定和说明
     */
    private String secrecyPeriod;

    public String getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getParallelTitle() {
        return parallelTitle;
    }

    public void setParallelTitle(String parallelTitle) {
        this.parallelTitle = parallelTitle;
    }

    public String getAlternativeTitle() {
        return alternativeTitle;
    }

    public void setAlternativeTitle(String alternativeTitle) {
        this.alternativeTitle = alternativeTitle;
    }

    public String getOtherTitleInformation() {
        return otherTitleInformation;
    }

    public void setOtherTitleInformation(String otherTitleInformation) {
        this.otherTitleInformation = otherTitleInformation;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getPersonalName() {
        return personalName;
    }

    public void setPersonalName(String personalName) {
        this.personalName = personalName;
    }

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getPrecedence() {
        return precedence;
    }

    public void setPrecedence(String precedence) {
        this.precedence = precedence;
    }

    public String getPrincipalReceiver() {
        return principalReceiver;
    }

    public void setPrincipalReceiver(String principalReceiver) {
        this.principalReceiver = principalReceiver;
    }

    public String getOtherReceivers() {
        return otherReceivers;
    }

    public void setOtherReceivers(String otherReceivers) {
        this.otherReceivers = otherReceivers;
    }

    public String getSecurityClassification() {
        return securityClassification;
    }

    public void setSecurityClassification(String securityClassification) {
        this.securityClassification = securityClassification;
    }

    public String getSecrecyPeriod() {
        return secrecyPeriod;
    }

    public void setSecrecyPeriod(String secrecyPeriod) {
        this.secrecyPeriod = secrecyPeriod;
    }
}
