/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prognoz.frames;

import com.prognoz.panels.BatchDetailsPanel;
import com.prognoz.panels.BatchNamesPanel;

import com.prognoz.panels.BatchSchedulePanel1;
import java.awt.Container;
import java.awt.Toolkit;
import javax.swing.JComponent;

/**
 *
 * @author Bhavin
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    BatchDetailsPanel bdp = new BatchDetailsPanel();
    BatchSchedulePanel1 bsp = new BatchSchedulePanel1();
    BatchNamesPanel bnp = new BatchNamesPanel();
    static MainFrame mf;

    public MainFrame() {

        initComponents();
        jButton3.setVisible(false);
        Toolkit tool = Toolkit.getDefaultToolkit();
        int x = (int) tool.getScreenSize().getWidth();
        int y = (int) tool.getScreenSize().getHeight();
        this.setSize(x, y);
        mf = this;
    }

    public static MainFrame getFrameReference() {
        return mf;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Add Batch");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Schedule Batch");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(67, 67, 67)
                .addComponent(jButton1)
                .addGap(39, 39, 39)
                .addComponent(jButton2)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


//        Container c = this.getContentPane();
//        
//        c.removeAll();
//        AbstractFrame af = new AbstractFrame();

//        this.remove(1);
//        this.remove(2);
        bdp.setBounds(0, 0, 607, 533);
        bdp.setVisible(true);
        this.add(bdp);
        this.setVisible(true);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(true);

//        this.dispose();

//        this.add(bdp);
//        this.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BatchNamesPanel.getNames();
        bnp.setBounds(0, 0, 400, 300);
        bnp.setVisible(true);
        this.add(bnp);
        this.setVisible(true);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(true);
//
//        bsp.setBounds(100, 0, 750, 482);
//        bsp.setVisible(true);
//        this.add(bsp);
//        this.setVisible(true);
//        jButton1.setVisible(false);
//        jButton2.setVisible(false);
//        jButton3.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        bsp.setVisible(false);
        bdp.setVisible(false);
        bnp.setVisible(false);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(false);
        BatchNamesPanel.bsp.setVisible(false);

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
