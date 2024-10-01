package com.example;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
public class App2 {
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"Pham tai\", \"age\":21, \"city\":\"VietNam\"}";
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            User user = objectMapper.readValue(jsonString, User.class);
            System.out.println("Name: " + user.getName());
            System.out.println("Age: " + user.getAge());
            System.out.println("City: " + user.getCity());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
