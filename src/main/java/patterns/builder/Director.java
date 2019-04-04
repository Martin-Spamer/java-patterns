
package patterns.builder;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

/**
 * Director Class.
 */
@Slf4j
public class Director {

    /** The builders. */
    private final List<AbstractBuilder> builders = new ArrayList<>();

    /**
     * Adds part builder.
     *
     * @param builder the builder to be added.
     * @return true, if successful, otherwise false., otherwise false.
     */
    public boolean add(final AbstractBuilder builder) {
        return this.builders.add(builder);
    }

    /**
     * Construct Product.
     *
     * @return the product
     */
    public Product constructProduct() {
        final BuilderOne builderOne = new BuilderOne();
        final AbstractPart partOne = builderOne.build();

        final BuilderTwo builderTwo = new BuilderTwo();
        final AbstractPart partTwo = builderTwo.build();

        return new Product(partOne, partTwo);
    }

    /**
     * Construct Product.
     */
    public void buildAll() {
        for (final BuilderInterface builder : this.builders) {
            final AbstractPart part = builder.build();
            log.info("part={}", part);
        }
    }

}
