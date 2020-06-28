
package patterns.composite;

import static org.hamcrest.CoreMatchers.notNullValue;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import static org.junit.Assume.assumeNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Composite class tests.
 */



@Slf4j
public final class CompositeTest {

    /**
     * Unit Test a typical usage of composite.
     */
    @Test
    public void testCompositeTypicalUsage() {
        // Given a composite
        final AbstractComponent composite = new Composite();
        assertNotNull("composite cannot be null", composite);

        // And a Leaf
        final Leaf leaf = new Leaf();
        assertNotNull("leaf cannot be null", leaf);

        // When we add the leaf to the composite
        assertNotNull("composite cannot be null", composite.add(leaf));

        // Then
        final ComponentInterface operation = composite.operation();
        assertNotNull("composite cannot be null", operation);
        log.debug("composite = {}", composite.toString());
    }

    /**
     * Type.
     */
    @Test
    public void type() {
        assertThat(Composite.class, notNullValue());
    }

    /**
     * Unit test to add.
     */
    @Test
    public void testAdd() {
        // Given a composite
        final Composite target = new Composite();
        assumeNotNull(target);
        // With a leaf
        final AbstractComponent component = new Leaf();
        assumeNotNull(component);

        // When
        final ComponentInterface actual = target.add(component);

        // Then
        assertNotNull(actual);
    }

    /**
     * Unit test to remove.
     */
    @Test
    public void testRemove() {
        // Given a composite
        final Composite target = new Composite();
        assumeNotNull(target);
        // With a leaf
        final AbstractComponent component = new Leaf();
        assumeNotNull(component);
        target.add(component);

        // When
        final ComponentInterface actual = target.remove(component);

        // Then
        assertNotNull(actual);
    }

    /**
     * Unit test to get child.
     */
    @Test
    public void testGetChild() {
        // Given a composite
        final Composite target = new Composite();
        assumeNotNull(target);

        // With a leaf
        final AbstractComponent component = new Leaf();
        assumeNotNull(component);
        target.add(component);
        final int index = 0;

        // When we get the leaf
        final ComponentInterface actual = target.getChild(index);

        // Then
        assertNotNull(actual);
    }

    /**
     * Unit test to operation.
     */
    @Test
    public void testOperation() {
        // Given a composite
        final Composite target = new Composite();
        assumeNotNull(target);

        // When
        final ComponentInterface actual = target.operation();

        // Then
        assertNotNull(actual);
    }

}
