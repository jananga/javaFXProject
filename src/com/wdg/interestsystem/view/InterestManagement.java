/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wdg.interestsystem.view;

import com.wdg.interestsystem.controller.CustomerDAO;
import com.wdg.interestsystem.controller.CustomerDAOImp;
import com.wdg.interestsystem.controller.InterestDAO;
import com.wdg.interestsystem.controller.InterestDAOImp;
import com.wdg.interestsystem.model.Customer;
import com.wdg.interestsystem.model.Interest;
import com.wdg.interestsystem.util.DateFunctions;
import com.wdg.interestsystem.util.NumericFunctions;
import java.awt.Font;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author acer
 */
public class InterestManagement extends javax.swing.JPanel {

    /**
     * Creates new form InterestManagement
     */
    DefaultComboBoxModel customerModel = new DefaultComboBoxModel();

    public InterestManagement() {
        initComponents();
        //  cmbName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        //Set Date chooser Value
        dateChooser.setDate(new Date());

        txtID.setVisible(false);
        InterestTable.setSelectionModel(new InterestManagement.ForcedListSelectionModel());
        InterestTable.setRowHeight(24);
        InterestTable.setFont(new Font("Dialog", Font.BOLD, 16));

        JTableHeader header = InterestTable.getTableHeader();
        header.setFont(new Font("Dialog", Font.BOLD, 18));
        //customerTable.setFont(new Font("Serif", Font.BOLD, 20));

        //Fill the name combo box
        fillCombobox();

        // loadList();
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
        btnNew = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtInstallment = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        txtInterest = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        InterestTable = new javax.swing.JTable();
        txtID = new javax.swing.JTextField();
        cmbName = new javax.swing.JComboBox();
        dateChooser = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(230, 210, 193));

        jPanel1.setBackground(new java.awt.Color(214, 209, 205));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        btnNew.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNew.setText("Clear");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setText("Edit");

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("Insert");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Description :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Date :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Interest Management");

        txtInstallment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Amount :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Interest :");

        txtAmount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtInterest.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("Installment :");

        txtDesc.setColumns(20);
        txtDesc.setRows(5);
        jScrollPane1.setViewportView(txtDesc);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Name :");

        InterestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Date", "Amount", "Interest", "Installment", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Double.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(InterestTable);
        if (InterestTable.getColumnModel().getColumnCount() > 0) {
            InterestTable.getColumnModel().getColumn(0).setMinWidth(40);
            InterestTable.getColumnModel().getColumn(0).setMaxWidth(50);
            InterestTable.getColumnModel().getColumn(1).setMinWidth(200);
            InterestTable.getColumnModel().getColumn(1).setMaxWidth(230);
            InterestTable.getColumnModel().getColumn(2).setMinWidth(100);
            InterestTable.getColumnModel().getColumn(2).setMaxWidth(150);
            InterestTable.getColumnModel().getColumn(3).setMinWidth(120);
            InterestTable.getColumnModel().getColumn(3).setMaxWidth(150);
            InterestTable.getColumnModel().getColumn(4).setMinWidth(80);
            InterestTable.getColumnModel().getColumn(4).setMaxWidth(100);
            InterestTable.getColumnModel().getColumn(5).setMinWidth(120);
            InterestTable.getColumnModel().getColumn(5).setMaxWidth(150);
            InterestTable.getColumnModel().getColumn(6).setMinWidth(300);
            InterestTable.getColumnModel().getColumn(6).setMaxWidth(320);
        }

        cmbName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        dateChooser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(230, 230, 230)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(17, 17, 17)
                                    .addComponent(txtInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(190, 190, 190)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(27, 27, 27)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtInstallment, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(cmbName, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(210, 210, 210))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInstallment, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
          boolean res = addInterest();
        if (res) {
            clear();
            //loadList();

            JOptionPane.showMessageDialog(null, "Record inserted successfully.");

        } else {
            // JOptionPane.showMessageDialog(null, "Record insertion fail..");

        }
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed

        //Clear text fields
        clear();
    }//GEN-LAST:event_btnNewActionPerformed

    private void loadList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void fillCombobox() {

        //Clear combobox
        cmbName.removeAllItems();
        cmbName.addItem("Select Customer");
        InterestDAO intImp = new InterestDAOImp();

        List<Customer> list = intImp.fillCustomer();

        //cmbName.setModel(new javax.swing.DefaultComboBoxModel());
        // customerModel.removeAllElements();
        //Add data to combo box
        for (Customer result : list) {
            //customerModel.addElement(result);
            cmbName.addItem(result);
        }

        //cmbName.setModel(customerModel);
    }

    public class ForcedListSelectionModel extends DefaultListSelectionModel {

        public ForcedListSelectionModel() {
            setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        }

        @Override
        public void clearSelection() {
        }

        @Override
        public void removeSelectionInterval(int index0, int index1) {
        }

    }

    //Clear fields
    public void clear() {
        this.fillCombobox();
        txtAmount.setText("");
        txtInterest.setText("");
        txtInstallment.setText("");
        txtDesc.setText("");

        //Set Date chooser Value
        dateChooser.setDate(new Date());

    }

     public boolean addInterest() {

        boolean res = false;

        boolean valid = validateFields();

        /*
        if (valid) {

            String name = txtName.getText();
            String telNoOne = txtTelOne.getText().trim();
            String telNoTwo = txtTelTwo.getText().trim();

            Customer customer = new Customer();
            customer.setName(name);
            customer.setTelNoOne(telNoOne);
            customer.setTelNoTwo(telNoTwo);

            CustomerDAO customerInsert = new CustomerDAOImp();
            res = customerInsert.insertCustomer(customer);

            // JOptionPane.showMessageDialog(null, "ok");
        }
        */
        return res;

    }
    
     
     public boolean validateFields() {

        String name = cmbName.getSelectedItem().toString();
        String amount = txtAmount.getText();
        String interest = txtInterest.getText();
        String installment = txtInstallment.getText();
        String description = txtDesc.getText();

        //get Date chooser Value
        Date date = dateChooser.getDate();

        //return value
        boolean ret = false;

        String regexStr = "^[0-9]{10}$";

        if (name.trim().equals("Select Customer")) {// || name.matches(".*\\d+.*")
            JOptionPane.showMessageDialog(null, "Select Name to Insert.");
            cmbName.requestFocus();

        } else if (!DateFunctions.isDate(date)){//(!telNoOne.matches(regexStr)) && (!telNoOne.trim().equals(""))) 
       
            JOptionPane.showMessageDialog(null, "Enter valid Date.");
            dateChooser.requestFocus();

        } else if ((!NumericFunctions.numberOrNot(amount))){//matches(regexStr)) && (!telNoTwo.trim().equals(""))) {
            JOptionPane.showMessageDialog(null, "Enter valid Amount.");
            txtAmount.requestFocus();

        } else if ((!NumericFunctions.intOrNot(interest))){//matches(regexStr)) && (!telNoTwo.trim().equals(""))) {
            JOptionPane.showMessageDialog(null, "Enter valid Interest.");
            txtInterest.requestFocus();

        } else if (installment.equals("")){//matches(regexStr)) && (!telNoTwo.trim().equals(""))) {
            JOptionPane.showMessageDialog(null, "Enter valid Details.");
            txtAmount.requestFocus();

        } else {
            ret = true;
        }

        return ret;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable InterestTable;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cmbName;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtInstallment;
    private javax.swing.JTextField txtInterest;
    // End of variables declaration//GEN-END:variables
}
