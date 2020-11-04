package com.goxda.check.metadate;

import java.util.Date;

/**
 * 电子签名
 * 对电子文件电子签名的一组描述信息
 * 子元素	签名规则（M58）签名时间（M59）签名人（M60）签名结果（M61）证书（M62）证书引证（M63）签名算法标识（M64）
 * @author zgq
 */
public class ElectronicSignature implements IMetadata{
    /**
     * 签名规则
     * 对电子文件的电子签名方法、手段等相关信息的描述
     */
    private String signatureRules;
    /**
     * 签名时间
     * 进行签名的时间
     */
    private Date signatureTime;
    /**
     * 签名人
     * 对电子签名负责的组织或个人
     */
    private String signer;
    /**
     * 电子文件中以电子形式所含、所附用于识别签名人身份并表明签名人认可其中内容的数据
     * 签名结果
     */
    private String signature;
    /**
     * 证书
     * 可证实电子签名人与电子签名制作数据有联系的电子文件或者其他电子记录
     */
    private String certificate;
    /**
     * 证书引证
     * 指向验证签名证书的链接
     */
    private String certificateReference;
    /**
     * 签名算法标识
     * 用于电子签名的算法标识
     */
    private String signatureAlgorithmIdentifier;

    public String getSignatureRules() {
        return signatureRules;
    }

    public void setSignatureRules(String signatureRules) {
        this.signatureRules = signatureRules;
    }

    public Date getSignatureTime() {
        return signatureTime;
    }

    public void setSignatureTime(Date signatureTime) {
        this.signatureTime = signatureTime;
    }

    public String getSigner() {
        return signer;
    }

    public void setSigner(String signer) {
        this.signer = signer;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getCertificateReference() {
        return certificateReference;
    }

    public void setCertificateReference(String certificateReference) {
        this.certificateReference = certificateReference;
    }

    public String getSignatureAlgorithmIdentifier() {
        return signatureAlgorithmIdentifier;
    }

    public void setSignatureAlgorithmIdentifier(String signatureAlgorithmIdentifier) {
        this.signatureAlgorithmIdentifier = signatureAlgorithmIdentifier;
    }
}
