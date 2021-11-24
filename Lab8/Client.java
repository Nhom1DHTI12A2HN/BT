/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6lab8;
import java.util.Scanner;
import  java.net.*;
import  java.io.*;

/**
 *
 * @author CaoTrung
 */
public class Client {
    public static void main(String[] args) {
        final String serverHost = "127.0.0.1";
        Socket socket = null;
        BufferedReader is = null;
        BufferedWriter os = null;
        
        try {
            socket = new Socket(serverHost, 9999);
            os = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (Exception e) {
            System.err.println("Khộng kết nối được máy chủ : " + serverHost);
            return;
        }
        try {
            Scanner sc = new Scanner(System.in);
            String qui="";
            while (true){
                System.out.println("Nhập a: ");
                String a = sc.nextLine();
                System.out.println("Nhập b: ");
                String b = sc.nextLine();
                os.write(a+"\n");
                os.write(b+"\n");
                os.newLine();
                os.flush();
                String nhan = is.readLine();
                System.out.println("Tong la : " + nhan);
            
            os.close();
            is.close();
            socket.close();
            System.exit(0);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
