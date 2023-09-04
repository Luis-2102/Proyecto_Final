
package Clases;

import java.sql.ResultSet;
import java.sql.SQLException;


public class Factura_beans {
    private int id_factura;
    private int id_empleado;
    private int id_cliente;
    private String fecha;
    private double subtotal;
    private double iva;
    private double total;
    private accesobd fd;

    public Factura_beans() {
        fd = new accesobd("localhost", "root", "", "productosbd");
        fd.conectarBD();
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int incremento_factura() throws SQLException {
        int inc = 0;
        ResultSet rs;
        rs = fd.consultaBD("SELECT max(ID__FACTURA) as num FROM factura;");
        if (rs.next()) {
            inc = rs.getInt(1) + 1;
        } else {
            inc = 1;
        }
        return inc;
    }

    public void insertar_factura() throws SQLException {
    try {
        String cadena = "insert into factura values ('" + incremento_factura() + "','" + getId_empleado() + "','" + getId_cliente() + "','" + getFecha() + "','" + getSubtotal() + "','" + getIva() + "','" + getTotal() + "')";
        fd.actualizarBD(cadena);
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    public void eliminar_factura(String idFactura) throws SQLException {

        String sql = "DELETE FROM factura WHERE id_factura = " + idFactura;
        fd.actualizarBD(sql);
    }

    public ResultSet consultaTabla(String sql) throws SQLException {
        return fd.consultaBD(sql);
    }

    public void consultar_factura() throws SQLException {
        ResultSet rs;
        rs = fd.consultaBD("select * from factura");
        while (rs.next()) {
            System.out.print(rs.getInt(1) + "   ");
            System.out.print(rs.getInt(2) + "   ");
            System.out.print(rs.getInt(3) + "   ");
            System.out.print(rs.getInt(4) + "   ");
            System.out.print(rs.getInt(5) + "   ");
            System.out.print(rs.getFloat(6) + "   ");
            System.out.print(rs.getFloat(7) + "   ");
            System.out.println("");
        }
    }


}
