import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class AppManager {

    static StartPane startPane = new StartPane();
    static SinglePlayerPane singlePlayerPane = new SinglePlayerPane();
    static MultiPlayerPane multiPlayerPane = new MultiPlayerPane();
    static SettingsPane settingsPane = new SettingsPane();
    static GamePane gamePane = new GamePane();

    static String preferredBoard;
    static Font preferredFont;

    static boolean challengeComputer;

    public static void viewPane(Pane pane)
    {
        startPane.setVisible(false);
        singlePlayerPane.setVisible(false);
        multiPlayerPane.setVisible(false);
        settingsPane.setVisible(false);
        gamePane.setVisible(false);

        pane.setVisible(true);
    }

    public static void setDefaultSettings()
    {

        settingsPane.boardsComboBox.getSelectionModel().selectFirst();
        settingsPane.fontSizesComboBox.getSelectionModel().select(1);


        setFont(preferredFont);
    }

    public static void setFont(Font preferredFont)
    {
        startPane.singlePlayer.setFont(AppManager.preferredFont);
        startPane.multiPlayer.setFont(AppManager.preferredFont);
        startPane.settings.setFont(AppManager.preferredFont);
        startPane.about.setFont(AppManager.preferredFont);
        startPane.exit.setFont(AppManager.preferredFont);

        singlePlayerPane.playerNameLabel.setFont(AppManager.preferredFont);
        singlePlayerPane.playerName.setFont(AppManager.preferredFont);
        singlePlayerPane.start.setFont(AppManager.preferredFont);
        singlePlayerPane.back.setFont(AppManager.preferredFont);

        multiPlayerPane.playerXLabel.setFont(AppManager.preferredFont);
        multiPlayerPane.playerOLabel.setFont(AppManager.preferredFont);
        multiPlayerPane.firstPlayerName.setFont(AppManager.preferredFont);
        multiPlayerPane.secondPlayerName.setFont(AppManager.preferredFont);
        multiPlayerPane.start.setFont(AppManager.preferredFont);
        multiPlayerPane.back.setFont(AppManager.preferredFont);

        gamePane.firstPlayerName.setFont(AppManager.preferredFont);
        gamePane.secondPlayerName.setFont(AppManager.preferredFont);
        gamePane.firstPlayerScore.setFont(AppManager.preferredFont);
        gamePane.secondPlayerScore.setFont(AppManager.preferredFont);
        gamePane.currentPlayerSymbol.setFont(AppManager.preferredFont);
        gamePane.restart.setFont(AppManager.preferredFont);
        gamePane.back.setFont(AppManager.preferredFont);


        settingsPane.labelForBoards.setFont(AppManager.preferredFont);
        settingsPane.labelForFontSizes.setFont(AppManager.preferredFont);
        settingsPane.reset.setFont(AppManager.preferredFont);
        settingsPane.back.setFont(AppManager.preferredFont);

        settingsPane.boardsComboBox.setStyle(
                "-fx-font-family:" + AppManager.preferredFont.getName() + ";"
                        +"-fx-font-size: " + AppManager.preferredFont.getSize() +"px;"
                        +"-fx-font-weight: bold;"
        );
        settingsPane.fontSizesComboBox.setStyle(
                "-fx-font-family:" + AppManager.preferredFont.getName() + ";"
                        +"-fx-font-size: " + AppManager.preferredFont.getSize() +"px;"
                        +"-fx-font-weight: bold;"
        );
    }

}