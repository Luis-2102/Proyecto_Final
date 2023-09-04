package Clases;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cliente_beans {
    
    private int id_cliente;
    private String nombres;
    private String apellidos;
    private String cedula;
    private String direccion;
    private String correo;
    private String telefono;
    private accesobd bd;
    
    public Cliente_beans() throws SQLException {
        bd = new accesobd("localhost", "root", "", "productosbd");
        bd.conectarBD();
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public int incremento_Cliente() throws SQLException{
        int inc=0;
        ResultSet rs;
        rs = bd.consultaBD("SELECT max(id_cliente) as num FROM cliente;");
        if (rs.next()){
            inc = rs.getInt(1)+1;
        }else{
            inc = 1;
        }
        return inc;
    }
    public void insertar_cliente() throws SQLException{
        try{
            String cadena = "insert into cliente values ('" + incremento_Cliente() + "','" + getNombres() + "','" + getApellidos() + "','" + getCedula() + "','" + getDireccion() + "','" + getCorreo() + "','" + getTelefono() + "')";
            bd.actualizarBD(cadena);
        } catch (SQLException e){
        
        }
    }

    public void eliminar_cliente(String idCliente) throws SQLException{
        
        String sql = "DELETE FROM cliente WHERE id_cliente = " + idCliente;
        bd.actualizarBD(sql);
    }
    public ResultSet consultaTabla(String sql) throws SQLException{
        return bd.consultaBD(sql);
    }
    
    public void consultar_cliente() throws SQLException{
        ResultSet rs;
       rs = bd.consultaBD("select * from cliente");
       while (rs.next()){
           System.out.print(rs.getInt(1)+ "   ");
           System.out.print(rs.getString(2)+ "   ");
           System.out.print(rs.getString(3) + "   ");
           System.out.print(rs.getString(4) + "   ");
           System.out.print(rs.getString(5)+ "   ");
           System.out.print(rs.getString(6)+ "   ");
           System.out.print(rs.getString(7)+ "   ");
           System.out.println("");
        }
    }
    
}
