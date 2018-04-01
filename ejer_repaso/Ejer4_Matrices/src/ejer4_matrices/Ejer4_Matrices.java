/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4_matrices;

/**
 *
 * @author the_d
 */
public class Ejer4_Matrices {

    static void iniciar(int t[][]){
        int alea;
        
        
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                
                alea = (int)(Math.random()*10);
                
                t[i][j] = alea;
            }//fin for
        }//fin for
        
    }//fin iniciar------------------------------------------------------
    
    static int sumarpar(int t[][],float m[]){
        int sum = 0;
        int cont=1;
        
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                
                cont++;
                if(t[i][j] % 2 == 0){
                    sum = sum + t[i][j];
                    
                }//fin if
            }//fin for
        }//fin for
        
        m[0] =(float) (sum + cont)/cont;
        
        System.out.println("La suma de los pares es, "+sum+", y su media es, "+m[0]);
        
        return sum;
    }//fin sumarpar--------------------------------------------
    
    static int sumarimpar(int t[][],float m[]){
        int sum = 0;
        int cont=1;
        
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                
                cont++;
                if(t[i][j] % 2 != 0){
                    sum = sum + t[i][j];
                    
                }//fin if
            }//fin for
        }//fin for
        
        m[0] =(float) (sum + cont)/cont;
        
        System.out.println("La suma de los impares es, "+sum+", y su media es, "+m[0]);
        
        return sum;
    }//fin sumarimpar--------------------------------------------
    
    static int sumarpar1(int t[][],float m[]){
        int sum = 0;
        int cont=1;
        
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                
                cont++;
                if(i % 2 == 0 && j % 2 == 0){
                    sum = sum + t[i][j];
                    
                }//fin if
            }//fin for
        }//fin for
        
        m[0] =(float) (sum + cont)/cont;
        
        System.out.println("La suma de los pares es, "+sum+", y su media es, "+m[0]);
        
        return sum;
    }//fin sumarpar1--------------------------------------------
    
    static int sumarimpar1(int t[][],float m[]){
        int sum = 0;
        int cont=1;
        
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                
                cont++;
                if(i % 2 != 0 && j % 2 != 0){
                    sum = sum + t[i][j];
                    
                }//fin if
            }//fin for
        }//fin for
        
        m[0] =(float) (sum + cont)/cont;
        
        System.out.println("La suma de los impares es, "+sum+", y su media es, "+m[0]);
        
        return sum;
    }//fin sumarimpar1--------------------------------------------
    
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
        int sumapar;
        int sumaimpar;
        int sumapar1;
        int sumaimpar1;
        float media[] = new float [1] ;
        
        
        iniciar(tab);
        
        mostrarM(tab);
        
        sumapar = sumarpar(tab,media);
        
        sumaimpar = sumarimpar(tab,media);
        
        sumapar1 = sumarpar1(tab,media);
        
        sumaimpar1 = sumarimpar1(tab,media); 
    }
    
}
