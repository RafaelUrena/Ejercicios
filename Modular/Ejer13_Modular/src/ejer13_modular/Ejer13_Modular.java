/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer13_modular;

import java.util.Scanner;

/**
 *
 * @author Rafalaptop
 */
public class Ejer13_Modular {

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
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Escribe un número para determinar si es primo: ");
        n = sc.nextInt();
        
        if(primo(n)) System.out.println("El número es primo");
        else System.out.println("El número no es primo");
    }//Fin main-----------------------------------------------------------------
    
}
