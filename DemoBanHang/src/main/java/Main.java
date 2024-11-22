import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import BLL.NhanVienBLL;


public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		NhanVienBLL bll = new NhanVienBLL();
		bll.checkLogin("", "");
		
	}
}
