/**
 * MainApp.java
 *
 * Created on 30 June 2004, 13:07
 **/

package coaching.thread;

import java.io.File;
import java.util.HashMap;

import javax.xml.parsers.*;

import org.slf4j.*;
import org.w3c.dom.*;

/**
 * a test harness for Java modules.
 * @author martin.spamer
 **/
public class MainApp {

	private static final Logger LOG = LoggerFactory.getLogger(MainApp.class);
	private Document mainAppConfig;
	private Element config;
	private final HashMap<String, AbstractApplicationProcess> threadMap = new HashMap<String, AbstractApplicationProcess>();

	/**
	 * Instantiates a new main application.
	 */
	public MainApp() {
		super();
	}

	/**
	 * XML Configuration File.
	 *
	 * @return true, if successful
	 */
	public boolean init() {
		try {
			final String configFilename = this.getClass().getName() + ".xml";
			final File configFile = new File(configFilename);

			// * XML file into a DOM
			final DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			final DocumentBuilder builder = builderFactory.newDocumentBuilder();
			mainAppConfig = builder.parse(configFile);

			// * root Document Element <config>
			config = mainAppConfig.getDocumentElement();
			LOG.info("{}", config);

			// * threads we must start.
			final NodeList threadListConfig = config.getElementsByTagName("thread");
			for (int i = 0; i < threadListConfig.getLength(); i++) {
				final org.w3c.dom.Node threadNode = threadListConfig.item(i);
				LOG.info("{}", threadNode);
				final org.w3c.dom.Element element = (Element) threadListConfig.item(i);
				LOG.info("{}", element);

				final String className = element.getAttribute("class");
				final AbstractApplicationProcess abstractApplicationProcess = (AbstractApplicationProcess) Class
				        .forName(className).newInstance();
				abstractApplicationProcess.start();

				threadMap.put(element.getAttribute("name"), abstractApplicationProcess);
			}

		} catch (final Exception exception) {
			exception.printStackTrace();
		}

		return false;
	}

	/**
	 * main method.
	 *
	 * command line arguments
	 * exception
	 *
	 * @param args the arguments
	 * @throws Exception the exception
	 */
	public static void main(final String[] args) throws Exception {
		try {
			final MainApp mainApp = new MainApp();
			mainApp.init();
		} catch (final Exception exception) {
			exception.printStackTrace();
		}
	}
}
