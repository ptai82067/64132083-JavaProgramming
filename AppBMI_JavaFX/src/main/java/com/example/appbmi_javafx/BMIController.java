package com.example.appbmi_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BMIController {
  @FXML
  TextField txtChieuCao, txtCanNang;
  @FXML
  Label lbKQ;
  public void kiemTra(ActionEvent event){
    float chieuCao = Float.parseFloat(txtChieuCao.getText());
    float canNang = Float.parseFloat(txtCanNang.getText());
    try{
      float bMI = canNang / (chieuCao * chieuCao);
      if (bMI < 18.5f) {
        lbKQ.setText("Gầy");
      } else if (bMI >= 18.5f && bMI < 24.9f) {
        lbKQ.setText("Gầy");
      } else if (bMI >= 24.9f && bMI <= 29.9f) {
        lbKQ.setText("Gầy");
      } else {
        lbKQ.setText("Gầy");
      }

    }catch (NumberFormatException exception){
      lbKQ.setText("Gầy");
    }
  }
}
