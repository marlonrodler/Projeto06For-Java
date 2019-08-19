/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto06for;

/**
 *
 * @author aluno
 */
public class Projeto06For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* for (inicializacao; condicao; incremento){
            
           }
        */
        
        for(int i = 0; i < 10; i++){
            System.out.println("Valor de i: " + i);
        }
        
        //Escopo de variavel
        
        int i;
        
        for(i = 0; i < 10; i++){
            System.out.println("Valor de i: " + i);
        }
        System.out.println("Valor de i: " + i);
        
        
        
        
    }
}
