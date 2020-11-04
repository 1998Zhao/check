package com.goxda.check.check.authenticity;



import com.goxda.check.metadate.IMetadata;
import com.goxda.check.metadate.Metadata;
import com.goxda.check.metadate.fixity.FixityInformation;
import com.goxda.check.result.Result;

import java.lang.reflect.Field;

/**
 * 来源真实性检测 元数据真实性检测 电子文件真实 元数据与内容关联真实性检测 归档信息包真实性检测
 * @author zgq
 * createTime 2020-10-27
 */
public interface IAuthenticity {
    /**
     * 来源真实性检测 检测项目为固化信息有效性检测
     * @return 是否通过
     */
    Result provenanceAuthenticity();

    /**
     * 元数据真实性检测
     * @return 是否通过
     */
    Result metadataAuthenticity();

    /**
     * 电子文件真实
     * @return 是否通过
     */
    Result electronicDocumentAuthenticity();

    /**
     * 元数据与内容关联真实性检测
     * @return 是否通过
     */
    boolean metadataRelevanceDocumentAuthenticity();

    /**
     *  asd
     * @return 是否通过
     */
    boolean archivePacketAuthenticity();

    /**
     * 获取元数据的子元素
     * @param metadata 元数据
     * @return 子元素数组
     */
    default IMetadata[] getAllIMetadata(Metadata metadata){
        try{
            Class c = metadata.getClass();
            Field[] fields = c.getDeclaredFields();
            IMetadata [] array= new IMetadata[fields.length];
            for (int i=0;i<fields.length;i++) {
                fields[i].setAccessible(true);
                array[i]= (IMetadata) fields[i].get(metadata);
            }
            return array;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }

    }
}
