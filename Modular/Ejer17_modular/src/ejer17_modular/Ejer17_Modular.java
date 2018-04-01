/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer17_modular;

import java.util.Scanner;

/**
 *
 * @author the_d
 */
public class Ejer17_Modular {

    
    static void ec2g(float a,float b,float c,float res1[],float res2[],int sol[]){
        float raiz;

        raiz = (float) (Math.pow(b, 2) - 4 * a * c);
        
        if(raiz < 0){
            sol[0] = 0;
        }//Fin if
        
        if(raiz == 0){
            sol[0] = 1;
           res1[0] = (float)  -b / (2*a);
        }//Fin if
        
        if(raiz > 0){
            sol[0] = 2;
            res1[0] = (float)( -b +  Math.sqrt(raiz) / (2*a));
            res2[0] =(float)(-b - Math.sqrt(raiz) / (2*a));
        }//Fin if
        
    }//Fin ec2g-----------------------------------------------------------------
    
    public static void main(String[] args) {
        float a,b,c;
        float result1[] = new float [1];
        float result2[] = new float [1];
        int sol[] = new int [1];
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escriba el valor de 'a': ");
        a = sc.nextFloat();
        System.out.print("Escriba el valor de 'b': ");
        b = sc.nextFloat();
        System.out.print("Escriba el valor de 'c': ");
        c = sc.nextFloat();
        
        ec2g(a,b,c,result1,result2,sol);
        
        if(sol[0]==0) System.out.println("La ecuación no tiene solución");
        
        if(sol[0]==1) System.out.println("La ecuación tiene un resultado: "+result1[0]);
        
        if(sol[0]==2) System.out.println("La ecuación tiene 2 resultados: "+result1[0]+ " y "+result2[0]);
        
        
    }//Fin main-----------------------------------------------------------------
    
}
