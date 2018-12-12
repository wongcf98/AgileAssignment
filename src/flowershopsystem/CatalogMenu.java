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
 * @author scollex
 */
public class CatalogMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public DefaultTableModel dm;

    public CatalogMenu() {
        initComponents();
        customizeColumSize();
        loadDataIntoTable();

    }

    private void loadDataIntoTable() {
        dm = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < MainMenu.prodList.size(); i++) {
            Object[] data = {MainMenu.prodList.get(i).name, MainMenu.prodList.get(i).amt,
                MainMenu.prodList.get(i).price};
            dm.addRow(data);
        }

    }

    private void customizeColumSize() {
        TableColumn col = null;
        for (int i = 0; i < 3; i++) {
            col = jTable1.getColumnModel().getColumn(i);
            if (i == 0) {
                col.setPreferredWidth(200);
            } else {
                col.setPreferredWidth(50);
            }
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

        btnAdd = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jcbCat = new javax.swing.JComboBox<String>();
        lblProdName = new javax.swing.JLabel();
        lblAmt = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        jtfProdPrice = new javax.swing.JTextField();
        jtfAmt = new javax.swing.JTextField();
        jtfProdName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Catalog Menu");

        btnAdd.setBackground(new java.awt.Color(51, 153, 0));
        btnAdd.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnAdd.setText("Add new Product");
        btnAdd.setMaximumSize(new java.awt.Dimension(195, 35));
        btnAdd.setMinimumSize(new java.awt.Dimension(195, 35));
        btnAdd.setPreferredSize(btnEdit.getPreferredSize());
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDel.setBackground(new java.awt.Color(187, 0, 51));
        btnDel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnDel.setText("Delete Catalog");
        btnDel.setEnabled(false);
        btnDel.setPreferredSize(btnEdit.getPreferredSize());
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnEdit.setText("Edit Product ");
        btnEdit.setEnabled(false);
        btnEdit.setMaximumSize(new java.awt.Dimension(195, 35));
        btnEdit.setMinimumSize(new java.awt.Dimension(195, 35));
        btnEdit.setPreferredSize(btnEdit.getPreferredSize());
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Amount", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setAutoscrolls(false);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jcbCat.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jcbCat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Flower", "Hand Bouquete", "Rose Bouquete", "Table Flowers", "Floral Arrangement", " " }));
        jcbCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCatActionPerformed(evt);
            }
        });

        lblProdName.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        lblProdName.setText("Product Name");

        lblAmt.setFont(lblProdName.getFont());
        lblAmt.setText("Amount");

        lblPrice.setFont(lblProdName.getFont());
        lblPrice.setText("Price");

        jtfAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAmtActionPerformed(evt);
            }
        });

        jtfProdName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfProdNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel1.setText("RM");

        jLabel3.setFont(lblProdName.getFont());
        jLabel3.setText("Category");

        jButton1.setText("Promotion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblProdName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAmt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfProdName)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfAmt)
                            .addComponent(jcbCat, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(jButton1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAmt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jcbCat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            TableModel model = jTable1.getModel();
            int index = jTable1.getSelectedRow();

            String n = jtfProdName.getText();
            int amt = Integer.parseInt(jtfAmt.getText());
            float price = Float.parseFloat(jtfProdPrice.getText());

            model.setValueAt(n, index, 0);
            model.setValueAt(amt, index, 1);
            model.setValueAt(price, index, 2);

            Product p = new Product(n, amt, price);
            MainMenu.prodList.get(index).name = n;
            MainMenu.prodList.get(index).amt = amt;
            MainMenu.prodList.get(index).price = price;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Data input error", "Input Unsuccesfull", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(this, "Record updated", "Edit sucessful", JOptionPane.INFORMATION_MESSAGE);
        jtfProdName.setText(null);
        jtfAmt.setText(null);
        jtfProdPrice.setText(null);
        btnEdit.setEnabled(false);
        btnDel.setEnabled(false);
        btnAdd.setEnabled(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        try {
            dm = (DefaultTableModel) jTable1.getModel();
            int index = jTable1.getSelectedRow();

            String n = jtfProdName.getText();
            int amt = Integer.parseInt(jtfAmt.getText());
            float price = Float.parseFloat(jtfProdPrice.getText());
            Product p = new Product(n, amt, price);

            dm.removeRow(index);

            MainMenu.prodList.remove(index);

            jtfAmt.setText(null);
            jtfProdName.setText(null);
            jtfProdPrice.setText(null);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Delete Uncessful", "Delete Unsuccesfull", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(this, "Record deleted", "Delete sucessful", JOptionPane.INFORMATION_MESSAGE);
        jtfProdName.setText(null);
        jtfAmt.setText(null);
        jtfProdPrice.setText(null);
        btnEdit.setEnabled(false);
        btnDel.setEnabled(false);
        btnAdd.setEnabled(true);
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        saveIntoArray();
        dm = (DefaultTableModel) jTable1.getModel();
        try {
            Object[] data = {jtfProdName.getText(), Integer.parseInt(jtfAmt.getText()), Float.valueOf(jtfProdPrice.getText())};
            dm.addRow(data);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Data input error", "Input Unsuccesfull", JOptionPane.ERROR_MESSAGE);
        }

        jtfAmt.setText(null);
        jtfProdName.setText(null);
        jtfProdPrice.setText(null);

    }//GEN-LAST:event_btnAddActionPerformed

    private void saveIntoArray() {
        try {
            String n = jtfProdName.getText();
            int amt = Integer.parseInt(jtfAmt.getText());
            float price = Float.parseFloat(jtfProdPrice.getText());
            Product p = new Product(n, amt, price);
            if (MainMenu.prodList.add(p)) {
                JOptionPane.showMessageDialog(this, "Product added");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Data input error", "Input Unsuccesfull", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        btnEdit.setEnabled(true);
        btnDel.setEnabled(true);
        btnAdd.setEnabled(false);
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String name = model.getValueAt(index, 0).toString();
        String amt = model.getValueAt(index, 1).toString();
        String price = model.getValueAt(index, 2).toString();

        jtfProdName.setText(name);
        jtfAmt.setText(amt);
        jtfProdPrice.setText(price);

    }//GEN-LAST:event_jTable1MouseClicked


    private void jcbCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCatActionPerformed

    private void jtfAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAmtActionPerformed

    private void jtfProdNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfProdNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfProdNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new PromotionMenu().setNimbus();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CatalogMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatalogMenu().setVisible(true);

            }
        });
    }

    public void setNimbus() {
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
            java.util.logging.Logger.getLogger(CatalogMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatalogMenu().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcbCat;
    private javax.swing.JTextField jtfAmt;
    private javax.swing.JTextField jtfProdName;
    private javax.swing.JTextField jtfProdPrice;
    private javax.swing.JLabel lblAmt;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProdName;
    // End of variables declaration//GEN-END:variables

}
