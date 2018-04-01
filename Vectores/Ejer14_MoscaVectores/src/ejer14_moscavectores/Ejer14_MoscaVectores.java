/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer14_moscavectores;

import java.util.Scanner;

/**
 *
 * @author Rafalaptop
 */
public class Ejer14_MoscaVectores {

    
    static void iniciar(boolean t[]){
        
        for(int i=0;i<t.length;i++){
            t[i]=false;
        }//Fin for
        
    }//Fin iniciar--------------------------------------------------
    
    static void mostrar(boolean t[]){
        
        for(int i=0;i<t.length;i++){
            System.out.println("["+i+"]"+t[i]);
        }//Fin for
        System.out.println(" ");
    }//Fin mostrar
    
    static void colocarMoscas(boolean t[],int mos){
        int alea;
        
        while(mos!=0){
            
            alea = (int)(Math.random()*t.length);
            
            if(!t[alea]){
                t[alea]=true;
                mos--;
            }//Fin if
        }//Fin while
        
        
    }//Fin colocarMoscas------------------------------------------------------
    
    static void revolotea(boolean t[],int pos){
        int alea;
        boolean fal=true;
        
        alea = (int)(Math.random()*t.length);
   
        while(t[alea] || !fal){
            
            alea = (int)(Math.random()*t.length);
            
            if(!t[alea]){
                t[alea] = true;
                fal=false;
            }//Fin if
            
         }//Fin while
        
    }
    
    
    static boolean darManotazo(boolean t[],int pos,int qhp[]){
        boolean caz=false;
        int mos;
        
        if(t[pos]==true){
            caz=true;
            t[pos]=false;
            qhp[0]=0;
        }//Fin if
        else{
            if(pos-1 >= 0){
                if(pos+1<=t.length){
                    if(t[pos-1]){
                        t[pos-1]=false;
                        qhp[0]=1;
                    }
                    if(t[pos+1]){
                        t[pos+1]=false;
                        qhp[0]=1;
                    }
                    if(t[pos-1] && t[pos+1]){
                        t[pos-1]=false;
                        t[pos+1]=false;
                        qhp[0]=2;
                    }
                }
            }
            else{
                if(t[pos+1]){
                   qhp[0]=1; 
                }
            }
        }
        
                
        return caz;
    }//-----------------------------------------------------------------
    
    public static void main(String[] args) {
        boolean tab[];
        int tamanio;
        int moscas;
        int pos;
        boolean cazada;
        int qhp[] = new int[1]; 
        int intentos=0;
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿De que tamaño quieres el tablero?");
        tamanio = sc.nextInt();
        
        tab = new boolean [tamanio];
        
        iniciar(tab);
        
        do{
            
            System.out.println("¿Cuantas moscas quieres?");
            moscas = sc.nextInt();
            
        }while(moscas >= tamanio);
        
        colocarMoscas(tab,moscas);
        
        mostrar(tab);
        
        while(moscas!=0 && intentos != 3){
        
            do{

                System.out.println("¿Donde quieres dar el manotazo?");
                pos = sc.nextInt();

            }while(pos < tab.length && pos > tab.length);
            
            mostrar(tab);

            darManotazo(tab,pos,qhp);

            switch(qhp[0]){

                case 0:
                    moscas--;

                    break;

                case 1:
                    revolotea(tab,pos);

                    break;

                case 2:
                    revolotea(tab,pos);
                    break;

            }//Fin switch
            
            intentos++;
            
        }//Fin while
        
        if(intentos==3){
            System.out.println("Ya no te quedan intentos, has perdido");
        }//Fin if
        
        if(moscas==0){
            System.out.println("¡Has matado a todas las moscas!");
        }//Fin if
        
    }//Fin main
    
}
