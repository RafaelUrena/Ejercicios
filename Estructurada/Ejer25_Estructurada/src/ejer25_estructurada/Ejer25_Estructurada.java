/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer25_estructurada;

import java.util.Scanner;

/**
 *
 * @author Rafa
 */
public class Ejer25_Estructurada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=0;
        int cont=1;
        int suma=0;
        float media;
        
        Scanner sc=new Scanner(System.in);
        
        while(n>=0){
            System.out.println("Ponga un número para su media, o un número negativo para salir");
            n = sc.nextInt();
            
            if(n>=0){
                suma = suma + n;
            }//Fin if
            
            cont++;
        }//Fin while
        
        media =(float) suma/(cont-1);
        
        System.out.println(media);
    }
    
}
