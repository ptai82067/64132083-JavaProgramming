module com.example.tinhtong {
  requires javafx.controls;
  requires javafx.fxml;


  opens com.example.tinhtong to javafx.fxml;
  exports com.example.tinhtong;
}