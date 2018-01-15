package GUI;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import root.MainMenu;
import root.Texts;


public class MainMenuExitController {
    @FXML Label question;
    @FXML Label Yes;
    @FXML Label No;

    @FXML public void initialize(){
        question.setText(Texts.getWord(Texts.EXIT_QUESTION));
        Yes.setText(Texts.getWord(Texts.YES));
        No.setText(Texts.getWord(Texts.NO));
        Yes.setOnMouseEntered(event -> {
            Yes.setTextFill(Color.DARKORANGE);
        });
        Yes.setOnMouseExited(event -> {
            Yes.setTextFill(Color.BLACK);
        });
        Yes.setOnMouseClicked(event -> {
            MainMenuController.animation.close();
            MainMenu.exit();
        });
        No.setOnMouseEntered(event -> {
            No.setTextFill(Color.DARKORANGE);
        });
        No.setOnMouseExited(event -> {
            No.setTextFill(Color.BLACK);
        });
        No.setOnMouseClicked(event -> {
            MainMenu.SecondMenu.getChildren().remove(0);
        });
    }
}
