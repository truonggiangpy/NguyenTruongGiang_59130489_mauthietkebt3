/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NguyenTruongGiang_59130489_bt3;

/**
 *
 * @author Giang Tien Ty
 */
public abstract class sinhvienpoly {
    public String hoten;
    public String nganhhoc;

    public sinhvienpoly(String hoten, String nganhhoc) {
      this.hoten = hoten;
      this.nganhhoc = nganhhoc;
    }

    public abstract double getDiem();

    public String getHocLuc() {
      if (this.getDiem() < 5) {
        return "yếu";
      } else if (this.getDiem() < 6.5) {
        return "Trung binh";
      }else if (this.getDiem() < 7.5) {
        return "Kha";
      } else if(this.getDiem() < 9) {
        return "Gioi";
      }
      return "xuất sắc";
    }
    
     public void xuat() {
       System.out.println("hoc ten poly " + this.hoten + "  nganh hoc poly " + this.nganhhoc);
     }
}