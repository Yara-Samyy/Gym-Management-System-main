/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;

import Backend.AdminRole;
import java.util.ArrayList;
import Backend.Trainer;
import javax.swing.JOptionPane;

/**
 *
 * @author Yara
 */
public class adminRole extends javax.swing.JFrame {

    private ArrayList<Trainer> trainers;
    private AdminRole admin;
    
    public adminRole() {
        initComponents();
         this.admin = new AdminRole();
        this.trainers = admin.getListOfTrainers();
         setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addTrainerbtn = new javax.swing.JButton();
        Logoutbtn = new javax.swing.JButton();
        viewTrainersbtn = new javax.swing.JButton();
        removeTrainerbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admin Role");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        addTrainerbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addTrainerbtn.setText("Add Trainer");
        addTrainerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTrainerbtnActionPerformed(evt);
            }
        });

        Logoutbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Logoutbtn.setText("Logout");
        Logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutbtnActionPerformed(evt);
            }
        });

        viewTrainersbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        viewTrainersbtn.setText("View Trainers");
        viewTrainersbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTrainersbtnActionPerformed(evt);
            }
        });

        removeTrainerbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        removeTrainerbtn.setText("Remove Trainer");
        removeTrainerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTrainerbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeTrainerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTrainerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewTrainersbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(addTrainerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(removeTrainerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(viewTrainersbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addTrainerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTrainerbtnActionPerformed
        // TODO add your handling code here:
         AddTrainer addTrainer= new AddTrainer(admin);
           addTrainer.setVisible(true);
           this.dispose(); 
    }//GEN-LAST:event_addTrainerbtnActionPerformed

    private void LogoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutbtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JOptionPane.showMessageDialog(null, "Logged out successfully");
       
       
    }//GEN-LAST:event_LogoutbtnActionPerformed

    private void viewTrainersbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTrainersbtnActionPerformed
        // TODO add your handling code here:
        //ViewTrainers viewTrainer= new ViewTrainers(admin);
          new ViewTrainers().setVisible(true);
           this.dispose();
    }//GEN-LAST:event_viewTrainersbtnActionPerformed

    private void removeTrainerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTrainerbtnActionPerformed
        // TODO add your handling code here:
        RemoveTrainer removeTrainer= new RemoveTrainer(admin);
           removeTrainer.setVisible(true);
           this.dispose(); 
    }//GEN-LAST:event_removeTrainerbtnActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
       // new gymSystem().setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(adminRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminRole().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logoutbtn;
    private javax.swing.JButton addTrainerbtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton removeTrainerbtn;
    private javax.swing.JButton viewTrainersbtn;
    // End of variables declaration//GEN-END:variables
}
