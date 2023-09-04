package Clases;

import java.sql.*;
public class accesobd {
    private final String host;
    private final String user;
    private final String passwd;
    private final String bd;
    //*********** *******
    private Connection conexion;
    
    public accesobd(String host, String user, String passwd, String bd) {
        this.host = host;
        this.user = user;
        this.passwd = passwd;
        this.bd = bd;
    }

    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getBd() {
        return bd;
    }
        
    public void conectarBD(){
        try {
                Driver driver =(Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
                String cadena= "jdbc:mysql://"+ getHost()+ "/" + getBd();
                conexion=DriverManager.getConnection(cadena, getUser(), getPasswd());
                System.out.println("Conexion Exitosa a la base de Datos... Siuuuuuu");
        } catch(Exception e){
            System.out.println("Error en la conexion de la base de datos... :/" + e.toString());
        }
    }
    
    public void actualizarBD(String sql){
        try {
            Statement stm = conexion.createStatement();
            stm.executeUpdate(sql);
            System.out.println("Transaccion exitosa... siuuuuuu");
        } catch(SQLException e){
            System.out.println("Error em la transaccion... Rollblack " + e.toString() );
        }
    }
    public ResultSet consultaBD(String sql)throws SQLException{
        ResultSet cursor;
        Statement stm = conexion.createStatement();
        cursor = stm.executeQuery(sql);
        return cursor;
    }
    public void cerrarBD()throws SQLException{
        if (conexion != null) {
            conexion.close();
            System.out.println("Conexión cerrada");
        }
    }

public PreparedStatement prepareStatement(String sql) throws SQLException {
    return conexion.prepareStatement(sql);
}
}
