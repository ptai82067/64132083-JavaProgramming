module com.example.pheptinh {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pheptinh to javafx.fxml;
    exports com.example.pheptinh;
}