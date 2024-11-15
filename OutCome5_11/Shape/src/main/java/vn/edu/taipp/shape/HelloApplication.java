package vn.edu.taipp.shape;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();

        // Tạo nút để vẽ hình
        Button drawButton = new Button("Vẽ Hình");
        drawButton.setLayoutX(120);
        drawButton.setLayoutY(10);
        drawButton.setOnAction(e -> drawShape(pane));  // Khi nhấn nút sẽ vẽ hình

        // Vẽ hình khi nhấn chuột
        pane.setOnMouseClicked(e -> drawShapeAtMousePosition(pane, e.getX(), e.getY())); // Khi nhấn chuột vẽ tại vị trí chuột

        // Thêm nút vào giao diện
        pane.getChildren().add(drawButton);

        Scene scene = new Scene(pane, 300, 300);
        stage.setTitle("Vẽ Hình");
        stage.setScene(scene);
        stage.show();
    }

    // Phương thức để vẽ hình khi nhấn nút
    private void drawShape(Pane pane) {
        // Vẽ tam giác lớn
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
                100.0, 90.0, // Góc trái của tai
                130.0, 50.0, // Đỉnh của tai
                120.0, 100.0 // Góc phải của tai
        );
        leftEar.setStroke(Color.BLACK);
        leftEar.setFill(Color.WHITE);

        // Vẽ tai phải
        Polygon rightEar = new Polygon();
        rightEar.getPoints().addAll(
                200.0, 90.0, // Góc phải của tai
                170.0, 50.0, // Đỉnh của tai
                180.0, 100.0 // Góc trái của tai
        );
        rightEar.setStroke(Color.BLACK);
        rightEar.setFill(Color.WHITE);

        // Vẽ tam giác nhỏ bên trong
        Polygon innerTriangle = new Polygon();
        innerTriangle.getPoints().addAll(
                150.0, 130.0, // Điểm đỉnh
                130.0, 170.0, // Góc trái (di chuyển gần hơn)
                170.0, 170.0
        );
        innerTriangle.setStroke(Color.RED);
        innerTriangle.setFill(Color.TRANSPARENT);
        innerTriangle.setRotate(180);
        // Vẽ thân hình (hình cung)
        Arc bodyArc = new Arc(150, 200, 100, 50, 180, 180);
        bodyArc.setStroke(Color.BLACK);
        bodyArc.setFill(Color.TRANSPARENT);
        bodyArc.setType(ArcType.OPEN);

        // Vẽ chân trái
        Circle leftFoot = new Circle(110, 245, 20);
        leftFoot.setStroke(Color.BLACK);
        leftFoot.setFill(Color.TRANSPARENT);

        // Vẽ chân phải
        Circle rightFoot = new Circle(190, 245, 20);
        rightFoot.setStroke(Color.BLACK);
        rightFoot.setFill(Color.TRANSPARENT);

        // Vẽ trang trí trên chân trái (hình cung nửa trên)
        Arc leftFootDetailTop = new Arc(110, 250, 10, 10, 0, 180);
        leftFootDetailTop.setStroke(Color.RED);
        leftFootDetailTop.setFill(Color.TRANSPARENT);
        leftFootDetailTop.setType(ArcType.OPEN);

// Vẽ trang trí trên chân trái (hình cung nửa dưới)
        Arc leftFootDetailBottom = new Arc(110, 250, 10, 10, 180, 180);
        leftFootDetailBottom.setStroke(Color.RED);
        leftFootDetailBottom.setFill(Color.TRANSPARENT);
        leftFootDetailBottom.setType(ArcType.OPEN);

        // Vẽ trang trí trên chân phải (hình cung)
        Arc rightFootDetailTop = new Arc(190, 250, 10, 10, 0, 180);
        rightFootDetailTop.setStroke(Color.RED);
        rightFootDetailTop.setFill(Color.TRANSPARENT);
        rightFootDetailTop.setType(ArcType.OPEN);

        Arc rightFootDetailBottom = new Arc(190, 250, 10, 10, 180, 180);
        rightFootDetailBottom.setStroke(Color.RED);
        rightFootDetailBottom.setFill(Color.TRANSPARENT);
        rightFootDetailBottom.setType(ArcType.OPEN);


        // Thêm tất cả các phần tử vào pane
        pane.getChildren().addAll(mainTriangle, leftEar, rightEar, innerTriangle,
                bodyArc, leftFoot, rightFoot, leftFootDetailTop, leftFootDetailBottom,
                rightFootDetailTop, rightFootDetailBottom);
    }

    // Phương thức để vẽ hình tại vị trí chuột
    private void drawShapeAtMousePosition(Pane pane, double x, double y) {
        // Vẽ tam giác lớn tại vị trí chuột
        Polygon mainTriangle = new Polygon();
        mainTriangle.getPoints().addAll(
                x, y, // Điểm đỉnh
                x - 100, y + 150, // Góc trái
                x + 100, y + 150 // Góc phải
        );
        mainTriangle.setStroke(Color.BLACK);
        mainTriangle.setFill(Color.WHITE);

        // Vẽ tai trái
        Polygon leftEar = new Polygon();
        leftEar.getPoints().addAll(
                x - 50, y + 110, // Góc trái của tai
                x, y - 100, // Đỉnh của tai
                x - 20, y + 40 // Góc phải của tai
        );
        leftEar.setStroke(Color.BLACK);
        leftEar.setFill(Color.WHITE);

        // Vẽ tai phải
        Polygon rightEar = new Polygon();
        rightEar.getPoints().addAll(
                x + 50, y + 110, // Góc phải của tai
                x, y - 100, // Đỉnh của tai
                x + 20, y + 40 // Góc trái của tai
        );
        rightEar.setStroke(Color.BLACK);
        rightEar.setFill(Color.WHITE);

        // Vẽ tam giác nhỏ bên trong
        Polygon innerTriangle = new Polygon();
        innerTriangle.getPoints().addAll(
                x, y + 80, // Điểm đỉnh
                x - 20, y + 120, // Góc trái
                x + 20, y + 120  // Góc phải
        );
        innerTriangle.setStroke(Color.RED);
        innerTriangle.setFill(Color.TRANSPARENT);
        innerTriangle.setRotate(180);

        // Thêm tất cả các phần tử vào pane
        pane.getChildren().addAll(mainTriangle, leftEar, rightEar, innerTriangle);
    }

    public static void main(String[] args) {
        launch();
    }
}
