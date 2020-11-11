package com.goxda.check.api.entity;

import java.time.LocalDateTime;
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
public class LockSignature implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer electronicDocumentsEncapsulationPackageId;

    private String lockedSignatureIdentifier;

    private String signatureRules;

    private LocalDateTime signatureTime;

    private String signer;

    private String signature;

    private String signatureAlgorithmIdentifier;


}
