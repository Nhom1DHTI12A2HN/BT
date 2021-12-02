/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demohtml;

/**
 *

 * @author admin
 */

/* HtmlDemo.java needs no other files. */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DemoHTML extends JPanel
                      implements ActionListener {
    JLabel theLabel;
    JTextArea htmlTextArea;

    public DemoHTML() {
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));

        String initialText = "<html>\n" +
                "Màu sắc và font chữ:\n" +
                "<ul>\n" +
                "<li><font color=red>Đỏ</font>\n" +
                "<li><font color=blue>Xanh dương</font>\n" +
                "<li><font color=green>Xanh lá</font>\n" +
                "<li><font size=-2>Chữ nhỏ</font>\n" +
                "<li><font size=+2>Chữ to</font>\n" +
                "<li><i>Chữ nghiêng</i>\n" +
                "<li><b>Chữ đậm</b>\n" +
                "</ul>\n";

        htmlTextArea = new JTextArea(10, 20);
        htmlTextArea.setText(initialText);
        JScrollPane scrollPane = new JScrollPane(htmlTextArea);

        JButton changeTheLabel = new JButton("Thực hiện");
        changeTheLabel.setMnemonic(KeyEvent.VK_C);
        changeTheLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        changeTheLabel.addActionListener(this);

        theLabel = new JLabel(initialText) {
            public Dimension getPreferredSize() {
                return new Dimension(200, 200);
            }
            public Dimension getMinimumSize() {
                return new Dimension(200, 200);
            }
            public Dimension getMaximumSize() {
                return new Dimension(200, 200);
            }
        };
        theLabel.setVerticalAlignment(SwingConstants.CENTER);
        theLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.PAGE_AXIS));
        leftPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder(
                    "Chỉnh HTML"),
                BorderFactory.createEmptyBorder(10,10,10,10)));
        leftPanel.add(scrollPane);
        leftPanel.add(Box.createRigidArea(new Dimension(0,10)));
        leftPanel.add(changeTheLabel);

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.PAGE_AXIS));
        rightPanel.setBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createTitledBorder("Kết quả"),
                        BorderFactory.createEmptyBorder(10,10,10,10)));
        rightPanel.add(theLabel);

        setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        add(leftPanel);
        add(Box.createRigidArea(new Dimension(10,0)));
        add(rightPanel);
    }

    //React to the user pushing the Change button.
    public void actionPerformed(ActionEvent e) {
        theLabel.setText(htmlTextArea.getText());
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("DemoHTML");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add content to the window.
        frame.add(new DemoHTML());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Turn off metal's use of bold fonts
	        UIManager.put("swing.boldMetal", Boolean.FALSE);
	        createAndShowGUI();
                
            }
        });
    }
}

