
package coaching.so;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestBoard {

    @Test
    public void testBoard() {
        Board board = new Board();
        assertNotNull(board);
        log.info(board.toString());
    }

}
