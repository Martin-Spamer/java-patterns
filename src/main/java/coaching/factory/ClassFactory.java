
package coaching.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ClassFactory {

    private static final String CLASS_NAME = "coaching.factory.ClassFactory.class";
    private static final Logger LOG = LoggerFactory
        .getLogger(ClassFactory.class);
    private static ClassFactory instance;

    private ClassFactory() {
        super();
    }

    public static ClassFactory getInstance() {
        if (instance == null) {
            return new ClassFactory();
        } else {
            return instance;
        }
    }

    public static Object create() {
        try {
            return Class.forName(CLASS_NAME).newInstance();
        } catch (
                InstantiationException |
                    IllegalAccessException |
                    ClassNotFoundException e) {
            LOG.error(e.getLocalizedMessage(), e);
        }
        return null;
    }

}
