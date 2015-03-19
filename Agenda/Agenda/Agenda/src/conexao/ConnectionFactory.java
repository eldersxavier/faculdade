/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author X-E
 * 
 */
public class ConnectionFactory {
    //cria conexão com banco de dados
    public java.sql.Connection getConnection() throws ClassNotFoundException {
        String SERVER = "localhost";
        String DATABASE = "agenda";
        String USUARIO = "root";
        String SENHA = "";        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://"+SERVER+"/"+DATABASE,USUARIO,SENHA);
        }
        catch (SQLException e) {
           throw new RuntimeException(e);
        }
    }
    
    
}
