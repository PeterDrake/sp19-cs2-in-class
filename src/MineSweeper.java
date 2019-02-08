public class MineSweeper {
    public static void main(String[] args) {
        StdDraw.enableDoubleBuffering();
        int gridWidth = 8;
        boolean[][] grid = createGrid(gridWidth);
        boolean[][] revealed = new boolean[gridWidth][gridWidth];
        revealed[2][3] = true;
        printGrid(grid);
        StdDraw.setScale(-0.5, grid.length - 0.5);
        drawGrid(grid, revealed);
        while (true) {
            int[] click = getMouseClick(grid.length);
            StdOut.println(click[0]);
            StdOut.println(click[1]);
            int r = click[0];
            int c = click[1];
            revealed[r][c] = true;
            drawGrid(grid, revealed);
        }
    }

    static int[] getMouseClick(int gridWidth) {
        while (!StdDraw.isMousePressed()) {
            //wait for mouse click
        }
        double x = StdDraw.mouseX();
        double y = StdDraw.mouseY();
        while (StdDraw.isMousePressed()) {
        }
        int r = (int) (Math.round(gridWidth - 1 - y));
        int c = (int) (Math.round(x));
        return new int[]{r, c};
    }

    static int countNeighboringMines(int r, int c, boolean[][] grid) {
        int count = 0;
        int[][] neighbors = {{r - 1, c - 1}, {r - 1, c}, {r - 1, c + 1}, {r, c - 1}, {r, c + 1}, {r + 1, c - 1}, {r + 1, c}, {r + 1, c + 1}};
        for (int i = 0; i < neighbors.length; i++) {
            int row = neighbors[i][0];
            int col = neighbors[i][1];
            if (row >= 0 && row < grid.length && col >= 0 && col < grid.length) {
                if (grid[row][col]) {
                    count++;
                }
            }
        }
        return count;
    }

    static void drawGrid(boolean[][] grid, boolean[][] revealed) {
        StdDraw.clear();
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid.length; c++) {
                if (revealed[r][c]) {
                    if (grid[r][c]) {
                        StdDraw.filledCircle(c, grid.length - 1 - r, 0.25);
                    }
                    int n = countNeighboringMines(r, c, grid);
                    if (n > 0) {
                        StdDraw.text(c, grid.length - 1 - r, "" + n);
                    }
                } else {
                    StdDraw.setPenColor(StdDraw.GRAY);
                    StdDraw.filledSquare(c, grid.length - 1 - r, 0.5);
                    StdDraw.setPenColor(StdDraw.BLACK);
                }
                StdDraw.square(c, grid.length - 1 - r, 0.5);
            }
        }
        StdDraw.show();
    }

    static void printGrid(boolean[][] grid) {
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid.length; c++) {
                if (grid[r][c]) {
                    StdOut.print("*");
                } else {
                    StdOut.print(".");
                }
            }
            StdOut.println();
        }
    }

    static boolean[][] createGrid(int w) {
        boolean[][] grid = new boolean[w][w];
        for (int i = 0; i < 10; i++) {
            int row = StdRandom.uniform(grid.length);
            int column = StdRandom.uniform(grid.length);
            if (grid[row][column]) {
                i--;
            } else {
                grid[row][column] = true;
            }
        }
        return grid;
    }

    static boolean allSafeSquaresRevealed(boolean[][] grid, boolean[][] revealed) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (!grid[i][j] && !revealed[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
