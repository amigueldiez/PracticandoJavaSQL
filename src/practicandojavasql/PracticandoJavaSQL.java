
package practicandojavasql;

import java.sql.SQLException;

/**
 * Clase principal
 * 
 * @author alber
 */
public class PracticandoJavaSQL {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException, Exception {
        // Voy a insertar un usuario en la DB
        UsuarioDAO ud = new UsuarioDAO();
        ud.registrarUsuario("Guzman", "Gonzalez", 12);
    }
    
}
