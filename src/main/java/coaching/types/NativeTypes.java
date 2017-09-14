/**
 * @title			Types.java
 * @description	TODO
 * @author			martin spamer
 * @version		0.1 - first release.
 * Created			07-Oct-2004
 **/
package coaching.types;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Java Native Types.
 *
 * @author martin.spamer
 * @version 0.1 - 09:20:22
 */
public class NativeTypes {
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	// integers
	private byte largestByte = Byte.MAX_VALUE;
	private byte smallestByte = Byte.MIN_VALUE;

	private short largestShort = Short.MAX_VALUE;
	private short smallestShort = Short.MIN_VALUE;

	private int largestInteger = Integer.MAX_VALUE;
	private int smallestInteger = Integer.MIN_VALUE;

	private long largestLong = Long.MAX_VALUE;
	private long smallesttLong = Long.MIN_VALUE;

	// real numbers
	private float largestFloat = Float.MAX_VALUE;
	private float smallestFloat = Float.MIN_VALUE;

	private double largestDouble = Double.MAX_VALUE;
	private double smallestDouble = Double.MIN_VALUE;

	// other primitive types
	private char aChar = 'A';

	private boolean aTrueBoolean = true;
	private boolean aFalseBoolean = false;

	/**
	 * Display.
	 */
	public void display() {
		// display them all
		this.log.info("largest byte value : " + this.largestByte);
		this.log.info("smallest byte value : " + this.smallestByte);

		this.log.info("largest short value is " + this.largestShort);
		this.log.info("smallest short value is " + this.smallestShort);

		this.log.info("largest integer value is " + this.largestInteger);
		this.log.info("smallest integer value is " + this.smallestInteger);

		this.log.info("largest long value is " + this.largestLong);
		this.log.info("smallest long value is " + this.smallesttLong);

		this.log.info("largest float value is " + this.largestFloat);
		this.log.info("smallest float value is " + this.smallestFloat);

		this.log.info("largest double value is " + this.largestDouble);
		this.log.info("smallest double value is " + this.smallestDouble);

		if (Character.isUpperCase(this.aChar)) {
			this.log.info("The character " + this.aChar + " is upper case.");
		} else {
			this.log.info("The character " + this.aChar + " is lower case.");
		}

		if (this.aTrueBoolean) {
			this.log.info("aBooleanTrue has tested as true : " + this.aTrueBoolean);
		} else {
			this.log.info("aBooleanTrue has tested as false : " + this.aTrueBoolean);
		}
	}
}
