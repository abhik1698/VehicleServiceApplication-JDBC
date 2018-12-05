
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
public class Service_log extends javax.swing.JFrame {

    private Connection c;
    private static final String serverPath = "jdbc:mysql://localhost:3306/bike_service";
    private static final String username = "root";
    private static final String password = "root";

    /**
     * Creates new form Service_log
     */
    public Service_log() {
        initComponents();
        addedLabel.setVisible(false);
        allVehiclesEnrolledLabel.setVisible(false);
        allVehicleSummaryTable.setVisible(false);
        viewQuotationButton.setVisible(false);

        c = null;

        try {

            c = DriverManager.getConnection(serverPath, username, password);
            System.out.println("connected");

        } catch (Exception e) {
            System.err.println(e);
        }

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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        serviceLogPanel = new javax.swing.JPanel();
        vehicleDeliveryTab = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        vmTable = new javax.swing.JTable();
        AddVehicleButton = new javax.swing.JButton();
        addedLabel = new javax.swing.JLabel();
        deleteBikeModel = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        rsTable = new javax.swing.JTable();
        placeOrderButton = new javax.swing.JButton();
        orderPlacedLabel = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        qTable = new javax.swing.JTable();
        addBillButton = new javax.swing.JButton();
        updateQuotationLabel = new javax.swing.JLabel();
        editQuotationButton = new javax.swing.JButton();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        searchVehicleText = new javax.swing.JTextField();
        searchVehicleButton = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        vehicleSummaryTable = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        allVehicleSummaryTable = new javax.swing.JTable();
        allVehiclesEnrolledLabel = new javax.swing.JLabel();
        viewQuotationButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        signOut = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("Service Vendor Application"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        vmTable.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        vmTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Bike Name", "Registration No", "Color", "Kilometers run"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        vmTable.setColumnSelectionAllowed(true);
        vmTable.setInheritsPopupMenu(true);
        jScrollPane1.setViewportView(vmTable);
        vmTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        AddVehicleButton.setText("Add Vehicle");
        AddVehicleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddVehicleButtonActionPerformed(evt);
            }
        });

        addedLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        deleteBikeModel.setText("Remove Vehicle Record");
        deleteBikeModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBikeModelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1194, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(AddVehicleButton)
                        .addGap(26, 26, 26)
                        .addComponent(deleteBikeModel))
                    .addComponent(addedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(568, 568, 568))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddVehicleButton)
                    .addComponent(deleteBikeModel))
                .addGap(18, 18, 18)
                .addComponent(addedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(354, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(AddVehicleButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(addedLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(deleteBikeModel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane2.addTab("Vehicle Model", jLayeredPane1);

        rsTable.setBorder(new javax.swing.border.MatteBorder(null));
        rsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Customer Name", "Bike Name", "Reg No", "Repair Category", "Customer Complaints"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(rsTable);

        placeOrderButton.setText("Place ORDER");
        placeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButtonActionPerformed(evt);
            }
        });

        orderPlacedLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1194, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(placeOrderButton)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(orderPlacedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(511, 511, 511))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(placeOrderButton)
                .addGap(18, 18, 18)
                .addComponent(orderPlacedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(349, Short.MAX_VALUE))
        );
        jLayeredPane2.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(placeOrderButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(orderPlacedLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane2.addTab("Required Service", jLayeredPane2);

        qTable.setBorder(new javax.swing.border.MatteBorder(null));
        qTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Reg No", "cost", "for"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        qTable.setColumnSelectionAllowed(true);
        jScrollPane4.setViewportView(qTable);

        addBillButton.setText("Add to BILL");
        addBillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBillButtonActionPerformed(evt);
            }
        });

        updateQuotationLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        editQuotationButton.setText("Edit Quotation");
        editQuotationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editQuotationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1194, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addComponent(addBillButton)
                .addGap(35, 35, 35)
                .addComponent(editQuotationButton))
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addComponent(updateQuotationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(338, 338, 338))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBillButton)
                    .addComponent(editQuotationButton))
                .addGap(18, 18, 18)
                .addComponent(updateQuotationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(360, Short.MAX_VALUE))
        );
        jLayeredPane3.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(addBillButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(updateQuotationLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(editQuotationButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane2.addTab("Quotation", jLayeredPane3);

        vehicleDeliveryTab.addTab("Vehicle Intake", jTabbedPane2);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Search Vehicle");

        searchVehicleText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchVehicleTextActionPerformed(evt);
            }
        });
        searchVehicleText.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                searchVehicleTextPropertyChange(evt);
            }
        });

        searchVehicleButton.setText("Search");
        searchVehicleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchVehicleButtonActionPerformed(evt);
            }
        });

        vehicleSummaryTable.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        vehicleSummaryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Bike Name", "Bike Color", "Vehicle No", "Kilometers Run", "Repair Category", "Customer Complaints", "Total Bill"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        vehicleSummaryTable.setEnabled(false);
        jScrollPane5.setViewportView(vehicleSummaryTable);

        allVehicleSummaryTable.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        allVehicleSummaryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Bike Name", "Bike Color", "Vehicle No", "Time Stamp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        allVehicleSummaryTable.setEnabled(false);
        jScrollPane6.setViewportView(allVehicleSummaryTable);

        allVehiclesEnrolledLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        allVehiclesEnrolledLabel.setText("Customers Record");

        viewQuotationButton.setText("View Quotation");
        viewQuotationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewQuotationButtonActionPerformed(evt);
            }
        });

        jLabel2.setText(" (registration number)");

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allVehiclesEnrolledLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jLayeredPane4Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(searchVehicleText, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(searchVehicleButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewQuotationButton))
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(searchVehicleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchVehicleButton)
                            .addComponent(jLabel2))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(viewQuotationButton)
                        .addGap(1, 1, 1)))
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(allVehiclesEnrolledLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane4.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(searchVehicleText, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(searchVehicleButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jScrollPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jScrollPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(allVehiclesEnrolledLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(viewQuotationButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        vehicleDeliveryTab.addTab("Vehicle Summary", jLayeredPane4);

        javax.swing.GroupLayout serviceLogPanelLayout = new javax.swing.GroupLayout(serviceLogPanel);
        serviceLogPanel.setLayout(serviceLogPanelLayout);
        serviceLogPanelLayout.setHorizontalGroup(
            serviceLogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serviceLogPanelLayout.createSequentialGroup()
                .addComponent(vehicleDeliveryTab, javax.swing.GroupLayout.PREFERRED_SIZE, 1204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        serviceLogPanelLayout.setVerticalGroup(
            serviceLogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vehicleDeliveryTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        signOut.setBackground(new java.awt.Color(0, 0, 0));
        signOut.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        signOut.setForeground(new java.awt.Color(255, 255, 255));
        signOut.setText("Sign out");
        signOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serviceLogPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(signOut)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(serviceLogPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(signOut))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int i = 1;
    int q = 0;
    private void addBillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBillButtonActionPerformed
        // TODO add your handling code here:        
        DefaultTableModel model = (DefaultTableModel) qTable.getModel();

        try {
            String reg_no = model.getValueAt(0, 0).toString().toUpperCase();
            String costString = model.getValueAt(0, 1).toString();
            int cost = Integer.parseInt(costString);
            String cost_for = model.getValueAt(0, 2).toString();

            String query = "insert into bill_quotation(registration_no, cost, cost_for) values(?, ?, ?)";
            PreparedStatement preparedStmt = c.prepareStatement(query);

            preparedStmt.setString(1, reg_no);
            preparedStmt.setInt(2, cost);
            preparedStmt.setString(3, cost_for);

            preparedStmt.execute();
            updateQuotationLabel.setVisible(true);
            if (q % 2 == 0) {
                updateQuotationLabel.setText("Quotation updated -");
            } else {
                updateQuotationLabel.setText("Quotation updated +");
            }
            q++;
        } catch (Exception e) {
            updateQuotationLabel.setVisible(true);
            updateQuotationLabel.setText(e.toString());
        }

    }//GEN-LAST:event_addBillButtonActionPerformed
    int p = 0;
    private void placeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) rsTable.getModel();
        try {
            String customer_name = model.getValueAt(0, 0).toString();
            String bike_name = model.getValueAt(0, 1).toString();
            String reg_no = model.getValueAt(0, 2).toString().toUpperCase();
            String repair_category = model.getValueAt(0, 3).toString();
            String customer_complaints = model.getValueAt(0, 4).toString();

            String query = "insert into service(customer_name, bike_name, registration_no, repair_category, customer_complaints) values(?, ?, ?, ?, ?)";
            PreparedStatement preparedStmt = c.prepareStatement(query);

            preparedStmt.setString(1, customer_name);
            preparedStmt.setString(2, bike_name);
            preparedStmt.setString(3, reg_no);
            preparedStmt.setString(4, repair_category);
            preparedStmt.setString(5, customer_complaints);

            preparedStmt.execute();

            orderPlacedLabel.setVisible(true);
            if (p % 2 == 0) {
                orderPlacedLabel.setText("Order Placed -");
            } else {
                orderPlacedLabel.setText("Order Placed +");
            }
            p++;
        } catch (Exception e) {

            orderPlacedLabel.setVisible(true);
            orderPlacedLabel.setText(e.toString());
        }
        searchVehicleButtonActionPerformed(evt);
    }//GEN-LAST:event_placeOrderButtonActionPerformed
    int z = 0;
    private void AddVehicleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddVehicleButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) vmTable.getModel();
        try {
            String bike_name = model.getValueAt(0, 0).toString();
            String reg_no = model.getValueAt(0, 1).toString().toUpperCase();
            String color = model.getValueAt(0, 2).toString();
            String kilometers = model.getValueAt(0, 3).toString();

            String query = "insert into bike_model(bike_name, registration_no, bike_color, kilometers_run) values(?, ?, ?, ?)";
            PreparedStatement preparedStmt = c.prepareStatement(query);

            preparedStmt.setString(1, bike_name);
            preparedStmt.setString(2, reg_no);
            preparedStmt.setString(3, color);
            preparedStmt.setString(4, kilometers);

            preparedStmt.execute();

            addedLabel.setVisible(true);

            if (z % 2 == 0) {
                addedLabel.setText("Vehicle Model added to the record successfully +");
            } else {
                addedLabel.setText("Vehicle Model added to the record successfully -");
            }
            z++;
        } catch (Exception e) {
            addedLabel.setVisible(true);
            addedLabel.setText(e.toString());
        }

    }//GEN-LAST:event_AddVehicleButtonActionPerformed

    private void signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        setVisible(false);
        dispose();
        l.setVisible(true);
    }//GEN-LAST:event_signOutActionPerformed


    private void searchVehicleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchVehicleButtonActionPerformed
        // TODO add your handling code here:
        String search = searchVehicleText.getText();

        Connect myConnection = new Connect();

        try {
            Object[][] row;
            Object[][] allVehicleRow;
            row = myConnection.vehicleSummary(search);
            DefaultTableModel summaryTable = (DefaultTableModel) vehicleSummaryTable.getModel();
            DefaultTableModel allVehicleSummaryTab = (DefaultTableModel) allVehicleSummaryTable.getModel();
            allVehicleSummaryTab.setNumRows(0);
            if (!search.isEmpty() && row.length != 0) {
                viewQuotationButton.setVisible(true);
                summaryTable.setNumRows(1);
                for (int k = 0; k < 8; k++) {
                    summaryTable.setValueAt(row[0][k], 0, k);
                }
            }
            allVehiclesEnrolledLabel.setVisible(true);
            allVehicleSummaryTable.setVisible(true);
            allVehicleRow = myConnection.allVehicleSummary();
            for (i = 0; i < myConnection.totalVehicles; i++) {
                allVehicleSummaryTab.setRowCount(i + 1);
                for (int j = 0; j <= 4; j++) {
                    allVehicleSummaryTab.setValueAt(allVehicleRow[i][j], i, j);

                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Service_log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchVehicleButtonActionPerformed

    private void searchVehicleTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchVehicleTextActionPerformed
        // TODO add your handling code here:     
    }//GEN-LAST:event_searchVehicleTextActionPerformed

    private void searchVehicleTextPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_searchVehicleTextPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_searchVehicleTextPropertyChange

    private void viewQuotationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewQuotationButtonActionPerformed
        // TODO add your handling code here:        
        CustomerView forQuotation = new CustomerView();
        forQuotation.setVisible(true);
    }//GEN-LAST:event_viewQuotationButtonActionPerformed

    private void deleteBikeModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBikeModelActionPerformed

        // TODO add your handling code here:
        DeleteRecords d = new DeleteRecords();
        d.setVisible(true);

    }//GEN-LAST:event_deleteBikeModelActionPerformed

    private void editQuotationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editQuotationButtonActionPerformed
        // TODO add your handling code here:
        UpdateQutation u = new UpdateQutation();
        u.setVisible(true);
    }//GEN-LAST:event_editQuotationButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Service_log.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Service_log.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Service_log.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Service_log.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Service_log().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddVehicleButton;
    private javax.swing.JButton addBillButton;
    private javax.swing.JLabel addedLabel;
    private javax.swing.JTable allVehicleSummaryTable;
    private javax.swing.JLabel allVehiclesEnrolledLabel;
    private javax.swing.JButton deleteBikeModel;
    private javax.swing.JButton editQuotationButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel orderPlacedLabel;
    private javax.swing.JButton placeOrderButton;
    private javax.swing.JTable qTable;
    private javax.swing.JTable rsTable;
    private javax.swing.JButton searchVehicleButton;
    private javax.swing.JTextField searchVehicleText;
    private javax.swing.JPanel serviceLogPanel;
    private javax.swing.JButton signOut;
    private javax.swing.JLabel updateQuotationLabel;
    private javax.swing.JTabbedPane vehicleDeliveryTab;
    private javax.swing.JTable vehicleSummaryTable;
    private javax.swing.JButton viewQuotationButton;
    private javax.swing.JTable vmTable;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
