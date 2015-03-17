/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soma;

import java.util.Scanner;

/**
 *
 * @author 1323594
 */
public class Soma {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1,num2, SOMA;
        System.out.println("Digite o primeiro valor \n");
        num1 = input.nextFloat();
        
        System.out.println("\n Digite o segundo valor \n");
        num2 = input.nextFloat();
        
        SOMA = num1 + num2;
        
        System.out.printf("\n SOMA É IGUAL A %.2f \n",SOMA);
    }
    
}
