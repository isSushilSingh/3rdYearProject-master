/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapro;

import com.sun.glass.events.KeyEvent;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sushil Singh
 */
public class adminpageadvance extends javax.swing.JFrame {

    /**
     * Creates new form adminpageadvance
     */
    public adminpageadvance() {
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
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton6.setText("<<<<<<<<<<<     Back to simple version                           ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setText("Checker name  :");

        cname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cnameKeyPressed(evt);
            }
        });

        jButton1.setText("Search by name");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Show all Checkers");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Clear all Field");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete all Checkers");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Delete by name");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Names"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCellSelectionEnabled(true);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(cname)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
        new adminpage().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    cname.setText("");
    DefaultTableModel model = (DefaultTableModel)
    jTable1.getModel();
    int rows=model.getRowCount();
    if(rows>0)
    {
        for(int i=0;i<rows;i++)
        {
            model.removeRow(0);
        }
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String name = cname.getText();
    DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
    int row=model.getRowCount();
    if(row>0)
    {
        for(int i=0;i<row;i++)
            model.removeRow(0);
    }
    if(cname.getText().isEmpty())
    {
        JOptionPane.showMessageDialog(this,"Field is empty");
    }
    else
    {
        try
        {
            int count=0;
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/javapro","root","1234");
            Statement stmt = con.createStatement();
            String query = "Select name from checker where name like '%"+name+"%';";
            ResultSet rs= stmt.executeQuery(query);
            if(rs.next())
            {
                String tabledata=rs.getString("name");
                model.addRow(new Object[] {tabledata});
            }
            row = model.getRowCount();
            if(row==0)
                JOptionPane.showMessageDialog(this,"No Data Found");
        }
        catch (SQLException | ClassNotFoundException ex) 
        {
            Logger.getLogger(adminpageadvance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    cname.setText("");
    DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
    int row=model.getRowCount();
    if(row>0)
    {
        for(int i=0;i<row;i++)
        {   
            model.removeRow(0);
        }
    }    
    try
    {
        Class.forName("java.sql.DriverManager");
        Connection con=(Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/javapro","root","1234");
        Statement stmt=con.createStatement();
        stmt.executeQuery("Select name from checker where name is not null");
        //String query=("Select name from checker where name is not null");
        ResultSet rs=stmt.getResultSet();
        while(rs.next())
        {
            String tabledata=rs.getString("name");
            model.addRow(new Object[] {tabledata});
        }
    }
    catch (SQLException | ClassNotFoundException ex) 
    {
        Logger.getLogger(adminpageadvance.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    cname.setText("");
    DefaultTableModel model = (DefaultTableModel)
    jTable1.getModel();
    int rows=model.getRowCount();
    if(rows>0)
    {
        for(int i=0;i<rows;i++)
            model.removeRow(0);
    }
    try
    {
    Class.forName("java.sql.DriverManager");
    Connection con =(Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/javapro","root","1234");
    Statement stmt=(Statement) con.createStatement();
    String query="delete from checker where name like '%'";
    int roweffected=stmt.executeUpdate(query);
    if(roweffected>0)
        JOptionPane.showMessageDialog(this,"All checker get deleted");
    }
    catch (ClassNotFoundException | SQLException ex)
    {
        Logger.getLogger(adminpageadvance.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    if(cname.getText().isEmpty())
    {
        JOptionPane.showMessageDialog(this,"Checker name is empty");
    }
    else
    {
        try
        {
            String name=cname.getText();
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/javapro","root","1234");
            Statement stmt = (Statement) con.createStatement();
            String query1 = "Select count(name) as num from checker where name='"+name+"';";
            ResultSet rs=stmt.executeQuery(query1);
            int count=0;
            if(rs.next())
            {
                count=rs.getInt("num");
            }
            if(count==1)
            {
                int p=JOptionPane.showConfirmDialog(rootPane,"Do you really want to delete","Delete",JOptionPane.YES_NO_OPTION);
                if(p==0)
                {
                    try
                    {
                        Class.forName("java.sql.DriverManager");
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/javapro","root","1234");
                        String query2 = "Delete from checker where name = '"+name+"';";
                        int rowsEffected =  stmt.executeUpdate(query2);
                        if(rowsEffected==0)
                            JOptionPane.showMessageDialog(this, "Please Try Again");
                        else    
                            JOptionPane.showMessageDialog(this,"Deleted");    
                    }
                    catch(ClassNotFoundException | SQLException | HeadlessException e)
                    {   
                        JOptionPane.showMessageDialog(this, e.getMessage());
                    }
                }
            }
            else   
            {
                JOptionPane.showMessageDialog(this,"This checker is not registered");
            }
        }
        catch (ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(adminpage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }        
    cname.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnameKeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_ENTER)
    {
        String name = cname.getText();
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        int row=model.getRowCount();
        if(row>0)
        {
            for(int i=0;i<row;i++)
            model.removeRow(0);
        }
        if(cname.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Field is empty");
        }
        else
        {
            try
            {
                int count=0;
                Class.forName("java.sql.DriverManager");
                Connection con = (Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/javapro","root","1234");
                Statement stmt = con.createStatement();
                String query = "Select name from checker where name like '%"+name+"%';";
                ResultSet rs= stmt.executeQuery(query);
                if(rs.next())
                {
                    String tabledata=rs.getString("name");
                    model.addRow(new Object[] {tabledata});
                }
                row = model.getRowCount();
                if(row==0)
                    JOptionPane.showMessageDialog(this,"No Data Found");
            }
            catch (SQLException | ClassNotFoundException ex) 
            {
                Logger.getLogger(adminpageadvance.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }//GEN-LAST:event_cnameKeyPressed

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
            java.util.logging.Logger.getLogger(adminpageadvance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminpageadvance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminpageadvance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminpageadvance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminpageadvance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
