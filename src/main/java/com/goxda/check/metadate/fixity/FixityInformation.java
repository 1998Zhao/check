package com.goxda.check.metadate.fixity;

import java.util.Date;

/**
 * 固化信息
 * 数字摘要、电子签名、电子印章、时间戳等技术措施的固化信息
 * 电子签名 非对称加密
 * 1.A要向B发送信息，A和B都要产生一对用于加密和解密的公钥和私钥。
 * 2.A的私钥保密，A的公钥告诉B；B的私钥保密，B的公钥告诉A。
 * 3.A要给B发送信息时，A用B的公钥加密信息，因为A知道B的公钥。
 * 4.A将这个消息发给B（已经用B的公钥加密消息）。
 * 5.B收到这个消息后，B用自己的私钥解密A的消息。其他所有收到这个报文的人都无法解密，因为只有B才有B的私钥。
 * 解密完成之后得到数字摘要 同时对比收到的数字摘要和解密的数字摘要 即可得到文件是否被修改
 * @author zgq
 * @create time 2020-11-03
 */
public class FixityInformation {
    private String entryId;
    /**
     * 数字摘要
     */
    private String messageDigest;
    /**
     * 电子签名
     */
    private String digitalSignatures;
    /**
     * 电子印章
     */
    private String electronicSeal;
    /**
     * 时间戳
     */
    private Date timeStamp;

    public String getEntryId() {
        return entryId;
    }

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    public String getMessageDigest() {
        return messageDigest;
    }

    public void setMessageDigest(String messageDigest) {
        this.messageDigest = messageDigest;
    }

    public String getDigitalSignatures() {
        return digitalSignatures;
    }

    public void setDigitalSignatures(String digitalSignatures) {
        this.digitalSignatures = digitalSignatures;
    }

    public String getElectronicSeal() {
        return electronicSeal;
    }

    public void setElectronicSeal(String electronicSeal) {
        this.electronicSeal = electronicSeal;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
}
