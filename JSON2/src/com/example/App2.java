package com.example;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class App2 {
	
	public static void main(String[] args) {
		String jsonString = "{\"name\":\"Pham Phuoc Tai\", \"age\":21, \"city\":\"Viet Nam\"}";

        JSONParser parser = new JSONParser();
        try {
            JSONObject jsonObject = (JSONObject) parser.parse(jsonString);

            String name = (String) jsonObject.get("name");
            Long age = (Long) jsonObject.get("age");
            String city = (String) jsonObject.get("city");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("City: " + city);
        } catch (ParseException e) {
            e.printStackTrace();
        }
	}
}
