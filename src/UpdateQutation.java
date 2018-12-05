
import java.sql.CallableStatement;
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
public class UpdateQutation extends javax.swing.JFrame {

    /**
     * Creates new form updateQutation
     */
    public UpdateQutation() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        quotationTable = new javax.swing.JTable();
        regLabel = new javax.swing.JLabel();
        regnoTextField = new javax.swing.JTextField();
        costBefore = new javax.swing.JTextField();
        costForBefore = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        beforeLabel = new javax.swing.JLabel();
        afterLabel = new javax.swing.JLabel();
        costAfter = new javax.swing.JTextField();
        costLabel = new javax.swing.JLabel();
        costForLabel = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        costLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quotation Update");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        quotationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reg-No", "Cost", "Cost for"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        quotationTable.setEnabled(false);
        jScrollPane1.setViewportView(quotationTable);

        regLabel.setText("Registration number");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        beforeLabel.setText("Before");

        afterLabel.setText("After");

        costLabel.setText("Cost");

        costForLabel.setText("Cost for");

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        costLabel1.setText("Cost");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(regLabel)
                        .addGap(18, 18, 18)
                        .addComponent(regnoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(beforeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(costBefore, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(costLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(costForLabel)
                                    .addComponent(costForBefore, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21))
                            .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(afterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(costLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(costAfter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updateButton)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regLabel)
                    .addComponent(regnoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costLabel)
                    .addComponent(costForLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costBefore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costForBefore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beforeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(costLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(afterLabel)
                    .addComponent(costAfter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton))
                .addGap(100, 100, 100))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        Connect bill = new Connect();
        int found = 0, z = 0, i;
        String rNo = regnoTextField.getText();
        DefaultTableModel quotationTab = (DefaultTableModel) quotationTable.getModel();
        try {
            Object[][] row = bill.billQuotation();
            for (i = 0; i < bill.quotationTable2RowCount; i++) {
                if ((row[i][0]).toString().equalsIgnoreCase(rNo)) {
                    found = 1;
                    quotationTab.setNumRows(i + 1);
                    quotationTab.setValueAt(row[i][0], z, 0);
                    quotationTab.setValueAt(row[i][1], z, 1);
                    quotationTab.setValueAt(row[i][2], z, 2);
                    z++;
                }
            }
            quotationTab.setNumRows(z);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (found != 1) {
            quotationTab.setNumRows(0);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        String beforeCostString = costBefore.getText();
        String beforeCostFor = costForBefore.getText();
        String afterCostString = costAfter.getText();
        String regno = regnoTextField.getText();

        if (!beforeCostString.isEmpty() && !afterCostString.isEmpty()) {
            int beforeCost = Integer.parseInt(beforeCostString);
            int afterCost = Integer.parseInt(afterCostString);
            Connect call = new Connect();
            CallableStatement stmt;
            try {
                stmt = call.c.prepareCall("{call bike_service.update_quotation_proc(?, ?, ?, ?)}");
                stmt.setString(1, regno);
                stmt.setInt(2, beforeCost);
                stmt.setString(3, beforeCostFor);
                stmt.setInt(4, afterCost);
                stmt.executeQuery();

            } catch (SQLException ex) {
                Logger.getLogger(DeleteRecords.class.getName()).log(Level.SEVERE, null, ex);
            }
            searchButtonActionPerformed(evt);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        String beforeCostString = costBefore.getText();
        String beforeCostFor = costForBefore.getText();
        String regno = regnoTextField.getText();

        if (!beforeCostString.isEmpty()) {
            int beforeCost = Integer.parseInt(beforeCostString);
            Connect call = new Connect();
            CallableStatement stmt;
            try {
                stmt = call.c.prepareCall("{call bike_service.delete_quotation_proc(?, ?, ?)}");
                stmt.setString(1, regno);
                stmt.setInt(2, beforeCost);
                stmt.setString(3, beforeCostFor);
                stmt.executeQuery();
            } catch (SQLException ex) {
                Logger.getLogger(DeleteRecords.class.getName()).log(Level.SEVERE, null, ex);
            }
            searchButtonActionPerformed(evt);            
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateQutation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateQutation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateQutation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateQutation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateQutation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel afterLabel;
    private javax.swing.JLabel beforeLabel;
    private javax.swing.JTextField costAfter;
    private javax.swing.JTextField costBefore;
    private javax.swing.JTextField costForBefore;
    private javax.swing.JLabel costForLabel;
    private javax.swing.JLabel costLabel;
    private javax.swing.JLabel costLabel1;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable quotationTable;
    private javax.swing.JLabel regLabel;
    private javax.swing.JTextField regnoTextField;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
