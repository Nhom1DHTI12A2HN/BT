/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author Admin
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee[] arr = new Employee[3];
        System.out.println("Nhap Thong tin boss");
        arr[0] = new Boss();
        arr[0].nhap();
        System.out.println("Nhap Thong tin PieceWorked ");
        arr[1] = new PieceWorker();
        arr[1].nhap();
        System.out.println("Nhap Thong tin CommisstionWorked ");
        arr[2] = new CommissionWorker();
        arr[2].nhap();
        System.out.println("Thong tin boss");
        arr[0].display();
        System.out.println("Thong tin PieceWorked");
        arr[1].display();
        System.out.println("Thong tin CommisstionWorked");
        arr[2].display();
    }

}
