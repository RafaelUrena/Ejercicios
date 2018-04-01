/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer5_tema4;

/**
 *
 * @author Rafalaptop
 */
public class Ejer5_Tema4 {

    static void alea(int v[]){
        
        for(int i=0;i<v.length;i++){
            v[i]=(int) ((Math.random()*200)-100);
        }//Fin for
    }//Fin alea--------------------------------------------
    
    static void escribir(int v[]){
        for(int i = 0;i < v.length;i++){
            System.out.println("["+i+"]="+v[i]+" ");
        }
        System.out.println("       ");
    }//Fin escribir---------------------------------------------
    
    static void posYneg(int v[],int po[],int neg[]){
        for(int i = 0;i < v.length;i++){
            if(v[i]>=0){
                po[0]++;
            }//Fin if
            else{
                neg[0]++;
            }//Fin else
        }//Fin for
        
    }//Fin posYneg-------------------------------------------------
    
    //*********************Algoritmo principal*****************************//
    
    public static void main(String[] args) {
        int ve[] = new int[10];
        int pos[] = new int[1];
        int neg[] = new int[1];
        
        alea(ve);
        escribir(ve);
        
        posYneg(ve,pos,neg);
        
        System.out.println("El vector tiene "+pos[0]+" positivos y "+neg[0]+" negativos");
        
    }//Fin main------------------------------------------------------------------------
    
}
