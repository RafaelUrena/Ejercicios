/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer27_estructurada;

import java.util.Scanner;

/**
 *
 * @author Don Solomillón
 */
public class Ejer27_Estructurada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        
        Scanner sc=new Scanner(System.in);
        
        do{
            System.out.println("Pon un número");
            n = sc.nextInt();
            
        }while(n<=100);
    }//Fin main
    
}
