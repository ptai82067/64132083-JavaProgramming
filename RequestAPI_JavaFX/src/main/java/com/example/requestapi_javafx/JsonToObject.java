package com.example.requestapi_javafx;

import com.google.gson.Gson;

public interface JsonToObject<T> {
    Gson gson = new Gson();
   static <T> T jsonToObject(String json, Class<T> clazz){
     T t = gson.fromJson(json,clazz);
     return t;

  }
  static <T> String objectToJson(T object){
     return gson.toJson(object);
  }
}
