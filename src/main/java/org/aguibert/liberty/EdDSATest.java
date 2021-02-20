package org.aguibert.liberty;

import java.security.KeyFactory;

/**
 *
 * EdDSA algorithm is only available in JDK 15
 *
 */
public class EdDSATest {

    public static String test() throws Exception {
        // The EdDSA algorithm is only available in JDK 15
        // JDK 14 or earlier will fail with - java.security.NoSuchAlgorithmException: EdDSA KeyFactory not available
        KeyFactory kf = null;

        try {
            kf = KeyFactory.getInstance("EdDSA");
            return "Successfully created an EdDSA KeyFactory";
        } catch (Exception e) {
            return "Failed to create an EdDSA KeyFactory";
        }
    }
}
