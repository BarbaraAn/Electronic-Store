/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electronic.store;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author theocharis
 */
public class dbconnect {
    static String driverClassName = "org.postgresql.Driver";
    static String url = "jdbc:postgresql://dblabs.iee.ihu.gr:5432/it185139"; 
    static String username = "it185139";
    static String password = "tbd2022";
    static Connection con = null;
    static Statement statement = null;
    static ResultSet rs = null;
    static ResultSetMetaData rsmd = null;
    
    public dbconnect(JFrame frame) {
        try {
            //Επειχηρηση συνδεσης με τη βαση
            Class.forName(driverClassName);
            con = DriverManager.getConnection(url,username,password);
        } catch(Exception ex) {
            //Μηνυμα λαθους αν δεν συνδεθει στη βαση
            JOptionPane.showMessageDialog(((JFrame) SwingUtilities.getWindowAncestor(frame)), "Προβλημα συνδεσης με τη βαση! Error: " + ex,
                     "Προβλημα Συνδεσης", JOptionPane.ERROR_MESSAGE);
            Menu.errors.add(ex.toString());
        }
      
    }
    
    public void dbclose(JFrame frame) {
        try {
            //Επειχηρηση αποσυνδεσης με τη βαση
            con.close();
        } catch(Exception ex) {
            //Μηνυμα λαθους αν δεν αποσυνδεθει απο τη βαση
            JOptionPane.showMessageDialog(((JFrame) SwingUtilities.getWindowAncestor(frame)), "Προβλημα αποσυνδεσης απο τη βαση! Error: " + ex,
                     "Προβλημα Αποσυνδεσης", JOptionPane.ERROR_MESSAGE);
            Menu.errors.add(ex.toString());
        }
    }
    
    //Γεμιζει ο πινακας με το εκαστοτε query
    public static void populateTable(String query, JTable table, int filter) {
        try {
            statement = con.createStatement();
            rs = statement.executeQuery(query);
            rsmd = rs.getMetaData();
            
            //Αδειαζει ο πινακας απο τα δεδομενα του
            while(table.getRowCount() > 0) { ((DefaultTableModel) table.getModel()).removeRow(0);}
            
            //Αριθμος των στηλων
            int columns = rsmd.getColumnCount();
            
            //Ονοματιση των στηλων
            String colNames[] = new String[columns];
            for (int i = 1; i <= colNames.length; i++) {
                colNames[i-1] = rsmd.getColumnName(i); 
            }
            DefaultTableModel model = new DefaultTableModel(colNames, 0);
            table.setModel(model);
            
            
            //Προσθηκη δεδομενων στον πινακα
            while(rs.next()) {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {  
                    row[i - 1] = rs.getObject(i);
                }
                //Ελεγχος αν εχει καποιο φιλτρο, η αν ειναι αποδεκτο το αποτελεσμα
                if (pass(row, filter)) {
                    ((DefaultTableModel) table.getModel()).insertRow(rs.getRow()-1,row);
                }
            }
            
        } catch(Exception ex) {
            Menu.errors.add(ex.toString());
        }
    }
    
    //Φιλτραρισμα αποτελεσματων
    public static boolean pass(Object[] row, int filter) {
        switch (filter) {
            case 1: return true;
            default: return false;
        }
    }
}
    
    

