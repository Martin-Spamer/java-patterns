
package patterns.adapter;

/**
 * The Adaptee.
 */

public class Adaptee implements AdapteeInterface {

    /*
     * (non-Javadoc)
     * @see patterns.adapter.AdapteeInterface#operation()
     */
    @Override
    public Result operation() {
        return new Result();
    }

}
