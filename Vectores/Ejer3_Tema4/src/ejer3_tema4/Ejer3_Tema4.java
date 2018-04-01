/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3_tema4;

import java.util.Scanner;

/**
 *
 * @author Rafalaptop
 */
public class Ejer3_Tema4 {

    static void escribir(int v[]){
        for(int i = 0;i < v.length;i++){
            System.out.println("["+i+"]="+v[i]+" ");
        }
        System.out.println("       ");
    }//Fin escribir---------------------------------------------
    
    static void pedirNum(float v[]){
        
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<v.length;i++){
            v[i] = sc.nextFloat();
        }//Fin for
        
    }//Fin pedirNum-------------------------------------
    
    static void calcularMedia(float v[],float media[]){
        int suma=0;
        
        for(int i=0;i<v.length;i++){
            suma=(int) (v[i]+suma);
        }//Fin for
        
        media[0]=(float)suma/10;
        
    }//Fin calcularMedia
    
    public static void main(String[] args) {
        float num[] = new float[10];
        float media[] = new float[1];
        int suma=0;
        
        System.out.println("Ponga 10 números: ");
        pedirNum(num);
        
        calcularMedia(num,media);
        
        System.out.println("La media es: "+media[0]);
    }//Fin main----------------------------------------
    
}
