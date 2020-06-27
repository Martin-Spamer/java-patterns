
package coaching.so;

public class Board {
    String[][] board = new String[][] {
            { "\u265c", "\u265e", "\u265d", "\u265b" },
            { "\u265c", "\u265e", "\u265d", "\u265b" },
            { "\u265c", "\u265e", "\u265d", "\u265b" },
            { "\u265c", "\u265e", "\u265d", "\u265b" } };

    public Board() {
        this.board[0][0] = "\u265c";
        this.board[0][1] = "\u265e";
        this.board[0][2] = "\u265d";
        this.board[0][3] = "\u265b";
    }
}
