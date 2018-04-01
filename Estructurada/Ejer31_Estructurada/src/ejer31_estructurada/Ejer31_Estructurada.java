/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer31_estructurada;

import java.util.Scanner;

/**
 *
 * @author Rafalaptop
 */
public class Ejer31_Estructurada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        boolean es_primo=true;
        int cont=2;
        
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("pon un número para determinar si es primo");
        n = sc.nextInt();
        
        /**
         * Mientras es_primo sea verdadero y cont sea menor que n
         * Compara si el resto de dividir n entre cont sea idéntico
         * a 0, mientras esa condicion no se cumpla n será primo,
         * si se cumple n no será primo ya que tiene un divisor común
         * el número no es primo
         * 
         * cont es igual a 2, ya que asi al hacer el mod de 1 y 2,
         * también nos pondrá que son primos.
         */
        
       while(es_primo && cont<n){
            if(n % cont==0) es_primo=false;
            cont++;
        }//Fin while
        
        if(es_primo) System.out.println("El número introducido es primo");
        else{
            System.out.println("El número no es primo");
        }//Fin if
        
    }//Fin main
    
}
