/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DLL.AccountDLL;
import Entity.Account;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aki
 */
public class QuenMK extends javax.swing.JFrame {

    /**
     * Creates new form QuenMK
     */
      ArrayList<Account> listacc= new ArrayList<>();
    AccountDLL accdll= new AccountDLL();
    public QuenMK() {
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

        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtmaxacnhan = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Username");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
        });

        jButton1.setText("Lưu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Thoát");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Quên mật khẩu");

        jLabel2.setText("Nhập mã xác nhận");

        jLabel3.setText("Nhập mật khẩu mới");

        txtmaxacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmaxacnhanActionPerformed(evt);
            }
        });
        txtmaxacnhan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmaxacnhanKeyPressed(evt);
            }
        });

        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtpass)
                                .addComponent(txtmaxacnhan)
                                .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                            .addComponent(jButton2))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtmaxacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String user= txtUsername.getText();
        String pass=new String(txtpass.getPassword());
        String ma=txtmaxacnhan.getText();
        boolean check= true;
        if(check&user.isEmpty()){
            check=false;
            JOptionPane.showMessageDialog(this,"Không được để trống username");
        }
        if(check&pass.isEmpty()){
            check=false;
            JOptionPane.showMessageDialog(this, "Không được để trống password");
        }
        if(check&ma.isEmpty()){
            check=false;
            JOptionPane.showMessageDialog(this, "Không được để trống mã xác nhận");
        }
        if(check==true){
            if(accdll.CheckData(user, ma)){
                Account acc= new Account();
               
         
 
                acc.setpass(pass);
                 acc.setaccid(1);
                if(accdll.UpdatePass(acc))
               
                    JOptionPane.showMessageDialog(this, "Lưu thành công");

                    Login lo = new Login();
                    lo.setVisible(true);
                    this.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(this, "Lưu thất bại");
                }

            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtmaxacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmaxacnhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmaxacnhanActionPerformed

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void txtpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             String user= txtUsername.getText();
        String pass=new String(txtpass.getPassword());
        String ma=txtmaxacnhan.getText();
        boolean check= true;
        if(check&user.isEmpty()){
            check=false;
            JOptionPane.showMessageDialog(this,"Không được để trống username");
        }
        if(check&pass.isEmpty()){
            check=false;
            JOptionPane.showMessageDialog(this, "Không được để trống password");
        }
        if(check&ma.isEmpty()){
            check=false;
            JOptionPane.showMessageDialog(this, "Không được để trống mã xác nhận");
        }
        if(check==true){
            if(accdll.CheckData(user, ma)){
                Account acc= new Account();
               
         
 
                acc.setpass(pass);
                 acc.setaccid(1);
                if(accdll.UpdatePass(acc))
               
                    JOptionPane.showMessageDialog(this, "Lưu thành công");

                    Login lo = new Login();
                    lo.setVisible(true);
                    this.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(this, "Lưu thất bại");
                }

            }
        
        }
    }//GEN-LAST:event_txtpassKeyPressed

    private void txtmaxacnhanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmaxacnhanKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             String user= txtUsername.getText();
        String pass=new String(txtpass.getPassword());
        String ma=txtmaxacnhan.getText();
        boolean check= true;
        if(check&user.isEmpty()){
            check=false;
            JOptionPane.showMessageDialog(this,"Không được để trống username");
        }
        if(check&pass.isEmpty()){
            check=false;
            JOptionPane.showMessageDialog(this, "Không được để trống password");
        }
        if(check&ma.isEmpty()){
            check=false;
            JOptionPane.showMessageDialog(this, "Không được để trống mã xác nhận");
        }
        if(check==true){
            if(accdll.CheckData(user, ma)){
                Account acc= new Account();
               
         
 
                acc.setpass(pass);
                 acc.setaccid(1);
                if(accdll.UpdatePass(acc))
               
                    JOptionPane.showMessageDialog(this, "Lưu thành công");

                    Login lo = new Login();
                    lo.setVisible(true);
                    this.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(this, "Lưu thất bại");
                }

            }
        
        }
    }//GEN-LAST:event_txtmaxacnhanKeyPressed

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             String user= txtUsername.getText();
        String pass=new String(txtpass.getPassword());
        String ma=txtmaxacnhan.getText();
        boolean check= true;
        if(check&user.isEmpty()){
            check=false;
            JOptionPane.showMessageDialog(this,"Không được để trống username");
        }
        if(check&pass.isEmpty()){
            check=false;
            JOptionPane.showMessageDialog(this, "Không được để trống password");
        }
        if(check&ma.isEmpty()){
            check=false;
            JOptionPane.showMessageDialog(this, "Không được để trống mã xác nhận");
        }
        if(check==true){
            if(accdll.CheckData(user, ma)){
                Account acc= new Account();
               
         
 
                acc.setpass(pass);
                 acc.setaccid(1);
                if(accdll.UpdatePass(acc))
               
                    JOptionPane.showMessageDialog(this, "Lưu thành công");

                    Login lo = new Login();
                    lo.setVisible(true);
                    this.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(this, "Lưu thất bại");
                }

            }
        
        }
    }//GEN-LAST:event_txtUsernameKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
      
    
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(QuenMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuenMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuenMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuenMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuenMK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtmaxacnhan;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}
