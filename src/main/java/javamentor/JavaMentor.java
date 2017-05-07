package javamentor;

/**
 * JavaMentor
 *
 * @author Martin Spamer <Martin@spamer.me.uk>
 */
public class JavaMentor {

	/**
	 * main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			final String string = args[i];
			System.out.println(string);
		}
	}
}
