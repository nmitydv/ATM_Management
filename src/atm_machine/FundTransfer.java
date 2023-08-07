/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package atm_machine;

/**
 *
 * @author 91975
 */
public class FundTransfer extends javax.swing.JDialog {

    /**
     * Creates new form FundTransfer
     */
    public FundTransfer(java.awt.Frame parent, boolean modal) {
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancel = new javax.swing.JButton();
        Confirm = new javax.swing.JButton();
        back = new javax.swing.JButton();
        accountnumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancel.setBackground(new java.awt.Color(0, 0, 0));
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_machine/cancel.png"))); // NOI18N
        cancel.setBorder(null);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 780, 140, 30));

        Confirm.setIcon(new javax.swing.ImageIcon("C:\\Users\\91975\\OneDrive\\Desktop\\MY_WORK\\ATM_Machine\\img\\confirm.png")); // NOI18N
        Confirm.setBorder(null);
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(Confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, -1, -1));

        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\91975\\OneDrive\\Desktop\\MY_WORK\\ATM_Machine\\img\\back.png")); // NOI18N
        back.setBorder(null);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 710, 140, 40));

        accountnumber.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        accountnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountnumberActionPerformed(evt);
            }
        });
        getContentPane().add(accountnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 390, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ENTER ACCOUNT NUMBER ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 310, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("!! NOTE  - The account number entered should be belong to branch");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 430, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 44)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("FUND Transfer");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 310, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\91975\\OneDrive\\Desktop\\MY_WORK\\ATM_Machine\\img\\coverthird1.jpg")); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 680, 580));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\91975\\OneDrive\\Desktop\\MY_WORK\\ATM_Machine\\img\\coverthird1.jpg")); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 210, 650));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\91975\\OneDrive\\Desktop\\MY_WORK\\ATM_Machine\\img\\coverthird1.jpg")); // NOI18N
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 660, 660));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\91975\\OneDrive\\Desktop\\MY_WORK\\ATM_Machine\\img\\coverthird1.jpg")); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 750, 810));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\91975\\OneDrive\\Desktop\\MY_WORK\\ATM_Machine\\img\\Dashboard.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_nameActionPerformed

    private void balanceActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_balanceActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_balanceActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cancelActionPerformed
        System.exit(0);
    }// GEN-LAST:event_cancelActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ConfirmActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_ConfirmActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backActionPerformed
        new Second();
        dispose();
    }// GEN-LAST:event_backActionPerformed

    private void accountnumberActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_accountnumberActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_accountnumberActionPerformed

    /**
     * @param args the command line arguments
     */
    public FundTransfer() {
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
            java.util.logging.Logger.getLogger(FundTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FundTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FundTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FundTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FundTransfer dialog = new FundTransfer(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField accountnumber;
    private javax.swing.JButton back;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
