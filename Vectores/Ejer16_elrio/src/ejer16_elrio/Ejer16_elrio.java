/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer16_elrio;

import static java.lang.Thread.sleep;
import java.util.Scanner;

/**
 *
 * @author the_d
 */
public class Ejer16_elrio {

    static void iniciar(int r[]){
        
        for(int i=0;i<r.length;i++){
            
            r[i]=0;
            
        }//Fin for
        
    }//Fin iniciar---------------------------------------------------------
    
    static void tirar_piedra(int r[],int f,int pos){
        
        r[pos]=f;
        
        if(r[pos]>=1 && r[pos]<=r.length-1){
         
            for(int i=pos-1;i>=0;i--){
                if(f >0){
                    r[i]=f-1;
                    f--;
                }//fin if
               
            }//fin for
            
            f = r[pos];
            
            for(int j=pos+1;j<r.length;j++){
                if(f >0){
                    r[j]=f-1;
                    f--;
                }//Fin if
               
            }//Fin for
            
            
        }//Fin if
        
    }//Fin tirar_piedra----------------------------------------------------
    
    static void mostrar(int r[]){
        
        for(int i=0;i<r.length;i++){
            System.out.print("["+r[i]+"]");
        }//Fin for
        System.out.println(" ");
    }//Fin mostrar-------------------------------------------------------
    
    static void calmar(int r[],int pos) throws InterruptedException{
        
        while(r[pos]>0){
            
            if(r[pos]>=1 && r[pos]<=r.length-1){
         
                for(int i=pos-1;i>=0;i--){
                    if(r[i] > 0){
                        r[i]--;
                    }//fin if

                }//Fin for

                for(int j=pos+1;j<r.length;j++){
                    if(r[j] > 0){
                        r[j]--;
                    }//Fin if

                }//Fin for
            
                r[pos]--;
                mostrar(r);
                
            }//Fin if
            Thread.sleep(1000);
        }//Fin while
        
        
    }//Fin calmar--------------------------------------------------------
    
    
    
    //**************************Algoritmo Principal**********************//
    public static void main(String[] args) throws InterruptedException {
        int rio[] = new int[13];
        int fuerza;
        int posicion;
        
        Scanner sc = new Scanner(System.in);
        
        iniciar(rio);
        
        do{
        
            System.out.println("¿En que posicion desea tirar la piedra?/0-"+(rio.length-1));
            posicion = sc.nextInt();
        
        }while(posicion < 0 && posicion > rio.length);
        
        do{
        
            System.out.println("¿Con que fuerza?/1-9");
            fuerza = sc.nextInt();
        
        }while(fuerza < 1 && fuerza > 9);
        
        tirar_piedra(rio,fuerza,posicion);
        
        mostrar(rio);
        
        calmar(rio,posicion);
        
    }//Fin main
    
}
