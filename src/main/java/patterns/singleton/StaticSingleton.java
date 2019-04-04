
package patterns.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * StaticSingleton Class.
 */
@Slf4j
public final class StaticSingleton {

    /** The instance. */
    private static final StaticSingleton INSTANCE = new StaticSingleton();

    /**
     * Instantiates a new static singleton.
     */
    private StaticSingleton() {
        super();
    }

    /**
     * single instance of StaticSingleton.
     *
     * @return single instance of StaticSingleton
     */
    public static synchronized StaticSingleton getInstance() {
        return INSTANCE;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s", this.getClass().getSimpleName());
    }

}
