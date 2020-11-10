package com.goxda.check.encapsulation;

import lombok.Data;

import java.util.Date;

/**
 * @author zgq
 * 被签名对象
 */
@Data
public class SignedObject {
    private PackageEnum type;
    private String packageTypeDescription;
    private Date packageCreationTime;
    /**
     * 创建 或 修改 EEP包的团体或个人
     */
    private String packageCreator;
    private IEncapsulationContent iEncapsulationContent;
}
