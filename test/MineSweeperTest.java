import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MineSweeperTest {

    @BeforeEach
    void setUp() {
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
}