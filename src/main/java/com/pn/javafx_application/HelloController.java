package com.pn.javafx_application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import java.io.File;

public class HelloController {
    @FXML
    private Label label;
    @FXML
    private Button button4;
    @FXML
    private GridPane gridPane;

    public void initialize(){
        button4.setEffect(new DropShadow());
    }
    @FXML
    public void handelMouseEnter(){
        label.setScaleY(2.0);
        label.setScaleX(2.0);
    }
    @FXML
    public void handelMouseExit(){
        label.setScaleX(1.0);
        label.setScaleX(1.0);
    }

    @FXML
    public void handelClick() {
        //FileChooser chooser = new FileChooser();
        DirectoryChooser chooser = new DirectoryChooser();
        File file = chooser.showDialog(gridPane.getScene().getWindow());
        if (file != null) {
            System.out.println(file.getPath());
        }else {
            System.out.println("Chooser was cancelled ");
        }

    }
}