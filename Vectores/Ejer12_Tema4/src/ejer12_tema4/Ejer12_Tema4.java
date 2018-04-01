/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer12_tema4;

/**
 *
 * @author the_d
 */
public class Ejer12_Tema4 {

    static void iniciar(int v[]){
        
        for(int i=0;i<v.length;i++){
            
            v[i] =(int) (Math.random()*19)-9;
            
        }//fin for
    }
    
    
   static void sumar(int v1[],int v2[],int sum[]){
       
       for(int i=0;i<sum.length;i++){
           
           sum[i] = v1[i] + v2[i];
       }//fin for
       
   }//Fin suma-----------------------------------------------------------------
   
   static void escribir(int v[]){
        for(int i = 0;i < v.length;i++){
            System.out.print(" "+v[i]);
        }
        System.out.println("       ");
    }//Fin escribir---------------------------------------------
   
    public static void main(String[] args) {
        int v1[] = new int[3];
        int v2[] = new int[3];
        int suma[] = new int[3];
        
        iniciar(v1);
        
        iniciar(v2);
        
        sumar(v1,v2,suma);
        
        escribir(v1);

        escribir(v2);
        System.out.println("___________");
        escribir(suma);
        
    }//Fin main
    
}
