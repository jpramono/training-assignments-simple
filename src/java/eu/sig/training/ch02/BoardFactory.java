package eu.sig.training.ch02;

public class BoardFactory {
    private int width;
    private int height;
    private Square square;
    // tag::createBoard[]
    public Board createBoard(Square[][] grid) {
        assert grid != null;

        Board board = new Board(grid);

        this.width = board.getWidth();
        this.height = board.getHeight();
        createborad(grid);

        return board;
    }

    private void createborad(Square[][] grid) {
        for (int x = 0; x < this.width; x++) {
            for (int y = 0; y < height; y++) {
                this.square = grid[x][y];
                for (Direction dir : Direction.values()) {
                    boardcreate(grid,  x, y,  dir);
                }
            }
        }
    }

    private void boardcreate(Square[][] grid, int x, int y,  Direction dir) {
        int dirX = (this.width + x + dir.getDeltaX()) % this.width;
        int dirY = (this.height + y + dir.getDeltaY()) % this.height;
        Square neighbour = grid[dirX][dirY];
        this.square.link(neighbour, dir);
    }
    // end::createBoard[]
}

class Board {
    @SuppressWarnings("unused")
    public Board(Square[][] grid) {}

    public int getWidth() {
        return 0;
    }

    public int getHeight() {
        return 0;
    }
}

class Square {
    @SuppressWarnings("unused")
    public void link(Square neighbour, Direction dir) {}
}

class Direction {

    public static Direction[] values() {
        return null;
    }

    public int getDeltaY() {
        return 0;
    }

    public int getDeltaX() {
        return 0;
    }
}
