package com.example.javafx_maven;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import javafx.event.ActionEvent;
import java.lang.reflect.Type;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SinhVienController {
  @FXML
  TextField tf_mssv, tf_hoten, tf_namsinh;
  @FXML
  TextArea t_area;




  String tmp = "";
  ArrayList<SinhVien> listSV = readUsersFromFile();
  Gson gson = new GsonBuilder()
          .setPrettyPrinting()
          .create();

  public void themSinhVien(ActionEvent event){

    String mssv = tf_mssv.getText().toString();
    String hoTen = tf_hoten.getText().toString();
    String namSinh = tf_namsinh.getText().toString();
    for (var i:listSV){
      tmp += "MSSV: "+i.mssv + "\n"+"Họ Tên: "+i.hoTen+"\n"+"Năm Sinh: "+i.namSinh+
      "-----------------------------------------------------------------------------\n";
    }
    t_area.setText( tmp + "\nMSSV: "+mssv + "\n"+"Họ Tên: "+hoTen+"\n"+"Năm Sinh: "+namSinh);
  }
  public void luuSinhVien(ActionEvent event){

    int mssv = Integer.parseInt(tf_mssv.getText().toString());
    String hoTen = tf_hoten.getText().toString();
    String namSinh = tf_namsinh.getText().toString();
    SinhVien sv = new SinhVien(mssv,hoTen,namSinh);
    listSV.add(sv);
    try (FileWriter writer = new FileWriter("user.json")) {
      gson.toJson(listSV,writer);
      System.out.println(gson.toJson(listSV));

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public ArrayList<SinhVien> readUsersFromFile() {
    Gson gson = new Gson();
    ArrayList<SinhVien> userList = null;
    try (FileReader reader = new FileReader("user.json")) {
      // Sử dụng TypeToken để lấy kiểu danh sách các đối tượng User
      Type userListType = new TypeToken<ArrayList<SinhVien>>(){}.getType();
      userList = gson.fromJson(reader, userListType);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return userList;
  }

}
