package thuchanh.arraylist.bai1;

public class Main {
	public static void main(String[] args) {
		QLSV qlsv = new QLSV();
		qlsv.list.add(new SinhVien("64132083","Tài Phạm Phước","Công Nghệ Thông Tin","Phú Yên"));
		qlsv.list.add(new SinhVien("64132084","Thiên Phạm Phước","Công Nghệ Thông Tin","Phú Yên"));
		qlsv.list.add(new SinhVien("64132085","Huy Phạm Phước","Công Nghệ Thông Tin","Phú Yên"));
		qlsv.list.add(new SinhVien("64132086","Lộc Phạm Phước","Công Nghệ Thông Tin","Phú Yên"));
		qlsv.list.add(new SinhVien("64132087","Phú Phạm Phước","Công Nghệ Thông Tin","Phú Yên"));
		qlsv.hienThiDanhSachSinhVien();
		SinhVien sv = qlsv.timKiemSinhVienTheoTen("Tài Phạm Phước");
		System.out.println(sv.getId()+" "+sv.getHoTen()+" "+sv.getNganh()+" "+sv.getQueQuan());
		qlsv.xoaSinhVienTheoMaSo("64132084");
		qlsv.themSinhVien(new SinhVien("64132088","Phúc Phạm Phước","Công Nghệ Thông Tin","Phú Yên"));
		qlsv.sapXep(qlsv.list);
		qlsv.hienThiDanhSachSinhVien();
	}

}
