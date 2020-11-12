package com.goxda.check.util;



import com.goxda.check.encapsulation.ElectronicDocumentsEncapsulationPackage;
import com.goxda.check.encapsulation.ElectronicSignatureBlock;
import com.goxda.check.encapsulation.LockSignature;
import com.goxda.check.encapsulation.SignedObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zgq
 */
public class XmlTransferMap {
    /**
     * 判断一个类是JAVA类型还是用户定义类型
     * @param clz
     * @return
     */
    public static boolean isJavaClass(Class<?> clz) {
        return clz != null && clz.getClassLoader() == null;
    }
    public static Map<String,String> map = new HashMap<>(136);
    static {
        map.put("锁定签名","lockSignature");
        map.put("签名规则","");
    }
    static {
        ElectronicDocumentsEncapsulationPackage pkg = new ElectronicDocumentsEncapsulationPackage();
        ElectronicSignatureBlock block = new ElectronicSignatureBlock();
        LockSignature lockSignature = new LockSignature();
        SignedObject object = new SignedObject();
        pkg.setElectronicSignatureBlock(block);
        pkg.setLockSignature(lockSignature);
        pkg.setSignedObject(object);

    }
}
