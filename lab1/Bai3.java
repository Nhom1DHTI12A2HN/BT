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
public class Bai3 {

    public static void main(String[] args) {

        double a, b, c, delta;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("a: ");
            a = sc.nextDouble();
            if (a == 0) {
                System.out.println("Nhap lai a (a#0)");
            }
        } while (a == 0);
        System.out.println("b: ");
        b = sc.nextDouble();
        System.out.println("c; ");
        c = sc.nextDouble();
        delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("PT vo nghiem");
        } else if (delta == 0) {
            float x = (float) ((float) -b / (2 * a));
            System.out.printf("PT co nghiem kep x1=x2=%.2f", x);
        } else {
            float x1 = (float) ((float) (-b - Math.sqrt(delta)) / (2 * a));
            float x2 = (float) ((float) (-b + Math.sqrt(delta)) / (2 * a));
            System.out.println("PT co 2 nghiem phan biet:");
            System.out.printf("\tx1=%.2f \n", x1);
            System.out.printf("\tx2=%.2f \n", x2);
        }

    }

}
