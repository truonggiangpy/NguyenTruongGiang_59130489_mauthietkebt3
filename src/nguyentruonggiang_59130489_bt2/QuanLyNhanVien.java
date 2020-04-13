/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyentruonggiang_59130489_bt2;
import java.util.ArrayList;
import nguyentruonggiang_59130489_bt1.Nhanvien;
/**
 *
 * @author Giang Tien Ty
 */
public class QuanLyNhanVien implements Iquanly{
  ArrayList<Nhanvien> dsNhanVien = new ArrayList<>();
  @Override
  public void themnv(Nhanvien nv) {
    dsNhanVien.add(nv);
  };
  public void inDS() {
      for(int i=0;i< dsNhanVien.size();i++){
      System.out.println(dsNhanVien.get(i).getThongTin());
      }
  };
}
