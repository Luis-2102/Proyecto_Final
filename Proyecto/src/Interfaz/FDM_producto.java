
package Interfaz;

import Clases.Producto_beans;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class FDM_producto extends javax.swing.JFrame {

    
    public FDM_producto() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbl_idProducto = new javax.swing.JLabel();
        lbl_Producto = new javax.swing.JLabel();
        lbl_descripcion = new javax.swing.JLabel();
        lbl_stock = new javax.swing.JLabel();
        lbl_pvp = new javax.swing.JLabel();
        txt_IdProducto = new javax.swing.JTextField();
        txt_nombreProducto = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        txt_stock = new javax.swing.JTextField();
        txt_pvp = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btn_nuevo = new javax.swing.JButton();
        bnt_agregar = new javax.swing.JButton();
        bnt_eliminar = new javax.swing.JButton();
        btn_continuar = new javax.swing.JButton();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_idProducto.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        lbl_idProducto.setText("ID Producto");

        lbl_Producto.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        lbl_Producto.setText("Producto");

        lbl_descripcion.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        lbl_descripcion.setText("Descripcion");

        lbl_stock.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        lbl_stock.setText("Strock");

        lbl_pvp.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        lbl_pvp.setText("Precio");

        txt_nombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreProductoActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        bnt_agregar.setText("Guardar");
        bnt_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_agregarActionPerformed(evt);
            }
        });

        bnt_eliminar.setText("Eliminar");
        bnt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_eliminarActionPerformed(evt);
            }
        });

        btn_continuar.setText("Continuar");
        btn_continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_continuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_idProducto)
                    .addComponent(lbl_Producto)
                    .addComponent(lbl_descripcion)
                    .addComponent(lbl_stock)
                    .addComponent(lbl_pvp))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_IdProducto)
                    .addComponent(txt_nombreProducto)
                    .addComponent(txt_descripcion)
                    .addComponent(txt_stock)
                    .addComponent(txt_pvp, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_nuevo)
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(bnt_agregar)
                .addGap(152, 152, 152)
                .addComponent(bnt_eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_continuar)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_idProducto)
                            .addComponent(txt_IdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btn_nuevo)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Producto)
                    .addComponent(txt_nombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_descripcion)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_stock)
                    .addComponent(txt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_pvp)
                    .addComponent(txt_pvp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(123, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_continuar)
                            .addComponent(bnt_eliminar)
                            .addComponent(bnt_agregar))
                        .addGap(21, 21, 21))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreProductoActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        // TODO add your handling code here:
        this.nuevo();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void bnt_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_agregarActionPerformed
        // TODO add your handling code here:
        this.agregar();
    }//GEN-LAST:event_bnt_agregarActionPerformed

    private void bnt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_eliminarActionPerformed
        // TODO add your handling code here:
        this.eliminar();
    }//GEN-LAST:event_bnt_eliminarActionPerformed

    private void btn_continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_continuarActionPerformed
        // TODO add your handling code here:
        FDM_empleado fe = new FDM_empleado();
        fe.setVisible(true);
    }//GEN-LAST:event_btn_continuarActionPerformed

private void nuevo(){
            try{
            Producto_beans pb = new Producto_beans();
            txt_IdProducto.setText(""+pb.incremento_Producto());
            txt_nombreProducto.setText("");
            txt_descripcion.setText("");
            txt_stock.setText("");
            txt_pvp.setText("");
            this.mostrar(jTable2, "select * from producto");
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error... :/" + e.toString() );
        }
    }
    public void agregar(){
        try{
            Producto_beans pb = new Producto_beans();
            pb.setIdProducto(Integer.parseInt(txt_IdProducto.getText()));
            pb.setNombreProducto(txt_nombreProducto.getText());
            pb.setDescripcion(txt_descripcion.getText());
            pb.setStock(Integer.parseInt(txt_stock.getText()));
            pb.setPvp(Integer.parseInt(txt_pvp.getText()));
            pb.insertar_producto();
            this.mostrar(jTable2, "select * from producto");
            JOptionPane.showMessageDialog(null, "¡Cliente Agregado Satisfactoriamente!");
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error... ¡NO se pudo agregar cliente!" + e.toString() );
        }
    
    }
    private void mostrar(javax.swing.JTable JT, String sql){
        try{
            Producto_beans pb = new Producto_beans();
            ResultSet rs;
            DefaultTableModel modelo= new DefaultTableModel();
            JT.setModel(modelo);
            rs = pb.consultaTabla(sql);
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
            int fila = jTable2.getSelectedRow();
            txt_IdProducto.setText(jTable2.getModel().getValueAt(fila, 0).toString());
            txt_nombreProducto.setText(jTable2.getModel().getValueAt(fila, 1).toString());
            txt_descripcion.setText(jTable2.getModel().getValueAt(fila, 2).toString());
            txt_stock.setText(jTable2.getModel().getValueAt(fila, 3).toString());
            txt_pvp.setText(jTable2.getModel().getValueAt(fila, 4).toString());
    }

    public void eliminar() {
        try {
            int fila = jTable2.getSelectedRow();
            String idProducto = jTable2.getModel().getValueAt(fila, 0).toString();
            Producto_beans pb = new Producto_beans();
            pb.eliminar_producto(idProducto);
            JOptionPane.showMessageDialog(null, "¡Producto eliminado correctamente!");
            mostrar(jTable2, "select * from producto");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el producto: " + e.toString());
        }
    }

    public JButton getContinuarButtonProducto() {
        return btn_continuar;
    }
    
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_agregar;
    private javax.swing.JButton bnt_eliminar;
    private javax.swing.JButton btn_continuar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbl_Producto;
    private javax.swing.JLabel lbl_descripcion;
    private javax.swing.JLabel lbl_idProducto;
    private javax.swing.JLabel lbl_pvp;
    private javax.swing.JLabel lbl_stock;
    private javax.swing.JTextField txt_IdProducto;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_nombreProducto;
    private javax.swing.JTextField txt_pvp;
    private javax.swing.JTextField txt_stock;
    // End of variables declaration//GEN-END:variables
}
