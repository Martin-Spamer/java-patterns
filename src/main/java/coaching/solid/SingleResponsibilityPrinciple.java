
package coaching.solid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * A class to Demonstrate the Single Responsibility Principle (SRP).
 *
 * Intent: A class should have only on reason to change, one responsibility.
 *
 */
public class SingleResponsibilityPrinciple {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(SingleResponsibilityPrinciple.class);

    /**
     * An example of a class with Multiple Responsibilities.
     */
    public class MultipleResponsibility {
        private boolean foo = false;
        private boolean bar = false;

        /**
         * Foo and Bar responsibility.
         */
        public void doSomething(final boolean newFoo, final boolean newBar) {
            LOG.info("doSomething({},{})", newFoo, newBar);
            foo = newFoo;
            bar = newBar;
        }

        /*
         * (non-Javadoc)
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
        private boolean foo;

        /**
         * Foo.
         */
        public void doFoo(final boolean newFoo) {
            LOG.info("doFoo({})", newFoo);
            foo = newFoo;
        }
    }

    /**
     * Split out the Bar responsibility into a separate class.
     */
    public class Bar {
        private boolean bar;

        /**
         * Bar.
         *
         * @param newBar
         */
        public void doBar(final boolean newBar) {
            LOG.info("doBar({}", newBar);
            bar = newBar;
        }
    }

    /**
     * A class with a Single Responsibility, a container for Foo and Bar.
     */
    public class SingleResponsibility {
        private final Foo foo = new Foo();
        private final Bar bar = new Bar();

        /**
         * Responsibility.
         */
        public void responsibility() {
            LOG.info("responsibility");
            foo.doFoo(true);
            bar.doBar(true);
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
