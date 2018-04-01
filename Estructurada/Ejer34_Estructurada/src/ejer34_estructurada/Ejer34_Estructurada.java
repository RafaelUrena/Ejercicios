/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer34_estructurada;

/**
 *
 * @author El de mi derecha
 */
public class Ejer34_Estructurada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int result;
        int combina;
        
        for(result=1;result<=15;result++){
            
            combina = (int)(Math.random()*3);
            
            switch(combina){
                case 0: System.out.println("El resultado "+result+" es 1");
                break;
                case 1: System.out.println("El resultado "+result+" es X");
                break;
                case 2: System.out.println("El resultado "+result+" es 2");
                break;
            }//Fin switch
            
        }//Fin for
    }//Fin main
    
}
