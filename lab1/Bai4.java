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
public class Bai4 {

    public static void main(String[] args) {

        double x, tien;
        Scanner sc = new Scanner(System.in);
        

        do {
            System.out.println("Nhap so dien: ");
            x = sc.nextDouble();
            if (x <= 0) {
                System.out.println("So dien khong the am!");
            }
        } while (x <= 0);

        if (x <= 50) {
            tien = x * 500;
        } else {
            tien = (x - 50) * 620 + 50 * 500;
        }

        System.out.println("Tien dien: " + tien);
    }

}
