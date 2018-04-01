/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer22_modular;

import java.util.Scanner;

/**
 *
 * @author the_d
 */
public class Ejer22_Modular {

    static void parimpar(int n,int p[],int i[]){
        int aux;
        
        do{
            aux=n % 10;
            if(aux % 2==0){
                p[0]++;
            }//Fin if
            else{
                i[0]++;
            }
            n=n/10;
        }while(n!=0);
        
    }//Fin parimpar-------------------------------------------------------------
    
    public static void main(String[] args) {
        int par[] = new int[1];
        int impar[] = new int[1];
        int n;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escribe un número para determinar cuantos pares e impares tiene: ");
        n = sc.nextInt();
        
        parimpar(n,par,impar);
        
        System.out.println("El número tiene: "+par[0]+" par/es y "+impar[0]+" impar/es");
        
    }//Fin main-----------------------------------------------------------------
    
}
