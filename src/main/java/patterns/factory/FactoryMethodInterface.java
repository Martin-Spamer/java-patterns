
package patterns.factory;

/**
 * The FactoryMethodInterface Interface.
 *
 * @param <T> the generic type
 */
public interface FactoryMethodInterface<T> {

	/**
	 * Creates the.
	 *
	 * @return the t
	 */
	public T create();

}
