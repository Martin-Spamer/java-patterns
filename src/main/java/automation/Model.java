package automation;

/**
 * Model Class.
 */
public class Model {

	private AbstractPage currentPage;

	/**
	 * Given.
	 *
	 * model
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
	 * model
	 *
	 * @return the model
	 */
	public Model when() {
		currentPage.login();
		return this;
	}

	/**
	 * Then.
	 *
	 * model
	 *
	 * @return the model
	 */
	public Model then() {
		currentPage = PageFactory.landingPage();
		currentPage.verify();
		return this;
	}

}
