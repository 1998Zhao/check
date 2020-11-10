package com.goxda.check.encapsulation;

import lombok.Data;

/**
 * 档号
 * @author zgq
 */
@Data
public class ArchivalCode {
    /**
     * 档号规则
     * 由哪几个部分构成
     */
    private String archivalCodeRule;
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


}
