/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer7_tema4;

import java.util.Scanner;

/**
 *
 * @author the_d
 */
public class Ejer7_Tema4 {

   
   static void iniciarV(int v[]){
       int azar;
       
       for(int i=0;i<v.length;i++){
           azar = (int) ((Math.random()*100)+1);
           v[i]=azar;
       }//Fin for
       
   }//fin iniciarV-------------------------------------
   
   static int comprobar(int v[],int n){
       int cont=0;
       
       for(int i=0;i<v.length;i++){
           if(v[i] == n){
               cont++;
           }//Fin if
       }//Fin for
       
       return cont;
   }//Fin comprobar--------------------------------------------
   
   static void escribir(int v[]){
        for(int i = 0;i < v.length;i++){
            System.out.println("["+i+"]="+v[i]+" ");
        }
        System.out.println("       ");
    }//Fin escribir---------------------------------------------
    
   //***********************Algoritmo Principal*********************************
   
    public static void main(String[] args) {
        int n;
        int v[] = new int[10];
        int cuantas;
        iniciarV(v);
        
        Scanner sc = new Scanner(System.in);
                
        escribir(v);
        
        System.out.print("Pon un número para comprobar si esta en el vector: ");
        n = sc.nextInt();
        
        cuantas = comprobar(v,n);
        
        System.out.println("El número introducido aparece "+cuantas+" vez/ces");
        
    }//Fin main-----------------------------------------------------------------
    
}
