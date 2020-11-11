package com.goxda.check.encapsulation;

import lombok.Data;

/**
 * 电子文件封装包
 * @author zgq
 */
@Data
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
