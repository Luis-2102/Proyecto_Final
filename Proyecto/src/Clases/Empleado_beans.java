
package Clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Empleado_beans {

    private int id_empleado;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String correo;
    private accesobd ed;

    public Empleado_beans() throws SQLException {
        ed = new accesobd("localhost", "root", "", "productosbd");
        ed.conectarBD();
    }

    public int getId_Empleado() {
        return id_empleado;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setId_Empleado(int id_factura) {
        this.id_empleado = id_factura;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int incremento_empleado() throws SQLException {
        int inc = 0;
        ResultSet rs;
        rs = ed.consultaBD("SELECT max(id_empleado) as num FROM empleado;");
        if (rs.next()) {
            inc = rs.getInt(1) + 1;
        } else {
            inc = 1;
        }
        return inc;
    }

    public void insertar_empleado() throws SQLException {
        try {
            String cadena = "insert into empleado values ('" + incremento_empleado() + "','" + getNombres() + "','" + getApellidos() + "','" + getCorreo() + "', '" + getTelefono() + "')";
            ed.actualizarBD(cadena);
        } catch (SQLException e) {

        }
    }
    public ResultSet consultaTabla(String sql) throws SQLException {
        return ed.consultaBD(sql);
    }
    public void eliminar_empleado(String idEmpleado) throws SQLException {

        String sql = "DELETE FROM empleado WHERE id_empleado = " + idEmpleado;
        ed.actualizarBD(sql);
    }

    public void consultar_empelado() throws SQLException {
        ResultSet rs;
        rs = ed.consultaBD("select * from empleado");
        while (rs.next()) {
            System.out.print(rs.getInt(1) + "   ");
            System.out.print(rs.getString(2) + "   ");
            System.out.print(rs.getString(3) + "   ");
            System.out.print(rs.getString(4) + "   ");
            System.out.print(rs.getString(5) + "   ");
            System.out.println("");
        }
    }
        public ResultSet consultarEmpleadoPorNombre(String nombreProducto) throws SQLException {
        String sql = "select * from empleado WHERE nombres AND apellidos = ?";
        PreparedStatement statement = ed.prepareStatement(sql);
        statement.setString(1, nombreProducto);
        return statement.executeQuery();
    }
}
