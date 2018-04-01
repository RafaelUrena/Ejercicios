/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer5_matrices;

/**
 *
 * @author the_d
 */
public class Ejer5_Matrices {

    static void iniciar(int t[][]){
        int alea;
        
        
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                
                alea = (int)(Math.random()*10);
                
                t[i][j] = alea;
            }//fin for
        }//fin for
        
    }//fin iniciar------------------------------------------------------
    
    static void valor(int t[][],int vM[],int vmi[], float med[]){
        int cont = 1;
        int sum = 0;
        vM[0] = t[0][0];
        vmi[0] = t[0][0];
        
        
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                
                sum = sum + t[i][j];
                cont++;
                
                if(j < t[j].length-1){
                    if(t[i][j] > vM[0]){
                        vM[0] = t[i][j];
                    }
                    if(t[i][j] < vmi[0]){
                        vmi[0] = t[i][j];
                    }
                }
            }//fin for
        }//fin for
        
        med[0] =(float) (sum+cont)/cont;
        
        System.out.println("El valor máximo es:"+vM[0]);
        System.out.println("El valor minimo es:"+vmi[0]);
        System.out.println("La media de todo es:"+med[0]);
        
    }//fin iniciar------------------------------------------------------
    
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
        int valmax[] = new int[1];
        int valmin[] = new int[1];
        float media[] = new float[1];
        
        
        iniciar(tab);
        
        mostrarM(tab);
        
        valor(tab,valmax,valmin,media);
        
        
        
        
    }
    
}
