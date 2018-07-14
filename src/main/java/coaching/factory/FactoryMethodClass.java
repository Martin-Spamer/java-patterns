
package coaching.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FactoryMethodClass {

    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
    private FactoryMethodClass parent = null;

    private FactoryMethodClass() {
        super();
    }

    public FactoryMethodClass(final FactoryMethodClass parentFactory) {
        super();
        parent = parentFactory;
    }

    public static FactoryMethodClass newInstance() {
        return new FactoryMethodClass();
    }

    public static Class<?> create() throws ClassNotFoundException {
        return Class.forName("FactoryMethod.class");
    }

    public FactoryMethodClass createNext() {
        return new FactoryMethodClass(this);
    }

    public void operation() {
        log.info(toString());
    }

    @Override
    public String toString() {
        return String.format("FactoryMethodClass [parent=%s]", parent);
    }
}
