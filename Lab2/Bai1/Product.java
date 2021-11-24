
package Bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Product {
    private String tenHangHoa;
    private String nhaSanXuat;
    private float giaBan;

    public Product() {
    }

    public Product(String tenHangHoa, String nhaSanXuat, float giaBan) {
        this.tenHangHoa = tenHangHoa;
        this.nhaSanXuat = nhaSanXuat;
        this.giaBan = giaBan;
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten hang hoa: ");
        tenHangHoa = sc.nextLine();
        System.out.println("Ten nha san xuat: ");
        nhaSanXuat = sc.nextLine();
        boolean kt = false;
        while(!kt){
            try {
                System.out.println("Gia ban: ");
                giaBan = sc.nextFloat();
                kt = true;
            } catch (Exception e) {
                System.out.println("Nhap du lieu sai");
                sc.nextLine();
            }
        }
        
    }
    public void hienthi(){
        System.out.println("Ten hang hoa: "+tenHangHoa);
        System.out.println("Ten nha san xuat: "+nhaSanXuat);
        System.out.println("Gia ban: "+giaBan);
    }
//    public static void sort(Product[] b){
//        for (int i = 0; i < b.length; i++){
//            for(int j = i + 1; j < b.length;j++){
//                if(b[i].getGiaBan() > b[j].getGiaBan()){
//                    Product tem = b[i];
//                    b[i] = b[j];
//                    b[j] = tem;
//                }
//            }
//        }
//    }
//    public static void sort(Product[] b){
//        Product  temp ;
//        for(int  i =  0 ; i <b.length - 1 ; i ++) {
//            for  ( int  j =  0 ; j <b.length - 1 - i; j ++) {
//                if (b[j].getGiaBan() > b[j + 1].getGiaBan()) {
//                    temp = b[j];
//                    b[j] = b[j + 1];
//                    b[j + 1] = temp;
//                }
//            }
//        }
//    }
    public static void sort(Product[] b){
        int  position =  0 ;
        for  ( int  i =  0 ; i <b.length; i ++) {
            position = i;
            Product  temp = b[i];
            for  (int j = i+1; j <b.length; j ++) {
                if(b[j].getGiaBan() < temp.getGiaBan()) {
                  temp = b[j];
                  position = j;
                }
            }
            b[position] = b[i];
            b[i] = temp;
        }
    }
}
