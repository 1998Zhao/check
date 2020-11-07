package com.goxda.check.factory;


import com.goxda.check.api.service.IMetadataService;
import com.goxda.check.api.service.impl.MetadataServiceImpl;

/**
 * @author zgq
 */
public class MetadataServiceSingle {
    private static IMetadataService instance;
    private MetadataServiceSingle(){}
    public static IMetadataService getInstance(){
        if(instance == null) {
            synchronized(MetadataServiceSingle.class) {
                if(instance == null) {
                    instance = new MetadataServiceImpl();
                }
            }
        }
        return instance;
    }
}
