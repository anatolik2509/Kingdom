package root;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MainMenu {
    public static FlowPane SecondMenu;
    public static Pane root;
    public static Pane LanguageSelect;
    public static Pane gameStart;
    public static void start(){
        root=null;
        try {
            root = FXMLLoader.load(Main.class.getResource("/GUI/MainMenu.fxml"));
            LanguageSelect = FXMLLoader.load(Main.class.getResource("/GUI/LanguageSelect.fxml"));
            gameStart = FXMLLoader.load(Main.class.getResource("/GUI/GameStart.fxml"));
            LanguageSelect.setVisible(false);
            gameStart.setVisible(false);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        Main.pane.getChildren().add(root);
        Main.pane.getChildren().add(LanguageSelect);
        Main.pane.getChildren().add(gameStart);
    }

    public static void exit(){
        Main.game.close();
    }

    public static void reset(){
        Main.pane.getChildren().removeAll(root,LanguageSelect);
        try {
            root = FXMLLoader.load(Main.class.getResource("/GUI/MainMenu.fxml"));
            LanguageSelect = FXMLLoader.load(Main.class.getResource("/GUI/LanguageSelect.fxml"));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        Main.pane.getChildren().add(root);
        Main.pane.getChildren().add(LanguageSelect);
    }
}
