package com.example.nexum;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class homepageController extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(homepageController.class.getResource("homepage-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);

        // 👇 Link your CSS file here
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

        stage.setTitle("Nexum - Home");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
