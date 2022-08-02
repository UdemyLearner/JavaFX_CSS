package com.pn.javafx_application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;

public class HelloController {
    @FXML
    private Label label;
    @FXML
    private Button button4;
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


}