package th.phamphuoctai.flashquizgui.flashquizgui;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class FlashQuizViewController implements Initializable {

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
  private ImageView imageView;
  @FXML
  private Label lblScore;
  int i=0;
  int score = 0;
  List<CauHoi> list = new ArrayList<>();
  List<Button> listCauHoi = new ArrayList<>();


  @FXML
  void handelBtnA(ActionEvent event) {

    check(event);
  }

  @FXML
  void handelBtnB(ActionEvent event) {

    check(event);
  }

  @FXML
  void handelBtnC(ActionEvent event) {

    check(event);
  }

  @FXML
  void handelBtnD(ActionEvent event) {

    check(event);
  }

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
    i=0;
    score = 0;
    lblScore.setText("0");
    listCauHoi.add(btnQuestion1);
    listCauHoi.add(btnQuestion2);
    listCauHoi.add(btnQuestion3);
    listCauHoi.add(btnQuestion4);
    listCauHoi.add(btnQuestion5);
    listCauHoi.add(btnQuestion6);
    listCauHoi.add(btnQuestion7);
    listCauHoi.add(btnQuestion8);
    listCauHoi.add(btnQuestion9);
    listCauHoi.add(btnQuestion10);

    list.add(new CauHoi("2+3=?", "https://files.catbox.moe/8hv9h2.jpg", "0","6","5","7","5"));
    list.add(new CauHoi("Thành phố Khánh Hòa tên là gì","https://files.catbox.moe/ssxr3f.jpg","Nha Trang","Cam Ranh","Nha Phu","Hàm Thuận", "Nha Trang"));
    list.add(new CauHoi("Thủ đô của Việt Nam là gì?", "https://files.catbox.moe/amu74q.jpg", "Hà Nội", "Hồ Chí Minh", "Đà Nẵng", "Huế", "Hà Nội"));
    list.add(new CauHoi("Quốc gia nào có kim tự tháp nổi tiếng?", "https://files.catbox.moe/ihub2c.jpg", "Ai Cập", "Mexico", "Ấn Độ", "Trung Quốc", "Ai Cập"));
    list.add(new CauHoi("5 x 6 bằng bao nhiêu?", "https://files.catbox.moe/mx09g3.png", "30", "25", "20", "35", "30"));
    list.add(new CauHoi("Tác giả của tác phẩm 'Truyện Kiều' là ai?", "https://files.catbox.moe/vjqlzn.jpg", "Nguyễn Du", "Nguyễn Trãi", "Hồ Xuân Hương", "Nguyễn Đình Chiểu", "Nguyễn Du"));
    list.add(new CauHoi("Hành tinh nào gần Mặt Trời nhất?", "https://files.catbox.moe/zaudus.jpg", "Sao Thủy", "Sao Kim", "Sao Hỏa", "Trái Đất", "Sao Thủy"));
    list.add(new CauHoi("Cầu thủ bóng đá nổi tiếng Lionel Messi đến từ quốc gia nào?", "https://files.catbox.moe/kmont2.png", "Argentina", "Brazil", "Bồ Đào Nha", "Pháp", "Argentina"));
    list.add(new CauHoi("Nước nào có diện tích lớn nhất thế giới?", "https://files.catbox.moe/4x84hk.jpg", "Nga", "Canada", "Trung Quốc", "Hoa Kỳ", "Nga"));
    list.add(new CauHoi("Tỉnh nào nổi tiếng với đặc sản phở bò Nam Định?", "https://files.catbox.moe/dnau3v.jpg", "Nam Định", "Hà Nam", "Thái Bình", "Hà Nội", "Nam Định"));
    cauHoiTracNghiem();
  }
  public void cauHoiTracNghiem(){
    if (i < list.size()) {
      lblQuestion.setText(list.get(i).getLoiHoi());
      btnA.setText(list.get(i).getPa1());
      btnB.setText(list.get(i).getPa2());
      btnC.setText(list.get(i).getPa3());
      btnD.setText(list.get(i).getPa4());

      // Reset lại style các button
      btnA.setStyle("");
      btnB.setStyle("");
      btnC.setStyle("");
      btnD.setStyle("");
      imageView.setImage(new Image(list.get(i).getUrl()));
      listCauHoi.get(i).setStyle("-fx-background-color: red; -fx-text-fill: white;");
    } else {
      lblQuestion.setText("Bạn đã hoàn thành tất cả các câu hỏi!");
      btnA.setDisable(true);
      btnB.setDisable(true);
      btnC.setDisable(true);
      btnD.setDisable(true);
    }

  }
  public void check(Event event) {
    Button clickedButton = (Button) event.getSource(); // Lấy button được nhấn
    String answer = clickedButton.getText(); // Đáp án từ button

    if (answer.equals(list.get(i).getPaDung())) {
      score=score+10;
      lblScore.setText(String.valueOf(score));
      clickedButton.setStyle("-fx-background-color: #90ee90;"); // Màu xanh lá khi đúng
    } else {
      score = score-2;
      lblScore.setText(String.valueOf(score));
      clickedButton.setStyle("-fx-background-color: #ffcccb;"); // Màu đỏ khi sai
    }

    i++; // Chuyển sang câu hỏi tiếp theo sau 1 giây
    PauseTransition pause = new PauseTransition(Duration.seconds(1));
    pause.setOnFinished(e -> cauHoiTracNghiem());
    pause.play();

  }

}