package com.goxda.check.api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

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
public class LockSignature implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer electronicDocumentsEncapsulationPackageId;

    private String lockedSignatureIdentifier;

    private String signatureRules;

    private LocalDateTime signatureTime;

    private String signer;

    private String signature;

    private String signatureAlgorithmIdentifier;

    private Integer originalEncapsulationPackageId;


}
