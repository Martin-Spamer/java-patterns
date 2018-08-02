/**
 * A Simple MultiThreaded Port Scanner
 * Created on 22 September 2004, 12:55
 */

package coaching.net;

import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import coaching.resources.PropertiesLoader;

/**
 * PortScan class.
 */
public class PortScan extends Thread {

    private static final String LOCALHOST = "127.0.0.1";

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(PortScan.class);

    /** The load factor. */
    private static int loadFactor = 100;

    /** The properties. */
    private static Properties properties = null;

    /** IP address, default to local host. */
    private String ip = LOCALHOST;

    /** Port Number, default to 0. */
    private int portNo = 0;

    /**
     * Default Constructor.
     */
    public PortScan() {
        super();
        initialise();
        LOG.info("{}", this);
    }

    /**
     * Default Constructor.
     *
     * @param args the args
     */
    public PortScan(final String[] args) {
        super();
        assertTrue(args.length == 2);
        this.ip = args[0];
        this.portNo = Integer.parseInt(args[1]);
        initialise();
        LOG.info("{}", this);
    }

    /**
     * Default Constructor.
     *
     * @param ip the ip
     * @param port the port
     */
    public PortScan(final String ip, final int port) {
        super();
        assertNotNull(ip);
        assertNotNull(port);
        this.ip = ip;
        this.portNo = port;
        initialise();
        LOG.info("{}", this);
    }

    /**
     * Initialise.
     */
    private void initialise() {
        final String resourceName = "ports.properties";
        properties = PropertiesLoader.getProperties(resourceName);
    }

    /**
     * Execute.
     */
    public void execute() {
        for (int port = 1; port < 64 * 1024;) {
            if (Thread.activeCount() > PortScan.loadFactor) {
                Thread.yield();
            } else {
                final PortScan portScan = new PortScan(this.ip, port);
                portScan.start();
                port++;
            }
        }
    }

    /**
     * Look up port number for the service description.
     *
     * @param port the port
     * @return the string
     */
    public String lookUpPort(final int port) {
        return PortScan.properties
            .getProperty(Integer.toString(port), "unknown");
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Thread#run()
     */
    @Override
    public void run() {
        LOG.info("run");
        try {
            LOG.info("portscan = {} : {} ", this.ip, this.portNo);
            final java.net.Socket socket = new java.net.Socket(this.ip,
                    this.portNo);

            // report open port & try looking it up
            String lookUpPort = lookUpPort(this.portNo);
            LOG.info("scanning = {} ", lookUpPort);

            socket.close();
            Thread.yield();
        } catch (final IOException e) {
            LOG.error(e.getLocalizedMessage(), e);
        }
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Thread#toString()
     */
    @Override
    public String toString() {
        return String
            .format("%s [ip=%s, port=%s]",
                    this.getClass().getSimpleName(),
                    this.ip,
                    this.portNo);
    }

}
