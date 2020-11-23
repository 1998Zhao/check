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
public class BusinessEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 业务标识符
     */
    @TableId(value = "business_entity_identifier", type = IdType.ASSIGN_ID)
    private Long businessEntityIdentifier;

    /**
     * 机构人员标识符
     */
    private Long agentEntityIdentifier;

    /**
     * 文件标识符
     */
    private Long recordIdentifier;

    /**
     * 业务状态
     */
    private String businessStatus;

    /**
     * 业务行为
     */
    private String businessActivity;

    /**
     * 行为时间
     */
    private String actionTime;

    /**
     * 行为依据
     */
    private String actionMandate;

    /**
     * 行为描述
     */
    private String actionDescription;


}
