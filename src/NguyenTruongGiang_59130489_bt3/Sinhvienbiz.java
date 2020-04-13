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
public class Sinhvienbiz extends sinhvienpoly {
    public double diemMarketing;
    public double diemSales;


    public Sinhvienbiz(String hoTen, String nganhHoc, double diemMarketing, double diemSales) {
      super(hoTen, nganhHoc);
      this.diemMarketing = diemMarketing;
      this.diemSales = diemSales;
    }

    public double getDiem() {
      return (2 * this.diemMarketing + this.diemSales) / 3;
    };
}
