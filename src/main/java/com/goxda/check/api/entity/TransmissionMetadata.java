package com.goxda.check.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2020-11-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TransmissionMetadata extends Metadata implements Serializable,IMetadata {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 起草
     */
    private String draft;

    /**
     * 审核
     */
    private String check;

    /**
     * 签发
     */
    private String signDistribution;

    /**
     * 复核
     */
    private String review;

    /**
     * 登记
     */
    private String register;

    /**
     * 用印
     */
    private String seal;

    /**
     * 核发
     */
    private String issuance;

    @Override
    public String toString() {
        return "TransmissionMetadata{" +
                "id=" + id +
                ", draft='" + draft + '\'' +
                ", check='" + check + '\'' +
                ", signDistribution='" + signDistribution + '\'' +
                ", review='" + review + '\'' +
                ", register='" + register + '\'' +
                ", seal='" + seal + '\'' +
                ", issuance='" + issuance + '\'' +
                ", entryid='" + entryid + '\'' +
                ", aggregationLevel='" + aggregationLevel + '\'' +
                ", provenance='" + provenance + '\'' +
                ", archivesName='" + archivesName + '\'' +
                ", archivesIdentifier='" + archivesIdentifier + '\'' +
                ", fondsName='" + fondsName + '\'' +
                ", fondsConstitutingUnitName='" + fondsConstitutingUnitName + '\'' +
                ", electronicRecordCode='" + electronicRecordCode + '\'' +
                ", archivalCode='" + archivalCode + '\'' +
                ", fondsIdentifier='" + fondsIdentifier + '\'' +
                ", catalogueNumber='" + catalogueNumber + '\'' +
                ", year=" + year +
                ", retentionPeriod='" + retentionPeriod + '\'' +
                ", organizationalStructureOrFunction='" + organizationalStructureOrFunction + '\'' +
                ", categoryCode='" + categoryCode + '\'' +
                ", agencyFileNumber='" + agencyFileNumber + '\'' +
                ", archivesFileNumber='" + archivesFileNumber + '\'' +
                ", agencyItemNumber=" + agencyItemNumber +
                ", archivesItemNumber=" + archivesItemNumber +
                ", documentSequenceNumber='" + documentSequenceNumber + '\'' +
                ", pageNumber='" + pageNumber + '\'' +
                ", contentDescription='" + contentDescription + '\'' +
                ", title='" + title + '\'' +
                ", parallelTitle='" + parallelTitle + '\'' +
                ", alternativeTitle='" + alternativeTitle + '\'' +
                ", otherTitleInformation='" + otherTitleInformation + '\'' +
                ", descriptor='" + descriptor + '\'' +
                ", keyword='" + keyword + '\'' +
                ", personalName='" + personalName + '\'' +
                ", abstractMsg='" + abstractMsg + '\'' +
                ", classCode='" + classCode + '\'' +
                ", documentNumber='" + documentNumber + '\'' +
                ", author='" + author + '\'' +
                ", date='" + date + '\'' +
                ", documentType='" + documentType + '\'' +
                ", precedence='" + precedence + '\'' +
                ", principalReceiver='" + principalReceiver + '\'' +
                ", otherReceivers='" + otherReceivers + '\'' +
                ", securityClassification='" + securityClassification + '\'' +
                ", secrecyPeriod='" + secrecyPeriod + '\'' +
                ", formalCharacteristics='" + formalCharacteristics + '\'' +
                ", documentAggregationType='" + documentAggregationType + '\'' +
                ", totalNumberOfItems=" + totalNumberOfItems +
                ", totalNumberOfPages=" + totalNumberOfPages +
                ", language='" + language + '\'' +
                ", manuscriptType='" + manuscriptType + '\'' +
                ", electronicAttributes='" + electronicAttributes + '\'' +
                ", formatInformation='" + formatInformation + '\'' +
                ", computerFileName='" + computerFileName + '\'' +
                ", computerFileSize='" + computerFileSize + '\'' +
                ", documentCreatingApplication='" + documentCreatingApplication + '\'' +
                ", informationSystemDescription='" + informationSystemDescription + '\'' +
                ", digitizationAttributes='" + digitizationAttributes + '\'' +
                ", physicalRecordCharacteristics='" + physicalRecordCharacteristics + '\'' +
                ", scanningResolution='" + scanningResolution + '\'' +
                ", scanningColorModel='" + scanningColorModel + '\'' +
                ", imageCompressionScheme='" + imageCompressionScheme + '\'' +
                ", electronicSignature='" + electronicSignature + '\'' +
                ", signatureRules='" + signatureRules + '\'' +
                ", signatureTime=" + signatureTime +
                ", signer='" + signer + '\'' +
                ", signature='" + signature + '\'' +
                ", certificate='" + certificate + '\'' +
                ", certificateReference='" + certificateReference + '\'' +
                ", signatureAlgorithmIdentifier='" + signatureAlgorithmIdentifier + '\'' +
                ", storageLocation='" + storageLocation + '\'' +
                ", currentLocation='" + currentLocation + '\'' +
                ", offlineMediumIdentifier='" + offlineMediumIdentifier + '\'' +
                ", offlineMediumStorageLocation='" + offlineMediumStorageLocation + '\'' +
                ", microformIdentifier='" + microformIdentifier + '\'' +
                ", rightsManagement='" + rightsManagement + '\'' +
                ", intellectualPropertyStatement='" + intellectualPropertyStatement + '\'' +
                ", authorizedAgent='" + authorizedAgent + '\'' +
                ", permissionAssignment='" + permissionAssignment + '\'' +
                ", controlIdentifier='" + controlIdentifier + '\'' +
                ", annotation='" + annotation + '\'' +
                ", agentType='" + agentType + '\'' +
                ", agentName='" + agentName + '\'' +
                ", organizationCode='" + organizationCode + '\'' +
                ", positionName='" + positionName + '\'' +
                ", businessStatus='" + businessStatus + '\'' +
                ", businessActivity='" + businessActivity + '\'' +
                ", actionTime='" + actionTime + '\'' +
                ", actionMandate='" + actionMandate + '\'' +
                ", actionDescription='" + actionDescription + '\'' +
                ", entityIdentifier='" + entityIdentifier + '\'' +
                ", relationType='" + relationType + '\'' +
                ", relation='" + relation + '\'' +
                ", relationDescription='" + relationDescription + '\'' +
                '}';
    }
}
