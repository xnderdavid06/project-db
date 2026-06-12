package com.example.demo2;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {
    private static Stage primaryStage;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        changeScene("Login.fxml", "Form Login");
        stage.show();
    }

    // ganti scene
    public static void changeScene(String fxmlFile, String title) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxmlFile));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle(title);
        primaryStage.setScene(scene);
    }

    public static void main(String[] args) {
        launch();
    }
}
