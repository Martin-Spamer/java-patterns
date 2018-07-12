/**
 * A Simple MultiThreaded Port Scanner
 * Created on 22 September 2004, 12:55
 */

package coaching.net;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
        LOG.info(toString());
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
        LOG.info(toString());
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
        LOG.info(toString());
        initialise();
    }

    /**
     * Initialise.
     */
    private void initialise() {
        String filename = "ports.properties";
        File file = new File(filename);
        try {
            FileInputStream inStream = new FileInputStream(file);

            try {
                properties.load(inStream);
            } catch (IOException e) {
                LOG.error(e.toString());
            }
        } catch (FileNotFoundException e) {
            LOG.error(e.toString());
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
        String portNo = Integer.toString(port);
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
            final java.net.Socket socket = new java.net.Socket(ip, port);

            // report open port & try looking it up
            LOG.info("portscan = {} : {} ", ip, port);
            LOG.info("scanning = {} ", lookUpPort(port));

            Thread.yield();

            socket.close();
        } catch (final Exception exception) {
            LOG.error(exception.toString());
            LOG.info("portscan = {} : {} ", ip, port);
        }
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Thread#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [ip=%s, port=%s]", this.getClass().getSimpleName(), ip, port);
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
