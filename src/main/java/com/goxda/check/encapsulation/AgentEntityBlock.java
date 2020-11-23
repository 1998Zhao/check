package com.goxda.check.encapsulation;

import lombok.Data;

import java.util.List;

/**
 * @author zgq
 */
@Data
public class AgentEntityBlock {
    private List<AgentEntity> agentEntity;
    private List<AgentEntityRelation> agentEntityRelation;
}
