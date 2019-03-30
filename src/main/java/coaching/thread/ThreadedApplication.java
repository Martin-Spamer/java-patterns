
package coaching.thread;

import java.io.InputStream;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * ThreadedApplication, an example harness for Java Threads.
 *
 * Created on 30 June 2004 - 13:07
 **/
public class ThreadedApplication {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(ThreadedApplication.class);

    /** The document. */
    private Document document;

    /** The thread map. */
    private final Map<String, AbstractProcess> threadMap = new ConcurrentHashMap<>();

    /**
     * Instantiates a new main application.
     */
    public ThreadedApplication() {
        super();
        if (initialise()) {
            createThreads(this.document);
        }
    }

    /**
     * initialise from configuration file.
     *
     * @return true, if successful, otherwise false., otherwise false.
     */
    private boolean initialise() {
        final String configFilename = configFilename();

        try {
            // * XML file into a DOM
            final DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            final DocumentBuilder builder = builderFactory.newDocumentBuilder();
            this.document = builder.parse(inputStream(configFilename));
            return true;
        } catch (final Exception e) {
            LOG.warn("Configuration file : {} not found.", configFilename);
            return false;
        }
    }

    /**
     * Input stream from resource name.
     *
     * @param resourceName the resource name
     * @return the input stream
     */
    protected InputStream inputStream(final String resourceName) {
        final Thread currentThread = Thread.currentThread();
        final ClassLoader classloader = currentThread.getContextClassLoader();
        final InputStream resourceAsStream = classloader.getResourceAsStream(resourceName);
        return resourceAsStream;
    }

    /**
     * Creates the threads.
     *
     * @param document the document
     */
    protected void createThreads(final Document document) {
        final Element documentElement = document.getDocumentElement();

        if (documentElement != null) {
            // * threads we must start.
            final NodeList threadListConfig = document.getElementsByTagName("thread");
            createThreads(threadListConfig);
        }
    }

    /**
     * Creates the threads.
     *
     * @param threadListConfig the thread list config
     */
    private void createThreads(final NodeList threadListConfig) {
        for (int i = 0; i < threadListConfig.getLength(); i++) {
            createThread(threadListConfig, i);
        }
    }

    /**
     * Creates the thread.
     *
     * @param threadListConfig the thread list config
     * @param i the i
     */
    private void createThread(final NodeList threadListConfig, final int i) {
        final Element element = (Element) threadListConfig.item(i);

        final String nameAttribute = element.getAttribute("name");
        LOG.info("nameAttribute = {}", nameAttribute);

        final String className = element.getAttribute("class");
        LOG.info("className = {}", className);

        final AbstractProcess abstractApplicationProcess = createProcess(className);
        if (abstractApplicationProcess != null) {
            abstractApplicationProcess.start();
        }

        this.threadMap.put(nameAttribute, abstractApplicationProcess);
    }

    /**
     * Creates the process.
     *
     * @param className the class name
     * @return the abstract process
     */
    protected AbstractProcess createProcess(final String className) {
        try {
            return (AbstractProcess) Class.forName(className).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            LOG.error(e.getLocalizedMessage(), e);
        }
        return null;
    }

    /**
     * Configuration filename.
     *
     * @return the string
     */
    protected String configFilename() {
        final String className = this.getClass().getSimpleName();
        return String.format("%s.xml", className);
    }

    /**
     * transform the xml document.
     *
     * @param document the doc
     * @return the string
     */
    protected String transform(final Document document) {
        try {
            final TransformerFactory transformerFactory = TransformerFactory.newInstance();
            final Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            final StreamResult result = new StreamResult(new StringWriter());
            final DOMSource source = new DOMSource(document);
            transformer.transform(source, result);
            return result.getWriter().toString();
        } catch (IllegalArgumentException | TransformerFactoryConfigurationError | TransformerException e) {
            LOG.error(e.getLocalizedMessage(), e);
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [threadMap=%s]", this.getClass().getSimpleName(), this.threadMap);
    }

}
