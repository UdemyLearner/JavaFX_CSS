package com.pn.javafx_application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.List;
import javafx.scene.*;



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
        FileChooser chooser = new FileChooser();
        //DirectoryChooser chooser = new DirectoryChooser();
        chooser.setTitle("save Application File");
        chooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Text","*.txt"),
                                             new FileChooser.ExtensionFilter("PDF","*.pdf"),
                                             new FileChooser.ExtensionFilter("Zip","*.zip"),
                                             new FileChooser.ExtensionFilter("All Files","*.*"),
        new FileChooser.ExtensionFilter("Image ","*.jpg","*.png"));
        List<File> file = chooser.showOpenMultipleDialog(gridPane.getScene().getWindow());
        if (file != null) {
            for (File value : file) System.out.println(value);
        }else {
            System.out.println("Chooser was cancelled ");
        }

    }
    @FXML
    public void handelLinkClick() {
        //System.out.println("The link was clicked");
//        try{
//            Desktop.getDesktop().browse(new URI("http://www.javafx.com"));
//        }catch (IOException e){
//            e.printStackTrace();
//        }catch (URISyntaxException e) {
//            e.printStackTrace();
//        }

    }
}