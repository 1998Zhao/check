package com.goxda.check.metadate;

/**
 * 来源
 * 档案馆名称（M3）
 * 档案馆代码（M4）
 * 全宗名称（M5）
 * 立档单位名称（M6）
 * @author zgq
 */
public class Provenance implements IMetadata{
    private String provenance;
    private String archivesName;
    private String archivesIdentifier;
    private String fondsName;
    private String fondsConstitutingUnitName;

    public String getProvenance() {
        return provenance;
    }

    public void setProvenance(String provenance) {
        this.provenance = provenance;
    }

    public String getArchivesName() {
        return archivesName;
    }

    public void setArchivesName(String archivesName) {
        this.archivesName = archivesName;
    }

    public String getArchivesIdentifier() {
        return archivesIdentifier;
    }

    public void setArchivesIdentifier(String archivesIdentifier) {
        this.archivesIdentifier = archivesIdentifier;
    }

    public String getFondsName() {
        return fondsName;
    }

    public void setFondsName(String fondsName) {
        this.fondsName = fondsName;
    }

    public String getFondsConstitutingUnitName() {
        return fondsConstitutingUnitName;
    }

    public void setFondsConstitutingUnitName(String fondsConstitutingUnitName) {
        this.fondsConstitutingUnitName = fondsConstitutingUnitName;
    }

}
