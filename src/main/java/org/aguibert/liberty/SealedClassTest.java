/**
 * Class to test out basic sealed classes
 */
package org.aguibert.liberty;

/**
 * @author GregoryWatts
 *
 */
public class SealedClassTest {

    public static String test() {
        Child c = new Child();
        return c.greetings();
    }
}
