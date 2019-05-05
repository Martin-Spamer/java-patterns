
package patterns.adapter;

/**
 * The Adapter.
 */
public class Adapter implements TargetInterface {

    /*
     * (non-Javadoc)
     * @see patterns.adapter.TargetInterface#operation()
     */
    @Override
    public Result operation() {
        final AdapteeInterface adaptee = new Adaptee();
        return adaptee.operation();
    }

}
