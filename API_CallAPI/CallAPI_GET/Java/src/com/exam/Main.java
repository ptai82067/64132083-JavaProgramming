package com.exam;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            // URL của API (thay đổi cho phù hợp với API của bạn)
            URL url = new URL("http://localhost:51545/api/values");

            // Mở kết nối
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            // Kiểm tra mã phản hồi
            int responseCode = conn.getResponseCode();

            if (responseCode != 200) {
                throw new RuntimeException("HTTP GET Request Failed with Error code : " + responseCode);
            } else {
                // Đọc phản hồi từ API
                Scanner sc = new Scanner(url.openStream());
                StringBuilder inline = new StringBuilder();
                while (sc.hasNext()) {
                    inline.append(sc.nextLine());
                }
                System.out.println("\nJSON data in string format");
                System.out.println(inline);
                sc.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
