/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2_tema4;

/**
 *
 * @author Rafalaptop
 */
public class Ejer2_Tema4 {

    static void escribir(int v[]){
        for(int i = 0;i < v.length;i++){
            System.out.println("["+i+"]="+v[i]+" ");
        }
        System.out.println("       ");
    }
    
    static void calculaPares(int p[]){
          int cont=0;
          
        for(int i=0;i<p.length;i++){
            p[i]=cont;
            cont+=2;
        }
    }
    
    static void calculaImpares(int im[]){
        int cont=1;
        int i=0;
        while(i<im.length){
            im[i]=cont;
            cont+=2;
            i++;
        }
        
    }
    
    public static void main(String[] args) {
        int pares[]=new int[10];
        int impares[]=new int[10];
        int cont;

        System.out.println("Los pares: ");
        calculaPares(pares);
        escribir(pares);

        System.out.println("Los impares: ");
        calculaImpares(impares);
        escribir(impares);
    }
    
}
