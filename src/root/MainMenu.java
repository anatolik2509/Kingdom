package root;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MainMenu {
    public static FlowPane SecondMenu;
    public static Pane root;
    public static Pane LanguageSelect;
    public static void start(){
        root=null;
        try {
            root = FXMLLoader.load(Main.class.getResource("/GUI/MainMenu.fxml"));
            LanguageSelect = FXMLLoader.load(Main.class.getResource("/GUI/LanguageSelect.fxml"));
            LanguageSelect.setVisible(false);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        Main.pane.getChildren().add(root);
        Main.pane.getChildren().add(LanguageSelect);
    }

    public static void exit(){
        Main.game.close();
    }

    public void reset(){
        try {
            root = FXMLLoader.load(Main.class.getResource("/GUI/MainMenu.fxml"));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        Main.pane.getChildren().remove(root);
        Main.pane.getChildren().add(root);
    }
}
