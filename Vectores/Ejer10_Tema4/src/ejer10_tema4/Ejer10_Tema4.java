/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer10_tema4;

/**
 *
 * @author Rafalaptop
 */
public class Ejer10_Tema4 {

    static void iniciar(int v[]){
        int i=0;
        
        v[i]=(int) ((Math.random()*49)+1);
           
            while(i<v.length){
                v[i]=(int) ((Math.random()*49)+1);

                for(int j=0;j<i;j++){
                    if(v[j] == v[i]){

                        v[i]=(int) ((Math.random()*49)+1);
                        i=0;
                    }//Fin if
                    
                }//Fin for
               i++;
            }//Fin while  
    }//Fin iniciar--------------------------------------------
    
    
    static void escribir(int v[]){
        for(int i = 0;i < v.length;i++){
            System.out.println("["+i+"]="+v[i]+" ");
        }
        System.out.println("       ");
    }//Fin escribir---------------------------------------------
    
    public static void main(String[] args) {
        int v[]= new int[6];
        
        iniciar(v);
        
        escribir(v);
    }
    
}
