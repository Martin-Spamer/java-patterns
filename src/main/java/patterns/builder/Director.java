


package patterns.builder;

import java.util.Vector;

import org.slf4j.*;

/**
 * Director Class.
 */
public class Director {
	private static final Logger LOG = LoggerFactory.getLogger(Director.class);
	private final Vector<AbstractBuilder> builders = new Vector<AbstractBuilder>();

	/**
	 * Adds part builder.
	 *
	 * @param builder the builder to be added.
	 * @return true, if successful, otherwise false.
	 */
	public boolean add(final AbstractBuilder builder) {
		return builders.add(builder);
	}

	/**
	 * Construct Product.
	 *
	 * @return the product
	 */
	public Product constructProduct() {
		final BuilderOne builderOne = new BuilderOne();
		final Part partOne = builderOne.build();

		final BuilderTwo builderTwo = new BuilderTwo();
		final Part partTwo = builderTwo.build();

		final Product product = new Product(partOne, partTwo);
		return product;
	}

	/**
	 * Construct Product.
	 */
	public void buildAll() {
		for (final BuilderInterface builder : builders) {
			final Part part = builder.build();
			LOG.info("part={}", part);
		}
	}

}
