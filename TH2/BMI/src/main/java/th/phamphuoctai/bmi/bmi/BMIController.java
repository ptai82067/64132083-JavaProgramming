package th.phamphuoctai.bmi.bmi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class BMIController {
  @FXML
  private TextField tfChieuCao;

  @FXML
  private TextField tfCanNang;

  @FXML
  private TextField tfKQ;

  @FXML
  private RadioButton rb1;

  @FXML
  private RadioButton rb2;

  @FXML
  private Button btnKQ;

  @FXML
  void getOperator(ActionEvent event) {

  }

  @FXML
  void onResult(ActionEvent event) {
    if(tfChieuCao.getText().toString().isEmpty() || tfCanNang.getText().toString().isEmpty()){
      tfKQ.setText("Vui lòng nhập đầy đủ thông tin");
      return;
    }
    if(!rb1.isSelected()&&!rb2.isSelected()){
      tfKQ.setText("vui lòng chọn khu vực");
      return;
    }
     float chieuCao = Float.parseFloat(tfChieuCao.getText().toString());
      float canNang = Float.parseFloat(tfCanNang.getText().toString());
    if(rb1.isSelected()){
      if(!(1.0f < chieuCao && chieuCao < 2.2f)){
        tfKQ.setText("Chiều cao không hợp lý!!! Mời nhập lại....");
        tfChieuCao.setText("");
      } else if (!(2f < canNang && canNang < 200f)) {
        tfKQ.setText("Cân nặng không hợp lý !!! vui lòng nhập lại...");
      }else{
        float bMI = canNang / (chieuCao * chieuCao);
        if (bMI < 17.50f) {
          tfKQ.setText("Gầy");
        } else if (bMI >= 17.50f && bMI < 22.99f) {
          tfKQ.setText("Bình thường");
        } else if (bMI >= 23.00f && bMI <= 27.99f) {
          tfKQ.setText("Thừa cân");
        } else {
          tfKQ.setText("Béo phì");
        }
      }
  } else if (rb2.isSelected()) {
      if(!(1.0f < chieuCao && chieuCao < 2.2f)){
        tfKQ.setText("Chiều cao không hợp lý!!! Mời nhập lại....");
        tfChieuCao.setText("");
      } else if (!(2f < canNang && canNang < 200f)) {
        tfKQ.setText("Cân nặng không hợp lý !!! vui lòng nhập lại...");
      }else{
        float bMI = canNang / (chieuCao * chieuCao);
        if (bMI < 18.50f) {
          tfKQ.setText("Gầy");
        } else if (bMI >= 18.50f && bMI < 24.99f) {
          tfKQ.setText("Bình thường");
        } else if (bMI >= 25.00f && bMI <= 29.99f) {
          tfKQ.setText("Thừa cân");
        } else {
          tfKQ.setText("Béo phì");
        }
      }
    }
  }}
