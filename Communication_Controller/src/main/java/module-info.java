module com.example.communication_controller {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.communication_controller to javafx.fxml;
    exports com.example.communication_controller;
}