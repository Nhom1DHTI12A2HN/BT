/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author Admin
 */
public class HangHoa {
    private String maHH;
    private String tenHH;
    private double giaSp;
    private int soLuong;

    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public double getGiaSp() {
        return giaSp;
    }

    public void setGiaSp(double giaSp) {
        this.giaSp = giaSp;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public HangHoa(String maHH, String tenHH, double giaSp, int soLuong) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.giaSp = giaSp;
        this.soLuong = soLuong;
    }

    public HangHoa() {
    }

    @Override
    public String toString() {
        return "Hàng Hoá{" + "Mã Hàng Hoá=" + maHH + ", Tên Hàng Hoá=" + tenHH + ", Giá Sản Phẩm=" + giaSp + ", Số Lượng=" + soLuong + '}';
    }
    
}
