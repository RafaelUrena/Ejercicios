/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_modular;

import java.util.Scanner;

/**
 * Ejemplo Función
 * @author Rafalaptop
 */
public class Ejemplo_modular {

    static int suma(int v1,int v2){
        int sol;
        
        sol=v1+v2;
        
        return sol;
    }
    
    
    public static void main(String[] args) {
        int a,b,res;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Dame a: ");
        a = sc.nextInt();
        System.out.print("Dame b: ");
        b = sc.nextInt();
        
        res = suma(a,b);
        
        System.out.println("La solución es: "+res);
    }
    
}
