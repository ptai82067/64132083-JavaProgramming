import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//đăng kí driver
		Class.forName("com.mysql.cj.jdbc.Driver");//com.mysql.jdbc.Driver
		//mở kết nối
		//chuẩn bị chuỗi kết nối
		String connectionURL = "jdbc:mysql://localhost:3306/demobanhang";
		// mở kế nối
		Connection con = DriverManager.getConnection(connectionURL,"root","");
		System.out.println("haha");
		// select
		String sqlSelect = "SELECT * FROM SANPHAM";
		Statement lenh = con.createStatement();
		ResultSet ketQua = lenh.executeQuery(sqlSelect);
		// hiện kết quả
		while(ketQua.next()) {
			System.out.println("Id: "+ketQua.getInt("id") + " Tên sản phẩm: "+ketQua.getString("tensp")
			+ " Giá SP: "+ketQua.getFloat("Giasp")
			+ " Mô tả: "+ketQua.getString("mota"));
			
		}
		
	}
}
