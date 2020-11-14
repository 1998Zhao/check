//package com.goxda.check.factory;
//
//
//import com.goxda.check.api.service.IMetadataService;
//import com.goxda.check.api.service.impl.MetadataServiceImpl;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @author zgq
// */
//public class Singleton  {
//    public Singleton(){
//
//    }
//    private final static Map<Class<? extends Singleton >,Singleton > INSTANCES_MAP =new HashMap<>();
//    public static <E extends Singleton > Singleton  getInstance(Class<E> instanceClass) throws IllegalAccessException, InstantiationException {
//        synchronized (Singleton .class){
//            if (INSTANCES_MAP.containsKey(instanceClass)){
//                return INSTANCES_MAP.get(instanceClass);
//            }
//            else {
//                E instance = instanceClass.newInstance();
//                INSTANCES_MAP.put(instanceClass, instance);
//                return instance;
//            }
//        }
//    }
//}
