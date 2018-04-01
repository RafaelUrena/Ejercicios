/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer22_estructurada;

import java.util.Scanner;

/**
 *
 * @author Rafalaptop
 */
public class Ejer22_Estructurada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=1;
        int suma=0,suma1=0;
        int n1,n2;
        int aux;
        
        Scanner sc= new Scanner(System.in);
        
        while(n<=20){
            if(n % 2!=0){
             suma = suma + n;   
            }//Fin if
            n++;
        }//Fin while
        System.out.println(suma);
        
        System.out.println("Escribe un número");
        n1 = sc.nextInt();
        
        System.out.println("Escribe un número");
        n2 = sc.nextInt();
        
        aux=n1;
        
        while(aux<=n2){
            if(aux % 2!=0){
             suma1 = suma1 + aux;
            }//Fin if
            aux++;
        }//Fin while
        
        System.out.println(suma1);
    }
}
