
package coaching.solid;

/**
 * A class to demonstrate the Dependency Inversion Principle (DIP).
 *
 * The SOLID principle of dependency inversion (DIP) is an approach to reducing
 * the coupling between software modules.
 *
 * The dependencies are reversed, removing the depen of high-level modules on
 * low-level implementation module, the rules of DIP state:
 *
 * Intent: High-level modules should remain independent of the implementation
 * details of low-level module.
 * - High-level modules should not depend on low-level modules, and both should
 * depend on abstractions.
 * - Abstractions should not depend on details, details should depend on
 * abstractions.
 *
 */
public class DependencyInversionPrinciple {

    /**
     * The Abstraction.
     */
    public interface AnAbstractInterface {
        /**
         * Do something.
         */
        void doSomething();
    }

    /**
     * The Module class.
     */
    public abstract class Module implements AnAbstractInterface {
    }

    /**
     * The LowLevelModule.
     */
    public class LowLevelModule extends Module {

        /*
         * (non-Javadoc)
         * @see
         * coaching.solid.DependencyInversionPrinciple.Abstraction#doSomething()
         */
        @Override
        public void doSomething() {
        }

    }

    /**
     * The HighLevelModule.
     */
    public class HighLevelModule extends Module {

        /** The module. */
        public AnAbstractInterface module = new LowLevelModule();

        /*
         * (non-Javadoc)
         * @see
         * coaching.solid.DependencyInversionPrinciple.Abstraction#doSomething()
         */
        @Override
        public void doSomething() {
            module.doSomething();
        }
    }
}
