/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maytinh;

import javax.swing.JOptionPane;

/**
 *
 * @author datd6
 */
public class more extends javax.swing.JFrame {

    /**
     * Creates new form more
     */
    public more() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ptBac2 = new javax.swing.JButton();
        ptBac3 = new javax.swing.JButton();
        chuyenDonVi = new javax.swing.JButton();
        quaylai = new javax.swing.JButton();
        btnBamgio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        ptBac2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ptBac2.setText("aX^2+bX+c=0");
        ptBac2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptBac2ActionPerformed(evt);
            }
        });

        ptBac3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ptBac3.setText("aX^3+bX^2+cX+d=0");
        ptBac3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptBac3ActionPerformed(evt);
            }
        });

        chuyenDonVi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chuyenDonVi.setText("Chuyển đổi đơn vị");
        chuyenDonVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chuyenDonViActionPerformed(evt);
            }
        });

        quaylai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        quaylai.setText("Máy tính");
        quaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quaylaiActionPerformed(evt);
            }
        });

        btnBamgio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBamgio.setText("Đồng hồ bấm giờ");
        btnBamgio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBamgioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ptBac2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(chuyenDonVi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ptBac3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(quaylai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBamgio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(ptBac2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptBac3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chuyenDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBamgio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quaylai, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chuyenDonViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chuyenDonViActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, " tinh năng đang phát triển",
                "", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_chuyenDonViActionPerformed

    private void quaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quaylaiActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new calculator().setVisible(true);
    }//GEN-LAST:event_quaylaiActionPerformed

    private void ptBac2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptBac2ActionPerformed
        // TODO add your handling code here:
        new ptbac2().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ptBac2ActionPerformed

    private void ptBac3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptBac3ActionPerformed
        // TODO add your handling code here:
        new ptbac3().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ptBac3ActionPerformed

    private void btnBamgioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBamgioActionPerformed
        // TODO add your handling code here:
        new BamGio().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBamgioActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBamgio;
    private javax.swing.JButton chuyenDonVi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton ptBac2;
    private javax.swing.JButton ptBac3;
    private javax.swing.JButton quaylai;
    // End of variables declaration//GEN-END:variables
}
