package com.src.brian;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/views/main.fxml"));
        primaryStage.setTitle("Login Application");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 370, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
