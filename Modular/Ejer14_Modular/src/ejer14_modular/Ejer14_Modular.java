/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer14_modular;

/**
 *
 * @author Rafalaptop
 */
public class Ejer14_Modular {

    static boolean primo(int n){
        int cont=2;
        boolean es_primo=true;
        
        while(cont<n && es_primo==true){
            if(n % cont==0) es_primo=false;
            cont++;
        }//Fin while
        
        return es_primo;
    }//Fin primo----------------------------------------------------------------
    
    public static void main(String[] args) {
        int n;
        
        for(n=1;n!=100;n++){
            if(primo(n))System.out.println(n);
        }//Fin for
    }//Fin main-----------------------------------------------------------------
    
}
