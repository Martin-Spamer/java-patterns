
package patterns.factory;

/**
 * A factory for creating Abstract objects.
 */
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
