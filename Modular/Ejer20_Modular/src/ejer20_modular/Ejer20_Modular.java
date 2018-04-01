/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer20_modular;

import java.util.Scanner;

/**
 *
 * @author the_d
 */
public class Ejer20_Modular {

    
    static void orden(int n1[],int n2[],int n3[]){
        int aux;
        
        if (n1[0] > n2[0]){
            aux = n3[0];
            n3[0] = n1[0];
            n1[0] = aux;   
        }//Fin si
        
        if (n2[0] > n3[0]){
            aux = n3[0];
            n3[0] = n2[0];
            n2[0] = aux;
            
        }//Fin si
        if (n1[0] > n2[0]){
            aux = n1[0];
            n1[0] = n2[0];
            n2[0] = aux;
            
        }//Fin si
        
        
}//Fin orden--------------------------------------------------------------------
    
    public static void main(String[] args) {
        int n1[] = new int [1];
        int n2[] = new int [1];
        int n3[] = new int [1];
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca 3 números");
        n1[0] = sc.nextInt();
        n2[0] = sc.nextInt();
        n3[0] = sc.nextInt();
        
        orden(n1,n2,n3);
        
        System.out.println("Sus números ordenados de menor a mayor son: "+n1[0]+", "+n2[0]+", "+n3[0]);
        
        
        
    }//Fin main-----------------------------------------------------------------
    
}
