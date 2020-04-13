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
public class Sinhvienit extends sinhvienpoly {
    public double diemJava;
    public double diemCss;
    public double diemHtml;
    public Sinhvienit(String hoTen, String nganhHoc, double diemJava, double diemCss, double diemHtml) {
      super(hoTen, nganhHoc);
      this.diemJava = diemJava;
      this.diemCss = diemCss;
      this.diemHtml = diemHtml;
    }
    public double getDiem() {
      return ((2 * this.diemJava + this.diemHtml + this.diemCss) / 4);
    };
}