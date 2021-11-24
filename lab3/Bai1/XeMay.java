/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class XeMay implements Ixe{

     String bienso;
    String loaixe;
    String mauxe;
    float giatien;

    public XeMay(String bienso, String loaixe, String mauxe, float giatien) {
        this.bienso = bienso;
        this.loaixe = loaixe;
        this.mauxe = mauxe;
        this.giatien = giatien;
    }

    public XeMay() {
    }

    public String getBienso() {
        return bienso;
    }

    public void setBienso(String bienso) {
        this.bienso = bienso;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public String getMauxe() {
        return mauxe;
    }

    public void setMauxe(String mauxe) {
        this.mauxe = mauxe;
    }

    public float getGiatien() {
        return giatien;
    }

    public void setGiatien(float giatien) {
        this.giatien = giatien;
    }
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap biển số: ");
        bienso = sc.nextLine();
        System.out.print("Nhap loại xe: ");
        loaixe = sc.nextLine();
        System.out.print("Nhap mau xe: ");
        mauxe=sc.nextLine();
        System.out.print("Nhap gia tien: ");
        giatien=Float.parseFloat(sc.nextLine());
        
        
    }
    @Override
    public void xuat(){
        System.out.println("Bien so: "+bienso);
        System.out.println("Loai xe: "+loaixe);
        System.out.println("Mau xe: "+mauxe);
        System.out.println("Gia tien: "+getGiatien());
    }
}
