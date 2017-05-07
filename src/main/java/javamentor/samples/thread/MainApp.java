/**
 * MainApp.java
 *
 * Created on 30 June 2004, 13:07
 **/

package javamentor.samples.thread;

import java.util.HashMap;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * a test harness for Java modules.
 * @author martin.spamer
 **/
public class MainApp {
	Document mainAppConfig;
	Element config;
	HashMap threadMap;

	/**
	 * Initialise the worker threads using the XML Config File.
	 * @return
	 */
	public boolean init() {
		try {
			final String configFilename = this.getClass().getName() + ".xml";
			final java.io.File configFile = new java.io.File(configFilename);

			// Use the File object to Load the XML file into a DOM
			final javax.xml.parsers.DocumentBuilderFactory builderFactory = javax.xml.parsers.DocumentBuilderFactory
			        .newInstance();
			final javax.xml.parsers.DocumentBuilder builder = builderFactory.newDocumentBuilder();
			this.mainAppConfig = builder.parse(configFile);

			// Get the root Document Element <config>
			this.config = this.mainAppConfig.getDocumentElement();

			// get a list of the threads we must start.
			final NodeList threadListConfig = this.config.getElementsByTagName("thread");
			for (int i = 0; i < threadListConfig.getLength(); i++) {
				final org.w3c.dom.Node threadNode = threadListConfig.item(i);
				final org.w3c.dom.Element element = (Element) threadListConfig.item(i);

				final String className = element.getAttribute("class");
				final Object object = Class.forName(element.getAttribute("class")).newInstance();
				final AbstractApplicationProcess abstractApplicationProcess = (AbstractApplicationProcess) object;

				abstractApplicationProcess.start();

				this.threadMap.put(element.getAttribute("name"), abstractApplicationProcess);
			}

		} catch (final Exception exception) {
			exception.printStackTrace();
		}

		return false;
	}

	/**
	 *
	 * @param args the command line arguments
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		try {
			final MainApp mainApp = new MainApp();

			mainApp.init();
		} catch (final Exception exception) {
			exception.printStackTrace();
		}
	}
}
