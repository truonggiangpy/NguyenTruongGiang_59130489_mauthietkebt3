/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyentruonggiang_59130489_bt1;

/**
 *
 * @author Giang Tien Ty
 */
public class Nhanvien {
  private String ten;
  private int tuoi;
  private String diachi;
  private double tienluong;
  private int tongsogio;

    public Nhanvien(){}
  
    public Nhanvien(String ten, int tuoi, String diachi, double tienluong, int tongsogio) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.tienluong = tienluong;
        this.tongsogio = tongsogio;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getTienluong() {
        return tienluong;
    }

    public void setTienluong(double tienluong) {
        this.tienluong = tienluong;
    }

    public int getTongsogio() {
        return tongsogio;
    }

    public void setTongsogio(int tongsogio) {
        this.tongsogio = tongsogio;
    }
    public String getThongTin() {
    return "Ten: " + this.ten + ", tuoi: " + this.tuoi + ", dia chi: " + this.diachi + ", tien luong : " + this.tienluong + ", tong gio lam: " + this.tongsogio + ", tien thuong: " + this.tinhtienthuong();
    }

  // tinh luong nhan vien
  public double tinhtienthuong() {
    if (this.tongsogio >= 200) {
      return this.tienluong * 20/100;
    }
    else if (this.tongsogio >= 100) {
      return this.tienluong * 10/100;
    }
    else
    return 0;
  }
}


