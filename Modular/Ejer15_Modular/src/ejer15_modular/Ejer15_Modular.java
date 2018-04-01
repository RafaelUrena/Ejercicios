/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer15_modular;

import java.util.Scanner;

/**
 *
 * @author Rafalaptop
 */
public class Ejer15_Modular {

    static void resta(int dividendo[],int divisor[],int cociente[],int resto[] ){
        resto[0] = dividendo[0];
        cociente[0]=0;
        
        while (resto[0] >= divisor[0]) {
            resto[0] = resto[0] - divisor[0];
            cociente[0]++;
        }//Fin while
        
    }//Fin resta----------------------------------------------------------------
    
    public static void main(String[] args) {
        int n1[] = new int [1];
        int n2[] = new int [1];
        int valor[] = new int[1];
        int re[] = new int[1];
        
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Escriba un número: ");
            n1[0] = sc.nextInt();

            System.out.print("Escriba el siguiente número: ");
            n2[0] = sc.nextInt();
            
        }while(n2[0] > n1[0]);
        
        resta(n1,n2,valor,re);
        
        System.out.println("El resultado de la division "+n1[0]+"/"+n2[0]+" es:"+valor[0]+" y resto: "+re[0]);
        
    }//Fin main-----------------------------------------------------------------
    
}
