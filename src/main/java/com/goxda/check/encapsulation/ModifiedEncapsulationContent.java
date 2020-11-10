package com.goxda.check.encapsulation;

import lombok.Data;

/**
 * @author zgq
 * 修改封装内容
 *
 */
@Data
public class ModifiedEncapsulationContent implements IEncapsulationContent{
    private String modificationIdentifier;
    private OriginalEncapsulationPackage originalEncapsulationPackage;
    private RevisedContent revisedContent;
}
