
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Abhi
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public Login() {
        initComponents();
        unAuth.setVisible(false);
        noInternetConnectionLabel.setVisible(false);
        setVisible(true);
    }

    private boolean netIsAvailable() {
//        try {
//            final URL url = new URL("http://www.google.com");
//            final URLConnection conn = url.openConnection();
//            conn.connect();
//            conn.getInputStream().close();
//            return true;
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
        return true;
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        unAuth = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        passwordLabel = new javax.swing.JLabel();
        signinButton = new javax.swing.JButton();
        customerLoginButton = new javax.swing.JButton();
        noInternetConnectionLabel = new javax.swing.JLabel();
        aboutButton = new javax.swing.JButton();
        walpaper = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.POPUP);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("Authentication"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        title.setBackground(new java.awt.Color(0, 0, 0));
        title.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("<BikeService.h>");

        usernameLabel.setBackground(new java.awt.Color(0, 0, 0));
        usernameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Username");

        unAuth.setBackground(new java.awt.Color(0, 0, 0));
        unAuth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        unAuth.setForeground(new java.awt.Color(255, 0, 0));
        unAuth.setText("unAuthorized Credentials");

        username.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        passwordLabel.setBackground(new java.awt.Color(0, 0, 0));
        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password");

        signinButton.setBackground(new java.awt.Color(51, 51, 255));
        signinButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        signinButton.setText("Sign-in");
        signinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinButtonActionPerformed(evt);
            }
        });

        customerLoginButton.setBackground(new java.awt.Color(0, 0, 0));
        customerLoginButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        customerLoginButton.setForeground(new java.awt.Color(255, 255, 255));
        customerLoginButton.setText("Customer-Login");
        customerLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerLoginButtonActionPerformed(evt);
            }
        });

        noInternetConnectionLabel.setBackground(new java.awt.Color(0, 0, 0));
        noInternetConnectionLabel.setForeground(new java.awt.Color(255, 255, 0));
        noInternetConnectionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noInternetConnectionLabel.setText("Internet Connection Required");

        aboutButton.setBackground(new java.awt.Color(255, 255, 255));
        aboutButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        aboutButton.setText("About");
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });

        walpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZMR.jpg"))); // NOI18N

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/010_x-3-512.png"))); // NOI18N
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(0, 0, 0)
                .add(walpaper)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(103, 103, 103)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .add(unAuth)
                                .add(68, 68, 68))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(76, 76, 76)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(1, 1, 1)
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(usernameLabel)
                                            .add(password, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 98, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(passwordLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .add(jPanel1Layout.createSequentialGroup()
                                                .add(username, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .add(0, 0, Short.MAX_VALUE))))
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                            .add(signinButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                            .add(customerLoginButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 223, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(42, 42, 42))
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .add(noInternetConnectionLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 193, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(59, 59, 59))))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(title)
                                .add(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .add(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(aboutButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(closeButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(walpaper, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 728, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(title)
                        .add(1, 1, 1)
                        .add(noInternetConnectionLabel)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(usernameLabel)
                            .add(username, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(3, 3, 3)
                        .add(unAuth)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(passwordLabel)
                            .add(password, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(signinButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(52, 52, 52)
                        .add(customerLoginButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(closeButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 72, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(aboutButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinButtonActionPerformed
        // TODO add your handling code here:

        noInternetConnectionLabel.setVisible(true);
        if (netIsAvailable() && username.getText().equals("")) {
            noInternetConnectionLabel.setVisible(false);
            setVisible(false);
            dispose();
            Service_log service = new Service_log();
            service.setVisible(true);
        } else if (netIsAvailable() && !username.getText().equals("")) {
            noInternetConnectionLabel.setVisible(false);
            unAuth.setVisible(true);
        } else {
            noInternetConnectionLabel.setVisible(true);
        }
    }//GEN-LAST:event_signinButtonActionPerformed

    private void customerLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerLoginButtonActionPerformed
        // TODO add your handling code here:

        noInternetConnectionLabel.setVisible(true);
        if (netIsAvailable()) {
            noInternetConnectionLabel.setVisible(false);
            CustomerView view = new CustomerView();
            view.setVisible(true);
        } else {
            noInternetConnectionLabel.setVisible(true);
        }

    }//GEN-LAST:event_customerLoginButtonActionPerformed

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        // TODO add your handling code here:
        About aboutPage = new About();
        aboutPage.setVisible(true);

    }//GEN-LAST:event_aboutButtonActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton customerLoginButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel noInternetConnectionLabel;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton signinButton;
    private javax.swing.JLabel title;
    private javax.swing.JLabel unAuth;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel walpaper;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
