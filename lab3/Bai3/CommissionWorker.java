/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CommissionWorker extends Employee {
float soluongsanpham;
    float luong;

    
    @Override
    public float earnings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong san pham");
        soluongsanpham = Float.parseFloat(sc.nextLine());
        return luong = new Boss().earnings() +(float)(soluongsanpham*0.1);
    }

    @Override
    public void hienthi() {
        System.out.println("luong :" + luong);
    }
}
