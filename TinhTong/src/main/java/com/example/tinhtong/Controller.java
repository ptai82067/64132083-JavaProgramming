package com.example.tinhtong;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.security.MessageDigest;
import java.text.MessageFormat;

public class Controller {
  @FXML
  private TextField txtA, txtB, txtKQ;
  public void tinhTong(ActionEvent event){
    int a = Integer.parseInt(txtA.getText());
    int b = Integer.parseInt(txtB.getText());
    String KQ = String.valueOf(a+b);
    txtKQ.setText(KQ);
    String pattern = "Xin chào {0}, bạn có {1} tin nhắn mới.";
    String message = MessageFormat.format(pattern, "An", 5);
    txtA.setText(message);
  }
}
