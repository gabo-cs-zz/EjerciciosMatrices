/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
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
        txtNumeroFilas.setEditable(true);
        JButton botonesT[] = {cmdCrear, cmdLimpiar};
        JButton botonesF[] = {cmdLlenadoManual, cmdLlenadoAuto, cmdCalcular};
        Helper.habilitarBotones(botonesT);
        Helper.deshabilitarBotones(botonesF);
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
        txtNumeroFilas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumeroColumnas = new javax.swing.JTextField();
        cmbOperacion = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenadoAuto = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdCalcular = new javax.swing.JButton();
        cmdLlenadoManual = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaResultado = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("MATRICES - OPERACIONES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos iniciales:"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("No. de filas:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 25, -1, -1));
        jPanel2.add(txtNumeroFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 22, 50, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Operación:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 95, -1, -1));
        jPanel2.add(txtNumeroColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 55, 50, 25));

        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diagonal Secundaria", "Triangular Superior", "Triangular Inferior", "MatrizTraspuesta", "Letra A", "Letra Z", "Letra T", "Letra V", "Letra E", "Letra F", "Letra P", "Letra I", "Letra N", "Letra Y", "Letra X" }));
        jPanel2.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 115, 150, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("No. de columnas:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 250, 160));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Acciones:"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 27, 75, 30));

        cmdLlenadoAuto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdLlenadoAuto.setText("LlenarAuto");
        cmdLlenadoAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoAutoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlenadoAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 27, 110, 30));

        cmdLimpiar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 100, 30));

        cmdCalcular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 70, 75, 30));

        cmdLlenadoManual.setText("LlenarManual");
        cmdLlenadoManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoManualActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlenadoManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 70, 110, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 250, 160));

        tblTablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTablaResultado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 250, 190));

        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTablaInicial);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 250, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(641, 521));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        // TODO add your handling code here:
        try {
            int nc, nf, op;
            DefaultTableModel tm, tm2;
            nf = Integer.parseInt(txtNumeroFilas.getText());
            nc = Integer.parseInt(txtNumeroColumnas.getText());
            tm = (DefaultTableModel) tblTablaInicial.getModel();
            tm2 = (DefaultTableModel) tblTablaResultado.getModel();
            op = cmbOperacion.getSelectedIndex();
            if (nf < 2 || nc < 2) {
                Helper.mensaje(this, "Por favor considere 2 como el mínimo para filas y columnas.", 2);
                txtNumeroFilas.setText("");
                txtNumeroColumnas.setText("");
                txtNumeroFilas.requestFocusInWindow();
            }
            else if (nf > 10 || nc > 10) {
                Helper.mensaje(this, "Por favor considere 10 como el máximo para filas y columnas.", 2);
                txtNumeroFilas.setText("");
                txtNumeroColumnas.setText("");
                txtNumeroFilas.requestFocusInWindow();
            }
            else if ((nf != nc) && op < 3) {
                Helper.mensaje(this, "Para la operación elegida, el número de filas debe ser igual al número de columnas.", 3);
                txtNumeroFilas.setText("");
                txtNumeroColumnas.setText("");
                txtNumeroFilas.requestFocusInWindow();
            }
            else if (op == 4 && (nf < 4 || nc < 4)) {
                Helper.mensaje(this, "Por favor considere 4 como el mínimo de filas y columnas para formar la letra A.", 2);
                txtNumeroFilas.setText("");
                txtNumeroColumnas.setText("");
                txtNumeroFilas.requestFocusInWindow();
            }
            else {
                Helper.mensaje(this, "Matriz creada exitosamente.", 1);
                if (op == 3) {
                    tm.setRowCount(nf);
                    tm.setColumnCount(nc);
                    tm2.setRowCount(nc);
                    tm2.setColumnCount(nf);
                }
                else {
                    tm.setRowCount(nf);
                    tm.setColumnCount(nc);
                    tm2.setRowCount(nf);
                    tm2.setColumnCount(nc);
                }
                txtNumeroFilas.setEditable(false);
                txtNumeroColumnas.setEditable(false);
                JButton botonesT[] = {cmdLlenadoManual, cmdLlenadoAuto, cmdLimpiar};
                JButton botonesF[] = {cmdCrear};
                Helper.habilitarBotones(botonesT);
                Helper.deshabilitarBotones(botonesF);
            }
        } catch (NumberFormatException e) {
            Helper.mensaje(this, "Campo(s) Inválido(s).", 3);
            txtNumeroFilas.setText("");
            txtNumeroColumnas.setText("");
            txtNumeroFilas.requestFocusInWindow();
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLlenadoAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoAutoActionPerformed
        // TODO add your handling code here:
        int nf, nc, n;
        nf = tblTablaInicial.getRowCount();
        nc = tblTablaInicial.getColumnCount();
        Helper.mensaje(this, "Matriz llenada exitosamente.", 1);
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                n = (int) (Math.random() * 50 + 1);
                tblTablaInicial.setValueAt(n, i, j);
            }
        }
        JButton botonesT[] = {cmdCalcular, cmdLimpiar};
        JButton botonesF[] = {cmdCrear, cmdLlenadoManual, cmdLlenadoAuto};
        Helper.habilitarBotones(botonesT);
        Helper.deshabilitarBotones(botonesF);
    }//GEN-LAST:event_cmdLlenadoAutoActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        // TODO add your handling code here:
        int op;
        op = cmbOperacion.getSelectedIndex();
        Helper.limpiadoTabla(tblTablaResultado);
        switch (op) {
            case 0:
                Helper.diagonalSecundaria(tblTablaInicial, tblTablaResultado);
                break;
            case 1:
                Helper.triangularSuperior(tblTablaInicial, tblTablaResultado);
                break;
            case 2:
                Helper.triangularInferior(tblTablaInicial, tblTablaResultado);
                break;
            case 3:
                Helper.matrizTraspuesta(tblTablaInicial, tblTablaResultado);
                break;
            case 4:
                Helper.letraA(tblTablaInicial, tblTablaResultado);
                break;
        }
        JButton botonesT[] = {cmdLimpiar};
        JButton botonesF[] = {cmdCalcular, cmdCrear, cmdLlenadoManual, cmdLlenadoAuto};
        Helper.habilitarBotones(botonesT);
        Helper.deshabilitarBotones(botonesF);

    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        // TODO add your handling code here:
        Helper.porDefectoTabla(tblTablaInicial);
        Helper.porDefectoTabla(tblTablaResultado);
        txtNumeroFilas.setText("");
        txtNumeroFilas.setEditable(true);
        txtNumeroColumnas.setText("");
        txtNumeroColumnas.setEditable(true);
        txtNumeroFilas.requestFocusInWindow();
        cmbOperacion.setSelectedIndex(0);
        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdLlenadoManual, cmdLlenadoAuto, cmdCalcular};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdLlenadoManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoManualActionPerformed
        // TODO add your handling code here:
        int nf, nc, n, sw, res;
        boolean aux = true;
        nf = tblTablaInicial.getRowCount();
        nc = tblTablaInicial.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                do {
                    sw = 1;
                    try {
                        n = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite el elemento en la posición ["+i+"]" + "["+j+"]").trim());
                        tblTablaInicial.setValueAt(n, i, j);
                    } catch (NumberFormatException e) {
                        Helper.mensaje(this, "Digite un número válido", 3);
                        sw = 0;
                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "¿Estás seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
                        if (res == 0) {
                            Helper.mensaje(this, "Debe llenar la matriz.", 2);
                            sw = 1;
                            i = nf;
                            j = nc;
                            aux = false;
                            Helper.limpiadoTabla(tblTablaInicial);
                            Helper.limpiadoTabla(tblTablaResultado);
                        }
                        else {
                            sw = 0;
                        }
                    }
                } while (sw == 0);
            }
        }
        //Controlo los botones de llenar para  cuando se salgan del confirm dialog:
        if (aux == false) {
            cmdLlenadoAuto.setEnabled(true);
            cmdLlenadoManual.setEnabled(true);
        }
        else {
            Helper.mensaje(this, "Matriz llenada exitosamente.", 1);
            cmdLlenadoAuto.setEnabled(false);
            cmdLlenadoManual.setEnabled(false);
        }//

        cmdCalcular.setEnabled(aux);
        JButton botonesT[] = {cmdLimpiar};
        JButton botonesF[] = {cmdCrear};
        Helper.habilitarBotones(botonesT);
        Helper.deshabilitarBotones(botonesF);
    }//GEN-LAST:event_cmdLlenadoManualActionPerformed

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
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdLlenadoAuto;
    private javax.swing.JButton cmdLlenadoManual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTable tblTablaResultado;
    private javax.swing.JTextField txtNumeroColumnas;
    private javax.swing.JTextField txtNumeroFilas;
    // End of variables declaration//GEN-END:variables
}