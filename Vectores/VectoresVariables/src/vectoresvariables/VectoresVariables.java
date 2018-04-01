/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresvariables;

/**
 *
 * @author faranzabe
 */
public class VectoresVariables {

    static int[] cambiaTam(int v[]){
        
        int vDev[] = new int[7];
        
        for (int i = 0; i < vDev.length; i++) {
            vDev[i]=0;
        }
        
        for (int i = 0; i < v.length; i++) {
            vDev[i] = v[i];
        }
        
        return vDev;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vector[] = {12,43,56};
        
        vector = cambiaTam(vector);
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
        
    }
    
}
