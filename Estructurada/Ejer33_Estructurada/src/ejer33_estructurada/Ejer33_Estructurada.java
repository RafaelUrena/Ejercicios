/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer33_estructurada;

/**
 *
 * @author Rasputin
 */
public class Ejer33_Estructurada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int cont=0;
        
        while(cont<=6){
            
            n = (int) (Math.random() * 49) + 1;
            
            System.out.print(n+" ");
            
            cont++;
        }//Fin while
        
    }//Fin main
    
}
