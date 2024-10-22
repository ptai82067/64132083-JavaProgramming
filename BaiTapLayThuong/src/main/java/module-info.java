module ntu.taipp.baitaplaythuong {
  requires javafx.controls;
  requires javafx.fxml;
  requires java.sql;


  opens ntu.taipp.baitaplaythuong to javafx.fxml;
  exports ntu.taipp.baitaplaythuong;
}