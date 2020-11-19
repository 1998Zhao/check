package com.goxda.check.check.security;

import java.util.Map;

/**
 * 归档信息包病毒检测,归档载体安全性检测,归档过程安全性检测
 * @author zgq
 * createTime 2020-10-27
 */
public interface ISecurityCheck {
    /**
     * 归档信息包病毒检测
     * @param filepath 文件绝对路径
     * @return 是否通过
     */
    Map<String,String> virusOfArchivePackageDetection(String filepath);
    /**
     * 归档载体安全性检测
     * @return 是否通过
     */
    boolean vectorSecurityDetection();
    /**
     * 归档过程安全性检测
     * @return 是否通过
     */
    boolean processSecurityDetection();
}
