
package patterns.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * Subject Class.
 */




@Slf4j
public abstract class AbstractSubject implements SubjectInterface {

    /*
     * (non-Javadoc)
     * @see patterns.proxy.SubjectInterface#request()
     */
    @Override
    public abstract void request();

}
