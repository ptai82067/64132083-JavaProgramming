package com.appnull;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Map<String,String> dstd = new HashMap<String, String>();
		dstd.put("Hello", "Xin Chào");
		dstd.put("Go", "Đi");
		dstd.put("Move", "Di Chuyển");
		dstd.put("Buy", "Mua");
		dstd.put("Good", "Tốt");
		dstd.put("Bad", "Tệ");
		dstd.put("Clear", "làm sạch");
		dstd.put("You", "Bạn");
		dstd.put("Love", "Yêu");
		dstd.put("I", "Tôi");
		Scanner s = new Scanner(System.in);
		String S = s.nextLine();
		System.out.println(dstd.get(S));
	}
}
