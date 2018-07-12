
package patterns.adapter;

/**
 * The Class Adapter.
 */
public class Adapter implements TargetInterface {

    /* (non-Javadoc)
     * @see patterns.adapter.TargetInterface#operation()
     */
    @Override
    public Result operation() {
        AdapteeInterface adaptee = new Adaptee();
        return adaptee.operation();
    }

}
