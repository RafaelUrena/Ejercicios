/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer6_modular;

import java.util.Scanner;

/**
 *
 * @author Rafalaptop
 */
public class Ejer6_Modular {

    static boolean decim(float n){
        boolean tiene_decimales=false;
        int aux; 
        
        aux = (int)n;
        
        if(n>aux) tiene_decimales=true;
        
        return tiene_decimales;
    }//fin decim
    
    public static void main(String[] args) {
        float n;
        boolean tiene_decimal;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Pon un número para determinar si tiene decimales: ");
        n = sc.nextFloat();
        
        
        
        if(tiene_decimal = decim(n))System.out.println("El número tiene decimales");
        else System.out.println("El número no tiene decimales");
    }//Fin main
    
}
