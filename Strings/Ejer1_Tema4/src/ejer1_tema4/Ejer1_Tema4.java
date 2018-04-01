/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1_tema4;

import java.util.Scanner;

/**
 *
 * @author Rafalaptop
 */
public class Ejer1_Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cad1,cad2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ponga una cadena: ");
        cad1 = sc.nextLine();
        
        System.out.println("Ponga otra cadena: ");
        cad2 = sc.nextLine();
        
        
        if(cad1.length() == cad2.length()){
            System.out.println("Tienen la misma longitud");
        }
        
        if(cad1.compareTo(cad2)>0){
            System.out.println("La cadena 1 es mayor alfabeticamente");
        }
        
        if(cad1.compareTo(cad2)==0){
            System.out.println("La cadena 1 es igual alfabeticamente que cadena 2");
        }
        
        if(cad1.compareTo(cad2)<0){
            System.out.println("La cadena 2 es mayor alfabeticamente");
        }
        
        if(cad1.equals(cad2)){
            System.out.println("Las 2 cadenas son iguales");
        }
    }
    
}
