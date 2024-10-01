package com.example;
import org.json.simple.JSONObject;
//tao doi tuong json
public class App1 {
	public static void main(String[] args) {
		JSONObject jsonObject = new JSONObject();

        // Thêm các cặp key-value vào JSON
        jsonObject.put("name", "John");
        jsonObject.put("age", 25);
        jsonObject.put("city", "New York");

        // In ra chuỗi JSON
        System.out.println(jsonObject.toJSONString());
	}
	

}
