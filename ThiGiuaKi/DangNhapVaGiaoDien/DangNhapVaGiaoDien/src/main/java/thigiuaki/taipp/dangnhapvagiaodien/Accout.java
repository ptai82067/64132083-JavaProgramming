package thigiuaki.taipp.dangnhapvagiaodien;

public class Accout {
  private int id;
  private String taiKhoan;
  private String matKhau;

  public Accout(String taiKhoan, String matKhau) {
    this.taiKhoan = taiKhoan;
    this.matKhau = matKhau;
  }

  public Accout() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTaiKhoan() {
    return taiKhoan;
  }

  public void setTaiKhoan(String taiKhoan) {
    this.taiKhoan = taiKhoan;
  }

  public String getMatKhau() {
    return matKhau;
  }

  public void setMatKhau(String matKhau) {
    this.matKhau = matKhau;
  }
}
