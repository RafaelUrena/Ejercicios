/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas_matrices;

import java.util.Scanner;

/**
 *
 * @author the_d
 */
public class Buscaminas_Matrices {

    
    static void iniciar_tablero(int t[][],int minas){
        int alea;
        int f,c;
        
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                
                t[i][j]=0;
                
            }
        }
        
        while(minas>0){
            
            alea=(int)(Math.random()*t.length-1);
            
            f=alea;
            
            alea=(int)(Math.random()*t.length-1);
             
            c=alea; 
            
            if(t[f][c]==0){
                
                t[f][c]=-1;
                minas--;
                
            }//fin if
            
            
        }//fin while
        
        
        
    }//Fin Iniciar_tablero------------------------
    
    static void iniciar_tablero_usu(int t[][]){
        
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                
                t[i][j]=0;
                
            }
        }
        
        
        
    }//Fin Iniciar_tablero_usu------------------------
    
     static void mostrarM(int t[][]) {

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {

                if(t[i][j]==-1){
                    System.out.print("[*]");
                }
                else{
                System.out.print("[" + t[i][j] + "]");
                }
                
            }
            System.out.println("");
        }

    }//fin mostrarM--------------------------------------------
     
     static void mostrarM_usu(int t[][]) {

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {

                if(t[i][j]==0){
                    System.out.print("[*]");
                }
                
            }
            System.out.println("");
        }

    }//fin mostrarM_usu--------------------------------------------
     
     static void poner_pistas(int t[][]){
         int f,c;
         
         for(int i=0;i<t.length;i++){
             for(int j=0;j<t[0].length;j++){
                 
                 if(t[i][j]==-1){
                     
                     for(f=-1;f<=1;f++){
                         for(c=-1;c<=1;c++){
                             if(f+i >= 0 && c+j >= 0 && f+i < t.length && c+j < t[0].length){
                                 if(t[i+f][j+c] != -1){
                                     t[f+i][c+j]++;
                                 }
                             }
                         }
                     }
                     
                 }
                 
             }
         }
         
         
         
     }//fin poner_pistas-------------------------
     
     static boolean destapar(int t[][],int posf,int posc){
         boolean exp=false;
         
         if(t[posf][posc]==-1){
             
             exp=true;
             
         }
         else{
             
             
             
         }
         
         
         return exp;
     }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tab[][];
        int tab_usu[][];
        int minas,MAXMINAS=15;
        int TAMF,TAMC;
        boolean explota=false;
        int destapadas=0;
        int posf,posc;
        
        Scanner sc = new Scanner (System.in);
        
        do{
           System.out.println("¿Cuantas minas quieres?(1-"+ MAXMINAS +")");
            minas = sc.nextInt(); 
        }while(minas<0 && minas>15);
        
        do{
            System.out.println("¿De que tamaño quieres el tablero (-x-) Ej:4x4 ?");
            TAMF = sc.nextInt();
        }while(TAMF<4);
        
        TAMC = TAMF;
        
        tab = new int[TAMF][TAMC];
        tab_usu = new int[TAMF][TAMC];
        
        iniciar_tablero(tab,minas);
        iniciar_tablero_usu(tab_usu);
        
        //mostrarM(tab);
        
        poner_pistas(tab);
        
        System.out.println("--------------------------");
        
        //mostrarM(tab);
        
        while(!explota || destapadas < TAMF*TAMC-minas){
            
            System.out.println("Dime la posición de la fila que desea destapar(0-"+(tab.length-1)+")");
            posf = sc.nextInt();
            
            System.out.println("Dime la posición de la columna que desea destapar(0-"+(tab[0].length-1)+")");
            posc = sc.nextInt();
            
            explota = destapar(tab,posf,posc);
            
        }
    }
    
}
