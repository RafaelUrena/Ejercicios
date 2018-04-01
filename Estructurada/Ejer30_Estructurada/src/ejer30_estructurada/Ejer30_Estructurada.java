/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer30_estructurada;

import java.util.Scanner;

/**
 *
 * @author Rafalaptop
 */
public class Ejer30_Estructurada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int mayor;
        char salir='n';
        boolean quiere_salir=false;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Pon un número");
            mayor = sc.nextInt();
            
        System.out.println("¿Desea terminar? (s/n)");
        sc.nextLine();
        salir = sc.nextLine().charAt(0);
        
        
        while(!quiere_salir){
            
            
            
            System.out.println("Pon un número");
            n = sc.nextInt();
            sc.nextLine();
            
            if (n > mayor){
                mayor=n;
            }//Fin if
            System.out.println("¿Desea terminar? (s/n)");
            salir = sc.nextLine().charAt(0);
            
            
            if(salir=='s'|| salir=='S') quiere_salir=true;
            
        }//Fin while
        
        System.out.println("El número mayor es: "+mayor);
    }
    
}
