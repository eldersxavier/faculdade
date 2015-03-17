/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author 1323594
 */
public class Exercicio_1 {
        
        
        /*
               
        */
        
        public void ExecutarPrimeiro(){            
            String nome;
            String rg;
            String cpf;
            String endereco;
            String cep;
            String estado;
            String pais;
            String idade;
            String escolaridade;
            String exibir;
            nome = JOptionPane.showInputDialog("Entre com o nome");
            rg = JOptionPane.showInputDialog("Entre com o RG");
            cpf = JOptionPane.showInputDialog("Entre com o CPF");
            endereco = JOptionPane.showInputDialog("Entre com a endereco");
            cep = JOptionPane.showInputDialog("Entre com o CEP");
            estado = JOptionPane.showInputDialog("Entre com o estado");
            pais = JOptionPane.showInputDialog("Entre com o país");
            idade = JOptionPane.showInputDialog("Entre com a idade");
            escolaridade = JOptionPane.showInputDialog("Entre com a escolaridade");        
        
            exibir = "NOME: " + nome +"\n"
                    +"RG: " +rg +"\n"
                    +"CPF: " +cpf +"\n"
                    +"ENDEREÇO: " +endereco +"\n"
                    +"CEP: " +cep+"\n"
                    +"ESTADO: " +estado +"\n"
                    +"PAÍS: " +pais +"\n"
                    +"A IDADE É " +idade +"\n"
                    +"ESCOLARIDADE: " +escolaridade+"\n";

            JOptionPane.showMessageDialog(null, exibir);
        }
    
        
        public void ExecutarSegundo(){
            float soma, num1, num2;
            
            num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor"));
            
            num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor"));
            
            soma = num1 + num2;
            
            String mensagem = String.format("SOMA = % .2f", soma);
            
            JOptionPane.showMessageDialog(null, mensagem);
            
        }
        
        public void ExeExercicio1(){
            float num1, num2;
            
            num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor"));
            
            num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor"));
            
            String mensagem = "SOMA: "+String.format("% .2f", num1 + num2)+"\n" 
                            + "SUBITRAÇÃO: "+String.format("% .2f", num1 - num2)+"\n" 
                            +"MULTIPLICAÇÃO: "+String.format("% .2f", num1 * num2)+"\n" 
                            + "DIVISÃO: "+String.format("% .2f", num1 + num2)+"\n" 
                    ;
            JOptionPane.showMessageDialog(null, mensagem);
            
        }
        
        public void ExeExercicio2(){
            float raio, pi, valor;
            String mensagem;
            pi = (float) Math.PI;
            raio = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do raio"));          
            
            mensagem = "ARÉA: "+String.format("% .2f", pi*(raio*raio))+"\n"
                     + "PERÍMETRO: "+String.format("% .2f", 2*pi*raio)+"\n"
                     + "DIAMETRO: "+String.format("% .2f", 2*raio)+"\n"
                    ; 
            JOptionPane.showMessageDialog(null, mensagem);
        }
}
