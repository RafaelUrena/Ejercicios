/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer8_modular;

import java.util.Scanner;

/**
 *
 * @author Rafalaptop
 */
public class Ejer8_Modular {

    
    static boolean ordenados(int n1, int n2, int n3){
        boolean sol=false;
        
        if(n1<n2 && n2<n3){
            sol=true;
        }//Fin if
        
        return sol;//También se puede poner 'return(n1<n2 && n2<n3)'
    }//Fin ordenados
    //---------------------------------------------------------------
    
    public static void main(String[] args) {
        int n1,n2,n3;
        boolean estan_ordenados;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Escriba 3 números para determinar si estan ordenados: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        
        if(estan_ordenados=ordenados(n1,n2,n3)){
            System.out.println("Los números están ordenados");
        }//Fin if
        else{
            System.out.println("Los números No están ordenados");
        }//Fin else
        
    }//Fin main----------------------------------------------------
    
    
}
