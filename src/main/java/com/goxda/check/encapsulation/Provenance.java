package com.goxda.check.encapsulation;

import com.goxda.check.metadate.IMetadata;
import lombok.Data;

/**
 * 来源
 * 档案馆名称（M3）
 * 档案馆代码（M4）
 * 全宗名称（M5）
 * 立档单位名称（M6）
 * @author zgq
 */
@Data
public class Provenance implements IMetadata {
    private String archivesName;
    private String archivesIdentifier;
    private String fondsName;
    private String fondsConstitutingUnitName;

}
