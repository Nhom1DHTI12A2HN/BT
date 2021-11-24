/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.net.*;
import java.io.*;

/**
 *
 * @author Admin
 */
public class Server  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        DatagramSocket s = new DatagramSocket(1234);
        System.out.println(" Lắng nghe..");
        while (true) {
            DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
            s.receive(packet);
            String message = new String(packet.getData(), 0, 0, packet.getLength());
            System.out.println("Tín hiệu từ " + packet.getAddress().getHostName() + "- " + message);
        }
    }
}
