
package coaching.solid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * A class to Demonstrate the Single Responsibility Principle (SRP).
 *
 * Intent: A class should have only on reason to change, one responsibility.
 *
 * @author martin.spamer.
 * @version 0.1 - first release.
 *          Created 13-Jan-2005 - 12:05:35
 */
public class SingleResponsibilityPrinciple {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(SingleResponsibilityPrinciple.class);

    /**
     * A class with Multiple Responsibilities.
     */
    public class MultipleResponsibility {

        /** The foo. */
        private boolean foo = false;

        /** The bar. */
        private boolean bar = false;

        /**
         * Foo and Bar responsibility.
         */
        public void responsibility() {
            LOG.info("responsibility");
            foo = true;
            bar = true;
        }

        /* (non-Javadoc)
         * @see java.lang.Object#toString()
         */
        @Override
        public String toString() {
            return String.format("%s [foo=%s, bar=%s]", this.getClass().getSimpleName(), foo, bar);
        }
    }

    /**
     * Split out the Foo responsibility into a separate class.
     */
    public class Foo {

        /** The foo. */
        private boolean foo;

        /**
         * Foo.
         */
        public void doFoo() {
            LOG.info("doFoo");
            foo = true;
        }
    }

    /**
     * Split out the Bar responsibility into a separate class.
     */
    public class Bar {

        /** The bar. */
        private boolean bar;

        /**
         * Bar.
         */
        public void doBar() {
            LOG.info("doBar");
            bar = true;
        }
    }

    /**
     * A class with a Single Responsibility, a container for Foo and Bar.
     */
    public class SingleResponsibility {

        /** The foo. */
        private final Foo foo = new Foo();

        /** The bar. */
        private final Bar bar = new Bar();

        /**
         * Responsibility.
         */
        public void responsibility() {
            LOG.info("responsibility");
            foo.doFoo();
            bar.doBar();
        }
    }

    /**
     * Multiple responsibility.
     */
    public void multipleResponsibility() {
        final MultipleResponsibility multipleResponsibility = new MultipleResponsibility();
        assertNotNull(multipleResponsibility);
    }

    /**
     * Single responsibility.
     */
    public void singleResponsibility() {
        final SingleResponsibility singleResponsibility = new SingleResponsibility();
        assertNotNull(singleResponsibility);
    }

}
