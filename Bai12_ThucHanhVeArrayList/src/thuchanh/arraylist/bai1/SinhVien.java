package thuchanh.arraylist.bai1;

public class SinhVien {
	private String id;
	private String hoTen;
	private String nganh;
	private String queQuan;
	
	public SinhVien() {
		super();
	}
	public SinhVien(String id, String hoTen, String nganh, String queQuan) {
		super();
		this.id = id;
		this.hoTen = hoTen;
		this.nganh = nganh;
		this.queQuan = queQuan;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNganh() {
		return nganh;
	}
	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	
}
