package ntu.taipp.baitaplaythuong;

public class SanPham extends DBObject {

  private String tenSP;
  private float giaSP;
  private String moTa;

  public SanPham(String tenSP, float giaSP, String moTa) {
    this.tenSP = tenSP;
    this.giaSP = giaSP;
    this.moTa = moTa;
  }

  public SanPham(int id , String tenSP,float giaSP, String moTa) {
    super();
    super.setId(id);
    this.giaSP = giaSP;
    this.tenSP = tenSP;
    this.moTa = moTa;
  }

  public SanPham() {
  }

  public String getTenSP() {
    return tenSP;
  }

  public void setTenSP(String tenSP) {
    this.tenSP = tenSP;
  }

  public float getGiaSP() {
    return giaSP;
  }

  public void setGiaSP(float giaSP) {
    this.giaSP = giaSP;
  }

  public String getMoTa() {
    return moTa;
  }

  public void setMoTa(String moTa) {
    this.moTa = moTa;
  }

  @Override
  public String toString() {
    return "SanPham{" +
            "id=" + super.getId() +
            ", tenSP='" + tenSP + '\'' +
            ", giaSP=" + giaSP +
            ", moTa='" + moTa + '\'' +
            '}';
  }
}
