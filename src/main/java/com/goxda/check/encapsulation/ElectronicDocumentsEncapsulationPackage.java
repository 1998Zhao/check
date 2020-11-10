package com.goxda.check.encapsulation;

import lombok.Data;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;

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
    public void create(){

    }
    public void parse(){

    }

}
