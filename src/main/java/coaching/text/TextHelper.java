
package coaching.text;

import java.math.BigInteger;

/**
 * The Class TextHelper.
 */
public final class TextHelper {

    /**
     * Instantiates a new text helper.
     */
    private TextHelper() {
        super();
    }

    /**
     * Hex to bytes.
     *
     * @param hexString the hex string
     * @return the byte[]
     */
    public static byte[] hexToBytes(final String hexString) {
        BigInteger bigInteger = new BigInteger(hexString, 16);
        return bigInteger.toByteArray();
    }

    /**
     * Bytes to hex.
     *
     * @param byteData the byte data
     * @return the string
     */
    public static String bytesToHex(final byte[] byteData) {
        final StringBuilder stringBuffer = new StringBuilder();
        for (final byte element : byteData) {
            stringBuffer.append(element);
        }
        return stringBuffer.toString();
    }
}
