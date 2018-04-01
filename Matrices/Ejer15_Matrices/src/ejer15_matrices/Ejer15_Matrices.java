/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer15_matrices;

import java.util.Scanner;

/**
 *
 * @author rafa
 */
public class Ejer15_Matrices {

    static void iniciar(int t[][],int t2[][]) {
        int alea;

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {

                alea = (int)(Math.random()*10);
                t[i][j] = alea;
                t2[i][j] = t[i][j];

            }//fin for
        }//fin for

    }//fin iniciar------------------------------------------------------
    
    static void permutar_f(int t[][],int t2[][],int fila,int fila_u) {

       for(int i=0;i<t.length;i++){
           for(int j=0;j<t[0].length;j++){
               
               t2[fila][j] = t[fila_u][j];
               
           }
       }

    }//fin permutar_f------------------------------------------------------
    
    static void permutar_c(int t[][],int t2[][],int colum,int colum_u) {
        
       for(int i=0;i<t.length;i++){
           for(int j=0;j<t[0].length;j++){
               
               t2[i][colum] = t[i][colum_u];
               
           }
       }

    }//fin permutar_f------------------------------------------------------
    
    static void mostrarM(int t[][]) {

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {

                System.out.print("[" + t[i][j] + "]");
            }
            System.out.println("");
        }

    }//fin mostrarM--------------------------------------------
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t[][] = new int [3][3];
        int t2[][] = new int[3][3];
        int fila,columna,fila_u,colum_u;
        
        Scanner sc = new Scanner(System.in);
        
        iniciar(t,t2);
        
        mostrarM(t);
        
        System.out.println("¿Que fila desea permutar?(0/"+(t.length-1) +")");
        fila = sc.nextInt();
        
        System.out.println("¿Porque fila?");
        fila_u = sc.nextInt();
        
        System.out.println("¿Que columna desea permutar?(0/"+(t[0].length-1) +")");
        columna = sc.nextInt();
        
        System.out.println("¿Porque columna?");
        colum_u = sc.nextInt();
        
        permutar_f(t,t2,fila,fila_u);
        
        permutar_c(t,t2,columna,colum_u);
        
        mostrarM(t2);
                
                
                
    }
    
}
