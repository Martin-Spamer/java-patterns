
package automation;

public class Credentials {

    private String platform;

    private Credentials() {
        super();
    }

    public Credentials(final String platform) {
        super();
        load(platform);
        // TODO load credentials for platform
        // e.g. "classpath:dev/credentials.csv"
    }

    private void load(final String platform) {
        this.platform = platform;
    }

    public static Credentials on(final String platform) {
        return new Credentials(platform);
    }

    public Actor with(final String tag) {
        return new Actor();
    }

}
