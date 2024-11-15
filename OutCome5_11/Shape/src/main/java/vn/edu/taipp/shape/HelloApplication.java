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
        drawShapeAtPosition(pane, 150, 50); // Vẽ hình tại vị trí cố định
    }

    // Phương thức để vẽ hình tại vị trí chuột
    private void drawShapeAtMousePosition(Pane pane, double x, double y) {
        drawShapeAtPosition(pane, x, y); // Vẽ hình tại vị trí chuột
    }

    // Phương thức chung để vẽ hình tại vị trí cho trước
    private void drawShapeAtPosition(Pane pane, double x, double y) {
        // Dọn dẹp pane trước khi vẽ lại
        pane.getChildren().clear();

        // Vẽ tam giác lớn
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
                x - 20, y + 10, // Góc trái của tai (điểm thấp hơn, gần cơ thể)
                x - 0, y - 10, // Đỉnh của tai (nâng lên một chút)
                x, y + 20 // Góc phải của tai
        );
        leftEar.setStroke(Color.BLACK);
        leftEar.setFill(Color.WHITE);

// Vẽ tai phải
        Polygon rightEar = new Polygon();
        rightEar.getPoints().addAll(
                x + 20, y + 10, // Góc phải của tai (điểm thấp hơn, gần cơ thể)
                x + -0, y - 10, // Đỉnh của tai (nâng lên một chút)
                x, y + 20 // Góc trái của tai
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

        // Vẽ thân hình (hình cung)
        Arc bodyArc = new Arc(x, y + 150, 100, 50, 180, 180);
        bodyArc.setStroke(Color.BLACK);
        bodyArc.setFill(Color.TRANSPARENT);
        bodyArc.setType(ArcType.OPEN);

        // Vẽ chân trái
        Circle leftFoot = new Circle(x - 40, y + 195, 20);
        leftFoot.setStroke(Color.BLACK);
        leftFoot.setFill(Color.TRANSPARENT);

        // Vẽ chân phải
        Circle rightFoot = new Circle(x + 40, y + 195, 20);
        rightFoot.setStroke(Color.BLACK);
        rightFoot.setFill(Color.TRANSPARENT);

        // Vẽ trang trí trên chân trái (hình cung nửa trên)
        Arc leftFootDetailTop = new Arc(x - 40, y + 200, 10, 10, 0, 180);
        leftFootDetailTop.setStroke(Color.RED);
        leftFootDetailTop.setFill(Color.TRANSPARENT);
        leftFootDetailTop.setType(ArcType.OPEN);

        // Vẽ trang trí trên chân trái (hình cung nửa dưới)
        Arc leftFootDetailBottom = new Arc(x - 40, y + 200, 10, 10, 180, 180);
        leftFootDetailBottom.setStroke(Color.RED);
        leftFootDetailBottom.setFill(Color.TRANSPARENT);
        leftFootDetailBottom.setType(ArcType.OPEN);

        // Vẽ trang trí trên chân phải (hình cung)
        Arc rightFootDetailTop = new Arc(x + 40, y + 200, 10, 10, 0, 180);
        rightFootDetailTop.setStroke(Color.RED);
        rightFootDetailTop.setFill(Color.TRANSPARENT);
        rightFootDetailTop.setType(ArcType.OPEN);

        Arc rightFootDetailBottom = new Arc(x + 40, y + 200, 10, 10, 180, 180);
        rightFootDetailBottom.setStroke(Color.RED);
        rightFootDetailBottom.setFill(Color.TRANSPARENT);
        rightFootDetailBottom.setType(ArcType.OPEN);

        // Thêm tất cả các phần tử vào pane
        pane.getChildren().addAll(mainTriangle, leftEar, rightEar, innerTriangle,
                bodyArc, leftFoot, rightFoot, leftFootDetailTop, leftFootDetailBottom,
                rightFootDetailTop, rightFootDetailBottom);
    }

    public static void main(String[] args) {
        launch();
    }
}
