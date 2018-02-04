package GUI;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import root.Language;
import root.Main;
import root.MainMenu;

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
        cancel.setOnMouseEntered(event -> {
            cancel.setTextFill(Color.DARKORANGE);
        });
        cancel.setOnMouseExited(event -> {
            cancel.setTextFill(Color.BLACK);
        });
        rus.setOnMouseClicked(event -> {
            Language.selectLanguage(Language.RUSSIAN);
            MainMenu.reset();
        });
        eng.setOnMouseClicked(event -> {
            Language.selectLanguage(Language.ENGLISH);
            MainMenu.reset();
        });
        cancel.setOnMouseClicked(event -> {
            MainMenu.LanguageSelect.setVisible(false);
        });


    }
}
