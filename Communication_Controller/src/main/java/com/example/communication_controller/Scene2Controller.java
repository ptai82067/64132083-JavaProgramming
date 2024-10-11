package com.example.communication_controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class Scene2Controller {
  @FXML
  Label lb2;
  @FXML
  AnchorPane sceneAnchor;

  Stage stage;
  Scene scene;
  Parent root;
  public void display(String userName){
    lb2.setText("Hello: "+userName);
  }
  public void back(ActionEvent event) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("scene1.fxml"));
    root = loader.load();
    stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }
  public void exit(ActionEvent event){
    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
    alert.setTitle("Exit");
    alert.setHeaderText("Thoát Chương Trình");
    alert.setContentText("Bạn có muốn thoát chương trình hiện tại không");
    if(alert.showAndWait().get() == ButtonType.OK){
      stage = (Stage) sceneAnchor.getScene().getWindow();
      System.out.println("Đã thoát thành công");
      stage.close();

    }

  }
}
