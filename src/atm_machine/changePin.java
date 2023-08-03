/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package atm_machine;

import java.awt.event.ActionEvent;

/**
 *
 * @author 91975
 */
public class changePin extends javax.swing.JDialog {

    /**
     * Creates new form changePin
     */
    public changePin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JTextField();
        balance = new javax.swing.JTextField();
        lasttransaction = new javax.swing.JTextField();
        Confirm = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        newpin = new javax.swing.JTextField();
        oldpin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setBackground(new java.awt.Color(0, 0, 0));
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setBorder(null);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }

            private void nameActionPerformed(ActionEvent evt) {
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 180, 40));

        balance.setBackground(new java.awt.Color(0, 0, 0));
        balance.setForeground(new java.awt.Color(255, 255, 255));
        balance.setBorder(null);
        balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceActionPerformed(evt);
            }
        });
        getContentPane().add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 168, 40));

        lasttransaction.setBackground(new java.awt.Color(0, 0, 0));
        lasttransaction.setForeground(new java.awt.Color(255, 255, 255));
        lasttransaction.setBorder(null);
        getContentPane().add(lasttransaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 168, 40));

        Confirm.setIcon(new javax.swing.ImageIcon(
                "C:\\Users\\91975\\OneDrive\\Desktop\\MY_WORK\\ATM_Machine\\img\\confirm.png")); // NOI18N
        Confirm.setBorder(null);
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(Confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 620, 150, 40));

        cancel.setBackground(new java.awt.Color(0, 0, 0));
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_machine/cancel.png"))); // NOI18N
        cancel.setBorder(null);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 770, 180, 40));

        back.setIcon(
                new javax.swing.ImageIcon("C:\\Users\\91975\\OneDrive\\Desktop\\MY_WORK\\ATM_Machine\\img\\back.png")); // NOI18N
        back.setBorder(null);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 770, 140, 32));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ENTER NEW PIN ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 210, 50));
        getContentPane().add(newpin, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, 200, 40));
        getContentPane().add(oldpin, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, 200, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ENTER OLD PIN ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 210, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 44)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Change PIN ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 260, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(
                "C:\\Users\\91975\\OneDrive\\Desktop\\MY_WORK\\ATM_Machine\\img\\coverthird1.jpg")); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 670, 480));

        jLabel1.setIcon(
                new javax.swing.ImageIcon("C:\\Users\\91975\\OneDrive\\Desktop\\MY_WORK\\ATM_Machine\\img\\Third.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void balanceActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_balanceActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_balanceActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ConfirmActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_ConfirmActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cancelActionPerformed
        System.exit(0);
    }// GEN-LAST:event_cancelActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backActionPerformed
        new Second();
        dispose();
    }// GEN-LAST:event_backActionPerformed

    /**
     * @param args the command line arguments
     */
    public changePin() {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(changePin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changePin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changePin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changePin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                changePin dialog = new changePin(new javax.swing.JFrame(), true);
                dialog.setLocation(370, 90);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirm;
    private javax.swing.JButton back;
    private javax.swing.JTextField balance;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField lasttransaction;
    private javax.swing.JTextField name;
    private javax.swing.JTextField newpin;
    private javax.swing.JTextField oldpin;
    // End of variables declaration//GEN-END:variables
}
