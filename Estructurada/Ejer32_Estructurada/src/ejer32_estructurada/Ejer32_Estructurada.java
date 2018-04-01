/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer32_estructurada;

/**
 *
 * @author Morty Martillo Nvl:99
 */
public class Ejer32_Estructurada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int cont;
        boolean es_primo;
        
        for(n=1;n<=100;n++){
            es_primo=true;
                    cont=2;
                    
                    while(es_primo && cont<n){
                            if(n % cont==0) es_primo=false;
                            cont++;
                            
                    }//Fin while
                    if(es_primo) System.out.println(n);
        }//Fin for
    }//Fin main
    
}
