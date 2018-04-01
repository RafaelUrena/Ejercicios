/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer13_matrices;

/**
 *
 * @author the_d
 */
public class Ejer13_Matrices {

    static void iniciar(int t[][]) {
        int cont = 1;

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {

                t[i][j] = cont;

                cont++;
            }//fin for
        }//fin for

    }//fin iniciar------------------------------------------------------

    static void girar(int t[][], int t2[][]) {
        int jg = t.length - 1;

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t2[j][jg] = t[i][j];
            }
            jg--;
        }

        //m = new int [2][3];
        //t = new int [m[0].length][m.length];
        //cg = t[0].length-1;
        //cg = m.length-1;
    }//fin girar------------------------------------------------------

    static void girar90(int t[][], int t2[][]) {
        int jg;

        jg = t.length - 1;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t2[j][jg] = t[i][j];
            }
            jg--;
        }

        //m = new int [2][3];
        //t = new int [m[0].length][m.length];
        //cg = t[0].length-1;
        //cg = m.length-1;
    }//fin girar------------------------------------------------------

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
        int tab[][] = new int[4][5];
        int tab2[][] = new int[tab[0].length][tab.length];

        iniciar(tab);

        mostrarM(tab);

        System.out.println("------------------");

        // girar(tab,tab2);
        girar90(tab, tab2);

        System.out.println("------------------");

        mostrarM(tab2);

    }

}
