package GUI;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import root.Language;
import root.Main;
import root.Texts;

import java.io.IOException;

/**
 * Created by Stem on 28.01.2018.
 */
public class MainMenuSettingsController {
    @FXML
    Label fullScreen;
    @FXML
    Label language;
    @FXML
    public void initialize(){
        fullScreen.setText(Texts.getWord(Texts.FULL_SCREEN)+": "+((Main.game.isFullScreen())?Texts.getWord(Texts.ON):Texts.getWord(Texts.OFF)));
        language.setText(Texts.getWord(Texts.LANGUAGE));
        fullScreen.setOnMouseEntered(event ->  {
            fullScreen.setTextFill(Color.DARKORANGE);
        });
        fullScreen.setOnMouseExited(event ->  {
            fullScreen.setTextFill(Color.BLACK);
        });
        language.setOnMouseEntered(event ->  {
            language.setTextFill(Color.DARKORANGE);
        });
        language.setOnMouseExited(event ->  {
            language.setTextFill(Color.BLACK);
        });
        fullScreen.setOnMouseClicked(event -> {
            Main.game.setFullScreen(!Main.game.isFullScreen());
            fullScreen.setText(Texts.getWord(Texts.FULL_SCREEN)+": "+((Main.game.isFullScreen())?Texts.getWord(Texts.ON):Texts.getWord(Texts.OFF)));
        });
        language.setOnMouseClicked(event -> {

        });
    }
}
