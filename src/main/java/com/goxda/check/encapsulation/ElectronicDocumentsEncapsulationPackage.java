package com.goxda.check.encapsulation;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 电子文件封装包
 * @author zgq
 */
@Data
@Accessors(chain = true)
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
    private List<ElectronicSignatureBlock> electronicSignatureBlock;
    private List<LockSignature> lockSignature;
    public void create(){

    }
    public void parse(){

    }

}
