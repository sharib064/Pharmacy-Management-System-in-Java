/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacy;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author S
 */
public class feedback extends javax.swing.JFrame {

    /**
     * Creates new form User
     */
    public feedback() {
        initComponents();
        
    }
    boolean validation(){
        if(jTextArea1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter feedback");
            return false;
        }
        return true;
    }
    void InsertIntoSql() {
        try {
            Class.forName("java.sql.DriverManager");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy");
            java.sql.Statement st=con.createStatement();
            String sql="insert into feedback values('"+LoginPage.id+"','"+jTextArea1.getText()+"')";
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "Feedback Subitted");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rSButtonHover2 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover3 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover4 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover5 = new rojeru_san.complementos.RSButtonHover();
        jPanel2 = new javax.swing.JPanel();
        rSButtonHover6 = new rojeru_san.complementos.RSButtonHover();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(14, 175, 162));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacy/pharmacy.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        rSButtonHover2.setBackground(new java.awt.Color(14, 175, 162));
        rSButtonHover2.setForeground(new java.awt.Color(102, 102, 102));
        rSButtonHover2.setText("Order Now");
        rSButtonHover2.setColorHover(new java.awt.Color(255, 255, 255));
        rSButtonHover2.setColorTextHover(new java.awt.Color(102, 102, 102));
        rSButtonHover2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover2MouseClicked(evt);
            }
        });
        jPanel1.add(rSButtonHover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 250, 50));

        rSButtonHover3.setBackground(new java.awt.Color(14, 175, 162));
        rSButtonHover3.setText("View Medicine");
        rSButtonHover3.setColorHover(new java.awt.Color(255, 255, 255));
        rSButtonHover3.setColorTextHover(new java.awt.Color(102, 102, 102));
        rSButtonHover3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover3MouseClicked(evt);
            }
        });
        jPanel1.add(rSButtonHover3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 250, 50));

        rSButtonHover4.setBackground(new java.awt.Color(14, 175, 162));
        rSButtonHover4.setText("Give Feedback");
        rSButtonHover4.setColorHover(new java.awt.Color(255, 255, 255));
        rSButtonHover4.setColorText(new java.awt.Color(102, 102, 102));
        rSButtonHover4.setColorTextHover(new java.awt.Color(102, 102, 102));
        rSButtonHover4.setSelected(true);
        rSButtonHover4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover4MouseClicked(evt);
            }
        });
        rSButtonHover4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover4ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 250, -1));

        rSButtonHover5.setBackground(new java.awt.Color(14, 175, 162));
        rSButtonHover5.setText("Sign out");
        rSButtonHover5.setColorHover(new java.awt.Color(255, 51, 0));
        rSButtonHover5.setColorText(new java.awt.Color(255, 51, 0));
        rSButtonHover5.setColorTextHover(new java.awt.Color(102, 102, 102));
        rSButtonHover5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover5MouseClicked(evt);
            }
        });
        jPanel1.add(rSButtonHover5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 450));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonHover6.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonHover6.setText("X");
        rSButtonHover6.setColorHover(new java.awt.Color(255, 51, 0));
        rSButtonHover6.setColorText(new java.awt.Color(255, 51, 0));
        rSButtonHover6.setColorTextHover(new java.awt.Color(102, 102, 102));
        rSButtonHover6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover6MouseClicked(evt);
            }
        });
        jPanel2.add(rSButtonHover6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 40, 30));

        jLabel2.setFont(new java.awt.Font("Gazpacho Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(14, 175, 162));
        jLabel2.setText("Enter your feedback to send to Admin:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 470, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Gazpacho Black", 0, 16)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(14, 175, 162)));
        jTextArea1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 450, 130));

        rSButtonHover1.setBackground(new java.awt.Color(14, 175, 162));
        rSButtonHover1.setText("Submit feedback");
        rSButtonHover1.setColorHover(new java.awt.Color(102, 102, 102));
        rSButtonHover1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover1MouseClicked(evt);
            }
        });
        jPanel2.add(rSButtonHover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 150, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 550, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonHover4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover4ActionPerformed

    private void rSButtonHover6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover6MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_rSButtonHover6MouseClicked

    private void rSButtonHover2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover2MouseClicked
        // TODO add your handling code here:
        dispose();
        new User().show();
    }//GEN-LAST:event_rSButtonHover2MouseClicked

    private void rSButtonHover3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover3MouseClicked
        // TODO add your handling code here:
        dispose();
        new ViewMed().show();
    }//GEN-LAST:event_rSButtonHover3MouseClicked

    private void rSButtonHover4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover4MouseClicked
        // TODO add your handling code here:
        dispose();
        new feedback().show();
    }//GEN-LAST:event_rSButtonHover4MouseClicked

    private void rSButtonHover5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover5MouseClicked
        // TODO add your handling code here:
        dispose();
        new LoginPage().show();
    }//GEN-LAST:event_rSButtonHover5MouseClicked

    private void rSButtonHover1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover1MouseClicked
        // TODO add your handling code here:
        if(validation()){
            InsertIntoSql();
        }
    }//GEN-LAST:event_rSButtonHover1MouseClicked

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
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new feedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover2;
    private rojeru_san.complementos.RSButtonHover rSButtonHover3;
    private rojeru_san.complementos.RSButtonHover rSButtonHover4;
    private rojeru_san.complementos.RSButtonHover rSButtonHover5;
    private rojeru_san.complementos.RSButtonHover rSButtonHover6;
    // End of variables declaration//GEN-END:variables
}
