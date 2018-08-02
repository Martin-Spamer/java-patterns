package coaching.text;

public final class TextHelper {

    private TextHelper() {
        super();
    }

    public static byte[] hexToBytes(final String hexString) {
        byte[] data = new byte[hexString.length()/2];
        for (int i = 0; i < hexString.length(); i += 2) {
            byte lsb = (byte) Character.digit(hexString.charAt(i+1), 16);
            byte msb = (byte) (Character.digit(hexString.charAt(i), 16) << 4);
            data[i / 2] = (byte) (msb + lsb);
        }
        return data;
    }

    public static String bytesToHex(final byte[] byteData) {
        StringBuilder stringBuffer = new StringBuilder();
        for (byte element : byteData) {
            stringBuffer.append(element);
        }
        return stringBuffer.toString();
    }
}
