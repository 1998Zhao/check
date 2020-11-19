package com.goxda.check.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import com.goxda.check.api.entity.inte.IMetadata;
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
public class AccessionMetadata extends Metadata implements Serializable, IMetadata {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 签收
     */
    private String signFor;

    /**
     * 登记
     */
    private String register;

    /**
     * 初审
     */
    private String firstCheck;

    /**
     * 承办
     */
    private String undertake;

    /**
     * 传阅
     */
    private String circulate;

    /**
     * 催办
     */
    private String reminder;

    /**
     * 答复
     */
    private String reply;

    @Override
    public String toString() {
        return "AccessionMetadata{" +
                "id=" + id +
                ", signFor='" + signFor + '\'' +
                ", register='" + register + '\'' +
                ", firstCheck='" + firstCheck + '\'' +
                ", undertake='" + undertake + '\'' +
                ", circulate='" + circulate + '\'' +
                ", reminder='" + reminder + '\'' +
                ", reply='" + reply + '\'' +
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
//                ", electronicAttributes='" + electronicAttributes + '\'' +
//                ", formatInformation='" + formatInformation + '\'' +
//                ", computerFileName='" + computerFileName + '\'' +
//                ", computerFileSize='" + computerFileSize + '\'' +
//                ", documentCreatingApplication='" + documentCreatingApplication + '\'' +
//                ", informationSystemDescription='" + informationSystemDescription + '\'' +
//                ", digitizationAttributes='" + digitizationAttributes + '\'' +
//                ", physicalRecordCharacteristics='" + physicalRecordCharacteristics + '\'' +
//                ", scanningResolution='" + scanningResolution + '\'' +
//                ", scanningColorModel='" + scanningColorModel + '\'' +
//                ", imageCompressionScheme='" + imageCompressionScheme + '\'' +
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
