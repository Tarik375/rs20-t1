package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class Controller {

    public Label helloW;


    public void onAction(ActionEvent actionEvent) {

        helloW.setText("Hello World");
        helloW.getStyleClass().add("crvenaa");




    }






 }



