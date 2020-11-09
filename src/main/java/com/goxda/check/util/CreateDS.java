package com.goxda.check.util;

import java.io.*;
import java.security.*;

/**
 *
 * @author gg
 */
public class CreateDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            // Generate public and private key
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA", "SUN");
            SecureRandom random = SecureRandom.getInstance("SHA512PRNG", "SUN");
            keyGen.initialize(256, random);
            KeyPair pair = keyGen.generateKeyPair();
            PrivateKey priv = pair.getPrivate();
            PublicKey pub = pair.getPublic();
            Signature dsa = Signature.getInstance("SHA1withDSA", "SUN");
            dsa.initSign(priv);
            FileInputStream fis = new FileInputStream("D:\\aa\\22.docx");
            BufferedInputStream bufin = new BufferedInputStream(fis);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bufin.read(buffer)) >= 0) {
                dsa.update(buffer, 0, len);
            };
            bufin.close();
            byte[] realSig = dsa.sign();
            byte[] publickey = pub.getEncoded();
            //GUARDAR LA FIRMA Y LA CLAVE PUBLICA EN FICHEROS
            FileOutputStream fos = new FileOutputStream("D:\\aa\\signature.obj");
            fos.write(realSig);
            fos.close();
            fos = new FileOutputStream("D:\\aa\\publicKey.obj");
            fos.write(publickey);
            fos.close();
            System.out.println("Digital signature created.");
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e.toString());
        }
    }

}
