package com.goxda.check.encapsulation;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 电子文件封装包
 * @author zgq
 */
@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ElectronicDocumentsEncapsulationPackage {
    /**
     * 格式描述
     */
    private String formatDescription;
    /**
     * 版本
     */
    private String version;
    /**
     * 被签名对象
     */
    private SignedObject signedObject;
    /**
     * 电子签名块
     */
    private ElectronicSignatureBlock electronicSignatureBlock;
    private LockSignature lockSignature;
    public void create(){

    }
    public void parse(){

    }

}
