/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Admin
 */
public class XeMayHaNoi extends XeMay {

     private int n;
    XeMay[] mangxe;

    public XeMayHaNoi(String bienso, String loaixe, String mauxe,
            float giatien, int n, XeMay[] mangxe) {
        super(bienso, loaixe, mauxe, giatien);
        this.n = n;
        this.mangxe = mangxe;
    }

    public XeMayHaNoi() {
        super();
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public XeMay[] getMangxe() {
        return mangxe;
    }

    public void setMangxe(XeMay[] mangxe) {
        this.mangxe = mangxe;
    }

    @Override
    public void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
    }

    public void SapXep(ArrayList<XeMayHaNoi> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).giatien > list.get(j).giatien) {
                    XeMayHaNoi temp = new XeMayHaNoi();
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
//    return list.stream().sorted(Comparator.comparing(x -> x.getGiatien())).collect(Collectors.toList());

    }

    public void TimKiem(String bSo, XeMayHaNoi hn) {
        if (hn.bienso.equals(bSo)) {
            hn.xuat();
        }
    }

}
