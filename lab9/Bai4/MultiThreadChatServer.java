/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Admin
 */
public class MultiThreadChatServer extends javax.swing.JFrame {

    private static ServerSocket ServerSocket = null;
    private static Socket ClientSocket = null;
    private static final int maxClientsCount = 10;
    private static final ClientThread[] threads = new ClientThread[maxClientsCount];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int portNumber = 2222;
        if (args.length < 1) {
            System.out.println("Usage: java MultiThreadChatServer <portNumber>\n" + "Now using port number=" + portNumber);
        } else {
            portNumber = Integer.valueOf(args[0]).intValue();
        }
        try {
            ServerSocket = new ServerSocket(portNumber);
        } catch (IOException e) {
            System.out.println(e);
        }
        while (true) {
            try {
                ClientSocket = ServerSocket.accept();
                int i = 0;
                for (i = 0; i < maxClientsCount; i++) {
                    if (threads[i] == null) {
                        (threads[i] = new ClientThread(ClientSocket, threads)).start();
                        break;
                    }
                }
                if (i == maxClientsCount) {
                    DataOutputStream os = new DataOutputStream(ClientSocket.getOutputStream());
                    os.writeUTF("Server too busy. Try later.");
                    os.close();
                    ClientSocket.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
