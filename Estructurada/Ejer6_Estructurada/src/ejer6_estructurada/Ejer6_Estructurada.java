/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer6_estructurada;

import java.util.Scanner;

/**
 *
 * @author Rafalaptop
 */
public class Ejer6_Estructurada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        float result=0;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ponga un número para calcular su raiz cuadrada");
       
        num = sc.nextInt();
        
        if(num<0){
            System.out.println("La operación no se puede realizar");
        }
        else{
            result=(float) Math.sqrt(num);
        }
        
        System.out.println("El resultado es: "+result);
        
    }
    
}
