

package automation;

/**
 * A factory for creating Page objects.
 */
public class PageFactory {

	/**
	 * Landing page.
	 *
	 * @return the page
	 */
	public static AbstractPage landingPage() {
		return new LandingPage();
	}

}
