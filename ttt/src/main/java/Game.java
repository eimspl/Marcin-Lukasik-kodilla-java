import javafx.scene.layout.GridPane;

class Game {

    private Board board;
    private GridPane gridPane;

    Game(Board board, GridPane gridPane) {
        this.board = board;
        this.gridPane = gridPane;
    }

    void doClick(int x, int y) {
            display();
        }
    }

    private void display() {
        gridPane.getChildren().clear();
        for (int col = 0; col < 8; col++) {
            for (int row = 0; row < 8; row++) {
                Sign.figure = board.getSign(col, row);
                if (figure instanceof Tic) {
                    gridPane.add(col, row);
                } else if (figure instanceof Toe) {
                    gridPane.add(col, row);
                }
            }
        }
    }
}