/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.net.*;
import java.io.*;

/**
 *
 * @author Admin
 */
public class DaytimeClient {

    static final int defaultPort = 13;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int portNumber;
        Socket ClientSocket;
        BufferedReader timeStream;
        String hostName;
        switch (args.length) {
            case 1:
                hostName = args[0];
                portNumber = defaultPort;//daytimePort;
                break;
            case 2:
                hostName = args[0];
                portNumber = new Integer(args[1]).intValue();
                
                break;
            default:
                hostName = "localhost";
                portNumber = defaultPort;
        }
        try {
            // Thực hiện kết nối tới Server
            ClientSocket = new Socket(hostName, portNumber);
            // Tạo luồng dữ liệu từ kết nối
            timeStream = new BufferedReader(new InputStreamReader(ClientSocket.getInputStream()));
            // Lấy dữ liệu từ Server
            String timeString = timeStream.readLine();
            System.out.println("It is " + timeString + " at " + hostName);
            // Đóng kết nối
            timeStream.close();
            ClientSocket.close();
        } catch (UnknownHostException e) {
            System.out.println(" Lỗi máy chủ không xác định");
           
        } catch (ConnectException e) {
            System.out.println(" Dịch vụ không khả dụng trên cổng " + portNumber + " của máy chủ " + hostName);
        } catch (IOException e) {
            System.out.println(" Đã xảy ra lỗi giao tiếp\r\n " + e);
        }
    }
}
