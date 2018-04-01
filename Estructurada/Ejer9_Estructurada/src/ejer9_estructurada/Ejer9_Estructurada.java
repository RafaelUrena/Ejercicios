/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer9_estructurada;

import java.util.Scanner;

/**
 *
 * @author Rafalaptop
 */
public class Ejer9_Estructurada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2;
        int result;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Escribe 2 números para restar al mayor el menor");
        n1=sc.nextInt();
        n2=sc.nextInt();
        
        if(n1>n2){
            result=n1-n2;
        }
        else{
            result=n2-n1;
        }
        
        System.out.println("El resultado es: "+result);
    }
    
}
