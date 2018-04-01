/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer14_matrices;

/**
 *
 * @author the_d
 */
public class Ejer14_Matrices {

    
    static void iniciar(int t[][]) {
        int alea;

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {

                alea = (int)(Math.random()*10);
                t[i][j] = alea;

            }//fin for
        }//fin for

    }//fin iniciar------------------------------------------------------
    
     static boolean comprobar(int t[][]) {
        boolean es_simetrica=true;

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {

                if(t[i][j]!=t[j][i]){
                    es_simetrica=false;
                }

            }//fin for
        }//fin for

        return es_simetrica;
    }//fin comprobar------------------------------------------------------
     
     static void mostrarM(int t[][]) {

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {

                System.out.print("[" + t[i][j] + "]");
            }
            System.out.println("");
        }

    }//fin mostrarM--------------------------------------------
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int tab[][]= new int [3][3];
       boolean es_simetrica=false;

       do{
           
       
            iniciar(tab);

            mostrarM(tab);

            es_simetrica = comprobar(tab);
            
            if(es_simetrica) System.out.println("La matriz es simetrica");
            if(!es_simetrica) System.out.println("La matriz No es simetrica");
            
            
       }while(!es_simetrica);
       
       mostrarM(tab);
       
       
    }
    
}
