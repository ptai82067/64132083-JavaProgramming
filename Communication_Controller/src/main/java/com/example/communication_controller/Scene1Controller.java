package com.example.communication_controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene1Controller {
  @FXML
  TextField txtUserName;
  Parent root;
  Stage stage;
  Scene scene;
  public void loginUserName(ActionEvent event) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
     root = loader.load();

    Scene2Controller scene2Controller = loader.getController();
    scene2Controller.display(txtUserName.getText());

    stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();

  }
}
