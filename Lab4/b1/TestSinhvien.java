/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author admin
 */
public class TestSinhvien {

    public static void main(String[] args) {

        DanhSachSinhvien qlsv = new DanhSachSinhvien();
        Sinhvien teo = new Sinhvien();
        teo.setMasv("113");
        teo.setTensv("Nguyễn Văn A");
        qlsv.addSinhvien(teo);
        Sinhvien ty = new Sinhvien();
        ty.setMasv("114");
        ty.setTensv("Nguyễn Thị B");
        qlsv.addSinhvien(ty);
        System.out.println(qlsv);
    }
}
