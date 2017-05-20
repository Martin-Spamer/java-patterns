/**
 *  @title			Types.java
 *  @description	TODO
 *  @author			martin.spamer.
 *  @version		0.1 - first release.
 *	Created			07-Oct-2004
 **/

package javamentor.types;

/**
 * Java Native Types
 * @author martin.spamer
 * @version 0.1 - 09:20:22
 **/
public class NativeTypes {
	// integers
	byte largestByte = Byte.MAX_VALUE;
	byte smallestByte = Byte.MIN_VALUE;

	short largestShort = Short.MAX_VALUE;
	short smallestShort = Short.MIN_VALUE;

	int largestInteger = Integer.MAX_VALUE;
	int smallestInteger = Integer.MIN_VALUE;

	long largestLong = Long.MAX_VALUE;
	long smallesttLong = Long.MIN_VALUE;

	// real numbers
	float largestFloat = Float.MAX_VALUE;
	float smallestFloat = Float.MIN_VALUE;

	double largestDouble = Double.MAX_VALUE;
	double smallestDouble = Double.MIN_VALUE;

	// other primitive types
	char aChar = 'A';

	boolean aBooleanTrue = true;
	boolean aBooleanFalse = false;

	public void display() {
		// display them all
		System.out.println("largest byte value : " + largestByte);
		System.out.println("smallest byte value : " + smallestByte);

		System.out.println("largest short value is " + largestShort);
		System.out.println("smallest short value is " + smallestShort);

		System.out.println("largest integer value is " + largestInteger);
		System.out.println("smallest integer value is " + smallestInteger);

		System.out.println("largest long value is " + largestLong);
		System.out.println("smallest long value is " + smallesttLong);

		System.out.println("largest float value is " + largestFloat);
		System.out.println("smallest float value is " + smallestFloat);

		System.out.println("largest double value is " + largestDouble);
		System.out.println("smallest double value is " + smallestDouble);

		if (Character.isUpperCase(aChar)) {
			System.out.println("The character " + aChar + " is upper case.");
		} else {
			System.out.println("The character " + aChar + " is lower case.");
		}

		if (aBooleanTrue) {
			System.out.println("aBooleanTrue has tested as true : " + aBooleanTrue);
		} else {
			System.out.println("aBooleanTrue has tested as false : " + aBooleanTrue);
		}
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		final NativeTypes types = new NativeTypes();
		types.display();
	}
}
