/**
 *  @title			Types.java
 *  @description	TODO
 *  @author			martin.spamer.
 *  @version		0.1 - first release.
 *	Created			07-Oct-2004
 **/

package javamentor.types;

/**
 * Java Native Types.
 *
 * @author martin.spamer
 * @version 0.1 - 09:20:22
 */
public class ObjectTypes {

	// integers object types
	Byte largestByte = Byte.MAX_VALUE;
	Byte smallestByte = Byte.MIN_VALUE;

	Short largestShort = Short.MAX_VALUE;
	Short smallestShort = Short.MIN_VALUE;

	Integer largestInteger = Integer.MAX_VALUE;
	Integer smallestInteger = Integer.MIN_VALUE;

	Long largestLong = Long.MAX_VALUE;
	Long smallesttLong = Long.MIN_VALUE;

	// real numbers
	Float largestFloat = Float.MAX_VALUE;
	Float smallestFloat = Float.MIN_VALUE;

	Double largestDouble = Double.MAX_VALUE;
	Double smallestDouble = Double.MIN_VALUE;

	// other primitive types
	Character aChar = 'A';

	Boolean aBooleanTrue = true;
	Boolean aBooleanFalse = false;

	/**
	 * Display.
	 */
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
	 * main method.
	 *
	 * arguments
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		final ObjectTypes types = new ObjectTypes();
		types.display();
	}
}
