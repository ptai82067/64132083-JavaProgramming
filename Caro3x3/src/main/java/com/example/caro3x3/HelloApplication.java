package com.example.caro3x3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
  private boolean isXTurn = true;
  private Button[][] buttons = new Button[3][3];
  @Override
  public void start(Stage stage) throws IOException {
    GridPane grid = new GridPane();
    for (int row = 0; row < 3; row++){
      for (int col = 0; col < 3; col++){
        Button button = new Button("");
        button.setPrefSize(50,50);
        button.setOnAction(event -> handButtonClick(button));
        buttons[row][col] = button;
        grid.add(button, row, col);
      }
    }
    Scene scene = new Scene(grid, 150, 150);
    stage.setScene(scene);
    stage.setTitle("Caro3x3");
    stage.show();
  }

  private void handButtonClick(Button button) {
    if(!button.getText().isEmpty()){
      return;
    }
    button.setText(isXTurn?"X":"O");
    isXTurn = !isXTurn;
    
    checkWiner();
  }

  private void checkWiner() {
    for (int i = 0; i<3; i++){
      if(checkRow(i)||checkCol(i)){
        endGame();
        return;
      }

    }
    if(checkDialog()){
      endGame();
    }
  }

  private void endGame() {
    System.out.println("Endgame");
    Label lb = new Label("Game Over");
    Scene scene = new Scene(lb,200,200);
    Stage stage = new Stage();
    stage.setScene(scene);
    stage.show();
  }

  private boolean checkDialog() {
    boolean dialog1 =  buttons[0][0].getText().equals(buttons[1][1].getText()) &&
            buttons[1][1].getText().equals(buttons[2][2].getText())&&
            !buttons[0][0].getText().isEmpty();
    boolean dialog2 =  buttons[0][2].getText().equals(buttons[1][1].getText()) &&
            buttons[1][1].getText().equals(buttons[2][0].getText())&&
            !buttons[1][1].getText().isEmpty();
    return dialog1||dialog2;
  }

  private boolean checkCol(int i) {
    return buttons[0][i].getText().equals(buttons[1][i].getText()) &&
            buttons[1][i].getText().equals(buttons[2][i].getText())&&
            (!buttons[0][i].getText().isEmpty());
  }

  private boolean checkRow(int i) {
    return buttons[i][0].getText().equals(buttons[i][1].getText()) &&
            buttons[i][1].getText().equals(buttons[i][2].getText())&&
            (!buttons[i][0].getText().isEmpty());
  }

  public static void main(String[] args) {
    launch();
  }
}