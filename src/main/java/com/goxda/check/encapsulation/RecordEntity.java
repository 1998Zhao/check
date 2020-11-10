package com.goxda.check.encapsulation;

import com.goxda.check.metadate.RightsManagement;
import lombok.Data;

/**
 * 文件实体
 * @author zgq
 */
@Data
public class RecordEntity {
    /**
     * 聚合类型
     */
    private String aggregationLevel;
    /**
     * 来源
     */
    private Provenance provenance;
    private String electronicRecordCode;
    private ArchivalCode archivalCode;
    private ContentDescription contentDescription;
    private FormalCharacteristics formalCharacteristics;
    private StorageLocation storageLocation;
    private RightsManagement rightsManagement;
    /**
     * 信息系统描述
     */
    private String informationSystemDescription;
    /**
     * 附注
     */
    private String annotation;
}
