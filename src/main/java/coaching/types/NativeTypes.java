/**
 * @title			Types.java
 * @description	TODO
 * @author			martin spamer
 * @version		0.1 - first release.
 * Created			07-Oct-2004
 **/
package coaching.types;

import org.slf4j.*;

/**
 * Java Native Types.
 *
 * @author martin.spamer
 * @version 0.1 - 09:20:22
 */
public class NativeTypes {
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	// integers
	private final byte largestByte = Byte.MAX_VALUE;
	private final byte smallestByte = Byte.MIN_VALUE;

	private final short largestShort = Short.MAX_VALUE;
	private final short smallestShort = Short.MIN_VALUE;

	private final int largestInteger = Integer.MAX_VALUE;
	private final int smallestInteger = Integer.MIN_VALUE;

	private final long largestLong = Long.MAX_VALUE;
	private final long smallesttLong = Long.MIN_VALUE;

	// real numbers
	private final float largestFloat = Float.MAX_VALUE;
	private final float smallestFloat = Float.MIN_VALUE;

	private final double largestDouble = Double.MAX_VALUE;
	private final double smallestDouble = Double.MIN_VALUE;

	// other primitive types
	private final char aChar = 'A';

	private final boolean aTrueBoolean = true;
	private final boolean aFalseBoolean = false;

	/**
	 * Display.
	 */
	public void display() {
		// display them all
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
		} else {
			log.info("The character {} is lower case.", aChar);
		}

		if (aTrueBoolean) {
			log.info("aBooleanTrue has tested as true : ", aTrueBoolean);
		} else {
			log.info("aBooleanTrue has tested as false : ", aTrueBoolean);
		}

		if (aFalseBoolean) {
			log.info("aFalseBoolean has tested as true : {}", aFalseBoolean);
		} else {
			log.info("aFalseBoolean has tested as false : {}", aFalseBoolean);
		}
	}
}
