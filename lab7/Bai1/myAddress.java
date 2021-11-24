/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;
import java.net.*;
/**
 *
 * @author Admin
 */
public class myAddress {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("Hello. My name is "
                    + address.getHostName() + " and my IP adress is "
                    + address.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("I don't know my own name and address.");
        }
    }

}
