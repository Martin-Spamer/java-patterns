
package coaching.pool;

import lombok.extern.slf4j.Slf4j;

/**
 * Abstract Value Object.
 */
@Slf4j
public abstract class AbstractValueObject {

    /** Indicates if the value dirty, has it been changed. */
    private boolean dirty = false;

    /**
     * Mark as dirty, changed.
     */
    protected void markDirty() {
        dirty = true;
    }

    /**
     * Checks if the value is dirty.
     *
     * @return true, if is dirty
     */
    protected boolean isDirty() {
        return dirty;
    }

}
