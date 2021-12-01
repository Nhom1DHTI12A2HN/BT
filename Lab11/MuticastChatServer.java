/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 *
 * @author admin
 */
public class MuticastChatServer {

    public static void main(String args[]) throws Exception {
        int portnumber = 5000;
        if (args.length >= 1) {
            portnumber = Integer.parseInt(args[0]);
        }
        // Create a MulticastSocket
        MulticastSocket ServerMulticastSocket = new MulticastSocket(portnumber);
        System.out.println("MulticastSocket is created at: " + portnumber);
        // Determine the IP address of a host, given the host name
        InetAddress group = InetAddress.getByName("225.4.5.6");
        ServerMulticastSocket.joinGroup(group);
        System.out.println("joinGroup method is called...");
        
        boolean infinite = true;
        while (infinite) {
            byte buf[] = new byte[1024];
            DatagramPacket data = new DatagramPacket(buf, buf.length);
            ServerMulticastSocket.receive(data);
            String msg = new String(data.getData()).trim();
            System.out.println("Message received from Client = " + msg);
        }
        ServerMulticastSocket.close();
    }
}
