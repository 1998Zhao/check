package com.goxda.check.metadate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 必选
 * @author zgq
 */
public class MetadataCheck {
    static Set<String> set = new HashSet<String>();
    static {
        set.add("fondsConstitutingUnitName");
        set.add("year");
        set.add("retentionPeriod");
        set.add("title");
        set.add("date");
        set.add("securityClassification");
        set.add("offlineMediumIdentifier");
    }
}
