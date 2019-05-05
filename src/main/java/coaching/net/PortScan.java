/**
 * A Simple MultiThreaded Port Scanner
 * Created on 22 September 2004, 12:55
 */

package coaching.net;

import java.io.IOException;
import java.util.Properties;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import coaching.resources.PropertiesLoader;
import lombok.extern.slf4j.Slf4j;

/**
 * PortScan class.
 */


@Slf4j
public class PortScan extends Thread {

    /** The Constant 			LOCALHOST. */
    private static final String LOCALHOST = "127.0.0.1";

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
        log.info("{}", this);
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
        log.info("{}", this);
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
        log.info("{}", this);
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
        return PortScan.properties.getProperty(Integer.toString(port), "unknown");
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Thread#run()
     */
    @Override
    public void run() {
        log.info("run");
        try {
            log.info("portscan = {} : {} ", this.ip, this.portNo);
            final java.net.Socket socket = new java.net.Socket(this.ip, this.portNo);

            // report open port & try looking it up
            final String lookUpPort = lookUpPort(this.portNo);
            log.info("scanning = {} ", lookUpPort);

            socket.close();
            Thread.yield();
        } catch (final IOException e) {
            log.error(e.getLocalizedMessage(), e);
        }
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Thread#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [ip=%s, port=%s]", this.getClass().getSimpleName(), this.ip, this.portNo);
    }

}
