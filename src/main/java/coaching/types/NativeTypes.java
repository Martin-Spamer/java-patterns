
package coaching.types;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Examples of Java Native Types.
 *
 * @author martin spamer
 * @version 0.1 - first release.
 *          Created 07-Oct-2004 - 09:20:22
 */
public class NativeTypes {

    /** The largest byte. */
    // integer types
    private final byte largestByte = Byte.MAX_VALUE;

    /** The smallest byte. */
    private final byte smallestByte = Byte.MIN_VALUE;

    /** The largest short. */
    private final short largestShort = Short.MAX_VALUE;

    /** The smallest short. */
    private final short smallestShort = Short.MIN_VALUE;

    /** The largest integer. */
    private final int largestInteger = Integer.MAX_VALUE;

    /** The smallest integer. */
    private final int smallestInteger = Integer.MIN_VALUE;

    /** The largest long. */
    private final long largestLong = Long.MAX_VALUE;

    /** The smallestt long. */
    private final long smallesttLong = Long.MIN_VALUE;

    /** The largest float. */
    // real number types
    private final float largestFloat = Float.MAX_VALUE;

    /** The smallest float. */
    private final float smallestFloat = Float.MIN_VALUE;

    /** The largest double. */
    private final double largestDouble = Double.MAX_VALUE;

    /** The smallest double. */
    private final double smallestDouble = Double.MIN_VALUE;

    /** The a char. */
    // other primitive types
    private final char aChar = 'A';

    /** The true boolean. */
    private final boolean trueBoolean = true;

    /** The false boolean. */
    private final boolean falseBoolean = false;

    /** provides logging. */
    protected final Logger log = LoggerFactory
        .getLogger(this.getClass().getSimpleName());

    /**
     * Display.
     */
    public void display() {
        // display all member types.
        log.info("largest byte value : {}", largestByte);
        log.info("smallest byte value : {}", smallestByte);

        log.info("largest short value is {}", largestShort);
        log.info("smallest short value is {}", smallestShort);

        log.info("largest integer value is {}", largestInteger);
        log.info("smallest integer value is {}", smallestInteger);

        log.info("largest long value is {}", largestLong);
        log.info("smallest long value is {}", smallesttLong);

        log.info("largest float value is {}", largestFloat);
        log.info("smallest float value is {}", smallestFloat);

        log.info("largest double value is {}", largestDouble);
        log.info("smallest double value is {}", smallestDouble);

        if (Character.isUpperCase(aChar)) {
            log.info("The character {} is upper case.", aChar);
        }

        if (trueBoolean) {
            log.info("aBooleanTrue has tested as true value : ", trueBoolean);
        }

        if (!falseBoolean) {
            log
                .info("aFalseBoolean has tested as false value : {}",
                        falseBoolean);
        }
    }
}
