/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_repaso2;

import java.util.Scanner;

/**
 *
 * @author the_d
 */
public class Ejer_repaso2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cad1;
        String cad2="";

        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ponga una cadena: ");
        cad1 = sc.nextLine();
        
        for(int i=0;i<cad1.length();i++){
            cad2 = cad1.charAt(i) + cad2;
        }
        
        System.out.println(cad2);
    }
    
    
    
}
