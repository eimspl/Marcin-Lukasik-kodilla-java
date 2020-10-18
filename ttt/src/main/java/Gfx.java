import javafx.scene.Scene;
import javafx.scene.layout.GridPane;

import java.util.Scanner;

class Gfx {

    public static void main(String[] args) {
        GridPane gp = new GridPane();
        Scene scene = new Scene(gp, 270, 270);
        Game game = new Game(gp, new Board(board));
        gp.setOnMouseClicked(e -> {

            System.out.println(e.getX());   // wight 270
            System.out.println(e.getY());   // hight 270
            int x = (int)(e.getX() / 90);   // 3
            int y = (int)(e.getY() / 90);   // 3
            game.doClick(x, y);
        });

        gp.setOn;
    }
