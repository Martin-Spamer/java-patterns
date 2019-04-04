
package coaching.solid;

import lombok.extern.slf4j.Slf4j;

/**
 * A class to Demonstrate the Liskov Substitution Principle (LSP).
 *
 * Intent: Derived types must be completely substitutable for their base types.
 *
 * If S is a subtype of T, then objects of type T may be replaced with objects
 * of type S (i.e. an object of type T may be substituted with any object of a
 * subtype S) without altering any of the desirable properties of the program
 * (correctness, task performed, etc.).
 *
 */
@Slf4j
public class LiskovSubstitutionPrinciple {

    /**
     * Abstraction Interface.
     */
    public interface TypeInterface {
        /**
         * Do something.
         */
        void doSomething();
    }

    /**
     * BaseType class.
     */
    public abstract class AbstractBaseType implements TypeInterface {
    }

    /**
     * TypeOne class.
     */
    public class TypeOne extends AbstractBaseType {

        /*
         * (non-Javadoc)
         * @see
         * coaching.solid.LiskovSubstitutionPrinciple.BaseType#doSomething()
         */
        @Override
        public void doSomething() {
            doOneThing();
        }

        /**
         * Do one thing.
         */
        private void doOneThing() {
            // do one thing;
        }
    }

    /**
     * TypeType class.
     */
    public class TypeTwo extends AbstractBaseType {

        /*
         * (non-Javadoc)
         * @see
         * coaching.solid.LiskovSubstitutionPrinciple.BaseType#doSomething()
         */
        @Override
        public void doSomething() {
            doSomethingElse();
        }

        /**
         * Do something else.
         */
        private void doSomethingElse() {
            // do something else
        }
    }
}
