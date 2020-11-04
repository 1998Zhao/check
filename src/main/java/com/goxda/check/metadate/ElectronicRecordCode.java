package com.goxda.check.metadate;

/**
 * @author zgq
 */
public class ElectronicRecordCode implements IMetadata{
    private String electronicRecordCode;

    public ElectronicRecordCode(String electronicRecordCode) {
        this.electronicRecordCode = electronicRecordCode;
    }

    public ElectronicRecordCode() {
    }

    public String getElectronicRecordCode() {
        return electronicRecordCode;
    }

    public void setElectronicRecordCode(String electronicRecordCode) {
        this.electronicRecordCode = electronicRecordCode;
    }
}
