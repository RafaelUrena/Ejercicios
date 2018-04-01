/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer8_objetos_buscaminas;

/**
 *
 * @author the_d
 */
public class Tablero {

    //********************* Atributos **********************************//
    private int tab[];
    private int tabj[];
    private int mins;
    private boolean dest[];

    //************************ Constructores ******************************//
    public Tablero(int tam, int minas) {
        this.tab = new int[tam];
        this.tabj = new int[tam];
        this.mins = minas;
        this.dest = new boolean[tam];
    }

    //*********************** Otros métodos ****************************//
    /**
     * Inicia tablero normal
     */
    public void iniciarTab() {
        for (int i = 0; i < this.tab.length; i++) {
            this.tab[i] = 0;
            this.dest[i]=false;
        }
    }//fin iniciartab-------------------------------------

    /**
     * Inicia tablero del jugador
     */
    public void iniciarTabJug() {
        for (int i = 0; i < this.tab.length; i++) {
            this.tabj[i] = 0;
            this.dest[i]=false;
        }
    }//fin iniciartab-------------------------------------

    /**
     * Inicia las minas en una posicion aleatoria.
     */
    public void colocarMinas() {
        int alea;
        int auxm;

        auxm = this.mins;

        while (auxm > 0) {
            alea = (int) (Math.random() * this.tab.length);

            if (this.tab[alea] == 0) {
                this.tab[alea] = 9;
                auxm--;
            }
        }
    }
/**
 * Muestra el tablero normal
 */
    public void mostrar() {
        for (int i = 0; i < this.tab.length; i++) {
            System.out.print("[" + this.tab[i] + "]");

        }
        System.out.println("");
    }//fin mostrar------------------------------------------

    /**
     * Muestra el panel boqueado y desbloqueado del jugador
     * 
     * @param pos (posicion) que ha elegido el usuario 
     */
    public void mostrarJug(int pos) {
        for (int i = 0; i < this.tab.length; i++) {

            this.tabj[i] = this.tab[i];

            if (!this.dest[i]) {

                System.out.print("[-]");
                
            } else {

                if (this.tabj[i] == 0) {
                    System.out.print("[0]");
                }
                if (this.tabj[i] == 9) {
                    System.out.print("[*]");
                }
                if (this.tabj[i] > 0 && this.tabj[i] < 9) {
                    System.out.print("[" + this.tabj[i] + "]");
                }
            }

        }

    }//fin mostrarJug------------------------------------------
/**
 * Genera las pistas al rededor del vector,
 * 1 - si hay una mina alrededor
 * 2 - Si hay 2 minas alrededor
 * 0- Si no hay ninguna
 */
    public void generarPistas() {
        for (int i = 0; i < this.tab.length; i++) {
            if (this.tab[i] == 9) {
                if (i - 1 >= 0) {
                    if (this.tab[i - 1] != 9) {
                        this.tab[i - 1]++;
                    }
                }
                if (i + 1 < this.tab.length - 1) {
                    if (this.tab[i + 1] != 9) {
                        this.tab[i + 1]++;

                    }
                }
            }
        }
    }//Fin generarPistas--------------------------------------

    /**
     * Destapa la casilla del jugador
     * @param pos
     * @return devuelve un entero (Que Ha Pasado)qhp que tiene devuelve:
     * 0 - Si ha explotado la mina
     * 1 - Si ha destapado casilla
     */
    public int destapar(int pos) {
        int qhp;

        if (this.tab[pos] == 9) {
            qhp = 0;
            for (int i = 0; i <tab.length ; i++) {
                this.dest[i]=true;
                
            }
            
            this.dest[pos] = true;
        } else {
            qhp = 1;
            this.dest[pos] = true;
        }

        return qhp;
    }//Fin destapar--------------------------------------------------------

}
