/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer9_tema4;

import java.util.Scanner;

/**
 *
 * @author Rafalaptop
 */
public class Ejer9_Tema4 {

    static int cifras(int n){
        int cont=0;
        
        while(n!=0){
            n=n/10;
            cont++;
        }//Fin while
        
        return cont;
    }//Fin cifras-------------------------------------------
    
    static void descomponer(int v[], int n){
        int dig;
        
        for(int i=0;i<v.length;i++){
            dig = n % 10;
            n=n/10;
            v[i]=dig;
        }//Fin for
        
    }//Fin descomponer------------------------------------
    
     static void escribir(int v[]){
        
        for(int i=0;i<v.length;i++){
         
            System.out.println("["+i+"]"+" "+v[i]);
            
        }//Fin for
        
        System.out.println("  ");
        
    }//Fin escribir----------------------------------------------------
    
     
     static boolean saveVinvert(int v1[],int v2[]){
        int j=v2.length-1;
        boolean cap = true;
        
           for(int i=0;i<v1.length;i++){
                v2[j]=v1[i];
                j--;
            }//Fin for
           
           int i=0;
        
           while(i<v1.length && cap){
               if(v1[i] != v2[i]){
                   cap=false;
               }//Fin if
               i++;
           }//Fin for
           
        return(cap);
    }//Fin saveVinvert----------------------------------------------------
    
    public static void main(String[] args) {
        int v[];
        int v2[];
        int n;
        boolean capic;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ponga un número para determinar si es capicua: ");
        n = sc.nextInt();
        
        v = new int [cifras(n)];
        v2 = new int[cifras(n)];
        
        descomponer(v,n);
        
        capic = saveVinvert(v, v2);
        
        escribir(v);
        escribir(v2);
       
        if(capic){
            System.out.println("El número es capicua");
        }//Fin if
        else{
            System.out.println("El número no es capicua");
        }//Fin else
        
        
    }//Fin main------------------------------------------------------
      
    
}
