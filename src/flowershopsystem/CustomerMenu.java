/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershopsystem;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

/**
 *
 * @author Acer
 */
public class CustomerMenu extends javax.swing.JFrame {

    /**
     * Creates new form CustomerMenu
     */
    
    public static ArrayList<Customer> custList = new ArrayList<>();
    public DefaultTableModel dm;
    
    public CustomerMenu() {
        initComponents();
        loadDataIntoTable();
    }
    
     private void loadDataIntoTable() {
        dm = (DefaultTableModel) jTable1.getModel();
        Customer cust = new Customer("C001","WONG HAO CHUNG","010-2052345","wong@gmail.com","Consumer",0,0);
        custList.add(cust);

        for (int i = 0; i < custList.size(); i++) {
            Object[] data = {custList.get(i).id,custList.get(i).name,custList.get(i).contact,custList.get(i).email,custList.get(i).custType,custList.get(i).currentLimit,custList.get(i).monthlyLimit};
            dm.addRow(data);
         
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jtfID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfCustName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfContact = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcbCustType = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jtfCCL = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfMCL = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnAddCust = new javax.swing.JButton();
        btnEditCust = new javax.swing.JButton();
        btnDeleteCust = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Menu");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Customer Name", "Contact Number", "E-mail", "Customer Type", "Current Credit Limit", "Monthly Credit Limit"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Customer ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Customer Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Contact No.");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("E-mail");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Customer Type");

        jcbCustType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbCustType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Customer Type", "Consumer", "Corporate Customer" }));
        jcbCustType.setToolTipText("");
        jcbCustType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCustTypeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Current Credit Limit");

        jtfCCL.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("RM");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Monthly Credit Limit");

        jtfMCL.setText("0");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("RM");

        btnAddCust.setFont(new java.awt.Font("Audiowide", 1, 18)); // NOI18N
        btnAddCust.setText("Add Customer");
        btnAddCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustActionPerformed(evt);
            }
        });

        btnEditCust.setFont(new java.awt.Font("Audiowide", 1, 18)); // NOI18N
        btnEditCust.setText("Edit Customer");
        btnEditCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCustActionPerformed(evt);
            }
        });

        btnDeleteCust.setFont(new java.awt.Font("Audiowide", 1, 18)); // NOI18N
        btnDeleteCust.setText("Delete Customer");
        btnDeleteCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCustActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(352, 352, 352))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(213, 213, 213)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(326, 326, 326))
                                .addComponent(jLabel5)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(187, 187, 187)
                                    .addComponent(jcbCustType, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8)
                                            .addComponent(btnAddCust))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel7)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jtfCCL, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel9)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jtfMCL, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnEditCust))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtfCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtfContact, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteCust)
                        .addGap(132, 132, 132))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jcbCustType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtfCCL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jtfMCL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddCust, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditCust, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteCust, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbCustTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCustTypeActionPerformed

        
        if(jcbCustType.getSelectedIndex() == 1)
        {
            String zero = "0";
            jtfCCL.setVisible(false);
            jtfMCL.setVisible(false);
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            jLabel9.setVisible(false);
           jtfCCL.setText(zero);
            jtfMCL.setText(zero);
        }
        if(jcbCustType.getSelectedIndex() == 2){
             jtfCCL.setVisible(true);
            jtfMCL.setVisible(true);
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
            jLabel9.setVisible(true);
        }
            
    }//GEN-LAST:event_jcbCustTypeActionPerformed

    private void btnAddCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustActionPerformed
         saveArray();
         dm = (DefaultTableModel) jTable1.getModel();
        try {
            Object[] data = {jtfID.getText(), jtfCustName.getText(), jtfContact.getText(),jtfEmail.getText(),jcbCustType.getSelectedItem().toString(),jtfMCL.getText(),jtfMCL.getText()};
            dm.addRow(data);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Data input error", "Input Unsuccesfull", JOptionPane.ERROR_MESSAGE);
        }

        jtfID.setText(null);
        jtfCustName.setText(null);
        jtfContact.setText(null);
        jtfEmail.setText(null);
        jtfCCL.setText(null);
        jtfMCL.setText(null);
        jcbCustType.setSelectedIndex(0);
    }//GEN-LAST:event_btnAddCustActionPerformed

    private void btnEditCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCustActionPerformed
         btnEditCust.setEnabled(false);
        try {
            TableModel model = jTable1.getModel();
            int index = jTable1.getSelectedRow();

            String id = jtfID.getText();
            String name = jtfCustName.getText();
            String contact = jtfContact.getText();
            String email = jtfEmail.getText();
            String type = jcbCustType.getSelectedItem().toString();
            int ccl = Integer.parseInt(jtfCCL.getText());
            int mcl = Integer.parseInt(jtfMCL.getText());
            
            model.setValueAt(id, index, 0);
            model.setValueAt(name, index, 1);
            model.setValueAt(contact, index, 2);
            model.setValueAt(email, index, 3);
            model.setValueAt(type,index, 4);
            model.setValueAt(mcl, index, 5);
            model.setValueAt(mcl, index, 6);

             Customer c = new Customer(id,name,contact,email,type,mcl,mcl);
             custList.get(index).id = id;
            custList.get(index).name = name;
            custList.get(index).contact = contact;
            custList.get(index).email = email;
            custList.get(index).custType = type;
            custList.get(index).currentLimit = mcl;
            custList.get(index).monthlyLimit = mcl;
            
            JOptionPane.showMessageDialog(this, "Customer Details have been updated successfully.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Data input error", "Input Unsuccesful", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditCustActionPerformed

    private void btnDeleteCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCustActionPerformed
           try {
            dm = (DefaultTableModel) jTable1.getModel();
            int index = jTable1.getSelectedRow();

            String id = jtfID.getText();
            String name = jtfCustName.getText();
            String contact = jtfContact.getText();
            String email = jtfEmail.getText();
            String type = jcbCustType.getSelectedItem().toString();
            int ccl = Integer.parseInt(jtfCCL.getText());
            int mcl = Integer.parseInt(jtfMCL.getText());
          Customer c = new Customer(id,name,contact,email,type,ccl,mcl);

            dm.removeRow(index);

            custList.remove(index);

           jtfID.setText(null);
        jtfCustName.setText(null);
        jtfContact.setText(null);
        jtfEmail.setText(null);
        jtfCCL.setText(null);
        jtfMCL.setText(null);
         JOptionPane.showMessageDialog(this, "Customer Details have been deleted successfully.");
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Delete Unsucessful", "Delete Unsuccessful", JOptionPane.ERROR_MESSAGE);
        }

        btnDeleteCust.setEnabled(false);
    }//GEN-LAST:event_btnDeleteCustActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      btnEditCust.setEnabled(true);
        btnDeleteCust.setEnabled(true);
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String id = model.getValueAt(index, 0).toString();
        String name = model.getValueAt(index, 1).toString();
        String contact = model.getValueAt(index, 2).toString();
        String email = model.getValueAt(index, 3).toString();
        String type = model.getValueAt(index, 4).toString();
        String ccl = model.getValueAt(index, 5).toString();
        String mcl= model.getValueAt(index, 6).toString();

        jtfID.setText(id);
        jtfCustName.setText(name);
        jtfContact.setText(contact);
        jtfEmail.setText(email);
        jtfCCL.setText(ccl);
        if(type == "Consumer")
            jcbCustType.setSelectedIndex(1);
        else
            jcbCustType.setSelectedIndex(2);
        jtfMCL.setText(mcl);
        btnAddCust.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        btnAddCust.setEnabled(true);
    }//GEN-LAST:event_formMouseClicked

     private void saveArray() {
        try {
            String id = jtfID.getText();
            String name = jtfCustName.getText();
            String contact = jtfContact.getText();
            String email = jtfEmail.getText();
            String type = jcbCustType.getSelectedItem().toString();
            
            int mcl = Integer.parseInt(jtfMCL.getText());
           Customer c = new Customer(id,name,contact,email,type,mcl,mcl);
            if (CustomerMenu.custList.add(c)) {
                JOptionPane.showMessageDialog(this, "Customer added");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Data input error", "Input Unsuccesfull", JOptionPane.ERROR_MESSAGE);
        }
    }              
     
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
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCust;
    private javax.swing.JButton btnDeleteCust;
    private javax.swing.JButton btnEditCust;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcbCustType;
    private javax.swing.JTextField jtfCCL;
    private javax.swing.JTextField jtfContact;
    private javax.swing.JTextField jtfCustName;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfMCL;
    // End of variables declaration//GEN-END:variables
}
