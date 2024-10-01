package com.file1;

import java.io.FileInputStream;
import java.io.IOException;

public class App {
public static void main(String[] args) throws IOException {
	FileInputStream fin =null;
	fin = new FileInputStream("num.clc");
	int byteRead;
	while (true)
	{
		byteRead = fin.read();
		if(byteRead == -1) break;
		System.out.println(byteRead);
	}
	System.out.println("Done.");
}
}
