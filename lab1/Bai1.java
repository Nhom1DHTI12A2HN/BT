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
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a;
        float f;
        double d;
        long l;
        char ch;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot so nguyen:");
        a = sc.nextInt();
        System.out.println("Nhap mot so thuc:");
        f = sc.nextFloat();
        System.out.println("Nhap mot so double:");
        d = sc.nextDouble();
        System.out.println("Nhap mot so long:");
        l = sc.nextLong();
        System.out.println("Nhap mot ki tu:");
        sc.nextLine(); // ki tu ket thuc nhap se bi mat
        ch = sc.nextLine().charAt(0);
        System.out.println("Nhap mot chuoi:");
        str = sc.nextLine();
        System.out.println("Du lieu vua nhap:");
        System.out.println("a=" + a);
        System.out.println("l=" + l);
        System.out.println("f=" + f);
        System.out.println("ch=" + ch);
        System.out.println("str=" + str);
        System.out.println("d=" + d);
        System.out.println("\nIn tren cung 1 dong:");
        System.out.println("a=" + a + ", f=" + f + ", l=" + l + ", d=" + d + ", ch=" + ch + ",str=" + str);
    }

}
