package com.goxda.check.metadate;
/**
 *  存储位置
 * 对电子文件物理和逻辑存址的一组描述信息
 * @author zgq
 */
public class StorageLocation implements IMetadata{
    private String storageLocation;
    /**
     * 当前位置
     * 电子文件在文档管理系统中存储位置
     */
    private String currentLocation;
    /**
     * 脱机载体编号
     * 电子文件脱机存储载体排列顺序的一组代码
     */
    private String offlineMediumIdentifier;
    /**
     * 脱机载体存址
     * 电子文件脱机载体的存放位置
     */
    private String offlineMediumStorageLocation;
    /**
     * 缩微号
     * 与电子文件对应的缩微胶片的编号
     */
    private String microformIdentifier;

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getOfflineMediumIdentifier() {
        return offlineMediumIdentifier;
    }

    public void setOfflineMediumIdentifier(String offlineMediumIdentifier) {
        this.offlineMediumIdentifier = offlineMediumIdentifier;
    }

    public String getOfflineMediumStorageLocation() {
        return offlineMediumStorageLocation;
    }

    public void setOfflineMediumStorageLocation(String offlineMediumStorageLocation) {
        this.offlineMediumStorageLocation = offlineMediumStorageLocation;
    }

    public String getMicroformIdentifier() {
        return microformIdentifier;
    }

    public void setMicroformIdentifier(String microformIdentifier) {
        this.microformIdentifier = microformIdentifier;
    }
}
