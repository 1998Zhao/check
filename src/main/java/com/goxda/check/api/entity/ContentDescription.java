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
public class ContentDescription implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer recordEntityId;

    private String title;

    private String parallelTitle;

    private String alternativeTitle;

    private String otherTitleInformation;

    private String descriptor;

    private String keyword;

    private String personalName;

    private String abstracts;

    private String classCode;

    private String documentNumber;

    private String author;

    private String date;

    private String documentType;

    private String precedence;

    private String principalReceiver;

    private String otherReceivers;

    private String securityClassification;

    private String secrecyPeriod;


}
