/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cifrado.des;

import javax.swing.JOptionPane;

/**
 *
 * @author MARIA DEL REFUGIO
 */
public class Ven_Menu extends javax.swing.JFrame {
  
    /**
     * Creates new form Ven_Menu
     */
    public Ven_Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cifrar = new javax.swing.JButton();
        Descifrar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cifrar.setBackground(new java.awt.Color(0, 255, 255));
        Cifrar.setText("Cifrar");
        Cifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CifrarActionPerformed(evt);
            }
        });
        getContentPane().add(Cifrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 108, 36));

        Descifrar.setBackground(new java.awt.Color(255, 255, 0));
        Descifrar.setText("Descifrar");
        Descifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescifrarActionPerformed(evt);
            }
        });
        getContentPane().add(Descifrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 108, 35));

        Salir.setBackground(new java.awt.Color(204, 0, 0));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("CIFRADO DES");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 210, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo (5).png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CifrarActionPerformed
        // TODO add your handling code here:
        Ven_Cifrar cifrar = new Ven_Cifrar();
        cifrar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CifrarActionPerformed

    private void DescifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescifrarActionPerformed
        // TODO add your handling code here:
        Ven_Descifrar descifrar = new Ven_Descifrar();
        descifrar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DescifrarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        int var = JOptionPane.showConfirmDialog(null, "Estas seguro de abandonar el progrma :3", "Aviso",
            JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
        if(var==0){
            System.exit(0);
        }
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(Ven_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ven_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ven_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ven_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ven_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cifrar;
    private javax.swing.JButton Descifrar;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}