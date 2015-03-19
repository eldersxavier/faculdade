/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conexao.ConnectionFactory;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Contatos_java;
/**
 *
 * @author X-E
 */
public class DAO {
    
    protected Connection connection;
    //construtor inica copnexão para classe
    public DAO() {
        try {
            this.connection = (Connection) new ConnectionFactory().getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro em conexão com banco de dados na classe DAO -> Construtor! \n log error:" + ex);            
        }
    }    
    
    //Função Adiciona contatos para Bando de dados
    public void setAdiciona(Contatos_java contato) {
        String sql = "insert into contatos " +
                "(nome,telefone,celular,email,endereco,numero,bairro,cidade,estado,pais)" +
                " values (?,?,?,?,?,?,?,?,?,?)";
    try {
    
        PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
        // seta os valores
        //stmt.setInt(1,contato.getId());
        stmt.setString(1,contato.getNome());
        stmt.setString(2,contato.getTelefone());
        stmt.setString(3,contato.getCelular());
        stmt.setString(4,contato.getEmail());
        stmt.setString(5,contato.getEndereco());
        stmt.setString(6,contato.getNumero());
        stmt.setString(7,contato.getBairro());
        stmt.setString(8,contato.getCidade());
        stmt.setString(9,contato.getEstado());        
        stmt.setString(10,contato.getPais());
        
        //contato.getDataNascimento().getTimeInMillis()));
// executa
        stmt.execute();
        stmt.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro em conexão com banco de dados na classe DAO -> Adiciona! \n log error:" + e);
    //throw new RuntimeException(e);
    }
    
  }
    
    
  //Função Atualiza contatos para Bando de dados
    public void setAtualiza(Contatos_java contato) {
        String sql = "update contatos set "+                
		"nome=?, telefone=?, celular=?, email=?, endereco=?, numero=?, bairro=?, cidade=?, estado=?, pais=?" +
                "where id = ?";		
    try {
    
        PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
        // seta os valores          
        stmt.setString(1,contato.getNome());
        stmt.setString(2,contato.getTelefone());
        stmt.setString(3,contato.getCelular());
        stmt.setString(4,contato.getEmail());
        stmt.setString(5,contato.getEndereco());
        stmt.setString(6,contato.getNumero());
        stmt.setString(7,contato.getBairro());
        stmt.setString(8,contato.getCidade());
        stmt.setString(9,contato.getEstado());        
        stmt.setString(10,contato.getPais());
        stmt.setInt(11,contato.getId());  
        
        
        // executa
        stmt.execute();
        stmt.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro em conexão com banco de dados na classe DAO -> setDeleta! \n log error: \n" + e);
    //throw new RuntimeException(e);
    }
  }
    //Função Deleta contato para Bando de dados
    public void setDeleta(Contatos_java contato) {
        String sql = "delete from contatos "+                		
                "where id = ?";		
        
    try {
    
        PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
        // seta os valores                  
        stmt.setInt(1,contato.getId());  
        
        
        // executa
        stmt.execute();
        stmt.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro em conexão com banco de dados na classe DAO -> setAtualiza! \n log error: \n" + e);
    //throw new RuntimeException(e);
    }
    
  }
  //Lista todos os contatos
  public List<Contatos_java> getLista(){
      List<Contatos_java> contatos = new ArrayList<Contatos_java>();
        try {            
            PreparedStatement stmt = (PreparedStatement) this.connection.
            prepareStatement("select * from contatos");
            ResultSet rs = stmt.executeQuery();

             while (rs.next()) {
            //criando o objeto Contato
            Contatos_java contato = new Contatos_java();
            contato.setId(rs.getInt("id"));
            contato.setNome(rs.getString("nome"));
            contato.setTelefone(rs.getString("telefone"));
            contato.setCelular(rs.getString("celular"));
            contato.setEmail(rs.getString("email"));
            contato.setEndereco(rs.getString("endereco"));
            contato.setNumero(rs.getString("numero"));
            contato.setBairro(rs.getString("bairro"));
            contato.setCidade(rs.getString("cidade"));
            contato.setEstado(rs.getString("estado"));
            contato.setPais(rs.getString("pais"));
            //contato.setNome(rs.getString("nome"));
            //contato.setEmail(rs.getString("email"));
            //contato.setEndereco(rs.getString("endereco"));            
            contatos.add(contato);
            }
            rs.close();
            stmt.close();
    //return contatos;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro em conexão com banco de dados na classe DAO -> getLista \n log error: \n" + e);
    //throw new RuntimeException(e);
    }
//return contatos;
        return contatos;
  }
    

    
}

