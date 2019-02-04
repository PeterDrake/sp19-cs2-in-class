public class MineSweeper {
    public static void main(String[] args) {
        boolean[][] grid = createGrid();
        printGrid(grid);
        StdDraw.setScale(-0.5, grid.length - 0.5);
        drawGrid(grid);
    }

    static void drawGrid(boolean[][] grid) {
        for(int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid.length; c++) {
                StdDraw.square(r, c, 0.5);
            }
        }
    }

    static void printGrid(boolean[][] grid) {
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid.length; c++){
                if (grid[r][c]){
                    StdOut.print("*");
                }
                else{
                    StdOut.print(".");
                }
            }
            StdOut.println();
        }
    }

    static boolean[][] createGrid() {
        boolean[][] grid = new boolean[8][8];
        for(int i = 0; i < 10; i++) {
            int row = StdRandom.uniform(grid.length);
            int column = StdRandom.uniform(grid.length);
            if (grid[row][column]) {
                i--;
            }
            else {
                grid[row][column] = true;
            }
        }
        return grid;
    }
}
