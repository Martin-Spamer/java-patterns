
package patterns.memento;

import static org.hamcrest.CoreMatchers.notNullValue;

import org.junit.Test;

import static org.junit.Assert.assertThat;

import lombok.extern.slf4j.Slf4j;

/**
 * The Class CaretakerTest.
 */
@Slf4j
public final class CaretakerTest {

    /**
     * Type.
     */
    @Test
    public void type() {
        assertThat(Caretaker.class, notNullValue());
    }

    /**
     * Instantiation.
     */
    @Test
    public void instantiation() {
        final Caretaker target = new Caretaker();
        assertThat(target, notNullValue());
    }

}
