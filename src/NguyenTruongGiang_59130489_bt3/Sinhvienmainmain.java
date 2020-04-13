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
public class Sinhvienmainmain {
    public static void main(String[] args) {
        Sinhvienit sinhvienit = new   Sinhvienit ("bui van cong", "htt", 1, 3, 1);
        Sinhvienbiz sinhvienbiz = new Sinhvienbiz("dong ban ha", "baa",3, 2);
       sinhvienpoly poly1 = new  sinhvienpoly("nguyen dong hung", "loly");
        sinhvienit.xuat();
        System.out.println("diem: " + sinhvienit.getDiem());
        System.out.println("hoc luc: " + sinhvienit.getHocLuc());
        
       sinhvienbiz .xuat();
        System.out.println("diem: " + sinhvienbiz .getDiem());
        System.out.println("hoc luc: " + sinhvienbiz .getHocLuc());
        
        poly1.xuat();
        System.out.println("diem: " + poly1.getDiem());
        System.out.println("hoc luc: " + poly1.getHocLuc());
    }
}
