/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer16_matrices;

import java.util.Scanner;

/**
 *
 * @author rafa
 */
public class Ejer16_Matrices {

    static void iniciar(char t[][]){
        
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                
                if((i+j) % 2 == 0 ){
                    
                    t[i][j] = 'B';
                }
                else{
                    t[i][j] = 'N';
                }
                
            }
        }
        
    }//Fin iniciar--------------------------------------------
    
     static void mostrarM(char t[][]) {

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {

                System.out.print("[" + t[i][j] + "]");
            }
            System.out.println("");
        }

    }//fin mostrarM--------------------------------------------
     
     static void colocar_torre(char[][] t) {
        char torre ='T';
        int f,c;
        int i,j;
        
        i = (int)(Math.random()*8);
        j = (int)(Math.random()*8);
        
        t[i][j] = torre;
        
        for(f=0;f<t.length;f++){
            for (c=0;c<t[f].length;c++){
                if(f==i || c==j) t[f][c]='*';
                if(f==i && c==j) t[f][c]=torre;
                
            }//fin for
        }//fin for
        
        mostrarM(t);
        
    }//Fin colocar_torre-------------------------------------------------

    static void colocar_alfil(char[][] t) {
        char alfil ='A';
        int f,c;
        int i,j;
        
        i = (int)(Math.random()*8);
        j = (int)(Math.random()*8);
        
        t[i][j] = alfil;
        
        f=i;
        c=j;
        
        while(f>=0 && c<t[0].length){
            t[f][c]='*';
            f--;
            c++;
        }//Diagonal Arriba-derecha
        
        f=i;
        c=j;
        
        while(f>=0 && c>=0){
            t[f][c]='*';
            f--;
            c--;
        }//Diagonal Arriba-izquierda
        
        f=i;
        c=j;
        
        while(f<t.length && c>=0){
            t[f][c]='*';
            f++;
            c--;
        }//Diagonal Abajo-izquierda
        
        f=i;
        c=j;
        
        while(f<t.length && c<t[0].length){
            t[f][c]='*';
            f++;
            c++;
        }//Diagonal Abajo-derecha
        
        t[i][j]='A';
        mostrarM(t);
    
    }//Fin colocar_alfil-----------------------------------------------

    static void colocar_reina(char[][] t) {
        char reina ='R';
        int f,c;
        int i,j;
        
        i = (int)(Math.random()*8);
        j = (int)(Math.random()*8);
        
        t[i][j] = reina;
        
        for(f=0;f<t.length;f++){
            for (c=0;c<t[f].length;c++){
                if(f==i || c==j) t[f][c]='*';
            }
        }
        
        f=i;
        c=j;
        
        while(f>=0 && c<t[0].length){
            t[f][c]='*';
            f--;
            c++;
        }//Diagonal Arriba-derecha
        
        f=i;
        c=j;
        
        while(f>=0 && c>=0){
            t[f][c]='*';
            f--;
            c--;
        }//Diagonal Arriba-izquierda
        
        f=i;
        c=j;
        
        while(f<t.length && c>=0){
            t[f][c]='*';
            f++;
            c--;
        }//Diagonal Abajo-izquierda
        
        f=i;
        c=j;
        
        while(f<t.length && c<t[0].length){
            t[f][c]='*';
            f++;
            c++;
        }//Diagonal Abajo-derecha
        t[i][j]='R';
        mostrarM(t);
        
    }//Fin colocar_reina-------------------------------------------------

    static void colocar_caballo(char[][] t) {
        char caballo = 'C';
        int i,j;
        int f,c;
        int k,m;
        
        i = (int)(Math.random()*8);
        j = (int)(Math.random()*8);
        
        t[i][j] = caballo;
        
        for(f=0;f<t.length;f++){
            for(c=0;c<t[0].length;c++){
                if (t[f][c]=='C'){
                    for(k=-2;k<=2;k++){
                        for(m=-2;m<=2;m++){
                            if(f+k>=0 && c+m>=0 && f+k<t.length && c+m<t[0].length){
                               if(k==-2 && m==-1)t[f+k][c+m]='*';
                               if(k==-1 && m==-2)t[f+k][c+m]='*';
                               if(k==-2 && m==1)t[f+k][c+m]='*';
                               if(k==-1 && m==2)t[f+k][c+m]='*';
                               if(k==1 && m==-2)t[f+k][c+m]='*';
                               if(k==2 && m==-1)t[f+k][c+m]='*';
                               if(k==1 && m==2)t[f+k][c+m]='*';
                               if(k==2 && m==1)t[f+k][c+m]='*';
                            }
                        }
                    }
                }
            }
        }
        t[i][j]='C';
        mostrarM(t);
        
    }//Fin colocar_caballo-------------------------------------------------
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char t[][] = new char [8][8];
        int posf,posc;
        
        Scanner sc = new Scanner (System.in);
        
        iniciar(t);
        
        mostrarM(t);
        
        System.out.println("---------------");
        colocar_torre(t);
        iniciar(t);
        System.out.println("---------------");
        colocar_alfil(t);
        iniciar(t);
        System.out.println("---------------");
        colocar_reina(t);
        iniciar(t);
        System.out.println("---------------");
        colocar_caballo(t);
    }
    
}
