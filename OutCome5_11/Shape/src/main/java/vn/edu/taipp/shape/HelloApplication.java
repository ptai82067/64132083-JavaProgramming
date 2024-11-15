package vn.edu.taipp.shape;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Pane pane = new Pane();
        Polygon mainTriangle = new Polygon();
        mainTriangle.getPoints().addAll(
                150.0, 50.0, // Điểm đỉnh
                50.0, 200.0, // Góc trái
                250.0, 200.0 // Góc phải
        );
        mainTriangle.setStroke(Color.BLACK);
        mainTriangle.setFill(Color.WHITE);

        Polygon leftEar = new Polygon();
        leftEar.getPoints().addAll(
                100.0, 100.0,
                120.0, 50.0,
                140.0, 100.0
        );
        leftEar.setStroke(Color.BLACK);
        leftEar.setFill(Color.WHITE);

        Scene scene = new Scene(pane, 300, 300);
        stage.setTitle("Vẽ Hình");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}