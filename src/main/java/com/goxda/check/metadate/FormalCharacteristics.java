package com.goxda.check.metadate;

/**
 * 形式特征
 * 电子文件外在征象
 * 记录电子文件形式特征信息，利于电子文件的统计和利用
 * 文件组合类型（M41）
 * 件数（M42）
 * 页数（M43）
 * 语种（M44）
 * 稿本（M45）
 * @author zgq
 */
public class FormalCharacteristics implements IMetadata{
    private String formalCharacteristics;
    /**
     * 文件组合类型
     * 文件级聚合层次上文档聚合状况的分类
     */
    private String documentAggregationType;
    /**
     * 件数
     * 案卷内文件的数量
     */
    private int totalNumberOfItems;
    /**
     * 页数
     * 双套保存时，与电子文件对应的纸质文件/档案的页数
     */
    private int totalNumberOfPages;
    /**
     * 语种
     * 电子文件正文所使用的语言的类别
     */
    private String language;
    /**
     * 稿本
     * 文件的文稿、文本和版本
     * 值域 ：草稿 定稿 正本 副本 试行本 修订本 [其他]
     */
    private String manuscriptType;

    public String getFormalCharacteristics() {
        return formalCharacteristics;
    }

    public void setFormalCharacteristics(String formalCharacteristics) {
        this.formalCharacteristics = formalCharacteristics;
    }

    public String getDocumentAggregationType() {
        return documentAggregationType;
    }

    public void setDocumentAggregationType(String documentAggregationType) {
        this.documentAggregationType = documentAggregationType;
    }

    public int getTotalNumberOfItems() {
        return totalNumberOfItems;
    }

    public void setTotalNumberOfItems(int totalNumberOfItems) {
        this.totalNumberOfItems = totalNumberOfItems;
    }

    public int getTotalNumberOfPages() {
        return totalNumberOfPages;
    }

    public void setTotalNumberOfPages(int totalNumberOfPages) {
        this.totalNumberOfPages = totalNumberOfPages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getManuscriptType() {
        return manuscriptType;
    }

    public void setManuscriptType(String manuscriptType) {
        this.manuscriptType = manuscriptType;
    }
}
