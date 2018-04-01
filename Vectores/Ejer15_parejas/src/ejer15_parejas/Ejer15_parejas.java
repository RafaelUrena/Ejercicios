/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer15_parejas;

/**
 *
 * @author the_d
 */
public class Ejer15_parejas {

    static void iniciar(int p[]){
        
        for(int i=0;i<p.length;i++){
            p[i] = 0;
        }//Fin for
        
        
    }//Fin iniciar------------------------------------------------------
    
    static void rellenar(int p[],int parej){
        int stacks=1;
        int alea;
        int n=1,pos;
        
        while(n<=p.length/2){
            
            do{
               pos = (int)(Math.random()*p.length-1); 
            }while(p[pos]!=0);
            p[pos]=n;
            stacks++;
            if(stacks==3){
                n++;
            }
        }
        
    }//Fin rellenar-------------------------------------------------------
    
    
    static void mostrar(int r[]){
        
        for(int i=0;i<r.length;i++){
            System.out.print("[ "+r[i]+" ]");
        }//Fin for
        System.out.println(" ");
    }//Fin mostrar-------------------------------------------------------
    
    public static void main(String[] args) {
        int panel[] = new int[10];
        int panel_J[] = new int[10];
        int parejas;
        
        parejas = panel.length/2;
        
        iniciar(panel);
        
        iniciar(panel_J);
        
        rellenar(panel,parejas);
        
        mostrar(panel);
        
    }
    
}
