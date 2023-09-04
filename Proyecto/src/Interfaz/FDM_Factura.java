
package Interfaz;
import Clases.Cliente_beans;
import Clases.accesobd;
import Clases.Producto_beans;
import Clases.Factura_beans;
import Clases.Empleado_beans;
import Clases.Detalle_beans;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import static java.util.Date.parse;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class FDM_Factura extends javax.swing.JFrame {
    
    

    public FDM_Factura() throws SQLException {
        initComponents();
        DefaultListModel<String> cantidadListModel = new DefaultListModel<>();
        List_Cantidad.setModel(cantidadListModel);

        DefaultListModel<String> descripcionListModel = new DefaultListModel<>();
        List_descripcion.setModel(descripcionListModel);

        DefaultListModel<String> precioListModel = new DefaultListModel<>();
        List_precio.setModel(precioListModel);

        DefaultListModel<String> totalListModel = new DefaultListModel<>();
        List_total.setModel(totalListModel);
     fillComboBoxWithProductIDs();
     fillComboBoxWithClientIDs();
     fillComboBoxWithEmpleadoIDs();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_Codigo = new javax.swing.JLabel();
        lbl_descripcion = new javax.swing.JLabel();
        lbl_p_unidad = new javax.swing.JLabel();
        lbl_cantidad = new javax.swing.JLabel();
        txt_descripcion_factura = new javax.swing.JTextField();
        txt_precio_unidad_factura = new javax.swing.JTextField();
        txt_cantidad_factura = new javax.swing.JTextField();
        btn_anadir_factura = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        ComboBox_Codigo = new javax.swing.JComboBox<>();
        lbl_codigo_factura = new javax.swing.JLabel();
        txt_codigo_producto = new javax.swing.JTextField();
        lbl_cantidad1 = new javax.swing.JLabel();
        lbl_cantidad2 = new javax.swing.JLabel();
        txt_codigo_cliente = new javax.swing.JTextField();
        txt_codigo_empleado = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        List_Cantidad = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        List_descripcion = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        List_precio = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        List_total = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_SubTotal_factura = new javax.swing.JTextField();
        txt_iva_factura = new javax.swing.JTextField();
        txt_total_factura = new javax.swing.JTextField();
        btn_nuevo = new javax.swing.JButton();
        btn_Guardar = new javax.swing.JButton();
        Btn_imprimirFactura = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_idfactura = new javax.swing.JTextField();
        txt_fecha = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        combo_cliente = new javax.swing.JComboBox<>();
        combo_empleado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        lbl_Codigo.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        lbl_Codigo.setText("Producto: ");

        lbl_descripcion.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        lbl_descripcion.setText("Descripcion: ");

        lbl_p_unidad.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        lbl_p_unidad.setText("Precio por unidad: ");

        lbl_cantidad.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        lbl_cantidad.setText("Cantidad: ");

        txt_descripcion_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descripcion_facturaActionPerformed(evt);
            }
        });

        txt_precio_unidad_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precio_unidad_facturaActionPerformed(evt);
            }
        });

        txt_cantidad_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidad_facturaActionPerformed(evt);
            }
        });

        btn_anadir_factura.setFont(new java.awt.Font("Lucida Bright", 1, 13)); // NOI18N
        btn_anadir_factura.setText("Añadir al carrito");
        btn_anadir_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anadir_facturaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N

        ComboBox_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_CodigoActionPerformed(evt);
            }
        });

        lbl_codigo_factura.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        lbl_codigo_factura.setText("Código Producto:");

        txt_codigo_producto.setFont(new java.awt.Font("Lucida Bright", 1, 13)); // NOI18N
        txt_codigo_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigo_productoActionPerformed(evt);
            }
        });

        lbl_cantidad1.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        lbl_cantidad1.setText("ClienteID:");

        lbl_cantidad2.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        lbl_cantidad2.setText("EmpleadoID: ");

        txt_codigo_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigo_empleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_cantidad2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_anadir_factura)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_cantidad1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_cantidad)
                            .addComponent(lbl_descripcion)
                            .addComponent(lbl_Codigo)
                            .addComponent(lbl_codigo_factura)
                            .addComponent(lbl_p_unidad))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 16, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_codigo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ComboBox_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72)
                                        .addComponent(jLabel9))
                                    .addComponent(txt_descripcion_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(107, 107, 107))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_cantidad_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_precio_unidad_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_codigo_cliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                        .addComponent(txt_codigo_empleado, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Codigo)
                    .addComponent(ComboBox_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigo_factura)
                    .addComponent(txt_codigo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_descripcion)
                    .addComponent(txt_descripcion_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_p_unidad)
                    .addComponent(txt_precio_unidad_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cantidad)
                    .addComponent(txt_cantidad_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cantidad1)
                    .addComponent(txt_codigo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_anadir_factura)
                    .addComponent(lbl_cantidad2)
                    .addComponent(txt_codigo_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        jLabel2.setText("Cantidad");

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        jLabel3.setText("Descripcion");

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        jLabel4.setText("Precio Unitario");

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        jLabel5.setText("Total");

        jScrollPane1.setViewportView(List_Cantidad);

        jScrollPane2.setViewportView(List_descripcion);

        jScrollPane3.setViewportView(List_precio);

        jScrollPane5.setViewportView(List_total);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 13)); // NOI18N
        jLabel1.setText("FECHA:");

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 1, 13)); // NOI18N
        jLabel6.setText("Sub.Total");

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 1, 13)); // NOI18N
        jLabel7.setText("I.V.A");

        jLabel8.setFont(new java.awt.Font("Lucida Bright", 1, 13)); // NOI18N
        jLabel8.setText("Total.");

        txt_SubTotal_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SubTotal_facturaActionPerformed(evt);
            }
        });

        btn_nuevo.setFont(new java.awt.Font("Lucida Bright", 1, 13)); // NOI18N
        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_Guardar.setFont(new java.awt.Font("Lucida Bright", 1, 13)); // NOI18N
        btn_Guardar.setText("Guardar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        Btn_imprimirFactura.setFont(new java.awt.Font("Lucida Bright", 3, 13)); // NOI18N
        Btn_imprimirFactura.setText(" Imprimir factura");
        Btn_imprimirFactura.setToolTipText("");
        Btn_imprimirFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_imprimirFacturaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Bright", 1, 13)); // NOI18N
        jLabel10.setText("FACTURA N°");

        txt_idfactura.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Lucida Bright", 1, 13)); // NOI18N
        jLabel11.setText("CLIENTE:");

        jLabel12.setFont(new java.awt.Font("Lucida Bright", 1, 13)); // NOI18N
        jLabel12.setText("EMPLEADO:");

        combo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_clienteActionPerformed(evt);
            }
        });

        combo_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_empleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Btn_imprimirFactura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_nuevo)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Guardar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(383, 383, 383)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(txt_SubTotal_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_total_factura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_iva_factura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(55, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(combo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(combo_empleado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_idfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10)
                    .addComponent(txt_idfactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(combo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(combo_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_SubTotal_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_iva_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_total_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Guardar)
                    .addComponent(Btn_imprimirFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_nuevo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_precio_unidad_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precio_unidad_facturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precio_unidad_facturaActionPerformed

    private void txt_SubTotal_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SubTotal_facturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SubTotal_facturaActionPerformed

    private void txt_descripcion_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descripcion_facturaActionPerformed
        
    }//GEN-LAST:event_txt_descripcion_facturaActionPerformed

    private void btn_anadir_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anadir_facturaActionPerformed
        String descripcion = txt_descripcion_factura.getText();
        double precioUnidad = Double.parseDouble(txt_precio_unidad_factura.getText());
        int cantidad = Integer.parseInt(txt_cantidad_factura.getText());

        double total = precioUnidad * cantidad;

        DefaultListModel<String> cantidadListModel = (DefaultListModel<String>) List_Cantidad.getModel();
        cantidadListModel.addElement(Integer.toString(cantidad));

        DefaultListModel<String> descripcionListModel = (DefaultListModel<String>) List_descripcion.getModel();
        descripcionListModel.addElement(descripcion);

        DefaultListModel<String> precioListModel = (DefaultListModel<String>) List_precio.getModel();
        precioListModel.addElement(Double.toString(precioUnidad));

        DefaultListModel<String> totalListModel = (DefaultListModel<String>) List_total.getModel();
        totalListModel.addElement(Double.toString(total));
    }//GEN-LAST:event_btn_anadir_facturaActionPerformed

    private void Btn_imprimirFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_imprimirFacturaActionPerformed
        FDM_DetalleFactura fdmdetalle = new FDM_DetalleFactura();
        fdmdetalle.setVisible(true);
    }//GEN-LAST:event_Btn_imprimirFacturaActionPerformed

    private void ComboBox_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_CodigoActionPerformed
        String selectedProduct = (String) ComboBox_Codigo.getSelectedItem();
        try {
            getProductDetails(selectedProduct);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ComboBox_CodigoActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
    
    
    this.nuevo();
    txt_descripcion_factura.setText("");
    txt_precio_unidad_factura.setText("");
    txt_cantidad_factura.setText("");

    DefaultListModel<String> cantidadListModel = new DefaultListModel<>();
    DefaultListModel<String> descripcionListModel = new DefaultListModel<>();
    DefaultListModel<String> precioListModel = new DefaultListModel<>();
    DefaultListModel<String> totalListModel = new DefaultListModel<>();

    List_Cantidad.setModel(cantidadListModel);
    List_descripcion.setModel(descripcionListModel);
    List_precio.setModel(precioListModel);
    List_total.setModel(totalListModel);

    txt_SubTotal_factura.setText("");
    txt_iva_factura.setText("");
    txt_total_factura.setText("");
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        
        this.agregar();
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void txt_cantidad_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidad_facturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidad_facturaActionPerformed

    private void txt_codigo_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigo_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigo_productoActionPerformed

    private void combo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_clienteActionPerformed
        String clienteSeleccionado = (String) combo_cliente.getSelectedItem();
        try {
            getClienteDetails(clienteSeleccionado);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_combo_clienteActionPerformed

    private void combo_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_empleadoActionPerformed
        String empleadoSeleccionado = (String) combo_cliente.getSelectedItem();
        try {
            getEmpleadoDetails(empleadoSeleccionado);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_combo_empleadoActionPerformed

    private void txt_codigo_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigo_empleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigo_empleadoActionPerformed

private void fillComboBoxWithProductIDs() throws SQLException {
        // Llenar el ComboBox con los ID_PRODUCTO de la base de datos
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/productosbd", "root", "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT PRODUCTO FROM producto");

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
            while (rs.next()) {
                comboBoxModel.addElement(rs.getString("PRODUCTO"));
            }
            ComboBox_Codigo.setModel(comboBoxModel);

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void getProductDetails(String product) throws SQLException {
        // Obtener la descripción y el precio de un producto por su ID
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/productosbd", "root", "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT ID_PRODUCTO, DESCRIPCION, PVP FROM producto WHERE PRODUCTO = '" + product + "'");

            if (rs.next()) {
                txt_descripcion_factura.setText(rs.getString("DESCRIPCION"));
                txt_precio_unidad_factura.setText(rs.getString("PVP"));
                txt_codigo_producto.setText(rs.getString("ID_PRODUCTO"));
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void fillComboBoxWithClientIDs() {
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/productosbd", "root", "");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT ID_CLIENTE FROM cliente");

        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        while (rs.next()) {
            comboBoxModel.addElement(rs.getString("ID_CLIENTE"));
        }
        combo_cliente.setModel(comboBoxModel);

        rs.close();
        stmt.close();
        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
   private void getClienteDetails(String product) throws SQLException {
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/productosbd", "root", "");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT ID_CLIENTE FROM cliente WHERE ID_CLIENTE = '" + product + "'");

        if (rs.next()) {
            txt_codigo_cliente.setText(rs.getString("ID_CLIENTE"));
        }

        rs.close();
        stmt.close();
        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    //ID_EMPLEADO
    
      private void fillComboBoxWithEmpleadoIDs() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/productosbd", "root", "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT ID_EMPLEADO FROM empleado");

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
            while (rs.next()) {
                comboBoxModel.addElement(rs.getString("ID_EMPLEADO"));
            }
            combo_empleado.setModel(comboBoxModel);

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void getEmpleadoDetails(String product) throws SQLException {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/productosbd", "root", "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT ID_EMPLEADO FROM empleado WHERE ID_EMPLEADO = '" + product + "'");

            if (rs.next()) {
                txt_codigo_empleado.setText(rs.getString("ID_EMPLEADO"));
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void nuevo() {
        try {
            Factura_beans fb = new Factura_beans();
            txt_idfactura.setText("" + fb.incremento_factura());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error... :/" + e.toString());
        }
    }
    
    public JButton getContinuarButtonFactura() {
        return Btn_imprimirFactura;
    }
    
    
    public void agregar() {
    DefaultListModel<String> totalListModel = (DefaultListModel<String>) List_total.getModel();
    double subTotal = 0;

    for (int i = 0; i < totalListModel.size(); i++) {
        subTotal += Double.parseDouble(totalListModel.getElementAt(i));
    }

    txt_SubTotal_factura.setText(Double.toString(subTotal));
    double iva = subTotal * 0.12;
    txt_iva_factura.setText(Double.toString(iva));
    double total = subTotal + iva;
    txt_total_factura.setText(Double.toString(total));

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String fechaActual = dateFormat.format(date);

    try {
        Factura_beans fb = new Factura_beans();
        int idFactura = Integer.parseInt(txt_idfactura.getText());
        int idCliente = Integer.parseInt(txt_codigo_cliente.getText());
        int idEmpleado = Integer.parseInt(txt_codigo_empleado.getText());
        fb.setId_factura(idFactura);
        fb.setId_cliente(idCliente);
        fb.setId_empleado(idEmpleado);
        fb.setFecha(fechaActual);
        fb.setSubtotal(subTotal);
        fb.setIva(iva); 
        fb.setTotal(total);
        
        
        fb.insertar_factura();
        
        JOptionPane.showMessageDialog(null, "¡Factura Agregada Satisfactoriamente!");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error... ¡NO se pudo agregar factura! " + e.toString());
    }
}
    public JButton getContinuarButtonDetalle() {
        return Btn_imprimirFactura;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_imprimirFactura;
    private javax.swing.JComboBox<String> ComboBox_Codigo;
    private javax.swing.JList<String> List_Cantidad;
    private javax.swing.JList<String> List_descripcion;
    private javax.swing.JList<String> List_precio;
    private javax.swing.JList<String> List_total;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_anadir_factura;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JComboBox<String> combo_cliente;
    private javax.swing.JComboBox<String> combo_empleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbl_Codigo;
    private javax.swing.JLabel lbl_cantidad;
    private javax.swing.JLabel lbl_cantidad1;
    private javax.swing.JLabel lbl_cantidad2;
    private javax.swing.JLabel lbl_codigo_factura;
    private javax.swing.JLabel lbl_descripcion;
    private javax.swing.JLabel lbl_p_unidad;
    private javax.swing.JTextField txt_SubTotal_factura;
    private javax.swing.JTextField txt_cantidad_factura;
    private javax.swing.JTextField txt_codigo_cliente;
    private javax.swing.JTextField txt_codigo_empleado;
    private javax.swing.JTextField txt_codigo_producto;
    private javax.swing.JTextField txt_descripcion_factura;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_idfactura;
    private javax.swing.JTextField txt_iva_factura;
    private javax.swing.JTextField txt_precio_unidad_factura;
    private javax.swing.JTextField txt_total_factura;
    // End of variables declaration//GEN-END:variables




}
