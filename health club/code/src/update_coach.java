import java.sql.*;
import javax.swing.*;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * update_coach.java
 *
 * Created on Sep 24, 2010, 10:21:55 PM
 */

/**
 *
 * @author Agarwal's
 */
public class update_coach extends javax.swing.JFrame {

    /** Creates new form update_coach */
    public update_coach() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        UpdateCmdButton = new javax.swing.JButton();
        ClearCmdButton = new javax.swing.JButton();
        ExitCmdButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 30));
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("UPDATE COACH INFO");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 3, true), "ID-NAME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 153, 51))); // NOI18N
        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel2.setForeground(new java.awt.Color(204, 102, 0));
        jLabel2.setText("COACH ID");

        jTextField1.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel3.setForeground(new java.awt.Color(204, 102, 0));
        jLabel3.setText("COACH NAME");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel4.setForeground(new java.awt.Color(204, 102, 0));
        jLabel4.setText("SPORTS");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel5.setForeground(new java.awt.Color(204, 102, 0));
        jLabel5.setText("SEX");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel6.setForeground(new java.awt.Color(204, 102, 0));
        jLabel6.setText("PHONE NO.");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel7.setForeground(new java.awt.Color(204, 102, 0));
        jLabel7.setText("ADDRESS");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel8.setForeground(new java.awt.Color(204, 102, 0));
        jLabel8.setText("SALARY");

        UpdateCmdButton.setFont(new java.awt.Font("Times New Roman", 1, 18));
        UpdateCmdButton.setForeground(new java.awt.Color(204, 102, 0));
        UpdateCmdButton.setText("UPDATE");
        UpdateCmdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCmdButtonActionPerformed(evt);
            }
        });

        ClearCmdButton.setFont(new java.awt.Font("Times New Roman", 1, 18));
        ClearCmdButton.setForeground(new java.awt.Color(204, 102, 0));
        ClearCmdButton.setText("CLEAR");
        ClearCmdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearCmdButtonActionPerformed(evt);
            }
        });

        ExitCmdButton.setFont(new java.awt.Font("Times New Roman", 1, 18));
        ExitCmdButton.setForeground(new java.awt.Color(204, 102, 0));
        ExitCmdButton.setText("EXIT");
        ExitCmdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitCmdButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ClearCmdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(UpdateCmdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(ExitCmdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                                        .addGap(83, 83, 83))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(98, 98, 98)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField7)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                                .addGap(40, 40, 40))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateCmdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearCmdButton)
                    .addComponent(ExitCmdButton))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/healthclub","root","");
            String cid=(String)jList1.getSelectedValue();
            cid=cid.substring(0,3).trim();
            String sql="select * from coach where coachid="+cid;
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);

            while(rs.next()) {
                String a=rs.getString("coachid");
                String b=rs.getString("coach_name");
                String c=rs.getString("sports");
                String d=rs.getString("sex");
                String e=rs.getString("phoneno");
                String f=rs.getString("address");
                String g=rs.getString("salary");

                jTextField1.setText(a);
                jTextField2.setText(b);
                jTextField3.setText(c);
                jTextField4.setText(d);
                jTextField5.setText(e);
                jTextField6.setText(f);
                jTextField7.setText(g);

            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
            e.printStackTrace();
        }    // TODO add your handling code here:
}//GEN-LAST:event_jList1MouseClicked

    private void UpdateCmdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCmdButtonActionPerformed
        DefaultListModel model=(DefaultListModel)jList1.getModel();
        int ans = JOptionPane.showConfirmDialog(null,"ARE YOU SURE YOU WANT TO UPDATE THIS ENTRY!!!");
        if (ans == JOptionPane.YES_OPTION) {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/healthclub","root","");
                Statement stmt=con.createStatement();
                ResultSet rs=null;
                String a=jTextField2.getText();
                String b=jTextField3.getText();
                String c=jTextField4.getText();
                String d=jTextField5.getText();
                String e=jTextField6.getText();
                String f=jTextField7.getText();

                String h=jTextField1.getText();
                String sql="update coach set coach_name='"+(a)+"',sports='"+(b)+"',sex='"+(c)+"',phoneno="+(d)+",address='"+(e)+"',salary='"+(f)+"' where coachid="+(h)+"";
                stmt.executeUpdate(sql);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());}
            model.clear();
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
        } else if (ans == JOptionPane.NO_OPTION) {
            model.clear();
            this.setVisible(true);
        } else if (ans == JOptionPane.CANCEL_OPTION) {
            model.clear();
            this.setVisible(true);
        }
        // TODO add your handling code here:
}//GEN-LAST:event_UpdateCmdButtonActionPerformed

    private void ClearCmdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearCmdButtonActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");

        // TODO add your handling code here:
}//GEN-LAST:event_ClearCmdButtonActionPerformed

    private void ExitCmdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitCmdButtonActionPerformed
  this.setVisible(false);
       MainUI.setVisible(true);     // TODO add your handling code here:
}//GEN-LAST:event_ExitCmdButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
   DefaultListModel model=(DefaultListModel)jList1.getModel();
      String q1="select * from coach";
   try
   {
       Class.forName("com.mysql.jdbc.Driver").newInstance();
       Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/healthclub","root","");
       Statement stmt=con.createStatement();
       ResultSet rs=stmt.executeQuery(q1);
       while(rs.next())
       {
       String a=rs.getString("coachid");
      String b=rs.getString("coach_name");
      model.addElement(a+"  -  "+b);
     jList1.setModel(model);}}
       catch (Exception e)
       {
       JOptionPane.showMessageDialog(null, e.getMessage());}        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update_coach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearCmdButton;
    private javax.swing.JButton ExitCmdButton;
    private javax.swing.JButton UpdateCmdButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

}
