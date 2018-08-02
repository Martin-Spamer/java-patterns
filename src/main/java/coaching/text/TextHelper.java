
package coaching.text;

public final class TextHelper {

    private TextHelper() {
        super();
    }

    public static byte[] hexToBytes(final String hexString) {
        final byte[] data = new byte[hexString.length() / 2];
        for (int i = 0; i < hexString.length(); i += 2) {
            final byte lsb = (byte) Character
                .digit(hexString.charAt(i + 1), 16);
            final byte msb = (byte) (Character
                .digit(hexString.charAt(i), 16) << 4);
            data[i / 2] = (byte) (msb + lsb);
        }
        return data;
    }

    public static String bytesToHex(final byte[] byteData) {
        final StringBuilder stringBuffer = new StringBuilder();
        for (final byte element : byteData) {
            stringBuffer.append(element);
        }
        return stringBuffer.toString();
    }
}
