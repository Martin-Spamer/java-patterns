/**
 *  @title			Types.java
 *  @description	TODO
 *  @author			martin.spamer.
 *  @version		0.1 - first release.
 *	Created			07-Oct-2004
 **/

package coaching.types;

import org.slf4j.*;

/**
 * Java Native Types.
 *
 * @author martin.spamer
 * @version 0.1 - 09:20:22
 */
public class ObjectTypes {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	// integers object types
	private final Byte largestByte = Byte.MAX_VALUE;
	private final Byte smallestByte = Byte.MIN_VALUE;

	private final Short largestShort = Short.MAX_VALUE;
	private final Short smallestShort = Short.MIN_VALUE;

	private final Integer largestInteger = Integer.MAX_VALUE;
	private final Integer smallestInteger = Integer.MIN_VALUE;

	private final Long largestLong = Long.MAX_VALUE;
	private final Long smallesttLong = Long.MIN_VALUE;

	// real numbers
	private final Float largestFloat = Float.MAX_VALUE;
	private final Float smallestFloat = Float.MIN_VALUE;

	private final Double largestDouble = Double.MAX_VALUE;
	private final Double smallestDouble = Double.MIN_VALUE;

	// other primitive types
	private final Character aChar = 'A';

	private final Boolean aBooleanTrue = true;
	private final Boolean aBooleanFalse = false;

	protected ObjectTypes() {
		super();
	}

	/**
	 * Display.
	 */
	public void display() {
		// display them all
		this.log.info("largest byte value : {}", this.largestByte);
		this.log.info("smallest byte value : {}", this.smallestByte);

		this.log.info("largest short value is {}", this.largestShort);
		this.log.info("smallest short value is {}", this.smallestShort);

		this.log.info("largest integer value is {}", this.largestInteger);
		this.log.info("smallest integer value is {}", this.smallestInteger);

		this.log.info("largest long value is {}", this.largestLong);
		this.log.info("smallest long value is {}", this.smallesttLong);

		this.log.info("largest float value is {}", this.largestFloat);
		this.log.info("smallest float value is {}", this.smallestFloat);

		this.log.info("largest double value is {}", this.largestDouble);
		this.log.info("smallest double value is {}", this.smallestDouble);

		if (Character.isUpperCase(this.aChar)) {
			this.log.info("The character {} is upper case.", this.aChar);
		} else {
			this.log.info("The character {} is lower case.", this.aChar);
		}

		if (this.aBooleanTrue) {
			this.log.info("aBooleanTrue has tested as true : {}", this.aBooleanTrue);
		} else {
			this.log.info("aBooleanTrue has tested as false : {}", this.aBooleanTrue);
		}

		if (this.aBooleanFalse) {
			this.log.info("aBooleanFalse has tested as true : {}", this.aBooleanFalse);
		} else {
			this.log.info("aBooleanFalse has tested as false : {}", this.aBooleanFalse);
		}
	}
}
