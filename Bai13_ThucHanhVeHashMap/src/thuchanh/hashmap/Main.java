package thuchanh.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		Map<String, Float> dssv = new HashMap<String, Float>();
		dssv.put("Tài", 8.0f);
		dssv.put("Alice",9.0f);
		dssv.put("Bob", 7.99f);
		dssv.put("Masster", 8.0f);
		System.out.println(dssv);
		System.out.println(dssv.get("Tài"));
		dssv.remove("Tài");
		System.out.println(dssv);
		dssv.put("Tài Đẹp Trai", 9.99f);
		System.out.println(dssv);
	}
	
}
