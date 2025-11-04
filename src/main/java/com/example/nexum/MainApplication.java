package com.example.nexum;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("homepage-view.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        // ✅ Correctly load CSS file from resources/com/example/nexum
        String styleCss = getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(styleCss);

        stage.setTitle("Nexum - Homepage");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
