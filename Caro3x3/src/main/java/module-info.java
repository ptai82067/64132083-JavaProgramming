module com.example.caro3x3 {
  requires javafx.controls;
  requires javafx.fxml;


  opens com.example.caro3x3 to javafx.fxml;
  exports com.example.caro3x3;
}