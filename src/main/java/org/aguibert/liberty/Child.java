/**
 * Class to test out basic sealed classes
 */
package org.aguibert.liberty;

/**
 * @author GregoryWatts
 *
 */
public non-sealed class Child extends Parent {

    public Child() {
        super();
    }

    @Override
    public String greetings() {
        return "Hello from the child";
    }
}
