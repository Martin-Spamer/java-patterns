

package automation;

/**
 * Model Class.
 */
public class Model {

	private AbstractPage currentPage;

	/**
	 * Given.
	 *
	 * @return the model
	 */
	public Model given() {
		DataManager.getData(Characteristic.AUTHORISED);
		currentPage = PageFactory.landingPage();
		currentPage.verify();
		return this;
	}

	/**
	 * When.
	 *
	 * @return the model
	 */
	public Model when() {
		currentPage.open();
		return this;
	}

	/**
	 * Then.
	 *
	 * @return the model
	 */
	public Model then() {
		currentPage = PageFactory.landingPage();
		currentPage.verify();
		return this;
	}

}
