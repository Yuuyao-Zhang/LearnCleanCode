import java.util.ArrayList;
import java.util.List;

public class Game3 {

    public List<Cell> getFlaggedCells(List<Cell> gameBoard) {
        List<Cell> flaggedCells = new ArrayList<>();
        for (Cell cell : gameBoard) {
            if (cell.isFlagged()) {
                flaggedCells.add(cell);
            }
        }
        return flaggedCells;
    }

    public static class Cell {
        private static final int FLAGGED = 4;

        private final int statusValue;

        public Cell(int statusValue) {
            this.statusValue = statusValue;
        }

        public boolean isFlagged() {
            return statusValue == FLAGGED;
        }
    }
}
