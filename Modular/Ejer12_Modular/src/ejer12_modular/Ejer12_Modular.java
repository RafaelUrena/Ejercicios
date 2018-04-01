/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer12_modular;

import java.util.Scanner;

/**
 *
 * @author the_d
 */
public class Ejer12_Modular {

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
        int n,k;
        int combi;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Escriba el valor de (n): ");
        n = sc.nextInt();
        
        System.out.print("Escriba el valor de (k): ");
        k = sc.nextInt();
        
        combi = facto(n)/(facto(k)*(facto(n-k)));
        
        System.out.println("El número combinatorio es: "+combi);
        
    }//Fin main---------------------------------------------------
    
}
