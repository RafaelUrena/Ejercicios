/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3_modular;

import java.util.Scanner;

/**
 *
 * @author Rafalaptop
 */
public class Ejer3_Modular {

    static boolean posiYnega(int n){
        boolean es_positivo=true;
        
        if (n<0) es_positivo=false;
        
        return es_positivo;
    }
    public static void main(String[] args) {
        int n;
        boolean es_positivo;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Escriba un número para determinar si es positivo o negativo: ");
        n = sc.nextInt();
        
        es_positivo = posiYnega(n);
        
        if(es_positivo) System.out.println("El número es positivo");
        if(!es_positivo)System.out.println("El número es negativo");
        
        
    }//Fin main
    
}
