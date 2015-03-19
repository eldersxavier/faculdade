/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

//import java.sql.Connection;
import com.mysql.jdbc.Connection;
import conexao.ConnectionFactory;
import java.sql.SQLException;
import model.Contatos_java;
import controler.DAO;
import java.util.List;
import view.Form_Agenda;




/**
 *
 * @author X-E
 */
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
      
       
  /*  Contatos_java contato = new Contatos_java();
        contato.setNome("teste atualizando novamente");
        contato.setTelefone("(11) 2221-2222");
        contato.setCelular("(11) 99991-9999");
        contato.setEmail("teste1@teste.com.br");
        contato.setEndereco("Rua testando");
        contato.setNumero("1");
        contato.setBairro("Vila Testada");
        contato.setCidade("Do Teste");
        contato.setEstado("São Paulo");        
        contato.setPais("Brasil");
        contato.setId(17);
        DAO dao = new DAO();
        //setAdiciona(contato);
        //dao.setAdiciona(contato);
        //contato.setId(1);
        //dao.setAtualiza(contato);
        dao.setDeleta(contato);
        //int cont = 0;
        //while(cont < 10){
          //  dao.setAdiciona(contato);
//            cont ++;
  //     
  * */     
        
        Form_Agenda form = new Form_Agenda();
            form.show();
        
        
    }
    
    
}
