package com.example.communication_controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;


public class Scene2Controller {
  @FXML
  Label lb2;
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
}
