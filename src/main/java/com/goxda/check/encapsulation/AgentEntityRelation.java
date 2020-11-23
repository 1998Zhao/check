package com.goxda.check.encapsulation;

import lombok.Data;

/**
 * M228 机构人员标识符
 *─M232 被关联机构人员标识符
 * ─M86 关系类型
 *─M87 关系
 * ─M88 关系描述
 * @author zgq
 */
@Data
public class AgentEntityRelation {
    private String agentEntityId;
    private String relatedAgentIdentifier;
    private String relationType;
    private String relation;
    private String relationDescription;
}
