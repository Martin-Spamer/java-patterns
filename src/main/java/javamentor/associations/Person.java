/**
 * Created on 06-Jul-2004
 */
package javamentor.associations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Person Class.
 */
public abstract class Person implements PersonInterface {

	/** The log. */
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/** The name. */
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
	@Override
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Person [name=%s]", name);
	}

}
