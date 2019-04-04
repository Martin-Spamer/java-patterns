
package patterns.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * PartOne class.
 */
@Slf4j
public class PartOne extends AbstractPart {

    /**
     * Default Constructor.
     */
    public PartOne() {
        super();
    }

    /**
     * Default Constructor.
     *
     * @param partName the part name
     */
    public PartOne(final String partName) {
        super(partName);
    }

}
