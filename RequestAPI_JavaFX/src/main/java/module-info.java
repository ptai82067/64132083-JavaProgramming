module com.example.requestapi_javafx {
  requires javafx.controls;
  requires javafx.fxml;
  requires java.net.http;
  requires com.google.gson;


  opens com.example.requestapi_javafx to javafx.fxml;
  exports com.example.requestapi_javafx;
}