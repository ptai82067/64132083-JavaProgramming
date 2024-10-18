package com.example.requestapi_javafx;

import com.google.gson.Gson;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HelloController implements JsonToObject<Know> {
  @FXML
  Label lb_fact, lb_length;
  @FXML
  TextField tf_api;


  public void onGetAPI(ActionEvent event) throws IOException, InterruptedException {
    String api =  tf_api.getText().toString();
    if(!api.isEmpty()){
      String json = getRequestAPI(api);
      Know know = JsonToObject.jsonToObject(json, Know.class);
      lb_fact.setText(know.fact);
      lb_length.setText(String.valueOf(know.length));
    }

  }


  public String getRequestAPI(String api) throws IOException, InterruptedException {
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(api))
            .build();
    HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

    return response.body();
  }
  public Know changeJsonToObject(String json){
    Gson gson = new Gson();
    Know know = gson.fromJson(json,Know.class);
    return know;
  }
}