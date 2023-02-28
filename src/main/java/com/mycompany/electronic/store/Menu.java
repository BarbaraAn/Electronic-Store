/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.electronic.store;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author barba
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    static ArrayList<String> errors = new ArrayList<String>();
    dbconnect db;
    public Menu() {
        initComponents();
        
        //Ελεγχος αν εχει ηδη γινει συνδεση με τη βαση
        if (db == null) {
            //Αν δεν εχει γινει, τοτε επιχειρηση συνδεσης
            db = new dbconnect(this);
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

        ordersButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        suppliersButton = new javax.swing.JButton();
        stockButton = new javax.swing.JButton();
        staffButton = new javax.swing.JButton();
        logButton = new javax.swing.JButton();
        customersButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Μενου");
        setResizable(false);

        ordersButton.setText("Παραγγελιες Πελατων");
        ordersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Εξοδος");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        suppliersButton.setText("Προμηθευτες");
        suppliersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppliersButtonActionPerformed(evt);
            }
        });

        stockButton.setText("Αποθεμα");
        stockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockButtonActionPerformed(evt);
            }
        });

        staffButton.setText("Προσωπικο");
        staffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffButtonActionPerformed(evt);
            }
        });

        logButton.setText("Διαγνωστικα");
        logButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logButtonActionPerformed(evt);
            }
        });

        customersButton.setText("Πελατολογιο");
        customersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customersButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ordersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(staffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suppliersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logButton, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ordersButton, suppliersButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suppliersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ordersButton, suppliersButton});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        //Εξοδος του προγραμματος
        db.dbclose(this);
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void stockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockButtonActionPerformed
        //Δημιουργια νεου παραθυρου
        JFrame frame = new JFrame();
        //Φορτωση πανω στο νεο παραθυρο τo JFrame Stock
        Stock gui = new Stock();
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //Απενεργοποιηση του [χ]
        frame.setContentPane(gui);
        frame.pack();
        frame.setResizable(false); //Δεν μπορει να αλλαξει το μεγεθος
        frame.setLocationRelativeTo(null); //Για να ανοιγει στο κεντρο της οθονης
        frame.setTitle("Αποθεμα"); //Ονομασια του παραθυρου
        frame.setVisible(true);
        //Εξαφανιση του μενου
        this.dispose();
    }//GEN-LAST:event_stockButtonActionPerformed

    private void suppliersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppliersButtonActionPerformed
        //Δημιουργια νεου παραθυρου
        JFrame frame = new JFrame();
        //Φορτωση πανω στο νεο παραθυρο τo JFrame Suppliers
        Suppliers gui = new Suppliers();
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //Απενεργοποιηση του [χ]
        frame.setContentPane(gui);
        frame.pack();
        frame.setResizable(false); //Δεν μπορει να αλλαξει το μεγεθος
        frame.setLocationRelativeTo(null); //Για να ανοιγει στο κεντρο της οθονης
        frame.setTitle("Προμηθευτες"); //Ονομασια του παραθυρου
        frame.setVisible(true);
        //Εξαφανιση του μενου
        this.dispose();
    }//GEN-LAST:event_suppliersButtonActionPerformed

    private void ordersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersButtonActionPerformed
        //Δημιουργια νεου παραθυρου
        JFrame frame = new JFrame();
        //Φορτωση πανω στο νεο παραθυρο τo JFrame Orders
        Orders gui = new Orders();
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //Απενεργοποιηση του [χ]
        frame.setContentPane(gui);
        frame.pack();
        frame.setResizable(false); //Δεν μπορει να αλλαξει το μεγεθος
        frame.setLocationRelativeTo(null); //Για να ανοιγει στο κεντρο της οθονης
        frame.setTitle("Παραγγελιες Πελατων"); //Ονομασια του παραθυρου
        frame.setVisible(true);
        //Εξαφανιση του μενου
        this.dispose();
    }//GEN-LAST:event_ordersButtonActionPerformed

    private void staffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffButtonActionPerformed
        //Δημιουργια νεου παραθυρου
        JFrame frame = new JFrame();
        //Φορτωση πανω στο νεο παραθυρο τo JFrame Staff
        Staff gui = new Staff();
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //Απενεργοποιηση του [χ]
        frame.setContentPane(gui);
        frame.pack();
        frame.setResizable(false); //Δεν μπορει να αλλαξει το μεγεθος
        frame.setLocationRelativeTo(null); //Για να ανοιγει στο κεντρο της οθονης
        frame.setTitle("Προσωπικο"); //Ονομασια του παραθυρου
        frame.setVisible(true);
        //Εξαφανιση του μενου
        this.dispose();
    }//GEN-LAST:event_staffButtonActionPerformed

    private void customersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersButtonActionPerformed
        //Δημιουργια νεου παραθυρου
        JFrame frame = new JFrame();
        //Φορτωση πανω στο νεο παραθυρο τo JFrame Customers
        Customers gui = new Customers();
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //Απενεργοποιηση του [χ]
        frame.setContentPane(gui);
        frame.pack();
        frame.setResizable(false); //Δεν μπορει να αλλαξει το μεγεθος
        frame.setLocationRelativeTo(null); //Για να ανοιγει στο κεντρο της οθονης
        frame.setTitle("Πελατολογιο"); //Ονομασια του παραθυρου
        frame.setVisible(true);
        //Εξαφανιση του μενου
        this.dispose();
    }//GEN-LAST:event_customersButtonActionPerformed

    private void logButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logButtonActionPerformed
        //Δημιουργια νεου παραθυρου
        JFrame frame = new JFrame();
        //Φορτωση πανω στο νεο παραθυρο τo JFrame Log
        Log gui = new Log();
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //Απενεργοποιηση του [χ]
        frame.setContentPane(gui);
        frame.pack();
        frame.setResizable(false); //Δεν μπορει να αλλαξει το μεγεθος
        frame.setLocationRelativeTo(null); //Για να ανοιγει στο κεντρο της οθονης
        frame.setTitle("Διαγνωστικα"); //Ονομασια του παραθυρου
        frame.setVisible(true);
        //Εξαφανιση του μενου
        this.dispose();
    }//GEN-LAST:event_logButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton customersButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton logButton;
    private javax.swing.JButton ordersButton;
    private javax.swing.JButton staffButton;
    private javax.swing.JButton stockButton;
    private javax.swing.JButton suppliersButton;
    // End of variables declaration//GEN-END:variables
}
