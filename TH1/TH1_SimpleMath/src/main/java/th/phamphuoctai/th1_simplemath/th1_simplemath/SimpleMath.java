package th.phamphuoctai.th1_simplemath.th1_simplemath;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class SimpleMath {

  @FXML
  private TextField tfA;

  @FXML
  private TextField tfB;

  @FXML
  private TextField tfKQ;

  @FXML
  private RadioButton rb1;

  @FXML
  private RadioButton rb2;

  @FXML
  private RadioButton rb3;

  @FXML
  private RadioButton rb4;

  @FXML
  private Button btnKQ;

  private String kq;
  private int a, b;

  @FXML
  void getOperator(ActionEvent event) {
  
  }

  @FXML
  void onResult(ActionEvent event) {
    a = Integer.parseInt(tfA.getText().toString());
    b = Integer.parseInt(tfB.getText().toString());
    if(rb1.isSelected()){
      kq = String.valueOf(a+b);
    } else if (rb2.isSelected()) {
      kq = String.valueOf(a-b);
    } else if (rb3.isSelected()) {
      kq = String.valueOf(a*b);
    } else if (rb4.isSelected()) {
      kq = String.valueOf((float) a/b);
    }else {
      kq = "Hãy chọn phép tính";
    }
    tfKQ.setText(kq);
  }

}
