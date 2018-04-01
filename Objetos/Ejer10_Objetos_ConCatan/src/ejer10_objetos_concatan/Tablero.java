/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer10_objetos_concatan;

/**
 *
 * @author the_d
 */
public class Tablero {

    //******************* Atributos ***************************//
    private Casilla tab[][];

    //********************** Constructores *********************//
    public Tablero() {
        this.tab = new Casilla[3][4];

    }

    //*********************** Get y Set ********************************//
    public Casilla[][] getTab() {
        return tab;
    }

    public void setTab(Casilla[][] tab) {
        this.tab = tab;
    }

    //***************** To String ************************************//
    @Override
    public String toString() {
        return "{tab=" + tab + '}';

    }

    public void iniciarTablero() {

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                tab[i][j] = new Casilla();
            }
        }

    } //Fin iniciarTablero--------------------------------------

    public void mostrarTablero() {

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {

                System.out.print(this.tab[i][j]);

            }
            System.out.println("");
        }
    }

    public int elegirPos(int pos_f, int pos_c) {
        int elegida;

        if (pos_f <= tab.length && pos_f >= 0 && pos_c <= tab.length && pos_c >= 0) {

            if (tab[pos_f][pos_c].getOwner().equalsIgnoreCase("Vacio")) {
                tab[pos_f][pos_c].setOwner("Jugador");
                elegida = 0;
            } else {
                elegida = 1;
            }
        } else {
            elegida = 2;
        }

        return elegida;
    }

    public int elegirPosM(int pos_f, int pos_c) {
        int elegida;

        if (pos_f <= tab.length && pos_f >= 0 && pos_c <= tab.length && pos_c >= 0) {

            if (tab[pos_f][pos_c].getOwner().equalsIgnoreCase("Vacio")) {
                tab[pos_f][pos_c].setOwner("Maquina");
                elegida = 0;
            } else {
                elegida = 1;
            }
        } else {
            elegida = 2;
        }

        return elegida;

    }

    public int getLength() {
        return this.tab.length;
    }

    public int getLengthdos() {
        return this.tab[0].length;
    }

    public int ha_ganado(int dado, Jugador jugador, Jugador ordenador) {
        int qhg = 0;

        for (int i = 0; i < this.tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {

                if (this.tab[i][j].getNum() == dado) {
                    if (this.tab[i][j].getOwner().equalsIgnoreCase("Jugador")) {
                        if (this.tab[i][j].getElemento().equalsIgnoreCase("Trigo")) {
                            jugador.setAlm_t(+1);
                        }
                        if (this.tab[i][j].getElemento().equalsIgnoreCase("Carbón")) {
                            jugador.setAlm_c(+1);
                        }
                        if (this.tab[i][j].getElemento().equalsIgnoreCase("Madera")) {
                            jugador.setAlm_m(+1);
                        }
                    }
                    if (this.tab[i][j].getOwner().equalsIgnoreCase("Ordenador")) {
                        if (this.tab[i][j].getElemento().equalsIgnoreCase("Trigo")) {
                            ordenador.setAlm_t(+1);
                        }
                        if (this.tab[i][j].getElemento().equalsIgnoreCase("Carbón")) {
                            ordenador.setAlm_c(+1);
                        }
                        if (this.tab[i][j].getElemento().equalsIgnoreCase("Madera")) {
                            ordenador.setAlm_m(+1);
                        }

                    }
                }
            }
        }
        if (jugador.getAlm_c() >= 20 && jugador.getAlm_m() >= 20 && jugador.getAlm_t() >= 20) {
            qhg = 1;
        }
        if (ordenador.getAlm_c() >= 20 && ordenador.getAlm_m() >= 20 && ordenador.getAlm_t() >= 20) {
            qhg = 2;
        }

        return qhg;
    }

}
