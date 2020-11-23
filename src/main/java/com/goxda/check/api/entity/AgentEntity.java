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
public class AgentEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "agent_entity_id", type = IdType.ASSIGN_ID)
    private Long agentEntityId;

    private String agentType;

    private String agentName;

    private String organizationCode;

    private String positionName;


}
