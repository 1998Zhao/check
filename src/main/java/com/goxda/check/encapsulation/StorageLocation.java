package com.goxda.check.encapsulation;

import com.goxda.check.metadate.IMetadata;
import lombok.Data;

/**
 *  存储位置
 * 对电子文件物理和逻辑存址的一组描述信息
 * @author zgq
 */
@Data
public class StorageLocation implements IMetadata {
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


}
