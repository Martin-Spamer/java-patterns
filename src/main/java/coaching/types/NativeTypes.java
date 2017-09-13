/**
 * @title			Types.java
 * @description	TODO
 * @author			martin spamer
 * @version		0.1 - first release.
 * Created			07-Oct-2004
 **/
package coaching.types;

/**
 * Java Native Types.
 *
 * @author martin.spamer
 * @version 0.1 - 09:20:22
 */
public class NativeTypes {
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

	private boolean aBooleanTrue = true;
	private boolean aBooleanFalse = false;

	/**
	 * Display.
	 */
	public void display() {
		// display them all
		System.out.println("largest byte value : " + this.largestByte);
		System.out.println("smallest byte value : " + this.smallestByte);

		System.out.println("largest short value is " + this.largestShort);
		System.out.println("smallest short value is " + this.smallestShort);

		System.out.println("largest integer value is " + this.largestInteger);
		System.out.println("smallest integer value is " + this.smallestInteger);

		System.out.println("largest long value is " + this.largestLong);
		System.out.println("smallest long value is " + this.smallesttLong);

		System.out.println("largest float value is " + this.largestFloat);
		System.out.println("smallest float value is " + this.smallestFloat);

		System.out.println("largest double value is " + this.largestDouble);
		System.out.println("smallest double value is " + this.smallestDouble);

		if (Character.isUpperCase(this.aChar)) {
			System.out.println("The character " + this.aChar + " is upper case.");
		} else {
			System.out.println("The character " + this.aChar + " is lower case.");
		}

		if (this.aBooleanTrue) {
			System.out.println("aBooleanTrue has tested as true : " + this.aBooleanTrue);
		} else {
			System.out.println("aBooleanTrue has tested as false : " + this.aBooleanTrue);
		}
	}
}
