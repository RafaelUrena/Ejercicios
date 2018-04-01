/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer26_estructurada;

import java.util.Scanner;

/**
 *
 * @author Rick Pepinillo
 */
public class Ejer26_Estructurada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letra;
        
        Scanner sc=new Scanner(System.in);
        
        do {
            System.out.println("¿Desea terminar(s/n)?");
            letra = sc.nextLine().charAt(0);
            
        }while(letra!='s' && letra!='S');
        
        System.out.println("¡Adios!");
        
    }
    
}
