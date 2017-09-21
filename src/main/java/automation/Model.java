
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
		this.currentPage = PageFactory.landingPage();
		this.currentPage.verify();
		return this;
	}

	/**
	 * When.
	 *
	 * @return the model
	 */
	public Model when() {
		this.currentPage.open();
		return this;
	}

	/**
	 * Then.
	 *
	 * @return the model
	 */
	public Model then() {
		this.currentPage = PageFactory.landingPage();
		this.currentPage.verify();
		return this;
	}

}
