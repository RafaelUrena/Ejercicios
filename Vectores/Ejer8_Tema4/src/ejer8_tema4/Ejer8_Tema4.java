/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer8_tema4;

/**
 *
 * @author the_d
 */
public class Ejer8_Tema4 {
/**
 * Procedimiento para cambiar el valor de vector v1[] a v2[] mientras los 2
 * vectores sean del mismo tamaño.
 * @param v1 
 * @param v2 
 */
    static void saveVinvert(int v1[],int v2[]){
        int j=v2.length-1;
        
           for(int i=0;i<v1.length;i++){
                v2[j]=v1[i];
                j--;
            }//Fin for
        
        
    }//Fin saveVinvert----------------------------------------------------
    
    static void escribir(int v[]){
        
        for(int i=0;i<v.length;i++){
         
            System.out.println("["+i+"]"+" "+v[i]);
            
        }//Fin for
        
        System.out.println("  ");
        
    }//Fin escribir----------------------------------------------------
    
    
    //*******************Algoritmo principal****************************//
    
    public static void main(String[] args) {
        int vector[] = new int[]{1,2,3,4,5};
        int v[] = new int[vector.length];
        
        
        saveVinvert(vector,v);
        
        escribir(v);
    }//Fin main--------------------------------------------------------
    
}
