

package exercicios;

import java.util.Scanner;

/**
 *
 * @author 1323594
 */
public class Exercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner input; 
        float num1,num2, SOMA;       
        input = new Scanner(System.in);
        num1 =0;
        num2 =0;
        SOMA = 0;
        System.out.println("Digite o primeiro valor \n");
        num1 = input.nextFloat();        
        System.out.println("\n Digite o segundo valor \n");
        num2 = input.nextFloat();          
        
        SOMA = num1 + num2;       
        System.out.printf("\n ADIÇÃO É IGUAL A %.2f \n",SOMA);                                    
        SOMA = num1 - num2;       
        System.out.printf("\n SUBTRAÇÃO É IGUAL A %.2f \n",SOMA);
                
        SOMA = num1 * num2;       
        System.out.printf("\n A MUTIPLICAÇÃO É IGUAL A %.2f \n",SOMA);                    
                
        SOMA = num1 / num2;       
        System.out.printf("\n A DIVISÃO É IGUAL A %.2f \n",SOMA);
                
           
        /*exercicio 2*/            
            
        input = new Scanner(System.in);
        System.out.println("\n Digite o valor do Raio \n");
        num1 = input.nextFloat();
        num2 = Float.parseFloat("3.1416"); 
        SOMA =  num2 * (num1 * num1);
        System.out.printf("\n VALOR DA AREA DO CIRCULO: %.2f \n",SOMA);       
        SOMA =  (2 *num2) * num1;
        System.out.printf("\n VALOR DO PEROMETRO DO CIRCULO: %.2f \n",SOMA);       
        
    }
    
}
