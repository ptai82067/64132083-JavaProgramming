module th.phamphuoctai.flashquizgui.flashquizgui {
  requires javafx.controls;
  requires javafx.fxml;


  opens th.phamphuoctai.flashquizgui.flashquizgui to javafx.fxml;
  exports th.phamphuoctai.flashquizgui.flashquizgui;
}