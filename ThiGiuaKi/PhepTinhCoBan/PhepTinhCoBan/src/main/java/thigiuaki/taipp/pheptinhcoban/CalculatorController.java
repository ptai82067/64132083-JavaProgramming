package thigiuaki.taipp.pheptinhcoban;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.Duration;

import java.net.URL;
import java.util.*;

public class CalculatorController  implements Initializable {

  @FXML
  private TextField toanhangA;

  @FXML
  private TextField toanhangB;

  @FXML
  private TextField toantu;
  @FXML
  private Label diem;
  @FXML
  private Label thoigian;

  private float a, b;
  @FXML
  private Button A;
  @FXML
  private Button B;
  @FXML
  private Button C;
  @FXML
  private Button D;
  private int countdownTime = 5; // thời gian đếm ngược từ 5
  private Timeline countdownTimeline;
  @FXML
  private Button correctButton;
  int diemtichluy;
  @FXML
  public void onA(ActionEvent event){
    if(A.getText().toString().equals(String.valueOf(correctAnswer))){  diemtichluy++;}
    handleButtonClick((Button) event.getSource());
    diem.setText(String.valueOf(diemtichluy));
  }
  private int correctAnswer;
  public void onB(ActionEvent event){
    if(B.getText().toString().equals(String.valueOf(correctAnswer))){  diemtichluy++;}
    handleButtonClick((Button) event.getSource());
    diem.setText(String.valueOf(diemtichluy));
  }
  public void onC(ActionEvent event){
    if(C.getText().toString().equals(String.valueOf(correctAnswer))){  diemtichluy++;}
    handleButtonClick((Button) event.getSource());
    diem.setText(String.valueOf(diemtichluy));
  }
  public void onD(ActionEvent event){
    if(D.getText().toString().equals(String.valueOf(correctAnswer))){  diemtichluy++;}
    handleButtonClick((Button) event.getSource());
    diem.setText(String.valueOf(diemtichluy));
  }
public void onChange(ActionEvent event){
  toanhangA.setText(String.valueOf(ramdomToanHan()));
  toanhangB.setText(String.valueOf(ramdomToanHan()));
  toantu.setText(ramdomToanTu());
  correctAnswer = calculateAnswer(Integer.parseInt(toanhangA.getText().toString()) ,
          Integer.parseInt(toanhangB.getText().toString()),
          toantu.getText().toString());
  assignCorrectAnswer();
  setWrongAnswers();
  A.setStyle("-fx-background-color: null;");
  B.setStyle("-fx-background-color: null;");
  C.setStyle("-fx-background-color: null;");
  D.setStyle("-fx-background-color: null;");
  startCountdown();
}

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
    toanhangA.setText(String.valueOf(ramdomToanHan()));
    toanhangB.setText(String.valueOf(ramdomToanHan()));
    toantu.setText(ramdomToanTu());
    correctAnswer = calculateAnswer(Integer.parseInt(toanhangA.getText().toString()) ,
            Integer.parseInt(toanhangB.getText().toString()),
            toantu.getText().toString());
//    assignCorrectAnswer();assignCorrectAnswer
    setWrongAnswers();
    if (diem != null) {
      diem.setText("điểm");
    } else {
      System.err.println("Label 'diem' chưa được khởi tạo.");
    }
    diemtichluy =0;
    int correctIndex = (int) (Math.random() * 4);
    if (correctIndex == 0) {
      correctButton = A;
    } else if (correctIndex == 1) {
      correctButton = B;
    } else if (correctIndex == 2) {
      correctButton = C;
    } else {
      correctButton = D;
    }

    // Kiểm tra nếu correctButton được gán chính xác trước khi sử dụng
    if (correctButton != null) {
      correctButton.setText(correctAnswer+"");
    }
    startCountdown();
  }

  private int ramdomToanHan() {
    Random random = new Random();
    int randomNumber = random.nextInt(100) + 1;
    return randomNumber;
  }

  private String ramdomToanTu() {
    Random random = new Random();
    char[] operators = {'+', '-', '*', '/'};
    char randomOperator = operators[random.nextInt(operators.length)];
    return String.valueOf(randomOperator);
  }
  private int calculateAnswer(int a, int b, String op) {
    switch (op) {
      case "+":
        return a + b;
      case "-":
        return a - b;
      case "*":
        return a * b;
      case "/":
        return b != 0 ? a / b : 0; // Tránh chia cho 0
      default:
        return 0;
    }
  }
  private void assignCorrectAnswer() {
//    // Chọn một nút ngẫu nhiên để hiển thị kết quả đúng
//    List<Button> buttons = Arrays.asList(A, B, C, D);
//    // Trộn danh sách nút để chọn ngẫu nhiên
//    Collections.shuffle(buttons);
//    buttons.get(0).setText(String.valueOf(correctAnswer));
    // Gán kết quả đúng cho nút đầu tiên
    correctButton.setText(String.valueOf(correctAnswer));
    int correctIndex = (int) (Math.random() * 4); // Giả sử có 4 nút
    if (correctIndex == 0) {
      A.setText(String.valueOf(correctAnswer));
      correctButton = A;
    } else if (correctIndex == 1) {
      B.setText(String.valueOf(correctAnswer));
      correctButton = B;
    } else if (correctIndex == 2) {
      C.setText(String.valueOf(correctAnswer));
      correctButton = C;
    } else {
      D.setText(String.valueOf(correctAnswer));
      correctButton = D;
    }
  }
  private void setWrongAnswers() {
    Random random = new Random();
    // Tạo danh sách các nút để thiết lập kết quả sai
    List<Button> buttons = Arrays.asList(A, B, C, D);
    for (Button button : buttons) {
      // Kiểm tra và thiết lập kết quả sai cho các nút không chứa kết quả đúng
      if (!button.getText().equals(String.valueOf(correctAnswer))) {
        int wrongAnswer;
        do {
          wrongAnswer = correctAnswer + random.nextInt(10) - 5; // Sinh kết quả sai ngẫu nhiên
        } while (wrongAnswer == correctAnswer); // Đảm bảo không trùng với kết quả đúng
        button.setText(String.valueOf(wrongAnswer));
      }
    }
  }
  private void handleButtonClick(Button clickedButton) {
    // Giả sử 'correctButton' là nút đúng
    if (clickedButton == correctButton) { // correctButton là nút đúng
      clickedButton.setStyle("-fx-background-color: green;"); // Màu xanh cho nút đúng
    } else {
      clickedButton.setStyle("-fx-background-color: red;"); // Màu đỏ cho nút sai
      correctButton.setStyle("-fx-background-color: green;"); // Đặt lại màu cho nút đúng nếu có
    }
  }
  private void startCountdown() {
    countdownTime = 5; // Bắt đầu từ 5
    thoigian.setText(String.valueOf(countdownTime)); // Cập nhật Timer Label

    if (countdownTimeline != null) {
      countdownTimeline.stop(); // Dừng đếm ngược trước đó nếu có
    }

    countdownTimeline = new Timeline(
            new KeyFrame(Duration.seconds(1), e -> {
              countdownTime--;
              thoigian.setText(String.valueOf(countdownTime)); // Cập nhật Label

              if (countdownTime <= 0) {
                countdownTimeline.stop(); // Dừng khi kết thúc đếm ngược
              }
            })
    );

    countdownTimeline.setCycleCount(Timeline.INDEFINITE);
    countdownTimeline.play(); // Bắt đầu đếm ngược
  }

}