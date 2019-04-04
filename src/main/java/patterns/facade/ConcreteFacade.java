
package patterns.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * Concrete Facade Class.
 */
@Slf4j
public final class ConcreteFacade implements FacadeInterface {

    /** The sub system one. */
    private final SubSystemOne subSystemOne = new SubSystemOne();

    /** The sub system two. */
    private final SubSystemTwo subSystemTwo = new SubSystemTwo();

    /** The sub system three. */
    private final SubSystemThree subSystemThree = new SubSystemThree();

    /*
     * (non-Javadoc)
     * @see patterns.facade.FacadeInterface#operation()
     */
    @Override
    public void operation() {
        subSystemOneOperation();
        subSystemTwoOperation();
        subSystemThreeOperation();
    }

    /**
     * Sub system one operation.
     */
    private void subSystemOneOperation() {
        this.subSystemOne.operation();
    }

    /**
     * Sub system two operation.
     */
    private void subSystemTwoOperation() {
        this.subSystemTwo.operation();
    }

    /**
     * Sub system three operation.
     */
    private void subSystemThreeOperation() {
        this.subSystemThree.operation();
    }

}
