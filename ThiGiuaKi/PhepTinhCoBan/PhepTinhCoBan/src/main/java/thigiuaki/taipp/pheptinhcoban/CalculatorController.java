package thigiuaki.taipp.pheptinhcoban;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CalculatorController {

  @FXML
  private TextField inputA;

  @FXML
  private TextField inputB;

  @FXML
  private TextArea inputKQ;

  private float a, b;
  private String c;

  // Add methods to handle button actions
  @FXML
  private void handleAddition() {
    a = Float.parseFloat(inputA.getText().toString());
    b = Float.parseFloat(inputB.getText().toString());
    c = String.valueOf(a + b);
    if(!inputA.getText().toString().isEmpty() && !inputB.getText().toString().isEmpty())
    inputKQ.setText(c);
  }

  @FXML
  private void handleSubtraction() {
    a = Float.parseFloat(inputA.getText().toString());
    b = Float.parseFloat(inputB.getText().toString());
    c = String.valueOf(a - b);
    inputKQ.setText(c);
  }

  @FXML
  private void handleMultiplication() {
    a = Float.parseFloat(inputA.getText().toString());
    b = Float.parseFloat(inputB.getText().toString());
    c = String.valueOf(a * b);
    inputKQ.setText(c);
  }

  @FXML
  private void handleDivision() {
    a = Float.parseFloat(inputA.getText().toString());
    b = Float.parseFloat(inputB.getText().toString());
    c = String.valueOf(a / b);
    inputKQ.setText(c);
  }

  @FXML
  private void handleSqrt() {
    a = Float.parseFloat(inputA.getText().toString());
    b = Float.parseFloat(inputB.getText().toString());
    c = String.valueOf(Math.sqrt(a));
    String d = String.valueOf(Math.sqrt(b));
    inputKQ.setText("√"+a +" = "+c +" \n "+"√"+b +" = "+d);
  }

  @FXML
  private void handleSin() {
    a = Float.parseFloat(inputA.getText().toString());
    b = Float.parseFloat(inputB.getText().toString());
    c = String.valueOf(Math.sin(a));
    String d = String.valueOf(Math.sin(b));
    inputKQ.setText("sin("+a +") = "+c +"\n"+"sin("+b +") = "+d);
  }

  @FXML
  private void handleCos() {
    a = Float.parseFloat(inputA.getText().toString());
    b = Float.parseFloat(inputB.getText().toString());
    c = String.valueOf(a + b);
    c = String.valueOf(Math.cos(a));
    String d = String.valueOf(Math.cos(b));
    inputKQ.setText("cos("+a +") = "+c +"\n"+"cos("+b +") = "+d);
  }

  @FXML
  private void handleExp() {
    a = Float.parseFloat(inputA.getText().toString());
    b = Float.parseFloat(inputB.getText().toString());
    c = String.valueOf(Math.exp(a));
    String d = String.valueOf(Math.exp(b));
    inputKQ.setText("e("+a +") = "+c +"\n"+"e("+b +") = "+d);
  }

  @FXML
  private void handleLn() {
    a = Float.parseFloat(inputA.getText().toString());
    b = Float.parseFloat(inputB.getText().toString());
    c = String.valueOf(Math.log10(a));
    String d = String.valueOf(Math.log10(b));
    inputKQ.setText("ln("+a +") = "+c +"\n"+"ln("+b +") = "+d);
  }

  @FXML
  private void handleLog() {
    a = Float.parseFloat(inputA.getText().toString());
    b = Float.parseFloat(inputB.getText().toString());
    c = String.valueOf(Math.log(a));
    String d = String.valueOf(Math.log(b));
    inputKQ.setText("log("+a +") = "+c +"\n"+"log("+b +") = "+d);
  }
}