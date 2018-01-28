package root;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.animation.*;

public class Main extends Application {

    public static Stage game;
    public static StackPane pane=new StackPane();
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)throws Exception {
        Texts.installLanguage(Language.selectedLanguage);
        game=primaryStage;
        game.setScene(new Scene(pane));
        pane.setBackground(new Background(new BackgroundFill(Color.BLACK,null,null)));
        game.setFullScreen(true);
        game.show();
        pane.setScaleX(game.getWidth()/1200);
        pane.setScaleY(game.getHeight()/700);
        MainMenu.start();
    }
}
