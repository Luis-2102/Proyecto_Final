
package Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import Clases.Detalle_beans;
import Clases.Factura_beans;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class FDM_DetalleFactura extends javax.swing.JFrame {

    public FDM_DetalleFactura() {
        initComponents();
        btn_Salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cerrarLaInterfaz();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Salir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbl_Nombre_local = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        lbl_clientenombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_nombre_empleado = new javax.swing.JLabel();
        lbl_fechaVenta = new javax.swing.JLabel();
        txt_nombre_cliente = new javax.swing.JTextField();
        txt_cedula_cliente = new javax.swing.JTextField();
        txt_nombre_empleado = new javax.swing.JTextField();
        txt_fecha_venta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_descripcion_detalle = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        list_Cantidad_detalle = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        list_precio_detalle = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        list_total_detalle = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_Subtotal_Detalle = new javax.swing.JTextField();
        txt_total_detalle = new javax.swing.JTextField();
        txt_iva_detalle = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btn_llenar_datos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Salir.setFont(new java.awt.Font("Lucida Bright", 1, 13)); // NOI18N
        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("");

        lbl_Nombre_local.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        lbl_Nombre_local.setText("Fecha de emision:");
        lbl_Nombre_local.setToolTipText("");

        txt_fecha.setBorder(null);

        lbl_clientenombre.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        lbl_clientenombre.setText("Nombre Cliente:");

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        jLabel2.setText("Cedula/RUC:");

        lbl_nombre_empleado.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        lbl_nombre_empleado.setText("Emitido Por:");

        lbl_fechaVenta.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        lbl_fechaVenta.setText("Fecha de Venta:");

        txt_nombre_cliente.setBorder(null);

        txt_cedula_cliente.setBorder(null);

        txt_nombre_empleado.setBorder(null);
        txt_nombre_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre_empleadoActionPerformed(evt);
            }
        });

        txt_fecha_venta.setBorder(null);
        txt_fecha_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fecha_ventaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_Nombre_local, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                        .addComponent(lbl_clientenombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbl_fechaVenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addComponent(lbl_nombre_empleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cedula_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombre_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fecha_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Nombre_local)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_clientenombre)
                    .addComponent(txt_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_cedula_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre_empleado)
                    .addComponent(txt_nombre_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fecha_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_fechaVenta))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel1.setText("ALMACENES \"CIRCUIT SHOP\"");

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        jLabel3.setText("AV.10 DE AGOSTO Y AV.UNIVERSITARIA");

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        jLabel4.setText("QUITO - ECUADOR");

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        jLabel5.setText(" DE PARTE DE TODOS LOS QUE CONFORMAMOS LOS ALMACENES \"CIRCUIT SHOP\" QUEREMOS ");

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        jLabel6.setText(" AGRADECERTE POR ESCOGER NUESTROS SERVICIOS Y PRODUCTOS ¡¡¡¡VUELVE PRONTO!!!");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane2.setViewportView(list_descripcion_detalle);

        jScrollPane3.setViewportView(list_Cantidad_detalle);

        jScrollPane4.setViewportView(list_precio_detalle);

        jScrollPane5.setViewportView(list_total_detalle);

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 1, 13)); // NOI18N
        jLabel7.setText("DESCRIPCION");

        jLabel8.setFont(new java.awt.Font("Lucida Bright", 1, 13)); // NOI18N
        jLabel8.setText("CANTIDAD");

        jLabel9.setFont(new java.awt.Font("Lucida Bright", 1, 13)); // NOI18N
        jLabel9.setText("PRECIO UNITARIO");

        jLabel10.setFont(new java.awt.Font("Lucida Bright", 1, 13)); // NOI18N
        jLabel10.setText("TOTAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jLabel13.setText("I.V.A 12%");

        jLabel15.setText("Sub Total");

        txt_Subtotal_Detalle.setBorder(null);

        txt_total_detalle.setBorder(null);

        txt_iva_detalle.setBorder(null);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel11.setText("TOTAL");

        btn_llenar_datos.setText("Imprimir");
        btn_llenar_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_llenar_datosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(78, 78, 78)
                                        .addComponent(txt_Subtotal_Detalle, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(85, 85, 85)
                                        .addComponent(txt_total_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(78, 78, 78)
                                        .addComponent(txt_iva_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_llenar_datos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Salir)))
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt_Subtotal_Detalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_iva_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_total_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btn_Salir)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_llenar_datos)
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_fecha_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fecha_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fecha_ventaActionPerformed

    private void txt_nombre_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre_empleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre_empleadoActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
 
        this.dispose();
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void btn_llenar_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_llenar_datosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_llenar_datosActionPerformed

    
    public JButton getBtn_Salir() {
        return btn_Salir;
    }
    private void cerrarLaInterfaz() {
        this.dispose(); 
    }
    
    private void mostrarDetallesFactura(int idFactura) {
    // Crear una instancia de Factura_beans para manejar los detalles de la factura
    Factura_beans facturaBeans = new Factura_beans();

    try {
        // Obtener los detalles de la factura desde la base de datos
        ResultSet facturaResultSet = facturaBeans.consultaTabla("SELECT * FROM factura WHERE id_factura = " + idFactura);

        // Verificar si se encontró la factura
        if (facturaResultSet.next()) {
            // Rellenar los campos de la interfaz con los detalles de la factura
            txt_fecha.setText(facturaResultSet.getString("fecha"));
            txt_nombre_cliente.setText(facturaResultSet.getString("nombre_cliente"));
            txt_cedula_cliente.setText(facturaResultSet.getString("cedula_ruc"));
            txt_nombre_empleado.setText(facturaResultSet.getString("nombre_empleado"));
            txt_fecha_venta.setText(facturaResultSet.getString("fecha_venta"));
            txt_Subtotal_Detalle.setText(String.valueOf(facturaResultSet.getDouble("subtotal")));
            txt_iva_detalle.setText(String.valueOf(facturaResultSet.getDouble("iva")));
            txt_total_detalle.setText(String.valueOf(facturaResultSet.getDouble("total")));

            // Crear una instancia de Detalle_beans para manejar los detalles de productos
            Detalle_beans detalleBeans = new Detalle_beans();
            
            // Obtener los detalles de productos asociados a esta factura desde la base de datos
            ResultSet detalleResultSet = detalleBeans.consultaTabla("SELECT * FROM detalle_factura WHERE id_factura = " + idFactura);
            
            DefaultListModel<String> descripcionModel = new DefaultListModel<>();
            DefaultListModel<String> cantidadModel = new DefaultListModel<>();
            DefaultListModel<String> precioModel = new DefaultListModel<>();
            DefaultListModel<String> totalModel = new DefaultListModel<>();
            
            // Iterar a través de los detalles de productos y agregarlos a los modelos
            while (detalleResultSet.next()) {
                descripcionModel.addElement(detalleResultSet.getString("descripcion"));
                cantidadModel.addElement(String.valueOf(detalleResultSet.getInt("cantidad")));
                precioModel.addElement(String.valueOf(detalleResultSet.getDouble("precio_uni")));
                totalModel.addElement(String.valueOf(detalleResultSet.getDouble("pvp")));
            }
            
            list_descripcion_detalle.setModel(descripcionModel);
            list_Cantidad_detalle.setModel(cantidadModel);
            list_precio_detalle.setModel(precioModel);
            list_total_detalle.setModel(totalModel);
        } else {
            // Si no se encuentra la factura, muestra un mensaje de error
            JOptionPane.showMessageDialog(null, "No se encontró la factura con ID: " + idFactura);
        }
    } catch (SQLException e) {
        // Manejar cualquier error que ocurra al obtener los detalles
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al obtener los detalles de la factura: " + e.getMessage());
    }
}

        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_llenar_datos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbl_Nombre_local;
    private javax.swing.JLabel lbl_clientenombre;
    private javax.swing.JLabel lbl_fechaVenta;
    private javax.swing.JLabel lbl_nombre_empleado;
    private javax.swing.JList<String> list_Cantidad_detalle;
    private javax.swing.JList<String> list_descripcion_detalle;
    private javax.swing.JList<String> list_precio_detalle;
    private javax.swing.JList<String> list_total_detalle;
    private javax.swing.JTextField txt_Subtotal_Detalle;
    private javax.swing.JTextField txt_cedula_cliente;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_fecha_venta;
    private javax.swing.JTextField txt_iva_detalle;
    private javax.swing.JTextField txt_nombre_cliente;
    private javax.swing.JTextField txt_nombre_empleado;
    private javax.swing.JTextField txt_total_detalle;
    // End of variables declaration//GEN-END:variables
}
