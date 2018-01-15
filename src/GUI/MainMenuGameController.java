package GUI;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;

public class MainMenuGameController {
    @FXML
    Label newGame;
    @FXML
    FlowPane Contain;
    @FXML public void initialize(){
        newGame.setOnMouseEntered(event -> {
            newGame.setTextFill(Color.DARKORANGE);
        });
        newGame.setOnMouseExited(event -> {
            newGame.setTextFill(Color.BLACK);
        });
        newGame.setOnMouseClicked(event -> {

        });
    }
}
