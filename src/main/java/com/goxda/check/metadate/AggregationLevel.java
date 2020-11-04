package com.goxda.check.metadate;

/**
 * @author zgq
 */
public class AggregationLevel implements IMetadata{
    private String aggregationLevel;

    public String getAggregationLevel() {
        return aggregationLevel;
    }

    public void setAggregationLevel(String aggregationLevel) {
        this.aggregationLevel = aggregationLevel;
    }

    public AggregationLevel() {
    }

    public AggregationLevel(String aggregationLevel) {
        this.aggregationLevel = aggregationLevel;
    }
}
