package practicandojavasql;

import java.sql.*;


/**
 * Clase que implementaria el patron DAO
 * 
 * @author alberto
 */
public class UsuarioDAO {
    
    protected Conexion conexion;
    
    /**
     * Constructor de la clase que crea la conexion con la base de datos
     */
    public UsuarioDAO(){
        this.conexion = new Conexion();
    }
    
    /**
     * Anyade un usuario a la tabla de usuarios
     * 
     * @param nombre 
     * @param apellidos
     * @param edad 
     * @throws java.sql.SQLException 
     */
    public void registrarUsuario(String nombre, String apellidos, int edad) throws SQLException, Exception{
        conexion.openConnection();
        System.out.println("Conexion abierta");
        Statement st = conexion.createStatement();
        st.executeUpdate("INSERT INTO usuarios (nombre, apellidos,edad) values('" + nombre + "'  , '" + apellidos + "'  ," + edad + "  )");
        conexion.closeConnection();
    }
    
    
}
