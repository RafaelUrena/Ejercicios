/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2_tema4;

import java.util.Scanner;

/**
 *
 * @author Rafalaptop
 */
public class Ejer2_Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cad;
        String cad2="";
        
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Ponga una cadena");
        cad = sc.nextLine();
        
        for(int i=cad.length()-1;i>=0;i--){
            cad2 = cad2 + cad.charAt(i);
        }
        
        System.out.println(cad2);
    }
    
}
