package vn.edu.taipp.shape;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
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

        // Vẽ tai trái
        Polygon leftEar = new Polygon();
        leftEar.getPoints().addAll(
                100.0, 100.0,
                120.0, 50.0,
                140.0, 100.0
        );
        leftEar.setStroke(Color.BLACK);
        leftEar.setFill(Color.WHITE);

        // Vẽ tai phảin 
        Polygon rightEar = new Polygon();
        rightEar.getPoints().addAll(
                200.0, 100.0,
                180.0, 50.0,
                160.0, 100.0
        );
        rightEar.setStroke(Color.BLACK);
        rightEar.setFill(Color.WHITE);

        // Vẽ tam giác nhỏ bên trong
        Polygon innerTriangle = new Polygon();
        innerTriangle.getPoints().addAll(
                150.0, 120.0,
                130.0, 150.0,
                170.0, 150.0
        );
        innerTriangle.setStroke(Color.RED);
        innerTriangle.setFill(Color.TRANSPARENT);

        // Vẽ thân hình (hình cung)
        Arc bodyArc = new Arc(150, 230, 100, 50, 0, 180);
        bodyArc.setStroke(Color.BLACK);
        bodyArc.setFill(Color.TRANSPARENT);

        // Vẽ chân trái
        Circle leftFoot = new Circle(110, 250, 20);
        leftFoot.setStroke(Color.BLACK);
        leftFoot.setFill(Color.TRANSPARENT);

        // Vẽ chân phải
        Circle rightFoot = new Circle(190, 250, 20);
        rightFoot.setStroke(Color.BLACK);
        rightFoot.setFill(Color.TRANSPARENT);

        // Vẽ trang trí trên chân trái (hình cung)
        Arc leftFootDetail = new Arc(110, 250, 10, 10, 0, 180);
        leftFootDetail.setStroke(Color.RED);
        leftFootDetail.setFill(Color.TRANSPARENT);

        // Vẽ trang trí trên chân phải (hình cung)
        Arc rightFootDetail = new Arc(190, 250, 10, 10, 0, 180);
        rightFootDetail.setStroke(Color.RED);
        rightFootDetail.setFill(Color.TRANSPARENT);

        // Thêm tất cả các phần tử vào pane
        pane.getChildren().addAll(mainTriangle, leftEar, rightEar, innerTriangle,
                bodyArc, leftFoot, rightFoot, leftFootDetail, rightFootDetail);
        Scene scene = new Scene(pane, 300, 300);
        stage.setTitle("Vẽ Hình");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}