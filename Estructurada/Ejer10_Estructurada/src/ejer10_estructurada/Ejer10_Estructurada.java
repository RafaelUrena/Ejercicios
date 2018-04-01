/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer10_estructurada;

import java.util.Scanner;

/**
 *
 * @author Rafalaptop
 */
public class Ejer10_Estructurada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu;
        float grados;
        float conv=0;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Si quiere convertir a Celsius pulsa '1', si quieres convertir a Farenheit pulsa '2'");
        
        menu=sc.nextInt();
        
        if(menu==1){
            System.out.println("Escribe los grados Farenheit");
            grados=sc.nextFloat();
            conv = (float) ((float) (grados - 32)/1.8);
           
        }//Fin si
        
        if (menu==2){
            System.out.println("Escribe los grados Celsius");
            grados=sc.nextFloat();
             conv=(float) (grados * 1.8) + 32;
        }// Fin si
        
        System.out.println(conv);
        
    }//Fin main
    
}
