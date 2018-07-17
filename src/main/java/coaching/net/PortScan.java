/**
 * A Simple MultiThreaded Port Scanner
 * Created on 22 September 2004, 12:55
 */

package coaching.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * PortScan class.
 */
public class PortScan extends Thread {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(PortScan.class);

    /** The load factor. */
    private static int loadFactor = 100;

    /** The properties. */
    private static Properties properties = null;

    /** The ip. */
    private String ip = "127.0.0.1";

    /** The port. */
    private int port = 0;

    /**
     * The Constructor.
     */
    public PortScan() {
        super();
        LOG.info("TODO {}", this);
        initialise();
    }

    /**
     * The Constructor.
     *
     * @param args the args
     */
    public PortScan(final String[] args) {
        super();
        ip = args[0];
        port = Integer.parseInt(args[1]);
        LOG.info("TODO {}", this);
        initialise();
    }

    /**
     * The Constructor.
     *
     * @param ip the ip
     * @param port the port
     */
    public PortScan(final String ip, final int port) {
        super();
        this.ip = ip;
        this.port = port;
        LOG.info("TODO {}", this);
        initialise();
    }

    /**
     * Initialise.
     */
    private void initialise() {
        final String filename = "ports.properties";
        try {
            final ClassLoader classLoader = this.getClass().getClassLoader();
            final InputStream resourceAsStream = classLoader
                .getResourceAsStream(filename);
            properties.load(resourceAsStream);
        } catch (final IOException e) {
            final String message = String
                .format("Resource %s not found.", filename);
            LOG.error(message, e);
        }
    }

    /**
     * Execute.
     */
    public void execute() {
        for (int port = 1; port < (64 * 1024);) {
            if (Thread.activeCount() > PortScan.loadFactor) {
                Thread.yield();
            } else {
                final PortScan portScan = new PortScan(ip, port);
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
        final String portNo = Integer.toString(port);
        return PortScan.properties.getProperty(portNo, "unknown");
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Thread#run()
     */
    @Override
    public void run() {
        LOG.info("run");
        try {
            LOG.info("portscan = {} : {} ", ip, port);
            final java.net.Socket socket = new java.net.Socket(ip, port);

            // report open port & try looking it up
            LOG.info("scanning = {} ", lookUpPort(port));

            socket.close();
            Thread.yield();
        } catch (final UnknownHostException e) {
            LOG.error(e.toString(), e);
        } catch (final IOException e) {
            LOG.error(e.toString(), e);
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
                    ip,
                    port);
    }

    /**
     * The main method.
     *
     * @param args the args
     */
    public static void main(final String[] args) {
        LOG.trace("System properties = {}", System.getProperties().toString());
        LOG.debug("args = {}", Arrays.toString(args));
        new PortScan(args).execute();
    }

}
