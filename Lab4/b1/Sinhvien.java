/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Date;

/**
 *
 * @author admin
 */
public class Sinhvien implements Comparable<Sinhvien> {

    private String Masv;
    private String Tensv;
    private Date Namsinh;
    private String Diachi;
    private String Lop;
    //Chèn các phương thức khởi tạo, set, get các giá trị cho các thuộc tính

    public String getMasv() {
        return Masv;
    }

    public String getTensv() {
        return Tensv;
    }

    public Date getNamsinh() {
        return Namsinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public String getLop() {
        return Lop;
    }

    public void setMasv(String Masv) {
        this.Masv = Masv;
    }

    public void setTensv(String Tensv) {
        this.Tensv = Tensv;
    }

    public void setNamsinh(Date Namsinh) {
        this.Namsinh = Namsinh;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public int compareTo(Sinhvien o) {
        if (Masv.equalsIgnoreCase(o.getMasv())) {
            return 0;
        }
        return 1;
    }

    public String toString() {
        return "Sinhvien [Masv=" + Masv + ", Tensv=" + Tensv + ", Namsinh="
                + Namsinh + ", Diachi=" + Diachi + ", Lop=" + Lop + "]";
    }
}
