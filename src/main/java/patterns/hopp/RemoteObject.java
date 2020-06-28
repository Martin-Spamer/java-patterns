
package patterns.hopp;

import lombok.extern.slf4j.Slf4j;

/**
 * RemoteObject Class.
 */





@Slf4j
public class RemoteObject implements HoppInterface {

    /*
     * (non-Javadoc)
     * @see patterns.hopp.HoppInterface#remoteMethod()
     */
    @Override
    public void remoteMethod() {
        log.info("{}.remoteMethod()", this.getClass().getSimpleName());
    }

    /*
     * (non-Javadoc)
     * @see patterns.hopp.HoppInterface#localMethod()
     */
    @Override
    public void localMethod() {
        log.info("{}.localMethod()", this.getClass().getSimpleName());
    }

}
