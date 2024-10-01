package com.example;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
public class App {
	public static void main(String[] args) {
        
        User user = new User("Phạm Phước Tài", 21, "Việt Nam");
        
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            String jsonString = objectMapper.writeValueAsString(user);
            System.out.println("JSON Output: " + jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
