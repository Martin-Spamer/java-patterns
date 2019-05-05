
package patterns.proxy;

/**
 * Subject Class.
 */
public abstract class AbstractSubject implements SubjectInterface {

    /*
     * (non-Javadoc)
     * @see patterns.proxy.SubjectInterface#request()
     */
    @Override
    public abstract void request();

}
