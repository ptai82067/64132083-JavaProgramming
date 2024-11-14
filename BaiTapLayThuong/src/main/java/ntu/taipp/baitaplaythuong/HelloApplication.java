package ntu.taipp.baitaplaythuong;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class HelloApplication extends Application {
  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scene_list.fxml"));
    Scene scene = new Scene(fxmlLoader.load());
    stage.setTitle("Hello!");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    SanPham sanPham = new SanPham(14,"Motobike123123",2000,"Phong cách người chơi");
    DatabaseTemplate<SanPham> SanPhamDB = new DatabaseTemplate<>();
    SanPhamDB.update(sanPham);
//    List<SanPham> list = SanPhamDB.query(SanPham.class);
//    System.out.println(list.get(0));
//    System.out.println(list.get(1));
//    System.out.println(list.get(2));
    launch();
  }
}