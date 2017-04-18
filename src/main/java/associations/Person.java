/**
 * Created on 06-Jul-2004
 */
package associations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Person Class.
 */
public abstract class Person implements PersonInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	private String name;

	/**
	 * Instantiates a new person.
	 */
	public Person() {
	}

	/**
	 * Instantiates a new person.
	 *
	 * @param name the name
	 */
	public Person(final String name) {
		setName(name);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see associations.PersonInterface#setName(java.lang.String)
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return String.format("Person [name=%s]", this.name);
	}

}
