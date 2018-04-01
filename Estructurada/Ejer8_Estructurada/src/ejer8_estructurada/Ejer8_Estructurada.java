/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer8_estructurada;

import java.util.Scanner;

/**
 *
 * @author Rafalaptop
 */
public class Ejer8_Estructurada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num;
        int aux;
        boolean tiene_decimal=false;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Escribe un número para determinar si tiene o no decimales");
        
        num = sc.nextFloat();
        
        aux = (int) num;
        
        if(num>aux){
            tiene_decimal=true;
        }
        
        if(tiene_decimal==true){
            System.out.println("El número tiene decimales");
        }
        else{
            System.out.println("El número No tiene decimales");
        }
    }
    
}
