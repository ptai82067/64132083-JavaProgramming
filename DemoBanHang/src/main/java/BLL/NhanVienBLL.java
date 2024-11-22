package BLL;

import java.sql.SQLException;

import DAL.NhanVienDAL;
import Model_DTO.NhanVien;

public class NhanVienBLL {
	NhanVienDAL nvDAL = new NhanVienDAL();
	public boolean add(NhanVien nv) {
		// cac xu ly
		boolean kq = nvDAL.AddNew(nv);
		return kq;
	}
	
	public boolean dangKiTaiKhoan(String tenDN, String matkhau) {
		// kiem tra tinh dung dang
		return true;
	}
	
	public boolean checkLogin(String tenDN, String matKhau) throws SQLException {
		//Kiem tra tinh dung dang
		// vd: ten co rong khong, co dung format ko
		
		// thoa man roi thi ta goi dich vu o tang dal
		return nvDAL.Login(tenDN, matKhau);
	}
}
