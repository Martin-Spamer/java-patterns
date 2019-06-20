
package patterns.builder;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * The BuilderTest class.
 */


/** The Constant 			log. */
@Slf4j
public final class BuilderTest {

    /**
     * Unit Test to build one.
     */
    @Test
    public void testBuilderOne() {
        final BuilderOne builder = new BuilderOne();
        assertNotNull(builder);
        final AbstractPart product = builder.build();
        log.info("product = {}", product);
    }

    /**
     * Unit Test to build two.
     */
    @Test
    public void testBuilderTwo() {
        final BuilderTwo builder = new BuilderTwo();
        assertNotNull(builder);
        final AbstractPart product = builder.build();
        log.info("product = {}", product);
    }

}
