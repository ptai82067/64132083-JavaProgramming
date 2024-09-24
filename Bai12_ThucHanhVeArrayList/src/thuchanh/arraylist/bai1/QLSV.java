package thuchanh.arraylist.bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QLSV {
	ArrayList<SinhVien> list = new ArrayList<SinhVien>();
	public void themSinhVien(SinhVien sv) {
		list.add(sv);
		System.out.println("Đã thêm thành công sinh viên "+sv.getHoTen());
	}
	public void hienThiDanhSachSinhVien() {
		for(var i:list) {
			System.out.println("------------------------------------");
			System.out.println(i.getId() +"---"+ i.getHoTen()+"---"+i.getNganh());
		}
	}
	public SinhVien timKiemSinhVienTheoTen(String tenTimKiem) {
		for(var i:list) {
			if(i.getHoTen().equalsIgnoreCase(tenTimKiem)) {
				return i;
			}
		}
		return null;
	}
	public void xoaSinhVienTheoMaSo(String maSoTimKiem) {
		boolean flag = false;
		for(var i:list) {
			if(i.getId().equalsIgnoreCase(maSoTimKiem)) {
				list.remove(i);
				System.out.println("Đã xóa thành công sinh viên có mã số sinh viên "+ maSoTimKiem);
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("Sinh viên có MSSV "+maSoTimKiem+" không tồn tại trong danh sách");
		}
	}
	public void capNhatThongTinSinhVien(String id, String tenMoi, String nganhMoi) {
		boolean flag = false;
		for(var i:list) {
			if(i.getId().equalsIgnoreCase(id)) {
				i.setHoTen(tenMoi);
				i.setNganh(nganhMoi);
				flag = true;
				System.out.println("Đã cập nhật thành công có mã sinh viên "+id);
				break;
			}
		}
		if(!flag) {
			System.out.println("Sinh viên có MSSV "+id+" không tồn tại trong danh sách");
		}
	}
	public void sapXep(ArrayList<SinhVien> list) {
		Collections.sort(list, new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				return sv1.getHoTen().compareToIgnoreCase(sv2.getHoTen());
			}
		});
	}
}
