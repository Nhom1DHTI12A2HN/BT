/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6lab8;
import java.net.*;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author CaoTrung
 */
public class Server {
    public static void main(String[] args) {
        ServerSocket cong = null;
        String line="";
        BufferedReader is;
        BufferedWriter os;
        Socket socket = null;
        try {
            cong = new ServerSocket(9999);
        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }
        try {
            System.out.println("Chạy client");
            socket = cong.accept();
            System.out.println("Chấp nhận máy con");
            is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            os = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            int a = Integer.parseInt(is.readLine());
            int b = Integer.parseInt(is.readLine());
            String c = String.valueOf(a+b);
            os.write(c);
            os.newLine();
            os.flush();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Dừng kết nối server!");
    }
}
