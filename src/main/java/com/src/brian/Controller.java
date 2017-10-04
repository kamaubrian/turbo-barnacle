package com.src.brian;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button login;



    @FXML
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    public void setLoginAction(javafx.event.ActionEvent e){

        System.out.println("Hello Buddy");
    }
    @FXML
    public void setExitAction(ActionEvent ex){
        System.exit(0);

    }




}
