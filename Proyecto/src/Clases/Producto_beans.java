
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Producto_beans {

    private int id_producto;
    private String nombre_producto;
    private String descripcion;
    private int stock;
    private float pvp;
    private accesobd pd;
    

    public Producto_beans() throws SQLException {
        pd = new accesobd("localhost", "root", "", "productosbd");
        pd.conectarBD();

    }
    // Getters y Setters

    public int getIdProducto() {
        return id_producto;
    }

    public void setIdProducto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombreProducto() {
        return nombre_producto;
    }

    public void setNombreProducto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPvp() {
        return pvp;
    }

    public void setPvp(float pvp) {
        this.pvp = pvp;
    }

    public int incremento_Producto() throws SQLException {
        int inc = 0;
        ResultSet rs;
        rs = pd.consultaBD("SELECT max(id_producto) as num FROM producto;");
        if (rs.next()) {
            inc = rs.getInt(1) + 1;
        } else {
            inc = 1;
        }
        return inc;
    }

    public void insertar_producto() throws SQLException {
        try {
            String cadena = "insert into producto values ('" + incremento_Producto() + "','" + getNombreProducto() + "','" + getDescripcion() + "','" + getStock() + "','" + getPvp() + "')";
            pd.actualizarBD(cadena);
        } catch (SQLException e) {

        }
    }

    public void eliminar_producto(String idProducto) throws SQLException {

        String sql = "DELETE FROM producto WHERE id_producto = " + idProducto;
        pd.actualizarBD(sql);
    }

    public ResultSet consultaTabla(String sql) throws SQLException {
        return pd.consultaBD(sql);
    }

    public void consultar_producto() throws SQLException {
        ResultSet rs;
        rs = pd.consultaBD("select * from producto");
        while (rs.next()) {
            System.out.print(rs.getInt(1) + "   ");
            System.out.print(rs.getString(2) + "   ");
            System.out.print(rs.getString(3) + "   ");
            System.out.print(rs.getInt(4) + "   ");
            System.out.print(rs.getInt(5) + "   ");
            System.out.println("");
        }
    }
    public void establecerConexion(Connection conexion) {
        this.pd = (accesobd) conexion;
    }


    public ResultSet consultarProductos() throws SQLException {
        String consulta = "SELECT * FROM producto";
        return pd.consultaBD(consulta);
    }
}
