/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4_modular;

import java.util.Scanner;

/**
 *
 * @author Rafalaptop
 */
public class Ejer4_Modular {

    static float raiz(float n){
        float sol;
        
        sol = (float) Math.sqrt(n);
        
        return sol;
    }//Fin función raiz
    
    public static void main(String[] args) {
        float n;
        float raiz;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Escribe un número para su raiz cuadrada: ");
        n = sc.nextFloat();
        
        if(n>=0){
            raiz = raiz(n);
            System.out.println("El resultado es: "+raiz);
        }//Fin if
        else{
            System.out.println("Lo siento, esta operación no es posible.");
        }//Fin else
        
    
    }//Fin main
    
}
