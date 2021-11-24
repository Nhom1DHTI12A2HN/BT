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
public class StudentMarkTotal extends StudentMark {

    private int totalExamSubject;
    private float everageMark;

    public StudentMarkTotal(int totalExamSubject, float everageMark, String StuId, String className, String subjectName, int semester, float mark) {
        super(StuId, className, subjectName, semester, mark);
        this.totalExamSubject = totalExamSubject;
        this.everageMark = everageMark;
    }

    public StudentMarkTotal() {
        super();
    }

    public int getTotalExamSubject() {
        return totalExamSubject;
    }

    public void setTotalExamSubject(int totalExamSubject) {
        this.totalExamSubject = totalExamSubject;
    }

    public float getEverageMark() {
        return everageMark;
    }

    public void setEverageMark(float everageMark) {
        this.everageMark = everageMark;
    }

    @Override
    public void input() {
        super.input(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Diem trung binh: ");
        everageMark = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap De thi: ");
        totalExamSubject = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void display() {
        super.display(); 
        System.out.println("Diem trung binh: " + everageMark);
        System.out.println("De thi: " + totalExamSubject);
        System.out.println("___________________________________________");
    }

    public void getTotalExamSubject(StudentMarkTotal[] list) {
     //Tinh tong so mon thi
    }

    public void calculateEverageMark(StudentMarkTotal[] list) {
    //tinh diem trung bih cac mon thi
    }
}
