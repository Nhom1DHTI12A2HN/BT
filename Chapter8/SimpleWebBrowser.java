/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleWebBrowser;

import javax.swing.text.*;
import javax.swing.*;
import java.net.*;
import java.io.*;
import java.awt.*;

public class SimpleWebBrowser {

    public static void main(String[] args) {

        // get the first URL 
        String initialPage = "http://www.cafeaulait.org/";
        if (args.length > 0) {
            initialPage = args[0];
        }

        // set up the editor pane 
        JEditorPane jep = new JEditorPane();
        jep.setEditable(false);
        jep.addHyperlinkListener(new LinkFollower(jep));

        try {
            jep.setPage(initialPage);
        } catch (IOException e) {
            System.err.println("Xảy ra lỗi: ");
            System.err.println(e);
            System.exit(-1);
        }

        // set up the window 
        JScrollPane scrollPane = new JScrollPane(jep);
        JFrame f = new JFrame("Trình duyệt cơ bản");
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        f.setContentPane(scrollPane);
        f.setSize(512, 342);
        f.show();

    }
}
