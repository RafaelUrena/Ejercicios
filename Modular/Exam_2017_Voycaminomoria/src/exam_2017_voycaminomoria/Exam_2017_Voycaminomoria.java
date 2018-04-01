/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_2017_voycaminomoria;

/**
 *
 * @author Rafalaptop
 */
public class Exam_2017_Voycaminomoria {

    int numconca(int j1,int j2){
        int sol;
        int cif;
        int res;
        int cont=0;
        
        cif = cifras(j1)+cifras(j2);
        
        do{
            res = j1 % 10;
            sol = (int) (res * Math.pow(10, cont));
        }while(cont<=cif);
        
        return sol;
    }//Fin numconca-----------------------------------------
    
    int cifras(int n){
        int sol=0;
        
        do{
            n=n/10;
            sol++;
        }while(n>=0);
        
        return sol;
    }//Fin cifras-----------------------------------------------
    
    public static void main(String[] args) {
        int j1_1,j1_2,j2_1,j2_2;
    }
    
}
