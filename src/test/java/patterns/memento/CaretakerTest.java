
package patterns.memento;

import org.junit.Test;

/**
 * The CaretakerTest class.
 */
public final class CaretakerTest {
    @Test
    public void instantiation() {
        Originator originator = new Originator();
        Memento memento = originator.createMemento();
        originator.restore(memento);
    }

}
