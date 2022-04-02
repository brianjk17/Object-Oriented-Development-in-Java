package oodj;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2); //to center the jframe
        this.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));
        txtEnterUsername.setBackground(new Color(0,0,0,0));
        txpPass.setBackground(new Color(0,0,0,0)); //make the text field transparent
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
        btnClose = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        chkboxPass = new javax.swing.JCheckBox();
        btnLog = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEnterUsername = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txpPass = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/X.png"))); // NOI18N
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 40, 40));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Show Password");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 150, 40));

        chkboxPass.setBackground(new java.awt.Color(255, 79, 90));
        chkboxPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkboxPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkboxPassActionPerformed(evt);
            }
        });
        jPanel1.add(chkboxPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, -1, -1));

        btnLog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LoginExitted.png"))); // NOI18N
        btnLog.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLogMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLogMouseReleased(evt);
            }
        });
        jPanel1.add(btnLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 460, 110, 40));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("<html>\n<body>\n<u>Sign Up</u>\n</body>\n</html>");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 400, 60, 20));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Don't Have an Account ? Click here to");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 340, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Username");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 110, 40));

        txtEnterUsername.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEnterUsername.setForeground(new java.awt.Color(204, 204, 204));
        txtEnterUsername.setText("Enter Username");
        txtEnterUsername.setBorder(null);
        txtEnterUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEnterUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEnterUsernameFocusLost(evt);
            }
        });
        jPanel1.add(txtEnterUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 390, 50));

        jSeparator1.setBackground(java.awt.Color.gray);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 390, 20));
        jSeparator1.getAccessibleContext().setAccessibleName("jSeparator1");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 110, 40));

        txpPass.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txpPass.setForeground(new java.awt.Color(204, 204, 204));
        txpPass.setText("EnterPassword");
        txpPass.setBorder(null);
        txpPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txpPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txpPassFocusLost(evt);
            }
        });
        jPanel1.add(txpPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 390, 40));

        jSeparator2.setBackground(java.awt.Color.gray);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 390, 10));
        jSeparator2.getAccessibleContext().setAccessibleName("jSeparator2");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Please enter your information");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 440, 90));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 79, 90));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Get Vaccinated Now !");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 430, 90));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back2.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 620, 530));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackIntr(2).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 38, 1023, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnterUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnterUsernameFocusGained
        // TODO add your handling code here:
        if("Enter Username".equals(txtEnterUsername.getText())){
            txtEnterUsername.setText("");
        }
    }//GEN-LAST:event_txtEnterUsernameFocusGained

    private void txpPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txpPassFocusGained
        // TODO add your handling code here:
        if("EnterPassword".equals(String.valueOf(txpPass.getPassword()))){
            txpPass.setText("");
        }
    }//GEN-LAST:event_txpPassFocusGained

    private void txtEnterUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnterUsernameFocusLost
        // TODO add your handling code here:
        if(txtEnterUsername.getText().length()==0){
            txtEnterUsername.setText("Enter Username");
        }
    }//GEN-LAST:event_txtEnterUsernameFocusLost

    private void txpPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txpPassFocusLost
        // TODO add your handling code here:
        if(txpPass.getPassword().length==0){
            txpPass.setText("EnterPassword");
        }
    }//GEN-LAST:event_txpPassFocusLost

    private void chkboxPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkboxPassActionPerformed
        // TODO add your handling code here:
        if (chkboxPass.isSelected()) {
            txpPass.setEchoChar((char)0);
         } else {
            txpPass.setEchoChar('*');
         }
    }//GEN-LAST:event_chkboxPassActionPerformed

    private void btnLogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseEntered
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/LoginEntered.png"));
        btnLog.setIcon(icon);
    }//GEN-LAST:event_btnLogMouseEntered

    private void btnLogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseExited
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/LoginExitted.png"));
        btnLog.setIcon(icon);
    }//GEN-LAST:event_btnLogMouseExited

    private void btnLogMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMousePressed
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/LoginPressed.png"));
        btnLog.setIcon(icon);
    }//GEN-LAST:event_btnLogMousePressed

    private void btnLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseClicked
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/LoginClicked.png"));
        btnLog.setIcon(icon);
        String Username=txtEnterUsername.getText();
        String Password=String.valueOf(txpPass.getPassword());
        People log = new People(Username,Password);
        if (log.login_peep()=="admin"){ //enters admin information
            this.dispose();
            new PersonnelHome_jframe().setVisible(true);
        }
        else if(log.login_peep()=="false") //incorrect information
        {
            JOptionPane.showMessageDialog(null,"Invalid Information, Please re-enter");
        }
        else{ //enters user information
            this.dispose();
            //open partGUI
            new ParticipantHome_jframe(Integer.parseInt(log.login_peep())).setVisible(true); //pass the participant id
        }
    }//GEN-LAST:event_btnLogMouseClicked

    private void btnLogMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseReleased
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/LoginExitted.png"));
        btnLog.setIcon(icon);
    }//GEN-LAST:event_btnLogMouseReleased

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        this.dispose();
        new Register().setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCloseMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnLog;
    private javax.swing.JCheckBox chkboxPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txpPass;
    private javax.swing.JTextField txtEnterUsername;
    // End of variables declaration//GEN-END:variables
}