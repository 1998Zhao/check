package com.goxda.check.api.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ah
 * @since 2020-11-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BusinessEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer businessEntityIdentifier;

    private Integer businessEntityBlockId;

    private String agentEntityIdentifier;

    private String recordIdentifier;

    private String businessStatus;

    private String businessActivity;

    private String actionTime;

    private String actionMandate;

    private String actionDescription;


}
