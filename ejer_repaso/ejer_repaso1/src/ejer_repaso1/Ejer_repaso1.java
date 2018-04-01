/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_repaso1;

import java.util.Scanner;

/**
 *
 * @author the_d
 */
public class Ejer_repaso1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cad1;
        String cad2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ponga la primera cadena: ");
        cad1 = sc.nextLine();
        
        System.out.print("Ponga la segundo cadena: ");
        cad2 = sc.nextLine();
        //Con length comparamos la longuitud
        if(cad1.length()== cad2.length()){
            System.out.println("La cadena 1 es igual en longuitud que cadena 2");
            
        }
        //Con compareTo compara si la suma de sus letra en codigo ascii es mayor menor o igual
        if(cad1.compareTo(cad2)>0) System.out.println("La cadena 1 es mayor");
            
        if(cad1.compareTo(cad2)<0) System.out.println("La cadena 2 es mayor");
            
        if(cad1.compareTo(cad2)==0) System.out.println("Las 2 cadenas son iguales");
            
        //Con equals compara si las cadenas tienen los mismos caracteres.
        if(cad1.equals(cad2)) System.out.println("Las 2 cadenas son identicas");
        
        
    }
    
}
