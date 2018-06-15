/**
 *  @title			AbstractAssociation.java
 *  @description	An abstract for use as targets of UML associations.
 *  @author			martin.spamer.
 *  @version		0.1 - first release.
 *	Created      23-Sep-2004
 **/

package coaching.associations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Abstract Associated Class.
 */
public abstract class AbstractAssociatedClass {

    /** The log. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /**
     * execute.
     */
    public void execute() {
        this.log.info("{}.execute", this.getClass().getName());
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s", this.getClass().getSimpleName());
    }

}
