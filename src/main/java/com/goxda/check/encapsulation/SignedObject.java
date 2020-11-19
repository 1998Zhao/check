package com.goxda.check.encapsulation;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author zgq
 * 被签名对象
 */
@Data
public class SignedObject {
    private PackageEnum type;
    private String packageTypeDescription;
    private String packageCreationTime;
    /**
     * 创建 或 修改 EEP包的团体或个人
     */
    private String packageCreator;
    private List<IEncapsulationContent> iEncapsulationContents;
}
