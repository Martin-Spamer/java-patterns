
package coaching.text;

import java.math.BigInteger;

public final class TextHelper {

    private TextHelper() {
        super();
    }

    public static byte[] hexToBytes(final String hexString) {
        BigInteger bigInteger = new BigInteger(hexString, 16);
        return bigInteger.toByteArray();
    }

    public static String bytesToHex(final byte[] byteData) {
        final StringBuilder stringBuffer = new StringBuilder();
        for (final byte element : byteData) {
            stringBuffer.append(element);
        }
        return stringBuffer.toString();
    }
}
