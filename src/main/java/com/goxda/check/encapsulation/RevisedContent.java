package com.goxda.check.encapsulation;

import lombok.Data;

/**
 * 文件实体块（M210）
 * 业务实体块（M225）
 * 机构人员实体块（M229）
 * @author admin
 */
@Data
public class RevisedContent {
    private RecordEntityBlock recordEntityBlock;
    private BusinessEntityBlock businessEntityBlock;
    private AgentEntityBlock agentEntityBlock;
}
