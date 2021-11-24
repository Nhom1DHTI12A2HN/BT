/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Admin
 */
public class ClientThread extends Thread {

    private DataInputStream is = null;
    private DataOutputStream os = null;
    private Socket ClientSocket = null;
    private final ClientThread[] threads;
    private int maxClientsCount;

    public ClientThread(Socket ClientSocket, ClientThread[] threads) {
        this.ClientSocket = ClientSocket;
        this.threads = threads;
        maxClientsCount = threads.length;
    }

    public void run() {
        int maxClientsCount = this.maxClientsCount;
        ClientThread[] threads = this.threads;
        try {
            is = new DataInputStream(ClientSocket.getInputStream());
            os = new DataOutputStream(ClientSocket.getOutputStream());
            os.writeUTF("Enter your name.");
            String name = is.readUTF().trim();
            os.writeUTF("Hello " + name + " to our chat room.\nTo leave enter /quit in a new line");
            for (int i = 0; i < maxClientsCount; i++) {
                if (threads[i] != null && threads[i] != this) {
                    threads[i].os.writeUTF("*** A new user " + name + " entered the chat room !!! ***");
                }
            }
            while (true) {
                String line = is.readUTF();
                if (line.startsWith("/quit")) {
                    break;
                }
                for (int i = 0; i < maxClientsCount; i++) {
                    if (threads[i] != null) {
                        System.out.println(line);
                        threads[i].os.writeUTF("<" + name + "> : " + line);
                    }
                }
            }
            for (int i = 0; i < maxClientsCount; i++) {
                if (threads[i] != null && threads[i] != this) {
                    threads[i].os.writeUTF("*** The user " + name
                            + " is leaving the chat room !!! ***");
                }
            }
            os.writeUTF("*** Bye " + name + " ***");
            for (int i = 0; i < maxClientsCount; i++) {
                if (threads[i] == this) {
                    threads[i] = null;
                }
            }
            is.close();
            os.close();
            ClientSocket.close();
        }catch (IOException e) {
            
        }
    }
}
