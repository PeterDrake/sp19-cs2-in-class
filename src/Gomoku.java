public class Gomoku {
    public static void main(String[] args) {
        char[][] board = {
                {'x', 'x', 'x', 'x', '.'},
                {'o', 'o', 'o', 'o', 'o'},
                {'.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.'}};
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                StdOut.print(board[r][c]);
            }
            StdOut.println();

        }
        char[] players = {'x', 'o'};
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                for (int j = 0; j < 2; j++) {
                    int count = 0;
                    for (int i = 0; c + i < 5; i++) {
                        if (board[r][c + i] == players[j]) {
                            count++;
                        }
                        if (count == 5) {
                            StdOut.println(players[j] + " wins");
                            return;
                        }
                    }
                }
            }
        }

    }
}
