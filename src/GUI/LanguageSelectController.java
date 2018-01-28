package GUI;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class LanguageSelectController {
    @FXML
    Label eng;
    @FXML
    Label rus;
    @FXML
    Label cancel;
    @FXML
    public void initialize(){
        rus.setOnMouseEntered(event -> {
            rus.setTextFill(Color.DARKORANGE);
        });
        rus.setOnMouseExited(event -> {
            rus.setTextFill(Color.BLACK);
        });
        eng.setOnMouseEntered(event -> {
            eng.setTextFill(Color.DARKORANGE);
        });
        eng.setOnMouseExited(event -> {
            eng.setTextFill(Color.BLACK);
        });
    }
}
