import com.tictactoe.Board;
import com.tictactoe.Game;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {
    private Image imageback = new Image("file:eksperymentowanie/src/main/resources/board.png");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BackgroundSize backgroundSize = new BackgroundSize(150, 150, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        for(int n=0;n<3;n++) {
            grid.getColumnConstraints().add(new ColumnConstraints(250));
            grid.getRowConstraints().add(new RowConstraints(201));
        }
        grid.setBackground(background);

        Scene scene = new Scene(grid, 604, 604, Color.BLACK);
        Board board = new Board();

        Game game = new Game(board, grid);
        grid.setOnMouseClicked(e -> {
            System.out.println(e.getX());
            System.out.println(e.getY());

            int x = (int)(e.getX()/201);
            int y = (int)(e.getY()/201);
            if(game.isGameFinish()) {
               game.initBoard();
               game.setGameFinish(false);
            } else {
                game.doClick(x, y);
            }
        });

        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
