/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.interfaz;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GABRIEL
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio1
     */
    public Principal() {
        initComponents();
        txtNumeroFilasYColumnas.setEditable(true);
        cmdCrear.setEnabled(true);
        cmdLlenarAuto.setEnabled(false);
        cmdCalcular.setEnabled(false);
        cmdLimpiar.setEnabled(false);
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumeroFilasYColumnas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenarAuto = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdCalcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaResultado = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("MATRIZ - DIAGONAL SECUNDARIA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos iniciales:"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("No. de filas y columnas:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        jPanel2.add(txtNumeroFilasYColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 37, 50, 25));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 250, 100));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Acciones:"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 27, 75, 30));

        cmdLlenarAuto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdLlenarAuto.setText("LlenarAuto");
        cmdLlenarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarAutoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlenarAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 27, 100, 30));

        cmdLimpiar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 63, 100, 30));

        cmdCalcular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 63, 75, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 250, 110));

        tblTablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTablaResultado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 250, 190));

        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTablaInicial);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 250, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(641, 473));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        // TODO add your handling code here:
        try {
            int nc, nf;
            DefaultTableModel tm, tm2;
            nf = Integer.parseInt(txtNumeroFilasYColumnas.getText());
            nc = nf;
            tm = (DefaultTableModel) tblTablaInicial.getModel();
            tm2 = (DefaultTableModel) tblTablaResultado.getModel();
            if (nf > 10) {
                JOptionPane.showMessageDialog(this, "Por favor considere 10 como el número máximo para filas y columnas.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                txtNumeroFilasYColumnas.setText("");
                txtNumeroFilasYColumnas.requestFocusInWindow();
            }
            else {
                JOptionPane.showMessageDialog(this, "Matriz creada exitosamente.");
                tm.setRowCount(nf);
                tm.setColumnCount(nc);
                tm2.setRowCount(nf);
                tm2.setColumnCount(nc);
                txtNumeroFilasYColumnas.setEditable(false);
                cmdCrear.setEnabled(false);
                cmdLlenarAuto.setEnabled(true);
                cmdLimpiar.setEnabled(true);
            }
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Campo Inválido.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtNumeroFilasYColumnas.setText("");
            txtNumeroFilasYColumnas.requestFocusInWindow();
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLlenarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarAutoActionPerformed
        // TODO add your handling code here:
        int nf, nc, n;
        nf = tblTablaInicial.getRowCount();
        nc = tblTablaInicial.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                n = (int)(Math.random() * 50 + 1);
                tblTablaInicial.setValueAt(n, i, j);
            }
        }
        cmdCalcular.setEnabled(true);
    }//GEN-LAST:event_cmdLlenarAutoActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        // TODO add your handling code here:
        int nf, nc, aux;
        nf = tblTablaInicial.getRowCount();
        nc = tblTablaInicial.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int)tblTablaInicial.getValueAt(i, j);
                if (i == (nf-1) - j) {
                    tblTablaResultado.setValueAt(aux, i, j);
                }
            }
        }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tm, tm2;
        tm = (DefaultTableModel) tblTablaInicial.getModel();
        tm2 = (DefaultTableModel) tblTablaResultado.getModel();
        tm.setRowCount(0);
        tm.setColumnCount(0);
        tm2.setRowCount(0);
        tm2.setColumnCount(0);
        txtNumeroFilasYColumnas.setEditable(true);
        cmdCrear.setEnabled(true);
        cmdLlenarAuto.setEnabled(false);
        cmdCalcular.setEnabled(false);
        cmdLimpiar.setEnabled(false);
        txtNumeroFilasYColumnas.setText("");
        txtNumeroFilasYColumnas.requestFocusInWindow();
    }//GEN-LAST:event_cmdLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdLlenarAuto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTable tblTablaResultado;
    private javax.swing.JTextField txtNumeroFilasYColumnas;
    // End of variables declaration//GEN-END:variables
}
