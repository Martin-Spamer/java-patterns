
package coaching.rules;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * The RulesEngineTest class.
 */



@Slf4j
public final class RulesEngineTest {

    /**
     * Unit Test to rules engine.
     */
    @Test
    public void testRulesEngine() {
        log.info("testRulesEngine();");
        final RulesEngine rulesEngine = new RulesEngine();
        assertNotNull(rulesEngine);
    }

    /**
     * Unit Test to execute.
     */
    @Test
    public void testExecute() {
        log.info("new RulesEngine().execute();");
        final RulesEngine rulesEngine = new RulesEngine();
        assertNotNull(rulesEngine.execute());
    }

}
