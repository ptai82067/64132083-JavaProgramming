package com.file1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("songque.txt");
		char buff[] = null;
		buff = new char[10];
		fr.read(buff);
		fr.close();
		for(int i=0; i<10; i++)
			System.out.print(buff[i]);
		System.out.println(String.valueOf(buff));
	}

}
