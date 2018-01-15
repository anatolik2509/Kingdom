package root;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MainMenu {
    public static FlowPane SecondMenu;
    public static void start(){
        Pane root=null;
        try {
            root = FXMLLoader.load(Main.class.getResource("/GUI/MainMenu.fxml"));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        Main.pane.getChildren().add(root);
    }

    public static void exit(){
        Main.game.close();
    }
}
