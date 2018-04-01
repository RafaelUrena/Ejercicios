/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer11_matrices;

/**
 *
 * @author rafa
 */
public class Ejer11_Matrices {

    static void iniciar(int t[][]){
        int alea;
        
        
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                
                alea = (int)(Math.random()*10);
                
                t[i][j] = alea;
            }//fin for
        }//fin for
        
    }//fin iniciar------------------------------------------------------
    
    static int sumarDia1(int t[][]){
        int sol=0;
        int i=0;
        
        while(i < t.length){
            
            sol = sol + t[i][i];
            i++;
        }
        
        return sol;
    }
    
    static int sumarDia2(int t[][]){
        int sol=0;
        int i=0,j=t.length-1;
        
        while(i<t.length){
            
            sol = sol + t[i][j];
            i++;
            j--;
        }
        
        return sol;
    }
    
    static void mostrarM(int t[][]){
        
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                
                System.out.print("["+t[i][j] +"]");
            }
            System.out.println("");
        }
        
        
    }//fin mostrarM--------------------------------------------
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tab[][] = new int[4][4];
        int sum1,sum2;
        
        
        iniciar(tab);
        
        mostrarM(tab);
        
        sum1 = sumarDia1(tab);
        
        sum2 = sumarDia2(tab);
        
        System.out.println("La suma de la primera diagonal es: "+sum1);
        System.out.println("La suma de la segunda diagonal es: "+sum2);
    }
    
}
