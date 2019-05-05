/**
 * Created on 06-Jul-2004
 */

package coaching.model;

/**
 * An abstract Person class.
 */
public abstract class AbstractPerson implements PersonInterface {
    private String name;

    /**
     * Instantiates a new person.
     */
    public AbstractPerson() {
        this.name = "Name";
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
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [name=%s]", this.getClass().getSimpleName(), this.name);
    }

}
