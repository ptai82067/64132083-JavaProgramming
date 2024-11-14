package thigiuaki.taipp.dangnhapvagiaodien;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class MySQLController implements Initializable {

  @FXML
  private TextField tf_tensp;

  @FXML
  private TextField tf_giasp;

  @FXML
  private TextArea tf_mota;

  @FXML
  private TableView<SanPham> table;

  @FXML
  private TableColumn<SanPham, Integer> id;

  @FXML
  private TableColumn<SanPham, String> tenSP;

  @FXML
  private TableColumn<SanPham, Float> giaSP;

  @FXML
  private TableColumn<SanPham, String> moTa;

  DatabaseTemplate<SanPham> SanPhamDB = new DatabaseTemplate<>();
  @FXML
  void onInsert(ActionEvent event) {

  }

  ObservableList<SanPham> initialData(){
    List<SanPham> list = SanPhamDB.query(SanPham.class,"demobanhang");
    return FXCollections.observableArrayList(list);
  }

  @FXML
  void onQuery(ActionEvent event) {
    Alert alert = new Alert(Alert.AlertType.ERROR);
    alert.setTitle("Lỗi Đăng Nhập");
    alert.setHeaderText(null);
    alert.setContentText("Tài khoản hoặc mật khẩu không chính xác, vui lòng nhập lại !!!");
    alert.showAndWait();
  }


  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
    id.setCellValueFactory(new PropertyValueFactory<SanPham, Integer>("id"));
    tenSP.setCellValueFactory(new PropertyValueFactory<SanPham, String>("tenSP"));
    giaSP.setCellValueFactory(new PropertyValueFactory<SanPham, Float>("giaSP"));
    moTa.setCellValueFactory(new PropertyValueFactory<SanPham, String>("moTa"));
    table.setItems(initialData());
  }
}