/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoogleHomePage;

import javax.swing.text.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;

public class GoogleHomePage {

    public static void main(String[] args) {

        JEditorPane jep = new JEditorPane();
        jep.setEditable(false);

        try {
            jep.setPage("http://www.google.com");
        } catch (IOException e) {
            jep.setContentType("text/html");
            jep.setText("<html>Could not load http://www.google.com </html>");
        }

        JScrollPane scrollPane = new JScrollPane(jep);
        JFrame f = new JFrame("GG");
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        f.setContentPane(scrollPane);
        f.setSize(512, 342);
        f.show();

    }
}
