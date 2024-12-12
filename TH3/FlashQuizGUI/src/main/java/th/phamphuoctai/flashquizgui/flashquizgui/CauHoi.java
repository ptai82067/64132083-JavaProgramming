package th.phamphuoctai.flashquizgui.flashquizgui;

public class CauHoi {
  private String loiHoi;
  private String url;
  private String pa1;
  private String pa2;
  private String pa3;
  private String pa4;
  private String paDung;

  public CauHoi(String loiHoi, String url, String pa1, String pa2, String pa3, String pa4, String paDung) {
    this.loiHoi = loiHoi;
    this.url = url;
    this.pa1 = pa1;
    this.pa2 = pa2;
    this.pa3 = pa3;
    this.pa4 = pa4;
    this.paDung = paDung;
  }

  public String getLoiHoi() {
    return loiHoi;
  }

  public void setLoiHoi(String loiHoi) {
    this.loiHoi = loiHoi;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getPa2() {
    return pa2;
  }

  public void setPa2(String pa2) {
    this.pa2 = pa2;
  }

  public String getPa1() {
    return pa1;
  }

  public void setPa1(String pa1) {
    this.pa1 = pa1;
  }

  public String getPa3() {
    return pa3;
  }

  public void setPa3(String pa3) {
    this.pa3 = pa3;
  }

  public String getPaDung() {
    return paDung;
  }

  public void setPaDung(String paDung) {
    this.paDung = paDung;
  }

  public String getPa4() {
    return pa4;
  }

  public void setPa4(String pa4) {
    this.pa4 = pa4;
  }
}
