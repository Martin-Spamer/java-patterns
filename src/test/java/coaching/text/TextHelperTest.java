
package coaching.text;

import java.util.Arrays;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TextHelperTest {

    private static final Logger LOG = LoggerFactory.getLogger(TextHelperTest.class);

    @Test
    public void testHexToBytes() {
        byte[] byteData = TextHelper.hexToBytes("0123456789");
        LOG.info("{}", Arrays.toString(byteData));

        byteData = TextHelper.hexToBytes("0102030405060708090A0B0C0D0E0F");
        LOG.info("{}", Arrays.toString(byteData));

        String hex = TextHelper.bytesToHex(byteData);
        LOG.info("{}", hex);

        hex = TextHelper.bytesToHex(TextHelper.hexToBytes("00"));
        LOG.info("{}", hex);

    }

}
