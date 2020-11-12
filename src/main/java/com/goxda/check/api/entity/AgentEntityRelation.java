package com.goxda.check.api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ah
 * @since 2020-11-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class AgentEntityRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer agentEntityBlockId;

    private String agentEntityId;

    private String relatedAgentIdentifier;

    private String relationType;

    private String relation;

    private String relationDescription;


}
