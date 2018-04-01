/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer11_modular;

import java.util.Scanner;

/**
 *
 * @author the_d
 */
public class Ejer11_Modular {

    static int facto(int n){
        int sol=n;
        int cont=1;
        
        while(cont<=n-1){
            
            sol=sol*cont;
            cont++;
        }//Fin while
        
        if(n==0) sol=1;
        
        return sol;
    }//Fin facto----------------------------------------------------
    
    
    public static void main(String[] args) {
        int n;
        int factorial;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Escriba un número para su factorial: ");
        n = sc.nextInt();
        
        factorial = facto(n);
        
        System.out.println("El factorial de "+n+" es: "+factorial);
        
    }//Fin main-----------------------------------------------------
    
}
