
package coaching.idioms;

import java.util.Random;

/**
 * Enum Example with textValues.
 */
public enum EnumExample {

    /** The Unknown. */
    Unknown("Unknown"),
    
    /** The Heads. */
    Heads("Heads"),
    
    /** The Tails. */
    Tails("Tails");

    /** The text value. */
    private String textValue;

    /**
     * Instantiates a new enum example.
     *
     * @param textValue the text value
     */
    EnumExample(final String textValue) {
        this.textValue = textValue;
    }

    /**
     * Initial.
     *
     * @return the enum example
     */
    public static EnumExample initial() {
        return Unknown;
    }

    /**
     * Flip.
     *
     * @return the enum example
     */
    public static EnumExample flip() {
        if (new Random().nextBoolean()) {
            return Heads;
        } else {
            return Tails;
        }
    }

    /**
     * Factory method to create instance from string value.
     *
     * @param textValue the text value
     * @return the enum example
     */
    public static EnumExample fromString(final String textValue) {
        for (final EnumExample instance : EnumExample.values()) {
            if (instance.textValue.equalsIgnoreCase(textValue)) {
                return instance;
            }
        }
        return null;
    }

    /**
     * to String, the current text value.
     *
     * @return the text
     */
    @Override
    public String toString() {
        return this.textValue;
    }
}
