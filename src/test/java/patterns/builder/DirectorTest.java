
package patterns.builder;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * class DirectorTest.
 */
@Slf4j
public final class DirectorTest {

    /**
     * Unit Test to director.
     */
    @Test
    public void testDirector() {
        final Director director = new Director();

        final BuilderOne builderOne = new BuilderOne();
        assertNotNull(builderOne);
        director.add(builderOne);

        final BuilderTwo builderTwo = new BuilderTwo();
        assertNotNull(builderTwo);
        director.add(builderTwo);

        final Product product = director.constructProduct();
        assertNotNull(product);

    }

}
