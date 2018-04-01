/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4_tema4;

/**
 *
 * @author Rafalaptop
 */
public class Ejer4_Tema4 {

    static void alea(int v[]){
        
        for(int i=0;i<v.length;i++){
            v[i]=(int) ((Math.random()*10)+1);
        }//Fin for
    }//Fin alea--------------------------------------------
    
    static void calMax(int v[],int mayor[],int cont[]){
        mayor[0] = v[0];
        
        for(int i=1;i<v.length;i++){
            if(v[i]>=mayor[0]){
                mayor[0]=v[i];
                cont[0]=i;
            }//Fin si
        }
    }//Fin calMax
    
     static void escribir(int v[]){
        for(int i = 0;i < v.length;i++){
            System.out.println("["+i+"]="+v[i]+" ");
        }
        System.out.println("       ");
    }//Fin escribir---------------------------------------------
     
    
    public static void main(String[] args) {
        int vector[] =  new int[10];
        int ma[] = new int[1];
        int c[] = new int[1];
        
        alea(vector);
        
        escribir(vector);
        
        calMax(vector,ma,c);
        
        System.out.println("El número mayor es: "+ma[0]+" y la posición "+c[0]);
        
    }
    
}
