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
public class Bai2 {

    public static void main(String[] args) {

        double a, b, c, max, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextDouble();
        System.out.println("Nhap b: ");
        b = sc.nextDouble();
        System.out.println("Nhap c: ");
        c = sc.nextDouble();

        if (a >= b & a >= c) {
            max = a;
            min = (b < c) ? b : c;

        } else if (b > c) {
            max = b;
            min = (a < c) ? a : c;
        } else {
            max = c;
            min = (b < a) ? b : a;
        }

        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
