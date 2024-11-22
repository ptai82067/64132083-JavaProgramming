package BLL;

import DAL.NhanVienDAL;
import Model_DTO.NhanVien;

public class NhanVienBLL {
	NhanVienDAL nvDAL;
	public boolean add(NhanVien nv) {
		// cac xu ly
		boolean kq = nvDAL.AddNew(nv);
		return kq;
	}
	public boolean checkLogin(String tenDN, String matKhau) {
		//Kiem tra tinh dung dang
		// vd: ten co rong khong, co dung format ko
		
		// thoa man roi thi ta goi dich vu o tang dal
		return nvDAL.Login(tenDN, matKhau);
	}
}
