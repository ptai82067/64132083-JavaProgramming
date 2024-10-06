module com.example.switchscene {
  requires javafx.controls;
  requires javafx.fxml;


  opens com.example.switchscene to javafx.fxml;
  exports com.example.switchscene;
}