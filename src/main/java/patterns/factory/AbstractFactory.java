
package patterns.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * A factory for creating Abstract objects.
 */
@Slf4j
public abstract class AbstractFactory implements FactoryInterface {

    /*
     * (non-Javadoc)
     * @see patterns.factory.FactoryInterface#createProductA()
     */
    @Override
    public abstract AbstractProductAlpha createProductA();

    /*
     * (non-Javadoc)
     * @see patterns.factory.FactoryInterface#createProductB()
     */
    @Override
    public abstract AbstractProductBeta createProductB();

}
