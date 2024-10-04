module com.example.appbmi_javafx {
  requires javafx.controls;
  requires javafx.fxml;


  opens com.example.appbmi_javafx to javafx.fxml;
  exports com.example.appbmi_javafx;
}