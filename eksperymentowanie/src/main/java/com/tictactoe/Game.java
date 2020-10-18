package com.tictactoe;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class Game {

    private Image imageO = new Image("file:eksperymentowanie/src/main/resources/x.png");
    private Image imageX = new Image("file:eksperymentowanie/src/main/resources/o.png");
    private Image imageOWin = new Image("file:eksperymentowanie/src/main/resources/owinner.png");
    private Image imageXWin = new Image("file:eksperymentowanie/src/main/resources/xwinner.png");
    private Board board;
    private final GridPane grid;
    private Figure whoseMove = Figure.FIGUREX;
    private boolean gameFinish = false;
    //public int xWinner;
    //public int yWinner;

    public Game(Board board, GridPane grid) {
        this.board = board;
        this.grid = grid;
    }

    public void doClick(int x, int y) {

        if (board.getFigure(x, y) == Figure.NONE) {
            board.setFigure(x, y, whoseMove);
            whoseMove = (whoseMove == Figure.FIGUREX) ? Figure.FIGUREO : Figure.FIGUREX;
            displayOnGrid();
            orWin();
        }
    }

    private void displayOnGrid() {
        grid.getChildren().clear();
        for(int row=0;row<3;row++) {
            for(int col=0;col<3;col++) {
                Image image = null;
                if(board.getFigure(col, row) == Figure.FIGUREX)
                    image = imageX;
                else if(board.getFigure(col, row) == Figure.FIGUREO)
                    image = imageO;
                grid.add(new ImageView(image), col, row);
            }
        }
    }

    private void orWin() {
        if(isAWinner()) {
            grid.getChildren().clear();
            if (whoseMove == Figure.FIGUREX) {
                displayWinnerMessage(imageXWin, 0);

            } else {
                displayWinnerMessage(imageOWin, 2);
            }
            gameFinish = true;
        }

    }

    private void displayWinnerMessage(Image winnerImage, int row) {
        Image image = winnerImage;
        grid.add(new ImageView(image), 0, row);
    }

    private boolean isAWinner() {
        return (board.getFigure(0, 0) != Figure.NONE && board.getFigure(0, 0) == board.getFigure(0, 1) && board.getFigure(0, 0) == board.getFigure(0, 2))
                || (board.getFigure(1, 0) != Figure.NONE && board.getFigure(1, 0) == board.getFigure(0, 1) && board.getFigure(1, 0) == board.getFigure(1, 2))
                || (board.getFigure(2, 0) != Figure.NONE && board.getFigure(2, 0) == board.getFigure(2, 1) && board.getFigure(2, 0) == board.getFigure(2, 2))
                || (board.getFigure(0, 0) != Figure.NONE && board.getFigure(0, 0) == board.getFigure(1, 0) && board.getFigure(0, 0) == board.getFigure(2, 0))
                || (board.getFigure(0, 1) != Figure.NONE && board.getFigure(0, 1) == board.getFigure(1, 1) && board.getFigure(0, 1) == board.getFigure(2, 1))
                || (board.getFigure(0, 2) != Figure.NONE && board.getFigure(0, 2) == board.getFigure(1, 2) && board.getFigure(0, 2) == board.getFigure(2, 2))
                || (board.getFigure(0, 0) != Figure.NONE && board.getFigure(0, 0) == board.getFigure(1, 1) && board.getFigure(0, 0) == board.getFigure(2, 2))
                || (board.getFigure(0, 2) != Figure.NONE && board.getFigure(0, 2) == board.getFigure(1, 1) && board.getFigure(0, 2) == board.getFigure(2, 0));
    }

    public boolean isGameFinish() {
        return gameFinish;
    }

    public void setGameFinish(boolean gameFinish) {
        this.gameFinish = gameFinish;
    }

    public void initBoard() {
        board = new Board();
        grid.getChildren().clear();
    }
}
