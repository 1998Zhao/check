package com.goxda.check.encapsulation;

import com.goxda.check.metadate.IMetadata;
import lombok.Data;

/**
 * 电子属性
 * 电子文件作为计算机文件所具有的一组特征
 * 子元素 格式信息（M47）计算机文件名（M48）计算机文件大小（M49）文档创建程序（M50）信息系统描述（M51）
 * @author zgq
 */
@Data
public class ElectronicAttributes implements IMetadata {
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

    public ElectronicAttributes(String formatInformation, String computerFileName, String computerFileSize, String documentCreatingApplication, String informationSystemDescription) {
        this.formatInformation = formatInformation;
        this.computerFileName = computerFileName;
        this.computerFileSize = computerFileSize;
        this.documentCreatingApplication = documentCreatingApplication;
        this.informationSystemDescription = informationSystemDescription;
    }


}
