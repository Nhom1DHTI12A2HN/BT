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
public class StudentMark implements Imark {

    private String StuId;
    private String className;
    private String subjectName;
    private int semester;
    private float mark;

    public String getStuId() {
        return StuId;
    }

    public void setStuId(String StuId) {
        this.StuId = StuId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public StudentMark(String StuId, String className, String subjectName, int semester, float mark) {
        this.StuId = StuId;
        this.className = className;
        this.subjectName = subjectName;
        this.semester = semester;
        this.mark = mark;
    }

    public StudentMark() {
    }

    @Override
    public void input() {
       Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ID: ");
        StuId = sc.nextLine();
        System.out.print("Nhap ten lop: ");
        className = sc.nextLine();
        System.out.print("nhap ten mon hoc: ");
        subjectName = sc.nextLine();
        System.out.print("Nhap hoc ki: ");
        semester =Integer.parseInt(sc.nextLine());
        System.out.print("Nhap diem: ");
        mark =Float.parseFloat(sc.nextLine());
    }

    @Override
    public void display() {
        System.out.println("ID: "+StuId);
        System.out.println("Ten lop: "+className);
        System.out.println("Ten mon hoc: "+subjectName);
        System.out.println("Hoc ki: "+semester);
        System.out.println("Diem:"+mark);
        System.out.println("___________________________________________");
    }
}
