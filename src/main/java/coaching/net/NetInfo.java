/**
 *  @title       Guid.java
 *  @description TODO
 *	Created      28-Oct-2004
 **/

package coaching.net;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

import lombok.extern.slf4j.Slf4j;

/**
 * NetInfo class.
 */


@Slf4j
public final class NetInfo {

    /**
     * Instantiates a new net info.
     *
     * @throws SocketException the socket exception
     */
    public NetInfo() throws SocketException {
        final Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
            final NetworkInterface networkInterface = interfaces.nextElement();
            log.info("{}", networkInterface.getDisplayName());
            final Enumeration<InetAddress> bounded = networkInterface.getInetAddresses();
            while (bounded.hasMoreElements()) {
                final InetAddress inetAddress = bounded.nextElement();
                log.info("inetAddress.getHostAddress() = {}", inetAddress.getHostAddress());
                log.info("inetAddress.getHostName() = {}", inetAddress.getHostName());
            }
        }
    }
}
