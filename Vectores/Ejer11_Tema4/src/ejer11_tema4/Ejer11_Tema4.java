/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer11_tema4;

import java.util.Scanner;

/**
 *
 * @author the_d
 */
public class Ejer11_Tema4 {

    static void iniciar(int v[]){
        
        for(int i=0;i<v.length;i++){
            
            v[i] = (int) (Math.random()*9)+1;
            
        }//Fin for
        
    }//Fin iniciar-------------------------------------------------------------
    
    
    static void iniciarVm(int n1,int n2,int n3,int v[]){
            
            v[0] = n1;
            v[1] = n2;
            v[2] = n3;

        
    }//Fin iniciar-------------------------------------------------------------
    
    static void escribir(int v[]){
        for(int i = 0;i < v.length;i++){
            System.out.println("["+i+"]="+v[i]+" ");
        }
        System.out.println("       ");
    }//Fin escribir---------------------------------------------
    
    static boolean aparece(int v[],int vm[],int p1[],int p2[],int p3[]){
        int n1=0,n2=1,n3=3;
        int i=0;
        boolean aparece=false;
        
        while(n3<v.length && !aparece){
            if(i<v.length-3){
                if(vm[n1]==v[i] && vm[n2]==v[i+1] && vm[n3]==v[i+2]){
                    aparece=true;
                    p1[0]=n1;
                    p2[0]=n2;
                    p3[0]=n3;

                }//Fin if
            }//Fin if    
            n1++;
            n2++;
            n3++;
            i++;
        }//Fin while
        return aparece;
    }//Fin aparece
    
    
    public static void main(String[] args) {
        int v[] = new int[20];
        int vm[] = new int[3];
        int n1,n2,n3;
        int p1[] = new int[1];
        int p2[] = new int[1];
        int p3[] = new int[1];
        boolean apar;
        
        Scanner sc = new Scanner(System.in);
        
        iniciar(v);
        
        escribir(v);
        
        System.out.println("Escriba los 3 números del vector: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        
        iniciarVm(n1,n2,n3,vm);
        
        apar = aparece(v,vm,p1,p2,p3);
        
        if(apar){
            
            System.out.println("El sector aparece en las posiciones: "+p1[0]+", "+p2[0]+", "+p3[0]);
        }
        
        
    }//Fin main
    
}
