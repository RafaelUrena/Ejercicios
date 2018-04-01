/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc.pkg4.estructurada;

import java.util.Scanner;

/**
 *
 * @author Rafalaptop
 */
public class Ejerc4Estructurada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2,n3;
        float media;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ponga 3 números para hacer la media");
        
        n1= sc.nextInt();
        n2= sc.nextInt();
        n3= sc.nextInt(); 
    
        media=(float) (n1 + n2 + n3) / 3;
        
        System.out.println("La media de los 3 número es: "+media);
    }
    
}
