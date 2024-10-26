package thigiuaki.taipp.dangnhapvagiaodien;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class LoginController {

  @FXML
  private TextField username;

  @FXML
  private PasswordField password;

  @FXML
  private void handleLogin(ActionEvent event) {
    if(kiemTraTaiKhoan()){
      switchScene(event);
    }else{
      Alert alert = new Alert(Alert.AlertType.ERROR);
      alert.setTitle("Lỗi Đăng Nhập");
      alert.setHeaderText(null);
      alert.setContentText("Tài khoản hoặc mật khẩu không chính xác, vui lòng nhập lại !!!");
      alert.showAndWait();
      username.setText("");
      password.setText("");
    }

  }

  private boolean kiemTraTaiKhoan(){
    DatabaseTemplate<Accout> databaseTemplate = new DatabaseTemplate<>();
    List<Accout> list = databaseTemplate.query(Accout.class,"taikhoan");
    for (var i:list){
      if(username.getText().toString().equals(i.getTaiKhoan())
              && password.getText().toString().equals(i.getMatKhau())){
        return true;
      }
    }
    return false;
  }
  private void switchScene(ActionEvent event){
    Stage stage;
    Scene scene;
    Parent root;
    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scene_list.fxml"));
    try {
      root = fxmlLoader.load();
      stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
      scene = new Scene(root);
      stage.setScene(scene);
      stage.setTitle("Danh Sách Sản Phẩm");
      stage.centerOnScreen();
      stage.show();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}