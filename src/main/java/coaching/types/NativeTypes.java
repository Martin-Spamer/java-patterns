
package coaching.types;

import lombok.extern.slf4j.Slf4j;

/**
 * Examples of Java Native Types.
 *
 * @author martin spamer
 * @version 0.1 - first release. Created 07-Oct-2004 - 09:20:22
 */


/** The Constant 			log. */
@Slf4j
public class NativeTypes {

    /** The largest byte. */
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

    /** The smallest long. */
    private final long smallesttLong = Long.MIN_VALUE;

    /** The largest float. */
    private final float largestFloat = Float.MAX_VALUE;

    /** The smallest float. */
    private final float smallestFloat = Float.MIN_VALUE;

    /** The largest double. */
    private final double largestDouble = Double.MAX_VALUE;

    /** The smallest double. */
    private final double smallestDouble = Double.MIN_VALUE;

    /** The char. */
    private final char aChar = 'A';

    /** The true boolean. */
    private final boolean trueBoolean = true;

    /** The false boolean. */
    private final boolean falseBoolean = false;

    /**
     * Display.
     */
    public void display() {
        // display all member types.
        log.info("largest byte value : {}", this.largestByte);
        log.info("smallest byte value : {}", this.smallestByte);

        log.info("largest short value is {}", this.largestShort);
        log.info("smallest short value is {}", this.smallestShort);

        log.info("largest integer value is {}", this.largestInteger);
        log.info("smallest integer value is {}", this.smallestInteger);

        log.info("largest long value is {}", this.largestLong);
        log.info("smallest long value is {}", this.smallesttLong);

        log.info("largest float value is {}", this.largestFloat);
        log.info("smallest float value is {}", this.smallestFloat);

        log.info("largest double value is {}", this.largestDouble);
        log.info("smallest double value is {}", this.smallestDouble);

        if (Character.isUpperCase(this.aChar)) {
            log.info("The character {} is upper case.", this.aChar);
        }

        if (this.trueBoolean) {
            log.info("aBooleanTrue has tested as true value : ", this.trueBoolean);
        }

        if (!this.falseBoolean) {
            log.info("aFalseBoolean has tested as false value : {}", this.falseBoolean);
        }
    }
}
