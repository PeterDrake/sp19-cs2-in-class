import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MineSweeperTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void revealsAllSafeSquares() {

        boolean[][] grid = new boolean[4][4];
        grid[0][1] = grid[1][3] = true;
        boolean[][] revealed = new boolean[4][4];
        MineSweeper.reveal(grid, revealed, 3, 2);
        boolean[][] correct = {
                {false, false, false, false},
                {true, true, true, false},
                {true, true, true, true},
                {true, true, true, true}};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                assertEquals(correct[i][j], revealed[i][j]);
            }

        }

    }

    @Test
    void countNeighboringMinesWorksInMiddleOfGrid() {
        boolean[][] grid = new boolean[3][3];
        grid[0][1]=true;
        grid[2][2]=true;
        assertEquals(2,MineSweeper.countNeighboringMines(1,1,grid));
    }
    @Test
    void countNeighboringMinesWorksAtEdgeOfGrid() {
        boolean[][] grid = new boolean[3][3];
        grid[0][1]=true;
        grid[2][2]=true;
        assertEquals(1,MineSweeper.countNeighboringMines(2,1,grid));
    }
    @Test
    void recognizesWin(){
        boolean[][] grid = new boolean[3][3];
        grid[0][1]=true;
        grid[2][2]=true;
        boolean[][] revealed=new boolean[3][3];
        for(int i=0; i<3;i++){
            for (int j = 0; j <3 ; j++) {
                revealed[i][j]=true;
            }
        }
        revealed[2][2]=false;
        revealed[0][1]=false;
        assertTrue(MineSweeper.allSafeSquaresRevealed(grid,revealed));
    }
    @Test
    void recognizesLoss(){
        boolean[][] grid = new boolean[3][3];
        grid[0][1]=true;
        grid[2][2]=true;
        boolean[][] revealed=new boolean[3][3];
        revealed[0][1]=true;
        assertTrue(MineSweeper.anyMineRevealed(grid,revealed));
    }
}