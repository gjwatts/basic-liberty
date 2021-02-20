/**
 * Class to test out basic sealed classes
 */
package org.aguibert.liberty;

/**
 * @author GregoryWatts
 *
 */
public sealed class Parent permits org.aguibert.liberty.Child {

    public String greetings() {
        return "Hello from the parent";
    }
}
