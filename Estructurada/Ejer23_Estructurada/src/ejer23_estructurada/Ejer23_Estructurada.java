/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer23_estructurada;

import java.util.Scanner;

/**
 *
 * @author the_d
 */
public class Ejer23_Estructurada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,aux;
        int facto=1;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Escribe un número para su factorial");
        n = sc.nextInt();
        
        aux=n;
        
        do{
           facto = facto * aux;
            aux--;
        }while(aux!=1);
        
        if(n==0 || n==1){
            facto=1;
        }
        
        System.out.println(facto);
    }
    
}
