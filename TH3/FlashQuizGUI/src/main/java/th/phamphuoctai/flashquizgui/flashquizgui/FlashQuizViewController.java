package th.phamphuoctai.flashquizgui.flashquizgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FlashQuizViewController {

  @FXML
  private Button btnQuestion10;

  @FXML
  private Button btnQuestion9;

  @FXML
  private Button btnQuestion8;

  @FXML
  private Button btnQuestion7;

  @FXML
  private Button btnQuestion6;

  @FXML
  private Button btnQuestion5;

  @FXML
  private Button btnQuestion4;

  @FXML
  private Button btnQuestion3;

  @FXML
  private Button btnQuestion2;

  @FXML
  private Button btnQuestion1;

  @FXML
  private Button btnA1;

  @FXML
  private Label lblQuestion;

  @FXML
  private Button btnA;

  @FXML
  private Button btnB1;

  @FXML
  private Button btnB;

  @FXML
  private Button btnC1;

  @FXML
  private Button btnC;

  @FXML
  private Button btnD1;

  @FXML
  private Button btnD;

  @FXML
  private Label lblScore;
  private boolean isOriginalColor = true;
  private boolean isOriginalColor1 = true;
  private boolean isOriginalColor2 = true;
  private boolean isOriginalColor3 = true;
  @FXML
  void handelBtnA(ActionEvent event) {
    if (isOriginalColor) {
      btnA1.setStyle("-fx-background-color: #ff6347; -fx-text-fill: white;" +
              "-fx-background-radius:  50;");
      btnA.setStyle("-fx-background-color: #ff6347; -fx-text-fill: white;");
      btnB1.setStyle(
              "-fx-background-radius:  50;");
      btnB.setStyle(""); // Quay lại màu mặc địnhbtnA1.setStyle(
      btnC.setStyle("");
      btnD.setStyle("");
      btnC1.setStyle(
              "-fx-background-radius:  50;");
      btnD1.setStyle(
              "-fx-background-radius:  50;");
      isOriginalColor1 = true;
      isOriginalColor2 = true;
      isOriginalColor3 = true;

    } else {
      btnA1.setStyle(
              "-fx-background-radius:  50;");
      btnA.setStyle(""); // Quay lại màu mặc định

    }
    isOriginalColor = !isOriginalColor;
  }

  @FXML
  void handelBtnB(ActionEvent event) {
    if (isOriginalColor1) {
      btnB1.setStyle("-fx-background-color: #ff6347; -fx-text-fill: white;" +
              "-fx-background-radius:  50;");
      btnB.setStyle("-fx-background-color: #ff6347; -fx-text-fill: white;");
      btnA1.setStyle(
              "-fx-background-radius:  50;");
      btnA.setStyle(""); // Quay lại màu mặc địnhbtnA1.setStyle(
      btnC.setStyle("");
      btnD.setStyle("");
      btnC1.setStyle(
              "-fx-background-radius:  50;");
      btnD1.setStyle(
              "-fx-background-radius:  50;");
      isOriginalColor = true;
      isOriginalColor2 = true;
      isOriginalColor3 = true;
    } else {
      btnB1.setStyle(
              "-fx-background-radius:  50;");
      btnB.setStyle(""); // Quay lại màu mặc định
    }
    isOriginalColor1 = !isOriginalColor1;
  }

  @FXML
  void handelBtnC(ActionEvent event) {
    if (isOriginalColor2) {
      btnC1.setStyle("-fx-background-color: #ff6347; -fx-text-fill: white;" +
              "-fx-background-radius:  50;");
      btnC.setStyle("-fx-background-color: #ff6347; -fx-text-fill: white;");
      btnB1.setStyle(
              "-fx-background-radius:  50;");
      btnB.setStyle(""); // Quay lại màu mặc địnhbtnA1.setStyle(
      btnA.setStyle("");
      btnD.setStyle("");
      btnA1.setStyle(
              "-fx-background-radius:  50;");
      btnD1.setStyle(
              "-fx-background-radius:  50;");
      isOriginalColor = true;
      isOriginalColor1 = true;
      isOriginalColor3 = true;
    } else {
      btnC1.setStyle(
              "-fx-background-radius:  50;");
      btnC.setStyle(""); // Quay lại màu mặc định
    }
    isOriginalColor2 = !isOriginalColor2;
  }

  @FXML
  void handelBtnD(ActionEvent event) {
    if (isOriginalColor3) {
      btnD1.setStyle("-fx-background-color: #ff6347; -fx-text-fill: white;" +
              "-fx-background-radius:  50;");
      btnD.setStyle("-fx-background-color: #ff6347; -fx-text-fill: white;");
      btnB1.setStyle(
              "-fx-background-radius:  50;");
      btnB.setStyle(""); // Quay lại màu mặc địnhbtnA1.setStyle(
      btnC.setStyle("");
      btnA.setStyle("");
      btnC1.setStyle(
              "-fx-background-radius:  50;");
      btnA1.setStyle(
              "-fx-background-radius:  50;");
      isOriginalColor = true;
      isOriginalColor2 = true;
      isOriginalColor1 = true;
    } else {
      btnD1.setStyle(
              "-fx-background-radius:  50;");
      btnD.setStyle(""); // Quay lại màu mặc định
    }
    isOriginalColor3 = !isOriginalColor3;
  }

}