/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer7_modular;

import java.util.Scanner;

/**
 *
 * @author Rafalaptop
 */
public class Ejer7_Modular {

    static float conversor(char grados,int temp){
        float sol=0;
        
        if(grados=='c'||grados=='C'){
            sol = (float) ((float) (temp - 32)/1.8);
        }//Fin if
        
        if(grados=='f'||grados=='F'){
            sol = (float) (temp * 1.8) + 32;
        }//fin if
        
        return sol;
    }//Fin conversor
    
    public static void main(String[] args) {
        char t_gra;
        int temp;
        float conver;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Para pasar a Celsius pulse la tecla 'c' y para Farenheit pulse 'f': ");
        t_gra = sc.nextLine().charAt(0);
        
        System.out.print("Escriba la temperatura: ");
        temp = sc.nextInt();
        
        conver = conversor(t_gra,temp);
        
        System.out.println(conver);
        
    }//Fin main
    
}
