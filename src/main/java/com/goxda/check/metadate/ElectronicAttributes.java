package com.goxda.check.metadate;

/**
 * 电子属性
 * 电子文件作为计算机文件所具有的一组特征
 * 子元素 格式信息（M47）计算机文件名（M48）计算机文件大小（M49）文档创建程序（M50）信息系统描述（M51）
 * @author zgq
 */
public class ElectronicAttributes implements IMetadata{
    private String electronicAttributes;
    /**
     * 格式信息
     * 电子文件格式的一组描述信息
     * 建议尽可能选用本元素。使用结构化方式著录，可以是下列形式中的一种：
     * a)	格式名称：XXXX，格式版本：XXX，MIME媒体类型：XXXX；
     * b)	格式注册系统名称：XXXX，注册ID：XXX
     */
    private String formatInformation;
    /**
     * 计算机文件名
     * 标识计算机文件的一组特定字串
     */
    private String computerFileName;
    /**
     * 计算机文件大小
     * 计算机文件的字节数
     */
    private String computerFileSize;
    /**
     * 文档创建程序
     * 形成和处理文档的程序名称和版本
     */
    private String documentCreatingApplication;
    /**
     * 信息系统描述
     * 生成或管理电子文件的信息系统的描述信息
     */
    private String informationSystemDescription;

    public ElectronicAttributes(String electronicAttributes, String formatInformation, String computerFileName, String computerFileSize, String documentCreatingApplication, String informationSystemDescription) {
        this.electronicAttributes = electronicAttributes;
        this.formatInformation = formatInformation;
        this.computerFileName = computerFileName;
        this.computerFileSize = computerFileSize;
        this.documentCreatingApplication = documentCreatingApplication;
        this.informationSystemDescription = informationSystemDescription;
    }

    public String getElectronicAttributes() {
        return electronicAttributes;
    }

    public void setElectronicAttributes(String electronicAttributes) {
        this.electronicAttributes = electronicAttributes;
    }

    public String getFormatInformation() {
        return formatInformation;
    }

    public void setFormatInformation(String formatInformation) {
        this.formatInformation = formatInformation;
    }

    public String getComputerFileName() {
        return computerFileName;
    }

    public void setComputerFileName(String computerFileName) {
        this.computerFileName = computerFileName;
    }

    public String getComputerFileSize() {
        return computerFileSize;
    }

    public void setComputerFileSize(String computerFileSize) {
        this.computerFileSize = computerFileSize;
    }

    public String getDocumentCreatingApplication() {
        return documentCreatingApplication;
    }

    public void setDocumentCreatingApplication(String documentCreatingApplication) {
        this.documentCreatingApplication = documentCreatingApplication;
    }

    public String getInformationSystemDescription() {
        return informationSystemDescription;
    }

    public void setInformationSystemDescription(String informationSystemDescription) {
        this.informationSystemDescription = informationSystemDescription;
    }
}
