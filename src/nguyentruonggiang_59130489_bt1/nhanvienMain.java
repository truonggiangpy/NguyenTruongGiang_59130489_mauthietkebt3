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
public class nhanvienMain {
        public static void main(String[] args) {
        Nhanvien nhavien1 = new Nhanvien();
        nhavien1.setTen("Nhan vien 1");
        nhavien1.setTuoi(30);
        nhavien1.setDiachi("Phu Yen");
        nhavien1.setTienluong(10);
        nhavien1.setTongsogio(1);
        Nhanvien nhavien2 = new Nhanvien("Nhan vien 2",33,"Phu Yen",100, 2);
        System.out.println(nhavien1.getThongTin());
        System.out.println(nhavien2.getThongTin());
    }
}