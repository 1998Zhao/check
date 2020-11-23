package com.goxda.check.encapsulation;

import lombok.Data;

/**
 * M227 业务标识符
 *─M228 机构人员标识符
 *─M223 文件标识符
 *─M80 业务状态
 *─M81 业务行为
 *─M82 行为时间
 *─M83 行为依据
 *─M84 行为描述
 * @author zgq
 */
@Data
public class BusinessEntity {
    private String businessEntityIdentifier;
    private String agentEntityIdentifier;
    private String recordIdentifier;
    private String businessStatus;
    private String businessActivity;
    private String actionTime;
    private String actionMandate;
    private String actionDescription;
}
