package com.example.pheptinh;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PhepTinhController {
  @FXML
  TextField tfA, tfB, tfKQ;
  @FXML
  Button btnCong, btnTru, btnNhan, btnChia;

  public void ptCong(ActionEvent event){
    int a = Integer.parseInt(tfA.getText());
    int b = Integer.parseInt(tfB.getText());
    tfKQ.setText((a+b)+"");
  }
  public void ptTru(ActionEvent event){
    int a = Integer.parseInt(tfA.getText());
    int b = Integer.parseInt(tfB.getText());
    tfKQ.setText((a-b)+"");
  }
  public void ptNhan(ActionEvent event){
    int a = Integer.parseInt(tfA.getText());
    int b = Integer.parseInt(tfB.getText());
    tfKQ.setText((a*b)+"");
  }
  public void ptChia(ActionEvent event){
    int a = Integer.parseInt(tfA.getText());
    int b = Integer.parseInt(tfB.getText());
    tfKQ.setText(((float)a/b)+"");
  }

}
