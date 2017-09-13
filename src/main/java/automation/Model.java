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
		this.currentPage = PageFactory.landingPage();
		this.currentPage.verify();
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
		this.currentPage.login();
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
		this.currentPage = PageFactory.landingPage();
		this.currentPage.verify();
		return this;
	}

}
