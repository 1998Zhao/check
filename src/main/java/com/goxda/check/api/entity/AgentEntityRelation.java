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
public class AgentEntityRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 机构人员标识符
     */
    @TableId(value = "agentEntity_identifier", type = IdType.ASSIGN_ID)
    private Long agentEntityIdentifier;

    /**
     * 被关联机构人员标识符
     */
    private Long relatedAgentIdentifier;

    /**
     * 关系类型
     */
    private Long relationType;

    /**
     * 关系
     */
    private Long relation;

    /**
     * 关系描述
     */
    private Long relationDescription;


}
