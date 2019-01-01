
package coaching.scripting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EquationTest {

    @Test
    public void testEquation() throws Exception {
        Equation equation = new Equation();
        assertEquals(2, equation.solve("1 + 1"), Double.MIN_NORMAL);
        assertEquals(1, equation.solve("1 * 1"), Double.MIN_NORMAL);
        assertEquals(4, equation.solve("2 ^ 2"), Double.MIN_NORMAL);
        assertEquals(4, equation.solve("-2 ^ 2"), Double.MIN_NORMAL);

        assertEquals(4, equation.solve("- ( 2 ^ 2 )"), Double.MIN_NORMAL);

        equation.solve("( ( 1 + 2 ) * 3 )");
        equation.solve("4 - ( 2 ^ 2 ) + ( 5 * 3 ) - 2");
    }

}
