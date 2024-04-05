package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private final String stringConexion = "jdbc:oracle:thin:@server.oracle.com:1521/xepdb1";
    private final String User = "dentista";
    private final String Pass = "123";
    private Connection conexion;
    //Metodo para acceder a la BD

    public ConexionBD() {
        conexion = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conexion = DriverManager.getConnection(stringConexion, User, Pass);
        } catch (ClassNotFoundException e) {
            System.out.println("No se encuentra el driver");
        } catch (SQLException e) {
            System.out.println("Error en la conexion");
            e.printStackTrace();
        }
        //return conexion;
    }

    public Connection getConexion() {

        return this.conexion;
    }

    public void desconectar() {
        this.conexion = null;
    }

    public static void main(String[] args) {
        if (new ConexionBD().getConexion() != null) {
            System.out.println("Conexion exitosa");
        } else {
            System.out.println("Conexion fallida");
        }
    }

}
