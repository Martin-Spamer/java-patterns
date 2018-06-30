
package coaching.solid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
     * The Class MultipleResponsibility.
     */
    public class MultipleResponsibility {
        
        /** The foo. */
        private boolean foo;
        
        /** The bar. */
        private boolean bar;

        /**
         * Foo and Bar responsibility.
         */
        public void responsibility() {
            LOG.info("responsibility");
            foo = true;
            bar = true;
        }
    }

    /**
     * The Class Foo.
     */
    public class Foo {
        
        /** The foo. */
        private boolean foo;

        /**
         * Foo.
         */
        public void foo() {
            LOG.info("foo");
            foo = true;
        }
    }

    /**
     * The Class Bar.
     */
    public class Bar {
        
        /** The bar. */
        private boolean bar;

        /**
         * Bar.
         */
        public void bar() {
            LOG.info("bar");
            bar = true;
        }
    }

    /**
     * The Class SingleResponsibility.
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
            foo.foo();
            bar.bar();
        }
    }

    /**
     * Multiple responsibility.
     */
    public void multipleResponsibility() {
    }

    /**
     * Single responsibility.
     */
    public void singleResponsibility() {
    }

}
