/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Manager {

    public static void main(String[] args) {

        int n = 0;
        StudentUneti[] std = null;
        StudentMark[] stdmark = null;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 Nhap thong tin n sinh vien uneti");
            System.out.println("2 Nhap m diem cho cac sinh vien nay");
            System.out.println("3 sap xep sinh vien theo diem va hien thi ");
            System.out.println("4 Tim thong tin diem cua sinh vien theo id");
            System.out.print("Nhap vao lua chon cua ban: ");
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1: {
                    int m;
                    System.out.print("nhap vao so sinh vien: ");
                    m = Integer.parseInt(sc.nextLine());
                    std = new StudentUneti[m];
                    for (int i = 0; i < m; i++) {
                        std[i] = new StudentUneti();
                        int dem = 0;
                        do {
                            System.out.println("Nhap vao thong tin sinh vien thu " + (i + 1));
                            std[i].input();
                            dem = 0;
                            for (int j = 0; j < i; j++) {
                                if (std[i].getStuId().equals(std[j].getStuId()) && std != null) {
                                    System.out.println("ma id trung vui long nhap lai");
                                    dem++;
                                }
                            }
                        } while (dem != 0);
                    }
                    break;
                }
                case 2: {
                    if (std != null) {
                        int k;
                        System.out.print("nhap vao so luong sinh vien: ");
                        k = Integer.parseInt(sc.nextLine());
                        stdmark = new StudentMark[k];
                        for (int i = 0; i < stdmark.length; i++) {
                            stdmark[i] = new StudentMark();
                            int dem;
                            do {
                                System.out.println("Nhap vao thong tin mon hoc thu " + (i + 1));
                                stdmark[i].input();
                                dem = 0;
                                for (int j = 0; j < std.length; j++) {
                                    if (stdmark[i].getStuId().equals(std[j].getStuId()) == true) {
                                        dem++;
                                    }
                                }
                                if (dem == 0) System.out.println("ma id sinh vien chua co vui long nhap lai");
                            } while (dem == 0);
                        }
                    } else {
                        System.out.println("Can nhap thong tin cho sinh vien truoc");
                    }
                    break;
                }
                case 3: {
                    if (stdmark == null) {
                        System.out.println("ban chua nhap du lieu ");
                    } else {
                        for (int i = 0; i < std.length - 1; i++) {
                            for (int j = i + 1; j < std.length; j++) {
                                if (stdmark[i].getMark()> stdmark[j].getMark()) {
                                    StudentUneti tg = std[i];
                                    std[i] = std[j];
                                    std[j] = tg;
                                }
                            }
                        }
                        for (int i = 0; i < std.length; i++) {
                            System.out.println("thong tin sinh vien thu " + (i + 1));
                            std[i].display();
                        }
                    }
                    break;
                }
                case 4: {
                    if (std == null || stdmark == null) {
                        System.out.println("Ban chua nhap du lieu ");
                    } else {
                        String id;
                        int dem =0;
                        System.out.println("Nhap vao id ban muon tim:");
                        id = sc.nextLine();
                        for (int i = 0; i < std.length; i++) {
                            if (id.equals(std[i].getStuId())) {
                                dem++;
                            }
                        }
                        if(dem==0){
                            System.out.println("Khong co sinh vien voi id: "+id);
                        }
                        else{
                            System.out.println("Thong tin sinh vien ");
                            for (int i = 0; i < std.length; i++) {
                                if (id.equals(std[i].getStuId())) {
                                    stdmark[i].display();
                                }
                            }
                            System.out.println("voi cac diem :");
                            for (int i = 0; i < stdmark.length; i++) {
                                if (id.equals(stdmark[i].getStuId())) {
                                    stdmark[i].display();
                                }
                            }
                        }
                        
                    }
                    break;
                }
                case 5: {
                    break;
                }
                default: {
                    System.out.println("khong co lua chon cua ban");
                    break;
                }
            }
        } while (n != 5);
    }
}
