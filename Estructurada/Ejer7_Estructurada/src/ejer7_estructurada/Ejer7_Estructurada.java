/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer7_estructurada;

import java.util.Scanner;

/**
 *
 * @author Rafalaptop
 */
public class Ejer7_Estructurada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ano;
        boolean es_bisiesto=false;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduce un año para saber si es bisiesto");
        ano=sc.nextInt();
        
        
        if(ano % 4==0){
            es_bisiesto=true;
        }
        
        if(es_bisiesto==true){
            System.out.println("El año introducido es Bisiesto");
        }
        else{
            System.out.println("El año introducido No es Bisiesto");
        }
        
    }
    
}
