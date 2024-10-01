package com.file;

import java.io.FileWriter;
import java.io.IOException;

public class App {
	public static void main(String[] args) throws IOException {
		// tao file van ban
		FileWriter fw;
		fw = new FileWriter("songque.txt");
		fw.write("Quê hương tôi có con sông xanh biếc\r\n"
				+ "Nước gương trong soi tóc những hàng tre\r\n"
				+ "Tâm hồn tôi là một buổi trưa hè\r\n"
				+ "Tỏa nắng xuống lòng sông lấp loáng\r\n"
				+ "\r\n"
				+ "Chẳng biết nước có giữ ngày, giữ tháng\r\n"
				+ "Giữ bao nhiêu kỷ niệm giữa dòng trôi?\r\n"
				+ "Hỡi con sông đã tắm cả đời tôi!\r\n"
				+ "Tôi giữ mãi mối tình mới mẻ\r\n"
				+ "\r\n"
				+ "Sông của quê hương, sông của tuổi trẻ\r\n"
				+ "Sông của miền Nam nước Việt thân yêu\r\n"
				+ "Khi bờ tre ríu rít tiếng chim kêu\r\n"
				+ "Khi mặt nước chập chờn con cá nhảy\r\n"
				+ "\r\n"
				+ "Bạn bè tôi tụm năm tụm bảy\r\n"
				+ "Bầy chim non bơi lội trên sông…");
		fw.flush();
		fw.close();
	}
}
