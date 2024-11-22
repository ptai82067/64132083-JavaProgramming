package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Model_DTO.NhanVien;
import Utils.ComonUtils;
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
			
			if(tk.equals(ketQua.getString("taikhoan"))&& 
					ComonUtils.encodePas(mk).equals(ketQua.getString("matkhau")) ) {
				DBUtils.closeConnection(conn);
				return true;
			}
		}
		
		DBUtils.closeConnection(conn);
		return false;
	}
	public boolean createAccout(String tk, String mk) throws SQLException {
Connection conn = DBUtils.openConnection("taikhoan");
		
		 String sql = "INSERT INTO accout (taikhoan,matkhau) VALUES (?, ?)";
		 PreparedStatement statement = conn.prepareStatement(sql);

         // 5. Gán giá trị cho các tham số
         statement.setString(1, tk);          // Giá trị cho MaSV
         statement.setString(2, ComonUtils.encodePas(mk)); // Giá trị cho HoTen
         int rowsInserted = statement.executeUpdate();

         if (rowsInserted > 0) {
             System.out.println("Thêm bản ghi thành công!");
         }
		DBUtils.closeConnection(conn);
		return true;
	}
}
