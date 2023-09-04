
package programa1;

import java.sql.*;
import Interfaz.FDM_cliente;
import Interfaz.FDM_empleado;
import Interfaz.FDM_producto;
import Interfaz.FDM_Factura;
import Interfaz.FDM_DetalleFactura;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

public class Programa1 {

    public static void main(String[] args) throws SQLException {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FDM_empleado fe = new FDM_empleado(); // Manejar la excepción adecuadamente
                fe.setVisible(true); // Mostrar la interfaz FDM_empleado
                fe.getContinuarButtonEmpleado().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        fe.dispose(); // Cerrar la interfaz FDM_empleado

                        FDM_producto fp = new FDM_producto();
                        fp.setVisible(true); // Mostrar la interfaz FDM_producto

                        fp.getContinuarButtonProducto().addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                fp.dispose(); // Cerrar la interfaz FDM_producto

                                FDM_cliente fc = new FDM_cliente();
                                fc.setVisible(true); // Mostrar la interfaz FDM_cliente

                                fc.getContinuarButtonCliente().addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        fc.dispose(); // Cerrar la interfaz FDM_cliente

                                        try {
                                            FDM_Factura ff = new FDM_Factura();
                                            ff.setVisible(true); // Mostrar la interfaz FDM_Factura

                                            ff.getContinuarButtonFactura().addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    ff.dispose(); // Cerrar la interfaz FDM_Factura

                                                    FDM_DetalleFactura df = new FDM_DetalleFactura();
                                                    df.setVisible(true); // Mostrar la interfaz FDM_DetalleFactura
                                                    df.getBtn_Salir().addActionListener(new ActionListener() {
                                                        @Override
                                                        public void actionPerformed(ActionEvent e) {
                                                            df.dispose();
                                                        }
                                                    });
                                                            
                                                }
                                            });
                                        } catch (SQLException ex) {
                                            ex.printStackTrace();
                                            
                                        }
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }
}
