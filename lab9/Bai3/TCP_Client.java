/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class TCP_Client extends javax.swing.JFrame {

    /**
     * Creates new form TCP_Client
     */
    public TCP_Client() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbB = new javax.swing.JLabel();
        txtSoB = new javax.swing.JTextField();
        lba = new javax.swing.JLabel();
        txtSoA = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaStatus = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtketqua = new javax.swing.JTextField();
        btncong = new javax.swing.JButton();
        btntru = new javax.swing.JButton();
        btnnhan = new javax.swing.JButton();
        btnchia = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbB.setText("Số b");

        lba.setText("Số a");

        txaStatus.setColumns(20);
        txaStatus.setRows(5);
        jScrollPane1.setViewportView(txaStatus);

        jLabel1.setText("Kết quả");

        txtketqua.setEnabled(false);

        btncong.setText("+");
        btncong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncongActionPerformed(evt);
            }
        });

        btntru.setText("-");
        btntru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntruActionPerformed(evt);
            }
        });

        btnnhan.setText("*");
        btnnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnhanActionPerformed(evt);
            }
        });

        btnchia.setText("/");
        btnchia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchiaActionPerformed(evt);
            }
        });

        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnnhan)
                        .addGap(18, 18, 18)
                        .addComponent(btnchia)
                        .addGap(18, 18, 18)
                        .addComponent(btncong)
                        .addGap(18, 18, 18)
                        .addComponent(btntru)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnexit)
                        .addGap(10, 10, 10)
                        .addComponent(btnclear))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(lba, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(lbB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtketqua, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtSoA, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSoB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lba)
                        .addGap(18, 18, 18)
                        .addComponent(lbB))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txtSoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtketqua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnhan)
                    .addComponent(btnchia)
                    .addComponent(btnexit)
                    .addComponent(btnclear)
                    .addComponent(btncong)
                    .addComponent(btntru))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncongActionPerformed

        txaStatus.append("Đang gửi dữ liệu lên Server...\n");
        try {
            Socket ClientSocket = new Socket("Localhost", 12345);
            //tao luong nhan du lieu tu Server
            DataInputStream inFromServer = new DataInputStream(ClientSocket.getInputStream());
            //tao luong gui du lieu len Server
            DataOutputStream outToServer = new DataOutputStream(ClientSocket.getOutputStream());
            // nhap du lieu tu ban phim gui len Server
            outToServer.writeBytes(txtSoA.getText() + '\n');
            outToServer.writeBytes(txtSoB.getText() + '\n');
            outToServer.writeBytes(btncong.getText()+'\n');
            txaStatus.append("Đã nhận kết quả từ server");
            txtketqua.setText("Kết quả phép cộng từ Server:" + inFromServer.readLine() + "\n\n");
            //dong luong gui du lieu len Server
            outToServer.close();
            //dong luong nhan du lieu tu Server
            inFromServer.close();
            //dong socket Client
            ClientSocket.close();
        } catch (Exception e) {
            txaStatus.append("Không tìm thấy server\n\n");
        } 
    }//GEN-LAST:event_btncongActionPerformed

    private void btntruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntruActionPerformed
        txaStatus.append("Đang gửi dữ liệu lên Server...\n");
        try {
            Socket ClientSocket = new Socket("Localhost", 12345);
            //tao luong nhan du lieu tu Server
            DataInputStream inFromServer = new DataInputStream(ClientSocket.getInputStream());
            //tao luong gui du lieu len Server
            DataOutputStream outToServer = new DataOutputStream(ClientSocket.getOutputStream());
            // nhap du lieu tu ban phim gui len Server
            outToServer.writeBytes(txtSoA.getText() + '\n');
            outToServer.writeBytes(txtSoB.getText() + '\n');
            outToServer.writeBytes(btntru.getText() +'\n');
            txaStatus.append("Đã nhận kết quả từ server");
            txtketqua.setText("Kết quả phép trừ từ Server:" + inFromServer.readLine() + "\n\n");
            //dong luong gui du lieu len Server
            outToServer.close();
            //dong luong nhan du lieu tu Server
            inFromServer.close();
            //dong socket Client
            ClientSocket.close();
        } catch (Exception e) {
            txaStatus.append("Không tìm thấy server\n\n");
        } 
    }//GEN-LAST:event_btntruActionPerformed

    private void btnnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnhanActionPerformed
        txaStatus.append("Đang gửi dữ liệu lên Server...\n");
        try {
            Socket ClientSocket = new Socket("Localhost", 12345);
            //tao luong nhan du lieu tu Server
            DataInputStream inFromServer = new DataInputStream(ClientSocket.getInputStream());
            //tao luong gui du lieu len Server
            DataOutputStream outToServer = new DataOutputStream(ClientSocket.getOutputStream());
            // nhap du lieu tu ban phim gui len Server
            outToServer.writeBytes(txtSoA.getText() + '\n');
            outToServer.writeBytes(txtSoB.getText() + '\n');
            outToServer.writeBytes(btnnhan.getText() +'\n');
            txaStatus.append("Đã nhận kết quả từ server");
            txtketqua.setText("Kết quả phép nhân từ Server:" + inFromServer.readLine() + "\n\n");
            //dong luong gui du lieu len Server
            outToServer.close();
            //dong luong nhan du lieu tu Server
            inFromServer.close();
            //dong socket Client
            ClientSocket.close();
        } catch (Exception e) {
            txaStatus.append("Không tìm thấy server\n\n");
        } 
    }//GEN-LAST:event_btnnhanActionPerformed

    private void btnchiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchiaActionPerformed
        txaStatus.append("Đang gửi dữ liệu lên Server...\n");
        try {
            Socket ClientSocket = new Socket("Localhost", 12345);
            //tao luong nhan du lieu tu Server
            DataInputStream inFromServer = new DataInputStream(ClientSocket.getInputStream());
            //tao luong gui du lieu len Server
            DataOutputStream outToServer = new DataOutputStream(ClientSocket.getOutputStream());
            // nhap du lieu tu ban phim gui len Server
            outToServer.writeBytes(txtSoA.getText() + '\n');
            outToServer.writeBytes(txtSoB.getText() + '\n');
            outToServer.writeBytes(btnchia.getText() +'\n');
            txaStatus.append("Đã nhận kết quả từ server");
            txtketqua.setText("Kết quả phép chia từ Server:" + inFromServer.readLine() + "\n\n");
            //dong luong gui du lieu len Server
            outToServer.close();
            //dong luong nhan du lieu tu Server
            inFromServer.close();
            //dong socket Client
            ClientSocket.close();
        } catch (Exception e) {
            txaStatus.append("Không tìm thấy server\n\n");
        } 
    }//GEN-LAST:event_btnchiaActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        txtketqua.setText("");
        txaStatus.append("");
        txtSoA.setText("");
        txtSoB.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnexitActionPerformed

/**
 * @param args the command line arguments
 */
public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TCP_Client.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TCP_Client.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TCP_Client.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TCP_Client.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TCP_Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnchia;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btncong;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnnhan;
    private javax.swing.JButton btntru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbB;
    private javax.swing.JLabel lba;
    private javax.swing.JTextArea txaStatus;
    private javax.swing.JTextField txtSoA;
    private javax.swing.JTextField txtSoB;
    private javax.swing.JTextField txtketqua;
    // End of variables declaration//GEN-END:variables
}
