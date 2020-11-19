package com.goxda.check.encapsulation;

import lombok.Data;

import java.util.List;

/**
 * 文件实体块
 * @author zgq
 */
@Data
public class RecordEntityBlock {
    List<RecordEntity> recordEntities;
    RecordEntitiesRelation recordEntitiesRelation;
}
