/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer5_modular;

import java.util.Scanner;

/**
 *
 * @author Rafalaptop
 */
public class Ejer5_Modular {

    static boolean bisies(int anio){
        boolean es_bisiesto=true;
        
        if(anio % 4 != 0) es_bisiesto=false; 
        
        return es_bisiesto;
    }//Fin bisies
    
    public static void main(String[] args) {
        int anio;
        boolean es_bisiesto;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Escriba un año para determinar si es bisiesto: ");
        anio = sc.nextInt();
        
        es_bisiesto = bisies(anio);
        
        if(es_bisiesto) System.out.println("El año "+anio+" es bisiesto");
        else{
            System.out.println("El año "+anio+" No es bisiesto");
        }//Fin else
    }//Fin main
    
}
