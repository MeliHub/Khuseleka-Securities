/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khuselekasecurities;

/**
 *
 * @author matiw
 */
public class frmMain extends javax.swing.JFrame {

    String Role;

    /**
     * Creates new form frmLogin
     */
    public frmMain() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuLogoff = new javax.swing.JMenuItem();
        mnuExit = new javax.swing.JMenuItem();
        mnuVisitors = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        mnuViewVisitors = new javax.swing.JMenuItem();
        mnuSecurityOfficers = new javax.swing.JMenuItem();
        mnuViewSecurityOfficers = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");

        mnuLogoff.setText("Logoff");
        mnuLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLogoffActionPerformed(evt);
            }
        });
        jMenu1.add(mnuLogoff);

        mnuExit.setText("Exit");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuExit);

        jMenuBar1.add(jMenu1);

        mnuVisitors.setText("Form");

        jMenuItem3.setText("Visitors");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnuVisitors.add(jMenuItem3);

        mnuViewVisitors.setText("View Visitors");
        mnuViewVisitors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuViewVisitorsActionPerformed(evt);
            }
        });
        mnuVisitors.add(mnuViewVisitors);

        mnuSecurityOfficers.setText("Security Officers");
        mnuSecurityOfficers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSecurityOfficersActionPerformed(evt);
            }
        });
        mnuVisitors.add(mnuSecurityOfficers);

        mnuViewSecurityOfficers.setText("ViewSecurityOfficers");
        mnuViewSecurityOfficers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuViewSecurityOfficersActionPerformed(evt);
            }
        });
        mnuVisitors.add(mnuViewSecurityOfficers);

        jMenuBar1.add(mnuVisitors);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLogoffActionPerformed
        frmLogin logoff = new frmLogin();
        logoff.show();
    }//GEN-LAST:event_mnuLogoffActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnuExitActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
        
        frmVisitors visitors = new frmVisitors();
        visitors.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void mnuSecurityOfficersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSecurityOfficersActionPerformed
        frmSecurityOfficers officers = new frmSecurityOfficers();
        officers.show();
    }//GEN-LAST:event_mnuSecurityOfficersActionPerformed

    private void mnuViewVisitorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuViewVisitorsActionPerformed

       
        frmViewVisitors v = new frmViewVisitors();
        v.show();
    }//GEN-LAST:event_mnuViewVisitorsActionPerformed

    private void mnuViewSecurityOfficersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuViewSecurityOfficersActionPerformed
        
        frmViewSecurityOfficers s = new frmViewSecurityOfficers();
        s.show();
    }//GEN-LAST:event_mnuViewSecurityOfficersActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    public void mSetRoleRights() 
    {
        if(null != Role)
            switch (Role) {
                case "Supervisor":
                    mnuLogoff.setEnabled(true);
                    mnuExit.setEnabled(true);
                    mnuVisitors.setEnabled(true);
                    mnuViewVisitors.setEnabled(true);
                    mnuSecurityOfficers.setEnabled(true);
                    mnuViewSecurityOfficers.setEnabled(true);
                    break;
                    case "Security Officer":
                    mnuLogoff.setEnabled(true);
                    mnuExit.setEnabled(true);
                    mnuVisitors.setEnabled(true);
                    mnuViewVisitors.setEnabled(true);
                    mnuSecurityOfficers.setEnabled(false);
                    mnuViewSecurityOfficers.setEnabled(false);
                    break;
                    default:
                    break;
                    
          
                    
            }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuLogoff;
    private javax.swing.JMenuItem mnuSecurityOfficers;
    private javax.swing.JMenuItem mnuViewSecurityOfficers;
    private javax.swing.JMenuItem mnuViewVisitors;
    private javax.swing.JMenu mnuVisitors;
    // End of variables declaration//GEN-END:variables
}
