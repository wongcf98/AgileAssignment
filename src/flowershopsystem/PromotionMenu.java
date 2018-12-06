/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershopsystem;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

/**
 *
 * @author scollex
 */
public class PromotionMenu extends javax.swing.JFrame {

    /**
     * Creates new form PromotionMenu
     */
    Promotion tempPromo;
    private Product p;

    public PromotionMenu() {
        initComponents();
        populateTable();
        jDateChooser1.setDate(new Date());
        loadProductIntoDDL();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        lblProd = new java.awt.Label();
        lblProd1 = new java.awt.Label();
        lblProd2 = new java.awt.Label();
        lblProd3 = new java.awt.Label();
        txtPrice = new javax.swing.JTextField();
        txtDiscountRate = new javax.swing.JTextField();
        txtDiscountPrice = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Promotion Menu");

        jButton1.setBackground(new java.awt.Color(51, 153, 0));
        jButton1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("d - MMMM - yyyy");
        jDateChooser1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Initial Price", "Amount", "Discount %", "Discounted Price", "Start Date", "End Date"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        lblProd.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblProd.setText("Product");

        lblProd1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblProd1.setText("Price");

        lblProd2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblProd2.setText("Discount %");

        lblProd3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblProd3.setText("Discount Price");

        txtPrice.setEnabled(false);

        txtDiscountRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiscountRateActionPerformed(evt);
            }
        });

        txtDiscountPrice.setEnabled(false);

        jDateChooser2.setDateFormatString("d - MMMM - yyyy");
        jDateChooser2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        label1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        label1.setText("Start Date");

        label2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        label2.setText("End Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblProd1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblProd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblProd2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(lblProd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDiscountRate, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDiscountPrice))
                                .addGap(53, 53, 53))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(28, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblProd1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrice))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDiscountRate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDiscountPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProd3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblProd.getAccessibleContext().setAccessibleName("Product");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            System.out.println(jDateChooser1.getCalendar().get(Calendar.YEAR));
            int start_year = jDateChooser1.getCalendar().get(Calendar.YEAR);
            System.out.println(jDateChooser1.getCalendar().get(Calendar.MONTH) + 1);
            int start_month = jDateChooser1.getCalendar().get(Calendar.MONTH) + 1;
            System.out.println(jDateChooser1.getCalendar().get(Calendar.DAY_OF_MONTH));
            int start_day = jDateChooser1.getCalendar().get(Calendar.DAY_OF_MONTH);
            System.out.println(jDateChooser1.getCalendar().get(Calendar.YEAR));
            int end_year = jDateChooser2.getCalendar().get(Calendar.YEAR);
            System.out.println(jDateChooser2.getCalendar().get(Calendar.MONTH) + 1);
            int end_month = jDateChooser2.getCalendar().get(Calendar.MONTH) + 1;
            System.out.println(jDateChooser2.getCalendar().get(Calendar.DAY_OF_MONTH));
            int end_day = jDateChooser2.getCalendar().get(Calendar.DAY_OF_MONTH);

            Calendar start_cal = Calendar.getInstance();
            start_cal.set(Calendar.YEAR, start_year);
            start_cal.set(Calendar.MONTH, start_month);
            start_cal.set(Calendar.DAY_OF_MONTH, start_day);

            Calendar end_cal = Calendar.getInstance();
            end_cal.set(Calendar.YEAR, end_year);
            end_cal.set(Calendar.MONTH, end_month);
            end_cal.set(Calendar.DAY_OF_MONTH, end_day);
            Promotion promo;
            if (end_cal.before(start_cal)) {
                JOptionPane.showMessageDialog(this, "Date invalid!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            } else {
                promo = new Promotion(p, Integer.parseInt(txtDiscountRate.getText()), Float.parseFloat(txtDiscountPrice.getText()), start_cal, end_cal);
                MainMenu.promotionList.add(promo);
                populateTable();
                MainMenu.prodList.remove(p);
                loadProductIntoDDL();
                txtDiscountPrice.setText(null);
                txtDiscountRate.setText(null);
                txtPrice.setText(null);
                jDateChooser2.setDate(null);

            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Please fill in all the field", "Input Incomplete", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String prod = (String.valueOf(jComboBox1.getSelectedItem()));
        for (int i = 0; i < MainMenu.prodList.size(); i++) {
            if (prod.equalsIgnoreCase(MainMenu.prodList.get(i).getName())) {
                p = MainMenu.prodList.get(i);
                txtPrice.setText(String.valueOf(p.getPrice()));
            }
            System.out.println(prod);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtDiscountRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiscountRateActionPerformed
        // TODO add your handling code here:
        try {
            float price = Float.parseFloat(txtPrice.getText());
            int rate = Integer.parseInt(txtDiscountRate.getText());
            float discountPrice = price - (price * rate / 100);
            txtDiscountPrice.setText(String.valueOf(discountPrice));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Data input error", "Input Unsuccesfull", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtDiscountRateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String product = model.getValueAt(index, 0).toString();
        String price = model.getValueAt(index, 1).toString();
        String amt = model.getValueAt(index, 2).toString();
        String rate = model.getValueAt(index, 3).toString();
        String discountedPrice = model.getValueAt(index, 4).toString();
        String start_date = model.getValueAt(index, 5).toString();
        int sYear = Integer.parseInt(start_date.substring(0, 4));
        int sMonth = Integer.parseInt(start_date.substring(5, 7)) - 1;
        int sDay = Integer.parseInt(start_date.substring(8, 10));
        Calendar sDate = Calendar.getInstance();
        sDate.set(sYear, sMonth, sDay);
        String end_Date = model.getValueAt(index, 6).toString();
        int eYear = Integer.parseInt(end_Date.substring(0, 3));
        int eMonth = Integer.parseInt(end_Date.substring(5, 7)) - 1;
        int eDay = Integer.parseInt(end_Date.substring(8, 10));
        Calendar eDate = Calendar.getInstance();
        eDate.set(eYear, eMonth, eDay);

        Product p = new Product(product, Integer.parseInt(amt), Float.parseFloat(price));
        tempPromo = new Promotion(p, Integer.parseInt(rate), Float.parseFloat(discountedPrice),
                sDate, eDate);

        jComboBox1.addItem(product);
        jComboBox1.setSelectedItem(product);
        txtPrice.setText(price);
        txtDiscountPrice.setText(discountedPrice);
        txtDiscountRate.setText(rate);
        jDateChooser1.setCalendar(sDate);
        jDateChooser2.setCalendar(eDate);

    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(PromotionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PromotionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PromotionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PromotionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PromotionMenu().setVisible(true);
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
            java.util.logging.Logger.getLogger(PromotionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PromotionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PromotionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PromotionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PromotionMenu().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label lblProd;
    private java.awt.Label lblProd1;
    private java.awt.Label lblProd2;
    private java.awt.Label lblProd3;
    private javax.swing.JTextField txtDiscountPrice;
    private javax.swing.JTextField txtDiscountRate;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables

    private void loadProductIntoDDL() {
        jComboBox1.removeAllItems();
        jComboBox1.addItem(" ");
        for (int i = 0; i < MainMenu.prodList.size(); i++) {
            jComboBox1.addItem(new ComboItem(MainMenu.prodList.get(i).name, MainMenu.prodList.get(i).name));
            System.out.println("Add");
        }

    }

    private void populateTable() {
        String[] columnNames = new String[]{"Product", "Initial Price", "Amount", "Discount %",
            "Discounted Price", "Start Time", "End Time"};
        DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i < MainMenu.promotionList.size(); i++) {
            format.format(MainMenu.promotionList.get(i).startDate.getTime());
            p = MainMenu.promotionList.get(i).prod;
            Object[] data = {p.name, p.price, p.amt, MainMenu.promotionList.get(i).discount, 
                MainMenu.promotionList.get(i).discountedPrice,
                format.format(MainMenu.promotionList.get(i).startDate.getTime()), format.format(MainMenu.promotionList.get(i).endDate.getTime())};
            dm.insertRow(i, data);
        }
        jTable1.setModel(dm);
    }
}
