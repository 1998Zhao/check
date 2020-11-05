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

    public String getArchivesName() {
        return archivesName;
    }

    public String getArchivesIdentifier() {
        return archivesIdentifier;
    }

    public String getFondsName() {
        return fondsName;
    }

    public String getFondsConstitutingUnitName() {
        return fondsConstitutingUnitName;
    }
}
