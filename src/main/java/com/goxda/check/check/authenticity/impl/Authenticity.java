package com.goxda.check.check.authenticity.impl;

import com.goxda.check.api.entity.CheckStep;
import com.goxda.check.check.authenticity.IAuthenticity;
import com.goxda.check.metadate.IMetadata;
import com.goxda.check.metadate.Metadata;
import com.goxda.check.metadate.aip.ArchivalInformationPackage;
import com.goxda.check.metadate.fixity.FixityInformation;
import com.goxda.check.result.Result;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 真实性检测
 * @author zgq
 * createTime 2020-10-27
 */
public class Authenticity implements IAuthenticity {
    /**
     * 真实性检测环节
     */
    private final CheckStep checkStep;
    /**
     * 元数据
     */
    private final Metadata metadata;
    /**
     * 归档信息包
     */
    private final ArchivalInformationPackage aip;
    /**
     * 固化信息
     */
    private final FixityInformation fixityInformation;


    public Authenticity(CheckStep checkStep, Metadata metadata, ArchivalInformationPackage aip, FixityInformation fixityInformation) {
        this.checkStep = checkStep;
        this.metadata = metadata;
        this.aip = aip;
        this.fixityInformation = fixityInformation;
    }

    /**
     * 来源真实性检测 检测项目为固化信息有效性检测
     * 对归档电子文件中包含的数字摘要、电子签名、电子印章、时间戳等技术措施的固化信息的有效性进行验证
     * @return 是否通过
     */
    @Override
    public Result provenanceAuthenticity() {
        //数字摘要、电子签名、电子印章、时间戳

        return null;
    }

    /**
     * 数字摘要检测
     * @return 1
     */
    public Result messageDigestCheck(){
        return null;
    }
    /**
     * 电子签名检测
     * @return 1
     */
    public Result digitalSignaturesCheck(){
        return null;
    }
    /**
     * 电子印章检测
     * @return 1
     */
    public Result electronicSealCheck(){
        return null;
    }
    /**
     * 时间戳检测
     * @return 1
     */
    public Result timeStampCheck(){
        return null;
    }


    /**
     * 电子文件元数据准确性
     * 元数据项数据长度检测 a) 对数据库中电子文件元数据项进行数据项长度检测；b) 对归档信息包中元数据项进行长度检测。
     * 元数据项数据类型、格式检测 a) 对数据库中电子文件元数据项进行数据类型和格式的检测；b) 对归档信息包中元数据项进行数据类型和格式的检测
     * 设定值域的元数据项值域符合度检测 a) 对数据库中电子文件元数据项进行值域范围的检测；b) 对归档信息包中元数据项进行值域范围的检测。
     * 元数据项数据值合理性检测 a) 对数据库中电子文件元数据项进行数据值是否在合理范围内的检测；b) 对归档信息包中元数据项进行数据值是否在合理范围内的检测
     * 元数据项数据包含特殊字符检测 a) 对数据库中电子文件元数据项进行数据值是否包含特殊字符的检测；b) 对归档信息包中元数据项进行数据值是否包含特殊字符的检测
     * 档号规范性检测 a) 对数据库中的归档号/档号进行检测；b) 对归档信息包中的归档号/档号进行检测。
     * 元数据项数据重复性检测 依据用户自定义的元数据项（如：档号、文号、题名）进行数据库记录和归档信息包的数据重复性检测
     * @return 是否通过
     */
    @Override
    public Result metadataAuthenticity() {
        return null;
    }

    /**
     * 对数据库中电子文件元数据项进行数据项长度检测
     * 检查其是否为空 再检查长度
     * @return 1
     */
    public Result databaseMDLenCheck(){
        
        return null;
    }

    /**
     * 对归档信息包中元数据项进行长度检测
     * @return 1
     */
    public Result archivalMDLenCheck(){
        return null;
    }
    /**
     * 对数据库中电子文件元数据项进行数据类型和格式的检测
     * @return 1
     */
    public Result databaseMDTypeCheck(){
        return null;
    }

    /**
     * 对归档信息包中元数据项进行数据类型和格式的检测
     * @return 1
     */
    public Result archivalMDTypeCheck(){
        return null;
    }
    /**
     * 对数据库中电子文件元数据项进行值域范围的检测
     * @return 1
     */
    public Result databaseMDRangeCheck(){

        return null;
    }

    /**
     * 对归档信息包中元数据项进行值域范围的检测
     * @return 1
     */
    public Result archivalMDRangeCheck(){
        return null;
    }
    /**
     * 对数据库中电子文件元数据项进行数据值是否在合理范围内的检测
     * @return 1
     */
    public Result databaseMDRationalCheck(){
        return null;
    }
    /**
     * 对归档信息包中元数据项进行数据值是否在合理范围内的检测
     * @return 1
     */
    public Result archivalMDRationalCheck(){
        return null;
    }
    /**
     * 对数据库中电子文件元数据项进行数据值是否包含特殊字符的检测
     * @return 1
     */
    public Result databaseMDCharCheck(){
        return null;
    }
    /**
     * 对归档信息包中元数据项进行数据值是否包含特殊字符的检测
     * @return 1
     */
    public Result archivalMDCharCheck(){
        return null;
    }
    /**
     * 对归档信息包中中的归档号/档号进行检测
     * @return 1
     */
    public Result archivalMDCodeCheck(){
        return null;
    }
    /**
     * 对数据库中的归档号/档号进行检测
     * @return 1
     */
    public Result databaseMDCodeCheck(){
        return null;
    }
    /**
     * @return 1
     * 重复性检验
     */
    public Result databaseMDRepeatCheck(){
        return null;
    }
    /**
     * 重复性检验
     */
    public Result archivalMDRepeatCheck(){
        return null;
    }
    /**
     * 电子文件真实
     * @return 是否通过
     */
    @Override
    public Result electronicDocumentAuthenticity() {
        return new Result(true);
    }

    /**
     * 元数据与内容关联真实性检测
     *
     * @return 是否通过
     */
    @Override
    public boolean metadataRelevanceDocumentAuthenticity() {
        return false;
    }

    /**
     * 归档信息包真实性检测
     *
     * @return 是否通过
     */
    @Override
    public boolean archivePacketAuthenticity() {
        return false;
    }

}
