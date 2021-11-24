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
public class ProductMenu{
    static void menu(){
        System.out.println("1. Nhap thong tin cho n san pham.");
        System.out.println("2. Hien thi thong tin nhap.");
        System.out.println("3. Sap xep thong tin giam dan theo gia va hien thi.");
        System.out.println("4. Thoat");
    }
    public static void main(String[] args) {
            
        int n;
        Product a = new Product();
        Product[] product = null;
        do {
            menu();
            System.out.println("Nhap vao lua chon cua ban :");
            Scanner sc = new Scanner(System.in);
            n = Integer.parseInt(sc.nextLine());
           // n = sc.nextInt();1
            
            switch (n) {
            case 1: {
                int m;
                System.out.println("Nhap vao n :");
                m = Integer.parseInt(sc.nextLine());
                product = new Product[m];
                for (int i = 0; i < m; i++) {
                    product[i] = new Product();
                    product[i].nhap();
                }
                break;
            }
            case 2: {
                if (product == null) {
                    System.out.println("ban chua nhap du lieu");
                } else {
                    System.out.println("du lieu ban vua nhap la :");
                    for (int i = 0; i < product.length; i++) {
                        System.out.println("thong tin hang hoa thu " + (i + 1));
                        product[i].hienthi();
                    }
                }
                break;
            }
            case 3: {
                if (product == null) {
                    System.out.println("ban chua nhap du lieu");
                } else {
                    a.sort(product);
                    System.out.println("du lieu sau khi sap xep la :");
                    for (int i = 0; i < product.length; i++) {
                        System.out.println("thong tin hang hoa thu " + (i + 1));
                        product[i].hienthi();
                    }
                }
                break;
            }
            case 4:
                break;
            default: {
                    System.out.println("khong co lua chon cua ban ");
                    break;
                }
            }
        } while (n != 4);
    }
    
}
