/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer13_tema4;

import java.util.Scanner;

/**
 *
 * @author the_d
 */
public class Ejer13_Tema4 {

    static void iniciar(int n,int v[]){
        
        v[0]=n;
        
        for(int i=1;i<v.length;i++){
            v[i]=n+1;
            n++;
        }//Fin for
        
    }//Fin iniciar---------------------------------------------
    
    static void iniciar2(int n,int v[]){
        
        v[0]=n;
        
        for(int i=1;i<v.length;i++){
            v[i]=v[i-1]+i;
        }//Fin for
        
    }//Fin iniciar---------------------------------------------
    
    static void escribir(int v[]){
        for(int i = 0;i < v.length;i++){
            System.out.print("["+i+"]="+v[i]+" ");
        }
        System.out.println("   ");
    }//Fin escribir---------------------------------------------
    
    
    //***********************Algoritmo Principal**************************//
    
    public static void main(String[] args) {
        int n;
        int v1[] = new int[7];
        int v2[] = new int[7];
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Escriba un número para iniciar el vector: ");
        n = sc.nextInt();
        
        iniciar(n,v1);
        
        escribir(v1);
        
        iniciar2(n,v2);
        
        escribir(v2);
    }//Fin main----------------------------------------------------------------
    
}
