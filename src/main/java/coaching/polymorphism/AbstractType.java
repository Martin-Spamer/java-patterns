
package coaching.polymorphism;

import lombok.extern.slf4j.Slf4j;

/**
 * An abstract Class providing a polymorphic base.
 */
@Slf4j
public abstract class AbstractType implements TypeInterface {

    /*
     * (non-Javadoc)
     * @see coaching.polymorphism.TypeInterface#operation()
     */
    @Override
    public TypeInterface operation() {
        log.info("{}.operation", this.getClass().getSimpleName());
        return this;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [...]", this.getClass().getSimpleName());
    }

}
