package com.goxda.check.encapsulation;

import lombok.Data;

import java.util.List;
/**
 *  业务实体块
 *  M226 业务实体
 *  @author zgq
 */
@Data
public class BusinessEntityBlock {
    private List<BusinessEntity> businessEntities;
}
