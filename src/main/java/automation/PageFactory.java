
package automation;

/**
 * A factory for creating Page objects.
 */
public class PageFactory {

	private PageFactory() {
	}

	/**
	 * Landing page.
	 *
	 * @return the page
	 */
	public static AbstractPage landingPage() {
		final LandingPage landingPage = new LandingPage();
		return landingPage;
	}

}
