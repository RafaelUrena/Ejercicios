/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer18_buscaminas;

import java.util.Scanner;

/**
 *
 * @author the_d
 */
public class Ejer18_buscaminas {

    static void iniciar(int p[]){
        
        for(int i=0;i<p.length;i++){
            p[i] = 0;
        }//Fin for
        
        
    }//Fin iniciar------------------------------------------------------
    
    
    static void colocar_minas(int p[],int mi){
        int alea;
        
        
        while(mi > 0){
            
            alea = (int) (Math.random()*p.length-1);
            
            if(p[alea]==0){
                p[alea]=-1;
                mi--;
            }//Fin if
            
        }//Fin while
        
        
        
    }//Fin colocar_minas------------------------------------------------------
    
    static void mostrar(int r[]){
        
        for(int i=0;i<r.length;i++){
            System.out.print("[ "+r[i]+" ]");
        }//Fin for
        System.out.println(" ");
    }//Fin mostrar-------------------------------------------------------
    
    
    static void colocar_pistas(int pa[],int pis[]){
        
        for(int i=0;i<pa.length;i++){
            
            if(pa[i]==-1){
                if(i-1 >= 0){
                    if(pa[i-1]!=-1){
                        pis[i-1]++;
                    }//fin if    
                }//fin if
                if(i+1 <= pa.length-1){
                    if(pa[i+1]!=-1){
                        pis[i+1]++;
                    }//fin if 
                }//Fin if
                pis[i]=-1;
            }//Fin if
            
            
        }//fin for
        
    }//Fin colocar_pistas------------------------------------------
    
    static int que_pasa(int pis[],int pos,int jug[]){
        int qhp;
        
        if(pis[pos]==-1){
            qhp=0;
        }//fin if
        else{
            qhp=1;
            jug[pos]=pis[pos];
            
        }//fin else
        
        return(qhp);
    }//fin que_pasa--------------------------------------------------
    
    
    //******************************Algoritmo Principal**********************//
    
    public static void main(String[] args) {
        int panel[];
        int panel_J[];
        int tamanio;
        int minas;
        int pistas[];
        int destapadas;
        boolean explota=false;
        int selec;
        int qhp;
        
        Scanner sc = new Scanner(System.in);
        
        do{
        
            System.out.println("¿De que tamaño quieres el tablero?");
            tamanio = sc.nextInt();
        
        }while(tamanio <= 0);
        
        panel = new int[tamanio];
        pistas = new int[tamanio];
        panel_J = new int[tamanio];
        
        do{
            
            System.out.println("¿Cuantas minas quieres?");
            minas = sc.nextInt();
            
        }while(minas < 0 || minas >= panel.length);
        
        iniciar(panel);
        iniciar(pistas);
        iniciar(panel_J);
        
        colocar_minas(panel,minas);
        
        colocar_pistas(panel,pistas);
        
        //mostrar(panel);
        
        //mostrar(pistas);
        
        destapadas = panel.length - minas;
        
        while(destapadas!=0 && !explota){
            
            System.out.println("Selecciona una casilla/0-"+(panel.length-1));
            selec = sc.nextInt();
            
            qhp = que_pasa(pistas,selec,panel_J);
            
            switch(qhp){
                case 0:
                    explota=true;
                    mostrar(panel);
                    break;
                case 1:
                    destapadas--;
                    mostrar(panel_J);
                    
            }//Fin switch
        }//fin while
        
        if(explota) System.out.println("Has explotado la mina T_T ");
        
        mostrar(pistas);
        
        if(destapadas==0) System.out.println("¡¡Felicidades, has descubierto las minas!!");
        
    }//fin main
    
}
