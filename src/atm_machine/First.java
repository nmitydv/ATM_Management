/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package atm_machine;

/**
 *
 * @author 91975
 */
public class First extends javax.swing.JDialog {

    /**
     * Creates new form First
     */
    public First(java.awt.Frame parent, boolean modal) {
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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        more = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        more.setIcon(new javax.swing.ImageIcon("C:\\Users\\91975\\OneDrive\\Desktop\\MY_WORK\\ATM_Machine\\img\\More.png")); // NOI18N
        more.setBorder(null);
        more.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moreActionPerformed(evt);
            }
        });
        getContentPane().add(more, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 760, 160, 30));

        cancel.setIcon(new javax.swing.ImageIcon("C:\\Users\\91975\\OneDrive\\Desktop\\MY_WORK\\ATM_Machine\\img\\cancel.png")); // NOI18N
        cancel.setBorder(null);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 760, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\91975\\OneDrive\\Desktop\\MY_WORK\\ATM_Machine\\img\\Logo.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 540, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\91975\\OneDrive\\Desktop\\MY_WORK\\ATM_Machine\\img\\welcome-removebg-preview.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\91975\\OneDrive\\Desktop\\MY_WORK\\ATM_Machine\\img\\coverfourth.jpg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 680, 590));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\91975\\OneDrive\\Desktop\\MY_WORK\\ATM_Machine\\img\\firstt.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moreActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_moreActionPerformed
        new Checking();
        dispose();
    }// GEN-LAST:event_moreActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cancelActionPerformed
        System.exit(0);
    }// GEN-LAST:event_cancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public First() {
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
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                First dialog = new First(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton more;
    // End of variables declaration//GEN-END:variables
}
