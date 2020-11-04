package com.goxda.check.metadate;

/**
 * 档号
 * @author zgq
 */
public class ArchivalCode {
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
    private String year;
    /**
     * 保管期限
     */
    private String retentionPeriod;
    /**
     * 对电子文件进行实体分类整理时按部门或问题分类的结果
     * 机构或问题
     */
    private String organizationalStructureOrFunction;
    /**
     * 根据电子文件实体分类方案赋予电子文件的类别代码
     * 类号
     */
    private String categoryCode;
    /**
     * 档案室编制的案卷顺序号
     * 室编案卷号
     */
    private String agencyFileNumber;
    /**
     * 馆编案卷号
     * 档案馆编制的案卷顺序号
     */
    private String archivesFileNumber;
    /**
     * 室编件号
     * 档案室编制的文件或组合文件的排列顺序号
     */
    private int agencyItemNumber;
    /**
     * 档案馆编制的文件或组合文件的排列顺序号
     * 馆编件号
     */
    private int archivesItemNumber;
    /**
     * 文档在组合文件中的排列顺序号
     * 文档序号
     */
    private String documentSequenceNumber;
    /**
     * 与电子文件对应的纸质档案在案卷内的页面顺序号
     * 页号
     */
    private String pageNumber;

    public String getArchivalCode() {
        return archivalCode;
    }

    public void setArchivalCode(String archivalCode) {
        this.archivalCode = archivalCode;
    }

    public String getFondsIdentifier() {
        return fondsIdentifier;
    }

    public void setFondsIdentifier(String fondsIdentifier) {
        this.fondsIdentifier = fondsIdentifier;
    }

    public String getCatalogueNumber() {
        return catalogueNumber;
    }

    public void setCatalogueNumber(String catalogueNumber) {
        this.catalogueNumber = catalogueNumber;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRetentionPeriod() {
        return retentionPeriod;
    }

    public void setRetentionPeriod(String retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    public String getOrganizationalStructureOrFunction() {
        return organizationalStructureOrFunction;
    }

    public void setOrganizationalStructureOrFunction(String organizationalStructureOrFunction) {
        this.organizationalStructureOrFunction = organizationalStructureOrFunction;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getAgencyFileNumber() {
        return agencyFileNumber;
    }

    public void setAgencyFileNumber(String agencyFileNumber) {
        this.agencyFileNumber = agencyFileNumber;
    }

    public String getArchivesFileNumber() {
        return archivesFileNumber;
    }

    public void setArchivesFileNumber(String archivesFileNumber) {
        this.archivesFileNumber = archivesFileNumber;
    }

    public int getAgencyItemNumber() {
        return agencyItemNumber;
    }

    public void setAgencyItemNumber(int agencyItemNumber) {
        this.agencyItemNumber = agencyItemNumber;
    }

    public int getArchivesItemNumber() {
        return archivesItemNumber;
    }

    public void setArchivesItemNumber(int archivesItemNumber) {
        this.archivesItemNumber = archivesItemNumber;
    }

    public String getDocumentSequenceNumber() {
        return documentSequenceNumber;
    }

    public void setDocumentSequenceNumber(String documentSequenceNumber) {
        this.documentSequenceNumber = documentSequenceNumber;
    }

    public String getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }
}
