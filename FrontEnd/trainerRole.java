package FrontEnd;
import Backend.Record;
import Backend.AdminRole;
import Backend.Member;
import Backend.TrainerRole;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class trainerRole extends javax.swing.JFrame {

private TrainerRole member;
    
     private ArrayList<Record> members;
    private TrainerRole trainer;
    
    public trainerRole() {
        initComponents();
         this.trainer = new TrainerRole();
        this.members = trainer.getListOfMembers();
         setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddMemberBtn = new javax.swing.JButton();
        ViewMemberBtn = new javax.swing.JButton();
        AddClassBtn = new javax.swing.JButton();
        ViewClassBtn = new javax.swing.JButton();
        RegBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        ViewRegBtn = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Trainer Role");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        AddMemberBtn.setText("Add Member");
        AddMemberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMemberBtnActionPerformed(evt);
            }
        });

        ViewMemberBtn.setText("View Members");
        ViewMemberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewMemberBtnActionPerformed(evt);
            }
        });

        AddClassBtn.setText("Add Class");
        AddClassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClassBtnActionPerformed(evt);
            }
        });

        ViewClassBtn.setText("View Classes");
        ViewClassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewClassBtnActionPerformed(evt);
            }
        });

        RegBtn.setText("Register Member for Class");
        RegBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegBtnActionPerformed(evt);
            }
        });

        CancelBtn.setText("Cancel Registration");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        ViewRegBtn.setText("View Registrations");
        ViewRegBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewRegBtnActionPerformed(evt);
            }
        });

        LogoutBtn.setText("Logout");
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ViewRegBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LogoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewClassBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddClassBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewMemberBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddMemberBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(76, 101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(AddMemberBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(ViewMemberBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(AddClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(ViewClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(RegBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(ViewRegBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddMemberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMemberBtnActionPerformed
        // TODO add your handling code here:
        AddMember addMember= new AddMember(trainer);
           addMember.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_AddMemberBtnActionPerformed

    private void RegBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegBtnActionPerformed
        // TODO add your handling code here:
        RegisterMember registerMember= new RegisterMember(trainer);
           registerMember.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_RegBtnActionPerformed

    private void AddClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClassBtnActionPerformed
        // TODO add your handling code here:
        AddClass addClass= new AddClass(trainer);
           addClass.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_AddClassBtnActionPerformed

    private void ViewMemberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewMemberBtnActionPerformed
        // TODO add your handling code here:
         ViewMembers viewMembers= new ViewMembers();
        viewMembers.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ViewMemberBtnActionPerformed

    private void ViewClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewClassBtnActionPerformed
        // TODO add your handling code here:
         ViewClasses viewClasses= new ViewClasses();
        viewClasses.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ViewClassBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        // TODO add your handling code here:
        CancelRegistration cancelReg= new CancelRegistration(trainer);
           cancelReg.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void ViewRegBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewRegBtnActionPerformed
        // TODO add your handling code here:
        ViewRegistrations viewreg= new ViewRegistrations();
        viewreg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ViewRegBtnActionPerformed

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JOptionPane.showMessageDialog(null, "Logged out successfully");
       new gymSystem().setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        //new gymSystem().setVisible(true);
       // this.dispose();
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(trainerRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trainerRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trainerRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trainerRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new trainerRole().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddClassBtn;
    private javax.swing.JButton AddMemberBtn;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JButton RegBtn;
    private javax.swing.JButton ViewClassBtn;
    private javax.swing.JButton ViewMemberBtn;
    private javax.swing.JButton ViewRegBtn;
    // End of variables declaration//GEN-END:variables
}
