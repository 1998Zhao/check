package com.goxda.check.encapsulation;

import lombok.Data;

@Data
public class LockSignature {
    private String lockedSignatureIdentifier;
    private String signatureRules;
    private String signatureTime;
    private String signer;
    private String signature;
    private CertificateBlock certificateBlock;
    private String signatureAlgorithmIdentifier;
}
