/**
 * Created on 06-Jul-2004
 */
package coaching.model;

import org.slf4j.*;

/**
 * An abstract Person class.
 */
public abstract class AbstractPerson implements PersonInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private String name;

	/**
	 * Instantiates a new person.
	 */
	public AbstractPerson() {
		this.name = "";
	}

	/**
	 * Instantiates a new person.
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
	public PersonInterface setName(final String name) {
		this.name = name;
		return this;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	@Override
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
