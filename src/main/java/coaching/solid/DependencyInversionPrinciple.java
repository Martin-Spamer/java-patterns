
package coaching.solid;

import lombok.extern.slf4j.Slf4j;

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
 * details of low-level module. - High-level modules should not depend on
 * low-level modules, and both should depend on abstractions. - Abstractions
 * should not depend on details, details should depend on abstractions.
 *
 */


/** The Constant 			log. */
@Slf4j
public class DependencyInversionPrinciple {

    /**
     * The Abstraction.
     */
    public interface ModuleInterface {
        /**
         * Do something.
         */
        void doSomething();
    }

    /**
     * The Module class.
     */
    public abstract class Module implements ModuleInterface {
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
            log.info("{}.doSomething", this.getClass().getSimpleName());
        }

    }

    /**
     * The HighLevelModule.
     */
    public class HighLevelModule extends Module {
        /** The module. */
        public ModuleInterface module = new LowLevelModule();

        /*
         * (non-Javadoc)
         * @see
         * coaching.solid.DependencyInversionPrinciple.Abstraction#doSomething()
         */
        @Override
        public void doSomething() {
            this.module.doSomething();
        }
    }
}
