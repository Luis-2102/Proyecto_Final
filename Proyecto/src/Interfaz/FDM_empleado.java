 
package Interfaz;

import Clases.Empleado_beans;
import Clases.Producto_beans;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FDM_empleado extends javax.swing.JFrame {

    public FDM_empleado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_idEmpleado = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        lbl_apellidos = new javax.swing.JLabel();
        lbl_correo = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        txt_idempleado = new javax.swing.JTextField();
        txt_nombre_empleado = new javax.swing.JTextField();
        txt_apellido_empleado = new javax.swing.JTextField();
        txt_correo_empleado = new javax.swing.JTextField();
        txt_telefono_empleado = new javax.swing.JTextField();
        bnt_guardar_empleado = new javax.swing.JButton();
        bnt_eliminar = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btn_continuar = new javax.swing.JButton();
        btn_producto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_idEmpleado.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        lbl_idEmpleado.setText("ID Empleado");

        lbl_nombres.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        lbl_nombres.setText("Nombres");

        lbl_apellidos.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        lbl_apellidos.setText("Apellidos");

        lbl_correo.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        lbl_correo.setText("Correo");

        lbl_telefono.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        lbl_telefono.setText("Telefono");

        bnt_guardar_empleado.setFont(new java.awt.Font("Lucida Bright", 1, 13)); // NOI18N
        bnt_guardar_empleado.setText("Guardar");
        bnt_guardar_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_guardar_empleadoActionPerformed(evt);
            }
        });

        bnt_eliminar.setFont(new java.awt.Font("Lucida Bright", 1, 13)); // NOI18N
        bnt_eliminar.setText("Eliminar");
        bnt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_eliminarActionPerformed(evt);
            }
        });

        btn_nuevo.setFont(new java.awt.Font("Lucida Bright", 1, 13)); // NOI18N
        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable3);

        btn_continuar.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        btn_continuar.setText("Continuar");
        btn_continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_continuarActionPerformed(evt);
            }
        });

        btn_producto.setFont(new java.awt.Font("Lucida Bright", 1, 13)); // NOI18N
        btn_producto.setText("Agregar Producto");
        btn_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_nuevo)
                        .addGap(32, 32, 32)
                        .addComponent(bnt_eliminar)
                        .addGap(28, 28, 28)
                        .addComponent(bnt_guardar_empleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_continuar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_idEmpleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(txt_idempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nombres)
                            .addComponent(lbl_apellidos)
                            .addComponent(lbl_correo)
                            .addComponent(lbl_telefono))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nombre_empleado)
                            .addComponent(txt_apellido_empleado)
                            .addComponent(txt_correo_empleado)
                            .addComponent(txt_telefono_empleado, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_producto)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_idEmpleado)
                            .addComponent(txt_idempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_producto))
                        .addGap(39, 39, 39)
                        .addComponent(lbl_nombres))
                    .addComponent(txt_nombre_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellidos)
                    .addComponent(txt_apellido_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_correo)
                    .addComponent(txt_correo_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telefono)
                    .addComponent(txt_telefono_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnt_guardar_empleado)
                    .addComponent(bnt_eliminar)
                    .addComponent(btn_continuar)
                    .addComponent(btn_nuevo))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnt_guardar_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_guardar_empleadoActionPerformed
        // TODO add your handling code here:
        this.agregar();
    }//GEN-LAST:event_bnt_guardar_empleadoActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        // TODO add your handling code here:
        this.nuevo();
        
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void bnt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_eliminarActionPerformed
        // TODO add your handling code here:
        this.eliminar();
    }//GEN-LAST:event_bnt_eliminarActionPerformed

    private void btn_continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_continuarActionPerformed
        // TODO add your handling code here:
        FDM_cliente fdm = null;
        fdm = new FDM_cliente();
        fdm.setVisible(true);
    }//GEN-LAST:event_btn_continuarActionPerformed

    private void btn_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productoActionPerformed
        FDM_producto fdmProducto = new FDM_producto();
    fdmProducto.setVisible(true);
    this.setVisible(false);
    fdmProducto.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosed(WindowEvent e) {
            FDM_cliente fdmCliente = new FDM_cliente();
            fdmCliente.setVisible(true);
            fdmCliente.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    setVisible(true);
                }
            });
        }
    });
    }//GEN-LAST:event_btn_productoActionPerformed

    private void nuevo() {
        try {
            Empleado_beans eb = new Empleado_beans();
            txt_idempleado.setText("" + eb.incremento_empleado());
            txt_nombre_empleado.setText("");
            txt_apellido_empleado.setText("");
            txt_correo_empleado.setText("");
            txt_telefono_empleado.setText("");
            this.mostrar(jTable3, "select * from empleado");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error... :/" + e.toString());
        }
    }

    public void agregar() {
        try {
            Empleado_beans eb = new Empleado_beans();
            eb.setId_Empleado(Integer.parseInt(txt_idempleado.getText()));
            eb.setNombres(txt_nombre_empleado.getText());
            eb.setApellidos(txt_apellido_empleado.getText());
            eb.setCorreo(txt_correo_empleado.getText());
            eb.setTelefono(txt_telefono_empleado.getText());
            eb.insertar_empleado();

            JOptionPane.showMessageDialog(null, "¡Empleado Agregado Satisfactoriamente!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error... ¡NO se pudo agregar al empleado!" + e.toString());
        }

    }

    private void mostrar(javax.swing.JTable JT, String sql) {
        try {
            Empleado_beans eb = new Empleado_beans();
            ResultSet rs;
            DefaultTableModel modelo = new DefaultTableModel();
            JT.setModel(modelo);
            rs = eb.consultaTabla(sql);
            ResultSetMetaData rsmd;
            rsmd = rs.getMetaData();
            int cantcolumna = rsmd.getColumnCount();
            for (int i = 1; i <= cantcolumna; i++) {
                modelo.addColumn(rsmd.getColumnLabel(i));
            }
            while (rs.next()) {
                Object[] columna = new Object[cantcolumna];
                for (int i = 0; i < cantcolumna; i++) {
                    columna[i] = rs.getObject(i + 1);
                }
                modelo.addRow(columna);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error..." + e.toString());
        }
}

    private void MouseClick() {
        int fila = jTable3.getSelectedRow();
        txt_idempleado.setText(jTable3.getModel().getValueAt(fila, 0).toString());
        txt_nombre_empleado.setText(jTable3.getModel().getValueAt(fila, 1).toString());
        txt_apellido_empleado.setText(jTable3.getModel().getValueAt(fila, 2).toString());
        txt_correo_empleado.setText(jTable3.getModel().getValueAt(fila, 3).toString());
        txt_telefono_empleado.setText(jTable3.getModel().getValueAt(fila, 4).toString());
    }

    public void eliminar() {
        try {
            int fila = jTable3.getSelectedRow();
            String idEmpleado = jTable3.getModel().getValueAt(fila, 0).toString();
            Empleado_beans eb = new Empleado_beans();
            eb.eliminar_empleado(idEmpleado);
            JOptionPane.showMessageDialog(null, "¡Empleado despedidio con exito!");
            mostrar(jTable3, "select * from empleado");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al despedir al empleado: " + e.toString());
        }
    }
    
        public JButton getContinuarButtonEmpleado() {
        return btn_continuar;
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_eliminar;
    private javax.swing.JButton bnt_guardar_empleado;
    private javax.swing.JButton btn_continuar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_producto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_correo;
    private javax.swing.JLabel lbl_idEmpleado;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JTextField txt_apellido_empleado;
    private javax.swing.JTextField txt_correo_empleado;
    private javax.swing.JTextField txt_idempleado;
    private javax.swing.JTextField txt_nombre_empleado;
    private javax.swing.JTextField txt_telefono_empleado;
    // End of variables declaration//GEN-END:variables

 
}
