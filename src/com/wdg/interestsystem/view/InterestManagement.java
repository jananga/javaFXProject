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
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

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

        //Load interest
        loadList();

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
        txtInstallment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInstallmentActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Amount :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Interest :");

        txtAmount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtInterest.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtInterest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInterestKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInterestKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("Installment :");

        txtDesc.setColumns(20);
        txtDesc.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtDesc.setRows(5);
        jScrollPane1.setViewportView(txtDesc);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Name :");

        InterestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "IntID", "Name", "Date", "Amount", "Interest", "Installment", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        InterestTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InterestTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(InterestTable);
        if (InterestTable.getColumnModel().getColumnCount() > 0) {
            InterestTable.getColumnModel().getColumn(0).setMinWidth(40);
            InterestTable.getColumnModel().getColumn(0).setMaxWidth(50);
            InterestTable.getColumnModel().getColumn(1).setMinWidth(70);
            InterestTable.getColumnModel().getColumn(1).setPreferredWidth(70);
            InterestTable.getColumnModel().getColumn(1).setMaxWidth(100);
            InterestTable.getColumnModel().getColumn(3).setMinWidth(100);
            InterestTable.getColumnModel().getColumn(3).setMaxWidth(150);
            InterestTable.getColumnModel().getColumn(4).setMinWidth(120);
            InterestTable.getColumnModel().getColumn(4).setMaxWidth(150);
            InterestTable.getColumnModel().getColumn(5).setMinWidth(80);
            InterestTable.getColumnModel().getColumn(5).setMaxWidth(100);
            InterestTable.getColumnModel().getColumn(6).setMinWidth(120);
            InterestTable.getColumnModel().getColumn(6).setMaxWidth(150);
        }

        cmbName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        dateChooser.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jLabel7)
                                .addGap(15, 15, 15)
                                .addComponent(cmbName, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(140, 140, 140)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtInstallment, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 22, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(txtInterest, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInstallment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        boolean res = addInterest();
        if (res) {
            clear();
            loadList();

            JOptionPane.showMessageDialog(null, "Record inserted successfully.");

        } else {
            // JOptionPane.showMessageDialog(null, "Record insertion fail..");

        }


    }//GEN-LAST:event_btnAddActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed

        //Clear text fields
        clear();
    }//GEN-LAST:event_btnNewActionPerformed

    private void txtInterestKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInterestKeyTyped

    }//GEN-LAST:event_txtInterestKeyTyped

    private void txtInterestKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInterestKeyReleased
        //Perform the calculation
        calculation();
    }//GEN-LAST:event_txtInterestKeyReleased

    private void InterestTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InterestTableMouseClicked

        //fill text Fields
        fillTextBox();
    }//GEN-LAST:event_InterestTableMouseClicked

    private void txtInstallmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInstallmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInstallmentActionPerformed

    private void loadList() {

        InterestDAO interestList = new InterestDAOImp();

        List<Interest> list = interestList.listAll();

        DefaultTableModel dtm = (DefaultTableModel) InterestTable.getModel();

        dtm.setRowCount(0);
        int i = 1;
        for (Interest interest : list) {

            Object[] obj = {i++, interest.getId(), interest.getCustomer(), interest.getDate(), interest.getAmount(), interest.getInterest(), interest.getInstallment(), interest.getDescription()};
            dtm.addRow(obj);

        }

    }

    public void fillTextBox() {
        // Get selected Row Value
        //JOptionPane.showMessageDialog(null, "Calles");
        int index = InterestTable.getSelectedRow();

        TableModel tbModel = InterestTable.getModel();

        //int indexForcombo = (int) tbModel.getValueAt(index, 1);
        int intID = (int) tbModel.getValueAt(index, 1);
        Customer cusName = (Customer) tbModel.getValueAt(index, 2);
        //JOptionPane.showMessageDialog(null, "Selected Row cus name: "+cusName);

        Date date = (Date) tbModel.getValueAt(index, 3);
        double amount = (double) tbModel.getValueAt(index, 4);
        double interest = (double) tbModel.getValueAt(index, 5);
        double installment = (double) tbModel.getValueAt(index, 6);
        String desc = (String) tbModel.getValueAt(index, 7);

        System.out.println("CUstomer : " + cusName);

        //Set values to text Boxes
        txtID.setText(String.valueOf(intID));
        cmbName.getModel().setSelectedItem(cusName);
        txtAmount.setText(String.valueOf(amount));
        txtInterest.setText(String.valueOf(interest));
        txtInstallment.setText(String.valueOf(installment));
        txtDesc.setText(String.valueOf(desc));
        dateChooser.setDate(date);

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
        txtID.setText("");
        //Set Date chooser Value
        dateChooser.setDate(new Date());

    }

    public boolean addInterest() {

        boolean res = false;

        String id = txtID.getText();

        if (!id.equals("")) {
            JOptionPane.showMessageDialog(null, "Record already Inserted.");
        } else {
            boolean valid = validateFields();

            if (valid) {

                Customer name = (Customer) cmbName.getSelectedItem();
                double amount = Double.parseDouble(txtAmount.getText());
                double interest = Double.parseDouble(txtInterest.getText());
                double installment = Double.parseDouble(txtInstallment.getText());
                String description = txtDesc.getText();

                //Get date
                Date date = dateChooser.getDate();

                Interest interests = new Interest();
                interests.setCustomer(name);

                interests.setInterest(interest);
                interests.setInstallment(installment);
                interests.setDescription(description);
                interests.setAmount(amount);

                java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                interests.setDate(sqlDate);

                InterestDAO InsertManage = new InterestDAOImp();
                res = InsertManage.insertInterest(interests);

                // JOptionPane.showMessageDialog(null, "ok");
            }
        }
        return res;

    }
    
      public boolean editInterest() {

        boolean res = false;
        int cusid = 0;

        if (txtID.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Select Interest to Update.");

        } else {
            cusid = Integer.parseInt(txtID.getText());

        }

        boolean valid = validateFields();

        if (valid) {

            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would You Like to Update the record ?", "Warning", dialogButton);

            if (dialogResult == JOptionPane.YES_OPTION) {

                String name = cmbName.getSelectedItem().toString();
                String amount = txtAmount.getText();
                String interest = txtInterest.getText();
                String installment = txtInstallment.getText();
                String description = txtDesc.getText();

                /*
                
                Interest interests = new Interest();
                interests.setId(cusid);
                interests.setName(name);
                interests.setTelNoOne(telNoOne);
                interests.setTelNoTwo(telNoTwo);

                CustomerDAO customerInsert = new CustomerDAOImp();
                res = customerInsert.updateCustomer(customer);

*/
            }
            // JOptionPane.showMessageDialog(null, "ok");
        }

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

        } else if (!DateFunctions.isDate(date)) {//(!telNoOne.matches(regexStr)) && (!telNoOne.trim().equals(""))) 

            JOptionPane.showMessageDialog(null, "Enter valid Date.");
            dateChooser.requestFocus();

        } else if ((!NumericFunctions.numberOrNot(amount))) {//matches(regexStr)) && (!telNoTwo.trim().equals(""))) {
            JOptionPane.showMessageDialog(null, "Enter valid Amount.");
            txtAmount.requestFocus();

        } else if ((!NumericFunctions.numberOrNot(interest))) {//matches(regexStr)) && (!telNoTwo.trim().equals(""))) {
            JOptionPane.showMessageDialog(null, "Enter valid Interest.");
            txtInterest.requestFocus();

        } else if (installment.equals("")) {//matches(regexStr)) && (!telNoTwo.trim().equals(""))) {
            JOptionPane.showMessageDialog(null, "Please calculate Installment.");
            txtAmount.requestFocus();

        } else {
            ret = true;
        }

        return ret;
    }

    public void calculation() {

        //Get values to calculate Interest
        String amount = txtAmount.getText();
        String interest = txtInterest.getText();
        txtInstallment.setText("");

        if ((!NumericFunctions.numberOrNot(amount))) {//matches(regexStr)) && (!telNoTwo.trim().equals(""))) {
            JOptionPane.showMessageDialog(null, "Enter valid Amount.");
            txtAmount.requestFocus();

        } else if ((!NumericFunctions.numberOrNot(interest))) {//matches(regexStr)) && (!telNoTwo.trim().equals(""))) {
            JOptionPane.showMessageDialog(null, "Enter valid Interest.");
            txtInterest.requestFocus();

        } else {

            double instalment = Double.parseDouble(amount) * Double.parseDouble(interest) * 0.01;
            txtInstallment.setText(String.valueOf(instalment));

        }

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
