/**
 * Created on 06-Jul-2004
 */
package coaching.associations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Person Class.
 */
public abstract class AbstractPerson implements PersonInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private String name;

	/**
	 * Instantiates a new person.
	 */
	public AbstractPerson() {
	}

	/**
	 * Instantiates a new person.
	 *
	 * name
	 *
	 * @param name the name
	 */
	public AbstractPerson(final String name) {
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
	 * name.
	 *
	 * name
	 *
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Person [name=%s]", this.name);
	}

}
