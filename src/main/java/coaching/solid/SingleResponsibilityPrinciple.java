/**
 *  @title			SingleResponsibilityPrinciple.java
 *  @description	A class should have a responsibility pieces of functionality.
 *  @author			martin.spamer.
 *  @version		0.1 - first release.
 *	Created			13-Jan-2005 - 12:05:35
 **/

package coaching.solid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A class to Demonstrate the Single Responsibility Principle. A class should
 * have a responsibility pieces of functionality.
 */
public class SingleResponsibilityPrinciple {

    /** The Constant LOG. */
    private static final Logger LOG = LoggerFactory.getLogger(SingleResponsibilityPrinciple.class);

    /**
     * Foo Bar responsibility.
     */
    public void responsibility() {
        LOG.info("responsibility");
        fooResponsibility();
        barResponsibility();
    }

    /**
     * Foo Responsibility.
     */
    private void fooResponsibility() {
        LOG.info("fooResponsibility");
    }

    /**
     * Bar Responsibility.
     */
    private void barResponsibility() {
        LOG.info("barResponsibility");
    }

}
