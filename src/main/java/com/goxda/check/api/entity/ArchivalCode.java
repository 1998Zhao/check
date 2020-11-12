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
public class ArchivalCode implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer recordEntityId;

    private String archivalCodeRule;

    private String archivalCode;

    private String fondsIdentifier;

    private String catalogueNumber;

    private String year;

    private String retentionPeriod;

    private String organizationalStructureOrFunction;

    private String categoryCode;

    private String agencyFileNumber;

    private String archivesFileNumber;

    private Integer archivesItemNumber;

    private String documentSequenceNumber;

    private String pageNumber;


}
