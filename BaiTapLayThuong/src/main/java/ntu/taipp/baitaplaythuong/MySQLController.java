package ntu.taipp.baitaplaythuong;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
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

    SanPham sp = new SanPham(tf_tensp.getText().toString(),Float.parseFloat(tf_giasp.getText().toString()),
            tf_mota.getText().toString());
    SanPhamDB.save(sp);
  }

  @FXML
  void onQuery(ActionEvent event) {
    table.setItems(initialData());
  }

  ObservableList<SanPham> initialData(){
    List<SanPham> list = SanPhamDB.query(SanPham.class);
    return FXCollections.observableArrayList(list);
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