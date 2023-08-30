
package Clases;

import java.sql.ResultSet;
import java.sql.SQLException;


public class Detalle_beans {
    private int id_detalle;
    private int id_factura;
    private int id_producto;
    private int cantidad;
    private double pvp;
    private double precio_uni;
    private accesobd dfd;

    public Detalle_beans() {
        dfd = new accesobd("localhost", "root", "", "productosbd");
        dfd.conectarBD();
    }

    public int getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    public double getPrecio_uni() {
        return precio_uni;
    }

    public void setPrecio_uni(double precio_uni) {
        this.precio_uni = precio_uni;
    }
        public int incremento_detalle() throws SQLException {
        int inc = 0;
        ResultSet rs;
        rs = dfd.consultaBD("SELECT max(id_detalle) as num FROM detalle_factura;");
        if (rs.next()) {
            inc = rs.getInt(1) + 1;
        } else {
            inc = 1;
        }
        return inc;
    }

    public void insertar_detalle() throws SQLException {
        try {
            String cadena = "insert into factura values ('" + incremento_detalle() + "','" + getId_factura() + "','" + getId_producto() + "','"  + "','" + getCantidad() + "','" + getPvp() + "','" + getPrecio_uni() + ")";
            dfd.actualizarBD(cadena);
        } catch (SQLException e) {

        }
    }

    public void eliminar_detalle(String idDetalle) throws SQLException {

        String sql = "DELETE FROM detalle_factura WHERE id_detalle = " + idDetalle;
        dfd.actualizarBD(sql);
    }

    public ResultSet consultaTabla(String sql) throws SQLException {
        return dfd.consultaBD(sql);
    }
    
}
