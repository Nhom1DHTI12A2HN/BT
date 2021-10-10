/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai5 {

    int n;
    public int getN() {
        return n;
    }

    void nhap() {
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Nhap vao n:");
                n = Integer.parseInt(sc.nextLine());
                check = true;
            } catch (java.lang.NumberFormatException e) {
                System.out.println("hay nhap dung kieu du lieu" + e.toString());
                check = false;
            }
        } while (check == false);
    }

    float tinhTong1(int a) {
        float tong1 = 0;
        for (int i = 1; i <= a; i++) {
            tong1 += 1.0 / i;
        }
        return tong1;
    }

    float tinhTong2(int a) {
        float tong2 = 0;
        int giaithua = 1;
        for (int i = 1; i <= a; i++) {
            giaithua *= i;
            tong2 += 1.0 / giaithua;
        }
        return tong2;
    }

    void menu() {
        System.out.println("1 Nhap vao so nguyen duong n");
        System.out.println("2 Tinh tong :1+....+1/n");
        System.out.println("3 Tinh tong :1+....+1/n!");
    }

    public static void main(String[] args) {
        Bai5 bai5 = new Bai5();
        int x = 0;
        Scanner sc = new Scanner(System.in);
        do {
            boolean check = false;
            do {
                bai5.menu();
                try {
                    System.out.println("Nhap vao lua chon :");
                    x = Integer.parseInt(sc.nextLine());
                    check = true;
                } catch (java.lang.NumberFormatException e) {
                    System.out.println("hay nhap dung kieu du lieu" + e.toString());
                    check = false;
                }
            } while (check == false);
            switch (x) {
                case 1: {
                    bai5.nhap();
                    break;
                }
                case 2: {
                    if (bai5.getN() == 0) {
                        System.out.println("ban chua nhap n!hoac ban de n =0");
                    } else {
                        System.out.println("Tong 1+...1/" + bai5.getN() + " la:" + bai5.tinhTong1(bai5.getN()));
                    }
                    break;
                }
                case 3: {
                    if (bai5.getN() == 0) {
                        System.out.println("ban chua nhap n!hoac ban de n =0");
                    } else {
                        System.out.println("Tong 1+...1/" + bai5.getN() + "! la:" + bai5.tinhTong2(bai5.getN()));
                    }
                    break;
                }
                case 0: {
                    break;
                }
                default: {
                    System.out.println("Khong co lua chon cua ban ");
                    break;
                }
            }
        } while (x != 0);
    }

}
