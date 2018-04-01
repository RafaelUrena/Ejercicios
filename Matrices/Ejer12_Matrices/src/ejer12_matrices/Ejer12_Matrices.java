/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer12_matrices;

/**
 *
 * @author rafa
 */
public class Ejer12_Matrices {

    static void mostrarM(int t[][]){
        
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                
                System.out.print("["+t[i][j] +"]");
            }
            System.out.println("");
        }
        
        
    }//fin mostrarM--------------------------------------------
    
    static void iniciar(int t[][]){
        int cont=1;
        
        
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                
                t[i][j] = cont;
                
                cont++;
            }//fin for
        }//fin for
        
    }//fin iniciar------------------------------------------------------
    
    static void cambiar(int t[][],int t2[][]){
        
        
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                
                t2[j][i]=t[i][j];
            }//fin for
        }//fin for
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tab[][] = new int[4][4];
        int tab2[][] = new int[4][4];
        
        
        iniciar(tab);
        
        mostrarM(tab);
        
        cambiar(tab,tab2);
        
        System.out.println(" ");
        System.out.println("-----------------------");
        System.out.println(" ");
        
        mostrarM(tab2);
    }
    
}
