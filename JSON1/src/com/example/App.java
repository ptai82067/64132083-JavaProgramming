package com.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class App {
	public static void main(String[] args) {
        Gson gson = new Gson();

        // Ghi object Java ra file dưới dạng JSON
        User user = new User();
        user.name = "Alice";
        user.age = 30;

        try (FileWriter writer = new FileWriter("user.json")) {
            gson.toJson(user, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Đọc JSON từ file và chuyển thành object Java
        try (FileReader reader = new FileReader("user.json")) {
            User userFromFile = gson.fromJson(reader, User.class);
            System.out.println(userFromFile.name + " - " + userFromFile.age);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}