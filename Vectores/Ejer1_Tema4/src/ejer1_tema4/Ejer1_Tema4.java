/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1_tema4;

/**
 *
 * @author Rafalaptop
 */
public class Ejer1_Tema4 {

    static void iniciar(int v[]){
        
        for(int i=0 ;i < v.length;i++){
        
            v[i]=-1;
        }//fin for
        
        
    }//fin iniciar------------------------------------
    public static void main(String[] args) {
        int vector[] = new int[10];
        
        iniciar(vector);
        
        for(int i = 0;i < vector.length;i++){
            System.out.println("["+i+"]="+vector[i]+" ");
        }
        System.out.println("       ");
    }
    
}
