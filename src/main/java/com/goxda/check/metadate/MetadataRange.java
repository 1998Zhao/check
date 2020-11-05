package com.goxda.check.metadate;

import java.util.HashMap;
import java.util.Map;

/**
 * 值域
 * @author zgq
 */
public class MetadataRange {
    public static Map<String,String[]> aggregationLevelMap = new HashMap<>();
    public static String[] aggregationLevels ={"文件","案卷"};
    public static Map<String,String[]> sourceMap = new HashMap<>();
    public static Map<String,String[]> archivalCodeMap = new HashMap<>();
    public static Map<String,String[]> contentDescriptionMap = new HashMap<>();
    public static Map<String,String[]> formalCharacteristicsMap = new HashMap<>();
    public static Map<String,String[]> electronicAttributesMap = new HashMap<>();
    public static Map<String,String[]> digitizationAttributesMap = new HashMap<>();
    public static Map<String,String[]> electronicSignatureMap = new HashMap<>();
    public static Map<String,String[]> storageLocationMap = new HashMap<>();
    public static Map<String,String[]> rightsManagementMap = new HashMap<>();
    public static Map<String,String[]> annotationMap = new HashMap<>();
    public static String[] annotation ={"文件","案卷"};
    static {
        annotationMap.put("annotation",annotation);
        aggregationLevelMap.put("aggregationLevel",aggregationLevels);
        archivalCodeMap.put("retentionPeriod",new String[]{"永久", "长期", "短期" ,"30年" ,"10年","[其他]"});
        contentDescriptionMap.put("documentType",new String[]{"命令（令）", "决定", "公告", "通告" ,"通知" ,"通报" ,"议案", "报告", "请示",
                "批复", "意见", "函", "会议纪要", "指示", "决议", "公报条例", "规定","[其他]"});
        contentDescriptionMap.put("precedence",new String[]{"特提", "特急", "加急", "平急", "急件","[其他]"});
        contentDescriptionMap.put("securityClassification",new String[]{"公开","限制","秘密","机密","绝密"});
        formalCharacteristicsMap.put("manuscriptType",new String[]{"草稿","定稿","正本","副本","试行本","修订本","[其他]"});
        digitizationAttributesMap.put("scanningColorModel",new String[]{"黑白二值", "灰度","彩色"});
        digitizationAttributesMap.put("signatureAlgorithmIdentifier",new String[]{"1.2.840.113549.1.1.4" , "1.2.840.113549.1.1.5" , "1.2.840.113549.1.1.11" , "1.2.840.113549.1.1.13" , "1.2.840.10040.4.3" , "[其他]"});
        rightsManagementMap.put("permissionAssignment",new String[]{"公布" , "复制" , "浏览" , "解密" , "[其他]"});
        rightsManagementMap.put("controlIdentifier",new String[]{"开放" , "控制" , "[其他]"});
    }
}
