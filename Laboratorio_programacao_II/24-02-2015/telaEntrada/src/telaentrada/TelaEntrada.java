
package telaentrada;

import javax.swing.JOptionPane;

/**
 *
 * @author 1323594
 */
public class TelaEntrada {
    public static void main(String[] args) {
        String idade;
        
        
        idade = JOptionPane.showInputDialog("Entre com a idade");
        
        JOptionPane.showMessageDialog(null, "A IDADE É " +idade);
       
    }
    
}
