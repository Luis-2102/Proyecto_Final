
package Interfaz;

import Clases.Cliente_beans;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;

public class FDM_cliente extends javax.swing.JFrame {

    public FDM_cliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id_cliente = new javax.swing.JLabel();
        nombres_cliente = new javax.swing.JLabel();
        apellidos_cliente = new javax.swing.JLabel();
        cedula_cliente = new javax.swing.JLabel();
        direccion_cliente = new javax.swing.JLabel();
        correo_cliente = new javax.swing.JLabel();
        telefono_cliente = new javax.swing.JLabel();
        txt_id_cliente = new javax.swing.JTextField();
        txt_nombres_cliente = new javax.swing.JTextField();
        txt_apellidos_cliente = new javax.swing.JTextField();
        txt_cedula_cliente = new javax.swing.JTextField();
        txt_direccion_cliente = new javax.swing.JTextField();
        txt_correo_cliente = new javax.swing.JTextField();
        txt_telefono_cliente = new javax.swing.JTextField();
        Btn_nuevo = new javax.swing.JButton();
        Btn_eliminar = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        Btn_Continuar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        id_cliente.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        id_cliente.setText("ID_Cliente");

        nombres_cliente.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        nombres_cliente.setText("Nombres");

        apellidos_cliente.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        apellidos_cliente.setText("Apellidos");

        cedula_cliente.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        cedula_cliente.setText("Cedula/RUC");

        direccion_cliente.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        direccion_cliente.setText("Direccion");

        correo_cliente.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        correo_cliente.setText("Correo");

        telefono_cliente.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        telefono_cliente.setText("Telefono");

        txt_id_cliente.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        txt_id_cliente.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_id_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_clienteActionPerformed(evt);
            }
        });

        txt_nombres_cliente.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        txt_nombres_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombres_clienteActionPerformed(evt);
            }
        });

        txt_apellidos_cliente.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N

        txt_cedula_cliente.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        txt_cedula_cliente.setToolTipText("");

        txt_direccion_cliente.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N

        txt_correo_cliente.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N

        txt_telefono_cliente.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N

        Btn_nuevo.setBackground(new java.awt.Color(0, 102, 102));
        Btn_nuevo.setFont(new java.awt.Font("Lucida Bright", 1, 13)); // NOI18N
        Btn_nuevo.setForeground(new java.awt.Color(255, 255, 255));
        Btn_nuevo.setText("Nuevo");
        Btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_nuevoActionPerformed(evt);
            }
        });

        Btn_eliminar.setBackground(new java.awt.Color(0, 102, 102));
        Btn_eliminar.setFont(new java.awt.Font("Lucida Bright", 1, 13)); // NOI18N
        Btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_eliminar.setText("Eliminar");
        Btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_eliminarActionPerformed(evt);
            }
        });

        btn_Agregar.setBackground(new java.awt.Color(0, 102, 102));
        btn_Agregar.setFont(new java.awt.Font("Lucida Bright", 1, 13)); // NOI18N
        btn_Agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Agregar.setText("Guardar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        Btn_Continuar.setBackground(new java.awt.Color(0, 102, 102));
        Btn_Continuar.setFont(new java.awt.Font("Lucida Bright", 1, 13)); // NOI18N
        Btn_Continuar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Continuar.setText("Continuar");
        Btn_Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ContinuarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("!BIENVENIDO¡... POR FAVOR LLENA LOS DATOS CORRECTAMENTE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addComponent(Btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_Continuar)
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(correo_cliente)
                                    .addComponent(direccion_cliente)
                                    .addComponent(nombres_cliente))
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(id_cliente)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_direccion_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nombres_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_correo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cedula_cliente)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(apellidos_cliente)
                                                .addGap(8, 8, 8)))
                                        .addGap(24, 24, 24))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(telefono_cliente)
                                        .addGap(34, 34, 34)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_cedula_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_telefono_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_apellidos_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_cliente)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Btn_nuevo)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombres_cliente)
                    .addComponent(txt_nombres_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidos_cliente)
                    .addComponent(txt_apellidos_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_direccion_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion_cliente)
                    .addComponent(txt_cedula_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedula_cliente))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_correo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correo_cliente)
                    .addComponent(telefono_cliente)
                    .addComponent(txt_telefono_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Agregar)
                    .addComponent(Btn_eliminar)
                    .addComponent(Btn_Continuar))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_id_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_clienteActionPerformed

    private void Btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_nuevoActionPerformed
        this.nuevo();
    }//GEN-LAST:event_Btn_nuevoActionPerformed

    private void txt_nombres_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombres_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombres_clienteActionPerformed

    private void Btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_eliminarActionPerformed
        // TODO add your handling code here:
        this.eliminar();
    }//GEN-LAST:event_Btn_eliminarActionPerformed

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        // TODO add your handling code here:
        this.agregar();
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void Btn_ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ContinuarActionPerformed
        // TODO add your handling code here:
        FDM_Factura fdmfactura = null;
        try {
            fdmfactura = new FDM_Factura();
        } catch (SQLException ex) {
            Logger.getLogger(FDM_cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        fdmfactura.setVisible(true);
    }//GEN-LAST:event_Btn_ContinuarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        this.MouseClick();
    }//GEN-LAST:event_jTable1MouseClicked
    
    private void nuevo(){
            try{
            Cliente_beans cb = new Cliente_beans();
            txt_id_cliente.setText(""+cb.incremento_Cliente());
            txt_nombres_cliente.setText("");
            txt_apellidos_cliente.setText("");
            txt_cedula_cliente.setText("");
            txt_direccion_cliente.setText("");
            txt_telefono_cliente.setText("");
            txt_correo_cliente.setText("");
            this.mostrar(jTable1, "select * from cliente");
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error... :/" + e.toString() );
        }
    }
    public void agregar(){
        try{
            Cliente_beans cb = new Cliente_beans();
            cb.setId_cliente(Integer.parseInt(txt_id_cliente.getText()));
            cb.setNombres(txt_nombres_cliente.getText());
            cb.setApellidos(txt_apellidos_cliente.getText());
            cb.setCedula(txt_cedula_cliente.getText());
            cb.setDireccion(txt_direccion_cliente.getText());
            cb.setCorreo(txt_correo_cliente.getText());
            cb.setTelefono(txt_telefono_cliente.getText());
            cb.insertar_cliente();
            this.mostrar(jTable1, "select * from cliente");
            JOptionPane.showMessageDialog(null, "¡Cliente Agregado Satisfactoriamente!");
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error... ¡NO se pudo agregar cliente!" + e.toString() );
        }
    
    }
    private void mostrar(javax.swing.JTable JT, String sql){
        try{
            Cliente_beans cb = new Cliente_beans();
            ResultSet rs;
            DefaultTableModel modelo= new DefaultTableModel();
            JT.setModel(modelo);
            rs = cb.consultaTabla(sql);
            ResultSetMetaData rsmd;
            rsmd = rs.getMetaData();
            int cantcolumna = rsmd.getColumnCount();
            for(int i=1; i<=cantcolumna; i++){
                modelo.addColumn(rsmd.getColumnLabel(i));
            }
            while(rs.next()){
                Object [] columna = new Object[cantcolumna];
                for(int i=0; i<cantcolumna; i++){
                    columna[i]=rs.getObject(i+1);
                }
                modelo.addRow(columna);
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error..." + e.toString());
        }
    }
        private void MouseClick(){
            int fila = jTable1.getSelectedRow();
            txt_id_cliente.setText(jTable1.getModel().getValueAt(fila, 0).toString());
            txt_nombres_cliente.setText(jTable1.getModel().getValueAt(fila, 1).toString());
            txt_apellidos_cliente.setText(jTable1.getModel().getValueAt(fila, 2).toString());
            txt_cedula_cliente.setText(jTable1.getModel().getValueAt(fila, 3).toString());
            txt_direccion_cliente.setText(jTable1.getModel().getValueAt(fila, 4).toString());
            txt_correo_cliente.setText(jTable1.getModel().getValueAt(fila, 5).toString());
            txt_telefono_cliente.setText(jTable1.getModel().getValueAt(fila, 6).toString());
        }
        
        public void eliminar() {
    try {
        int fila = jTable1.getSelectedRow();
        String idCliente = jTable1.getModel().getValueAt(fila, 0).toString();
        Cliente_beans cb = new Cliente_beans();
        cb.eliminar_cliente(idCliente);
        JOptionPane.showMessageDialog(null, "¡Cliente eliminado correctamente!");
        mostrar(jTable1, "select * from cliente");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar el cliente: " + e.toString());
    }
}
    public JButton getContinuarButtonCliente() {
    return Btn_Continuar;
}
        
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Continuar;
    private javax.swing.JButton Btn_eliminar;
    private javax.swing.JButton Btn_nuevo;
    private javax.swing.JLabel apellidos_cliente;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JLabel cedula_cliente;
    private javax.swing.JLabel correo_cliente;
    private javax.swing.JLabel direccion_cliente;
    private javax.swing.JLabel id_cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel nombres_cliente;
    private javax.swing.JLabel telefono_cliente;
    private javax.swing.JTextField txt_apellidos_cliente;
    private javax.swing.JTextField txt_cedula_cliente;
    private javax.swing.JTextField txt_correo_cliente;
    private javax.swing.JTextField txt_direccion_cliente;
    private javax.swing.JTextField txt_id_cliente;
    private javax.swing.JTextField txt_nombres_cliente;
    private javax.swing.JTextField txt_telefono_cliente;
    // End of variables declaration//GEN-END:variables
}
