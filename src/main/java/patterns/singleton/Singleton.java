
package patterns.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * Singleton Class.
 */




@Slf4j
public final class Singleton {

    /** single static instance within class loader. */
    private static Singleton instance;

    /**
     * Instantiates a new singleton.
     */
    private Singleton() {
        super();
    }

    /**
     * single instance of Singleton.
     *
     * @return single instance of Singleton
     */
    public static synchronized Singleton getInstance() {
        instance = new Singleton();
        return instance;
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
