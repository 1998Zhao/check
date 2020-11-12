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
public class ElectronicAttributes implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer encodingId;

    private String formatInformation;

    private String computerFileName;

    private String computerFileSize;

    private String documentCreatingApplication;

    private String informationSystemDescription;


}
