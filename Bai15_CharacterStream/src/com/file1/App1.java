package com.file1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App1 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("songque.txt");
		BufferedReader bufRead = new BufferedReader(fr);
		String dongque = bufRead.readLine();
		
		System.out.println(dongque);
	}
}
