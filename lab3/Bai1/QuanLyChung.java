/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuanLyChung {

    static void menu() {
        System.out.println("--------Menu----------");
        System.out.println("1. Nhập thông tin cho n xe máy tại tỉnh Hà Nội.");
        System.out.println("2. Nhập thông tin cho n xe máy tại tỉnh Hoà Bình.");
        System.out.println("3. Sắp xếp danh sách tăng theo biển số xe.");
        System.out.println("4. Tìm kiếm thông tin xe theo biển số xe.");
        System.out.println("5. Thống kê số lượng xe đang quản lý..");
        System.out.println("6. Thoát");
    }

    public static void main(String[] args) {

        ArrayList<XeMayHaNoi> list = new ArrayList<>();
        ArrayList<XeMayHoaBinh> list2 = new ArrayList<>();
        XeMayHoaBinh hb = new XeMayHoaBinh();

        int chon;
        Scanner sc = new Scanner(System.in);

        do {
            menu();
            System.out.println("Nhap vao lựa chọn của bạn");
            chon = sc.nextInt();
            switch (chon) {
                case 1: {

                    System.out.print("Nhap So Luong Xe :");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        XeMayHaNoi hn = new XeMayHaNoi();
                        hn.nhap();
                        list.add(hn);
                    }
                    break;
                }
                case 2: {
                    System.out.print("Nhap So Luong Xe :");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        XeMayHoaBinh hoaBinh = new XeMayHoaBinh();
                        hoaBinh.nhap();
                        list2.add(hoaBinh);
                    }
                    break;
                }
                case 3: {

                    for (XeMayHaNoi haNoi : list) {
                        haNoi.SapXep(list);
                        haNoi.xuat();
                    }
                    for (XeMayHoaBinh xeMayHoaBinh : list2) {
                        xeMayHoaBinh.SapXep(list2);
                        xeMayHoaBinh.xuat();
                    }
                    break;
                }
//                 {
////                    Collections.sort(list, new Comparator<XeMayHaNoi>() {
////
////                        @Override
////                        public int compare(XeMayHaNoi o1, XeMayHaNoi o2) {
////                            return o1.bienso.compareTo(o2.bienso);
////                        }
////                    });
////                    Collections.sort(list2, new Comparator<XeMayHoaBinh>() {
////
////                        @Override
////                        public int compare(XeMayHoaBinh o1, XeMayHoaBinh o2) {
////                            return o1.bienso.compareTo(o2.bienso);
////                        }
////                    });
////                    for (XeMayHoaBinh xm : list2) {
////                         System.out.println("sap xep");
////                         xm.xuat();
////                    }
//                   
//                }

                case 4: {
                    sc.nextLine();
                    System.out.print("Nhap Bien So Can Tim: ");
                    String bSo = sc.nextLine();
                    for (XeMayHaNoi hn : list) {
                        hn.TimKiem(bSo, hn);
                    }
                    break;
                }
                case 5: {
                    System.out.println("Thong Ke 2 Loai Xe: ");
                    System.out.println("So Luong Xe Ha Noi: " + list.size());
                    for (XeMayHaNoi haNoi : list) {
                        haNoi.xuat();
                    }
                    System.out.println("So Luong Xe Hoa Binh: " + list2.size());
                    for (XeMayHoaBinh xeMayHoaBinh : list2) {
                        xeMayHoaBinh.xuat();
                    }
                }
                default: {
                    break;
                }

            }

        } while (chon != 6);
    }
}
