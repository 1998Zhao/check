package com.goxda.check.encapsulation;

import lombok.Data;

/**
 * 封装内容
 * @author zgq
 */
@Data
public class EncapsulationContent implements IEncapsulationContent{
    RecordEntityBlock recordEntityBlock;
    BusinessEntityBlock businessEntityBlock;
    AgentEntityBlock agentEntityBlock;
}
