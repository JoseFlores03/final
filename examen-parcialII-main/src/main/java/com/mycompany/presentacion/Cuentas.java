/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.presentacion;
import com.mycompany.infraestructura.Modelo.CuentaModelo;
import com.mycompany.servicios.CuentasService;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author hp
 */
public class Cuentas extends javax.swing.JFrame {
    CuentasService cuentaServicio;
    /**
     * Creates new form Cuentas
     */
    public Cuentas() {
        initComponents();
        cuentaServicio = new CuentasService("postgres","0000","localhost","5432","exapar");
    }
    private void BuscarCuenta(String id) {
       cargardatos(cuentaServicio.consultarCuenta(Integer.parseInt(id)));
       
    }
    
    
    private void guardarCuenta() {
        
        CuentaModelo modelo = new CuentaModelo();
        txtidcuenta.setText(String.valueOf(modelo.IdCuenta));
        txtidcliente.setText(String.valueOf(modelo.IdCliente));
        txtnrocuenta.setText(modelo.NroCuenta);
        datecalendarfechaalta.setDate(modelo.FechaAlta);
        txttipocuenta.setText(modelo.TipoCuenta);
        txtestado.setText(modelo.Estado);
        txtsaldo.setText(modelo.Saldo);
        txtnrocontrato.setText(String.valueOf(modelo.NroContrato));
        txtestado.setText(modelo.Estado);
        txtcostomantenimiento.setText(modelo.CostoMantenimiento);
        txtpromedioacreditacion.setText(modelo.PromedioAcreditacion);
        txtestado.setText(modelo.Estado);
        txtmoneda.setText(modelo.Moneda);

        String resultado = cuentaServicio.registrarCuenta(modelo);
        JOptionPane.showMessageDialog(this, resultado);

        BorrarDatos();

    }
    
    private void actualizarCuenta(){
        CuentaModelo modelo = new CuentaModelo();
        txtidcuenta.setText(String.valueOf(modelo.IdCuenta));
        txtidcliente.setText(String.valueOf(modelo.IdCliente));
        txtnrocuenta.setText(modelo.NroCuenta);
        datecalendarfechaalta.setDate(modelo.FechaAlta);
        txttipocuenta.setText(modelo.TipoCuenta);
        txtestado.setText(modelo.Estado);
        txtsaldo.setText(modelo.Saldo);
        txtnrocontrato.setText(String.valueOf(modelo.NroContrato));
        txtestado.setText(modelo.Estado);
        txtcostomantenimiento.setText(modelo.CostoMantenimiento);
        txtpromedioacreditacion.setText(modelo.PromedioAcreditacion);
        txtestado.setText(modelo.Estado);
        txtmoneda.setText(modelo.Moneda);



        String resultado = cuentaServicio.modificarCuenta(modelo);
        JOptionPane.showMessageDialog(this, resultado);

        BorrarDatos();
    }
    public void cargardatos(CuentaModelo modelo){
        txtidcuenta.setText(String.valueOf(modelo.getIdCuenta()));
        txtidcliente.setText(String.valueOf(modelo.getIdCliente()));
        txtnrocuenta.setText(modelo.getNroCuenta());
        datecalendarfechaalta.setDate(modelo.getFechaAlta());
        txttipocuenta.setText(modelo.getTipoCuenta());
        txtestado.setText(modelo.getEstado());
        txtsaldo.setText(modelo.getSaldo());
        txtnrocontrato.setText(String.valueOf(modelo.getNroContrato()));
        txtestado.setText(modelo.getEstado());
        txtcostomantenimiento.setText(modelo.getCostoMantenimiento());
        txtpromedioacreditacion.setText(modelo.getPromedioAcreditacion());
        txtestado.setText(modelo.getEstado());
        txtmoneda.setText(modelo.getMoneda());
    }
    
    private void BorrarDatos() {
        txtidcuenta.setText("");
        txtidcliente.setText("");
        txtnrocuenta.setText("");
        datecalendarfechaalta.setDate(null);
        txttipocuenta.setText("");
        txtestado.setText("");
        txtsaldo.setText("");
        txtnrocontrato.setText("");
        txtestado.setText("");
        txtcostomantenimiento.setText("");
        txtpromedioacreditacion.setText("");
        txtestado.setText("");
        txtmoneda.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtidcuenta = new javax.swing.JTextField();
        txtidcliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtnrocuenta = new javax.swing.JTextField();
        datecalendarfechaalta = new com.toedter.calendar.JDateChooser();
        txttipocuenta = new javax.swing.JTextField();
        txtestado = new javax.swing.JTextField();
        txtsaldo = new javax.swing.JTextField();
        txtnrocontrato = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtcostomantenimiento = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtpromedioacreditacion = new javax.swing.JTextField();
        txtmoneda = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Cuentas");

        jLabel2.setText("id Cuenta:");

        jLabel3.setText("id Cliente:");

        txtidcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidcuentaActionPerformed(evt);
            }
        });

        jLabel5.setText("Nro. Cuenta:");

        jLabel6.setText("Fecha Alta:");

        jLabel7.setText("Tipo Cuenta:");

        jLabel8.setText("Estado");

        jLabel9.setText("Saldo:");

        jLabel10.setText("Nro. Contrato:");

        txttipocuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttipocuentaActionPerformed(evt);
            }
        });

        jLabel11.setText("Costo Mantenimiento:");

        jLabel12.setText("Promedio Acreditacion:");

        jLabel13.setText("Moneda:");

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(datecalendarfechaalta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txttipocuenta)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtnrocontrato, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtpromedioacreditacion, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtestado, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtsaldo, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtcostomantenimiento, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(6, 6, 6))
                                    .addComponent(txtmoneda, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtidcuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtidcliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(txtnrocuenta))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnguardar)
                                .addGap(32, 32, 32)
                                .addComponent(btnactualizar)
                                .addGap(41, 41, 41)
                                .addComponent(btneliminar)
                                .addGap(48, 48, 48)
                                .addComponent(btnsalir))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnbuscar)
                        .addGap(89, 89, 89)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtidcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtnrocuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(datecalendarfechaalta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txttipocuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtnrocontrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11))
                    .addComponent(txtcostomantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtpromedioacreditacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtmoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btnactualizar)
                    .addComponent(btneliminar)
                    .addComponent(btnsalir))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidcuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidcuentaActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        guardarCuenta();
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
        actualizarCuenta();
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void txttipocuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttipocuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttipocuentaActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        BuscarCuenta(txtidcuenta.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        BorrarDatos();
    }//GEN-LAST:event_btneliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnsalir;
    private com.toedter.calendar.JDateChooser datecalendarfechaalta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtcostomantenimiento;
    private javax.swing.JTextField txtestado;
    private javax.swing.JTextField txtidcliente;
    private javax.swing.JTextField txtidcuenta;
    private javax.swing.JTextField txtmoneda;
    private javax.swing.JTextField txtnrocontrato;
    private javax.swing.JTextField txtnrocuenta;
    private javax.swing.JTextField txtpromedioacreditacion;
    private javax.swing.JTextField txtsaldo;
    private javax.swing.JTextField txttipocuenta;
    // End of variables declaration//GEN-END:variables
}
