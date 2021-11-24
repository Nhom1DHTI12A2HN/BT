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
public class StudentUneti implements Imark{
     private String StuId;
    private String StuName;
    private String gender;
    private String birthday;
    private String nativePlace;

    public StudentUneti(String StuId, String StuName, String gender, String birthday, String nativePlace) {
        this.StuId = StuId;
        this.StuName = StuName;
        this.gender = gender;
        this.birthday = birthday;
        this.nativePlace = nativePlace;
    }

    public String getStuId() {
        return StuId;
    }

    public void setStuId(String StuId) {
        this.StuId = StuId;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String StuName) {
        this.StuName = StuName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public StudentUneti() {
    }

    @Override
    public void input() {
      Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ID: ");
        StuId = sc.nextLine();
        System.out.print("Nhap ten: ");
        StuName = sc.nextLine();
        System.out.print("nhap ngay sinh: ");
        birthday = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gender=sc.nextLine();
        System.out.print("Nhap que quan: ");
        nativePlace=sc.nextLine();
    }

    @Override
    public void display() {
        
        System.out.println("ID: "+StuId);
        System.out.println("Ten: "+StuName);
        System.out.println("Ngay Sinh: "+birthday);
        System.out.println("Gioi Tinh: "+gender);
        System.out.println("Que quan:"+nativePlace);
        System.out.println("___________________________________________");
    }
 
}
