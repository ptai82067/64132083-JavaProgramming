module com.example.javafx_maven {
  requires javafx.controls;
  requires javafx.fxml;
  requires com.google.gson;


  opens com.example.javafx_maven to javafx.fxml;
  exports com.example.javafx_maven;
}