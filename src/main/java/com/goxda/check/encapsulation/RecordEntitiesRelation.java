package com.goxda.check.encapsulation;

import lombok.Data;

/**
 * M223 文件标识符
 * M224 被关联文件标识符
 * M86  关系类型
 * M87 关系
 * M88 关系描述
 * @author zgq
 */
@Data
public class RecordEntitiesRelation {
    private String recordIdentifier;
    private String relatedRecordIdentifier;
    private String relationType;
    private String relation;
    private String relationDescription;
}
