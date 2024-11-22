package DAL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Model_DTO.NhanVien;
import Utils.DBUtils;

public class NhanVienDAL {
	public boolean AddNew (NhanVien nv) {
		return true;
	}
	public boolean Delete(int id) {
		return true;
	}
	public boolean Login(String tk, String mk) throws SQLException {
		Connection conn = DBUtils.openConnection("taikhoan");
		
		String sqlSelect = "SELECT * FROM accout";
		Statement lenh = conn.createStatement();
		ResultSet ketQua = lenh.executeQuery(sqlSelect);
		// hiện kết quả
		while(ketQua.next()) {
			System.out.println("Tài khoản: "+ketQua.getString("taikhoan") +
					" Tên sản phẩm: "+ketQua.getString("matkhau"));
			
		}
		
		DBUtils.closeConnection(conn);
		return true;
	}
	public boolean createAccout(String tk, String mk) throws SQLException {
Connection conn = DBUtils.openConnection("taikhoan");
		
		String sqlSelect = "SELECT * FROM accout";
		Statement lenh = conn.createStatement();
		ResultSet ketQua = lenh.executeQuery(sqlSelect);
		// hiện kết quả
		while(ketQua.next()) {
			System.out.println("Id: "+ketQua.getInt("id") + " Tên sản phẩm: "+ketQua.getString("tensp")
			+ " Giá SP: "+ketQua.getFloat("Giasp")
			+ " Mô tả: "+ketQua.getString("mota"));
			
		}
		
		DBUtils.closeConnection(conn);
		return true;
	}
}
