package com.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {
	// 
	public static void main(String[] args) {
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("num.clc");
			
		} catch (FileNotFoundException e) {
			System.out.println("Khong tim thay file");
		}
		
			try {
				for(int i=1; i<127; i++)
				fout.write(i);
				fout.flush();
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
