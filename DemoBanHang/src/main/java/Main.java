import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import BLL.NhanVienBLL;
import Utils.ComonUtils;


public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		NhanVienBLL bll = new NhanVienBLL();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Tài Khoản: ");
		String tk = scanner.nextLine();
		
		System.out.print("Mật khẩu: ");
		String mk = scanner.nextLine();
		
//		System.out.println(ComonUtils.encodePas(mk));
		
		if(bll.checkLogin(tk, mk) == true) {
			System.out.println("Đăng nhập thành công");
			
		}else {
			System.out.println("Đăng nhập thất bại");
		}
	}
}
