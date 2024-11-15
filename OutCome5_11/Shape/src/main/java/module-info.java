module vn.edu.taipp.shape {
    requires javafx.controls;
    requires javafx.fxml;


    opens vn.edu.taipp.shape to javafx.fxml;
    exports vn.edu.taipp.shape;
}