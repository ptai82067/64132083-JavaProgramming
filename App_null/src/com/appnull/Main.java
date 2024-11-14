package com.appnull;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:51545/api/values");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");

            // Dữ liệu JSON gửi qua API
            String jsonInputString = "{\"id\":3,\"name\":\"Alice\",\"position\":\"Tester\"}";

            // Gửi dữ liệu
            try(OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Kiểm tra phản hồi từ API
            int responseCode = conn.getResponseCode();
            System.out.println("POST Response Code :: " + responseCode);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
