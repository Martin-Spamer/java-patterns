
package coaching;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.SOURCE;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * The Interface WorkInProgress.
 */
@Documented
@Retention(SOURCE)
@Target(TYPE)
public @interface WorkInProgress {

    /**
     * Value.
     *
     * @return the string
     */
    String value();

}
