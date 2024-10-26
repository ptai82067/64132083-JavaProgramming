module thigiuaki.taipp.dangnhapvagiaodien {
  requires javafx.controls;
  requires javafx.fxml;
  requires java.sql;


  opens thigiuaki.taipp.dangnhapvagiaodien to javafx.fxml;
  exports thigiuaki.taipp.dangnhapvagiaodien;
}