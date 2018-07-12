
package coaching.automation;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import static org.junit.Assume.assumeNotNull;

import coaching.automation.Actor;
import coaching.automation.CredentialsFactory;

public class CredentialsTest {

    private static final Logger LOG = LoggerFactory.getLogger(CredentialsTest.class);
    private final String platform = "dev";
    private final String tag = "@AUTHORISED";

    @Test
    public void testCredentialsFactoryStatic() {
        final Actor actor = CredentialsFactory.on(platform).tagged(tag);
        assertNotNull(actor);
        LOG.info(actor.toString());
    }

    @Test
    public void testCredentialsFactory() {
        final CredentialsFactory credentials = new CredentialsFactory();
        assertNotNull(credentials);
        LOG.info(credentials.toString());

        final Actor actor = credentials.onPlatform(platform).tagged(tag);
        assertNotNull(actor);
        LOG.info(actor.toString());
    }

    @Test
    public void testCredentialsFactoryPlatform() {
        final CredentialsFactory credentials = new CredentialsFactory(platform);
        assertNotNull(credentials);
        LOG.info(credentials.toString());

        final Actor actor = credentials.tagged(tag);
        assertNotNull(actor);
        LOG.info(actor.toString());
    }

    /**
     * Unit test to credentials factory data.
     *
     * <code>
     *  # tags, username, password, email
     *  &#64;ADMIN,admin,password,admin@example.com
     *  &#64;AUTHORISED,alice,password,alice@example.com
     *  &#64;AUTHORISED,bob,password,bob@example.com
     *  &#64;UNAUTHORISED,trudy,password,trudy@example.com
     * </code>
     */
    @Test
    public void testCredentialsFactoryData() {
        // Given a credentials factory
        final CredentialsFactory credentials = new CredentialsFactory(platform);
        assumeNotNull(credentials);
        LOG.info(credentials.toString());

        // When we retrieve admin credentials
        final Actor actor = credentials.tagged("@ADMIN");
        assertNotNull(actor);
        assertEquals("admin", actor.getUsername());
        assertEquals("password", actor.getPassword());
        assertEquals("admin@example.com", actor.getEmail());
        LOG.info(actor.toString());
    }
}
