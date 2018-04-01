/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_matrices;

/**
 *
 * @author rafa
 */
public class Ejemplo_matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mat[][] = new int [2][3];
        int cont=1;
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                mat[i][j]=cont;
                cont++;
            }
        }
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
