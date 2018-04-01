/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2_matrices;

import java.util.Scanner;

/**
 *
 * @author rafa
 */
public class Ejer2_Matrices {

    static void mostrarM(int t[][]){
        
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                
                System.out.print("["+t[i][j] +"]");
            }
            System.out.println("");
        }
        
        
    }//fin mostrarM
    
    static void mostrarV(int v[]){
        
        for(int i=0;i<v.length;i++){
            System.out.println("["+v[i]+"]");
        }
        System.out.println("");
    }
    
    static void iniciar(int t[][]){
        int alea;
        
        
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                alea = (int)(Math.random()*10);
                
                t[i][j]=alea;
                
            }//fin for
        }//fin for
        
    }//fin iniciar
    
    static boolean comprobar(int t[][],int v[],int num){
        boolean esta=false;
        
        
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                
                if(num == t[i][j]){
                    esta=true;
                    v[0]=i;
                    v[1]=j;
                }
                
            }//fin for
        }//fin for
        
        return esta;
        
    }
    
    
    public static void main(String[] args) {
        int tab[][] = new int [3][3];
        int fYc[] = new int [2];
        int num;
        boolean esta;
        
        Scanner sc = new Scanner(System.in);
        
        iniciar(tab);
        
        System.out.println("Escribe un número para comprobar si esta en la matriz");
        num = sc.nextInt();
        
        esta = comprobar(tab,fYc,num);
        
        if(esta){
            mostrarM(tab);
            System.out.println("La posición del número es");
            mostrarV(fYc);
        }
        else{
            System.out.println("El número no se ha encontrado");
            mostrarM(tab);
        }
        
        
        
    }
    
}
