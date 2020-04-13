/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyentruonggiang_59130489_bt2;

/**
 *
 * @author Giang Tien Ty
 */
import  nguyentruonggiang_59130489_bt1.Nhanvien;

public class NhanVienmain {
    public static void main(String[] args) {
    Iquanly quanlynv = new QuanLyNhanVien();

    Nhanvien nhavien5 = new Nhanvien("Nhan vien 5",33,"Phu Yen",100, 2);
    Nhanvien nhavien3 = new Nhanvien("Nhan vien 3",33,"Phu Yen",100, 2);
    Nhanvien nhavien4 = new Nhanvien("Nhan vien 4",33,"Phu Yen",100, 2);
    Nhanvien nhavien6 = new Nhanvien("Nhan vien 6",33,"Phu Yen",100, 2);
    Nhanvien nhavien7 = new Nhanvien("Nhan vien 7",33,"Phu Yen",100, 2);
   
    quanlynv.themnv(nhavien5);
    quanlynv.themnv( nhavien3);
    quanlynv.themnv(nhavien4);
    quanlynv.themnv(nhavien6);
    quanlynv.themnv(nhavien7);

   quanlynv.inDS();
  }
}
