/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer35_estructurada;

/**
 *
 * @author Thor(El Dios)
 */
public class Ejer35_Estructurada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int result;
        int combina;
        int combina_u;
        int aciertos=0;
        int total=1;
        
        
        while(total<=15){

            combina = (int)(Math.random()*3);

            switch(combina){
                case 0: combina=0;
                System.out.println("El resultado "+total+" es X");
                break;
                case 1: combina=1;
                System.out.println("El resultado "+total+" es "+combina);
                break;
                case 2: combina=2;
                System.out.println("El resultado "+total+" es "+combina);
                break;
            }//Fin switch

            combina_u = (int)(Math.random()*3);

            switch(combina_u){
                case 0: combina_u=0;
                 System.out.println("Tu resultado "+total+" es X");
                break;
                case 1: combina_u=1;
                 System.out.println("Tu resultado "+total+" es "+combina);
                break;
                case 2: combina_u=2;
                 System.out.println("Tu resultado "+total+" es "+combina);
                break;
            }//Fin switch
            if(combina==combina_u){
                aciertos++;
            }//Fin if
            total++;
        }//Fin while
        
        System.out.println("Los aciertos son: "+aciertos);
    }//Fin main
    
}
