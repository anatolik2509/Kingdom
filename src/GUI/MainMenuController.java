package GUI;


import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;

import javafx.scene.input.MouseEvent;
import root.SpriteAnimation;
import root.*;

import java.io.IOException;

public class MainMenuController {
    @FXML
    FlowPane SecondMenu;
    @FXML
    Label GameButton;
    @FXML
    Label SettingButton;
    @FXML
    Label ExitButton;
    @FXML
    ImageView fire;

    static SpriteAnimation animation;

    @FXML public void initialize(){
        animation=new SpriteAnimation(fire,40,40,10,100);
        MainMenu.SecondMenu=SecondMenu;
        settingButtons();






        
    }



    private void settingButtons(){
        GameButton.setText(Texts.getWord(Texts.GAME));
        GameButton.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                GameButton.setTextFill(Color.DARKORANGE);
            }
        });
        GameButton.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                GameButton.setTextFill(Color.BLACK);
            }
        });


        SettingButton.setText(Texts.getWord(Texts.SETTINGS));
        SettingButton.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                SettingButton.setTextFill(Color.DARKORANGE);
            }
        });
        SettingButton.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                SettingButton.setTextFill(Color.BLACK);
            }
        });


        ExitButton.setText(Texts.getWord(Texts.EXIT));
        ExitButton.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ExitButton.setTextFill(Color.DARKORANGE);
            }
        });
        ExitButton.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ExitButton.setTextFill(Color.BLACK);
            }
        });


        ExitButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(MainMenu.SecondMenu.getChildren().size()>0)MainMenu.SecondMenu.getChildren().remove(0);
                try {
                    MainMenu.SecondMenu.getChildren().add(FXMLLoader.load(Main.class.getResource("/GUI/MainMenu_Exit.fxml")));
                }
                catch (IOException e){
                    e.printStackTrace();
                }

            }
        });
        GameButton.setOnMouseClicked(event -> {
            if(MainMenu.SecondMenu.getChildren().size()>0)MainMenu.SecondMenu.getChildren().remove(0);
            try {
                MainMenu.SecondMenu.getChildren().add(FXMLLoader.load(Main.class.getResource("/GUI/MainMenu_Game.fxml")));
            }
            catch (IOException e){
                e.printStackTrace();

        }});
    }



}
