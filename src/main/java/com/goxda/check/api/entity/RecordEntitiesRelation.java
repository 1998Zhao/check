package com.goxda.check.api.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ah
 * @since 2020-11-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class RecordEntitiesRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文件标识符
     */
    @TableId(value = "record_identifier", type = IdType.ASSIGN_ID)
    private Long recordIdentifier;

    /**
     * 被关联文件标识符
     */
    private Long relatedRecordIdentifier;

    /**
     * 关系类型
     */
    private String relationType;

    /**
     * 关系
     */
    private String relation;

    /**
     * 关系描述
     */
    private String relationDescription;


}
