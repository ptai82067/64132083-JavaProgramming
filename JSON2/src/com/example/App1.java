package com.example;
import org.json.simple.JSONObject;
//tao doi tuong json
public class App1 {
	public static void main(String[] args) {
		JSONObject jsonObject = new JSONObject();

        
        jsonObject.put("name", "Phạm Phước Lộc");
        jsonObject.put("age", 42);
        jsonObject.put("city", "Phú Yên");

        System.out.println(jsonObject.toJSONString());
	}
	

}
