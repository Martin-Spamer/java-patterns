
package automation;

/**
 * A factory for creating Page objects.
 */
public class PageFactory {

	/**
	 * Landing page.
	 *
	 * page
	 *
	 * @return the page
	 */
	public static Page landingPage() {
		return new LandingPage();
	}

}
