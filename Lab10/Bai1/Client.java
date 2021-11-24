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
public class Client extends java.applet.Applet {

    String myHost;

    public void init() {
        myHost = getCodeBase().getHost();
    }

    public void sendMessage(String message) {
//phương thức gửi tin nhắn
        try {
            byte[] data = new byte[message.length()];
            message.getBytes(0, data.length, data, 0);
            InetAddress addr = InetAddress.getByName(myHost);
            DatagramPacket pack = new DatagramPacket(data, data.length, addr, 1234);
            DatagramSocket ds = new DatagramSocket();
            ds.send(pack);
            ds.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void start() {
        sendMessage("Bắt đầu!");
    }

    public void stop() {
        sendMessage("Kết thúc!");
    }
}
