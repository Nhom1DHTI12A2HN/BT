/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;
import java.net.*; 

/**
 *
 * @author Admin
 */
public class AllAddr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            InetAddress[] addr = InetAddress.getAllByName("www.microsoft.com");
            for (int i = 0; i < addr.length; i++) {
                System.out.println(addr[i]);
            }
        } catch (UnknownHostException ex) {
            System.out.println("Could not find www.microsoft.com");
        }
    }

}
