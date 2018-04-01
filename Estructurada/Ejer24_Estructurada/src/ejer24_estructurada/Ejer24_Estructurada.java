/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer24_estructurada;

import java.util.Scanner;

/**
 *
 * @author Rafa
 */
public class Ejer24_Estructurada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont;
        int n,n1,n2,suma=0,suma1=0;
        float media,media1;
        
        Scanner sc=new Scanner(System.in);
        
        for(cont=0;cont<=9;cont++){
            System.out.print("Pon un número:");
            n = sc.nextInt();
            suma=suma+n;
        }//Fin for
        
        media= suma/10;
        
        System.out.println(media);
        
        System.out.print("Escribe de cuantos números quieres hacer la media:");
        n1 = sc.nextInt();
        
        for(cont=1;cont<=n1;cont++){
             System.out.print("Pon un número:");
            n2 = sc.nextInt();
            suma1=suma1+n2;
        }//Fin for
        
        media1=suma1/n1;
        
        System.out.println(media1);
    }
    
}
