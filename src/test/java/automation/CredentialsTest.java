
package automation;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CredentialsTest {

    private final String platform = "@dev";
    private final String tag = "@tag";

    @Test
    public void testCredentials() {
        final Actor actor = Credentials.on(this.platform).with(this.tag);
        assertNotNull(actor);
    }

    @Test
    public void testCredentialsPlatform() {
        final Credentials credentials = new Credentials(this.platform);
        assertNotNull(credentials);
        final Actor actor = credentials.with(this.tag);
        assertNotNull(actor);
    }
}
