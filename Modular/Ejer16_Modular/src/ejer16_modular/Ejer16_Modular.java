/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer16_modular;

import java.util.Scanner;

/**
 *
 * @author Rafalaptop
 */
public class Ejer16_Modular {

    static void hora(int hor[],int min[],int seg[]){
        
        seg[0]++;
        
        if(seg[0]==60){
            seg[0]=0;
            min[0]++;
        }//Fin if
        
        if(min[0]==60){
            min[0]=0;
            hor[0]++;
        }//Fin if
        
        if(hor[0]==24){
            hor[0]=0;
        }//Fin if
    }//Fin hora-----------------------------------------------------------------
    
    public static void main(String[] args) {
        int hora[] = new int [1];
        int minu[] = new int [1];
        int segu[] = new int [1];
        
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Escribe las horas: ");
        hora[0] = sc.nextInt();
        
        System.out.print("Escribe los minutos: ");
        minu[0] = sc.nextInt();
        
        System.out.print("Escribe los segundos: ");
        segu[0] = sc.nextInt();
        
        hora(hora,minu,segu);
        
        System.out.println("La hora es: "+hora[0]+":"+minu[0]+":"+segu[0]);
        
    }//Fin Main-----------------------------------------------------------------
    
}
