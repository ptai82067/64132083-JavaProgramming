package com.file1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class App2 {
public static void main(String[] args) throws IOException {
	URL url = new URL("https://ntu.edu.vn/default.aspx");
	URLConnection conection = url.openConnection();
	
	InputStream in = conection.getInputStream();
	
	InputStreamReader sr = new InputStreamReader(in);
	BufferedReader buffReader = new BufferedReader(sr);
	String line = buffReader.readLine();
	System.out.println(line);
}
}
