/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moscaobjetosvida;

/**
 *
 * @author Miki
 */
public class tablero {

    private mosca mesa[][];
    private int intentos;

    public tablero() {
        this.mesa = new mosca[4][4];
        this.intentos = 3;
    }

    public tablero(int f, int c) {
        this.mesa = new mosca[f][c];
        this.intentos = 3;
    }

    /**
     * ****************
     * Metodos *
     *******************
     */
    public void iniciarTablero() {
        for (int f = 0; f < this.mesa.length; f++) {
            for (int c = 0; c < this.mesa[f].length; c++) {
                this.mesa[f][c] = null;
            }
        }
    }

    public void colocarMosca(mosca mos) {
        int f = (int) (Math.random() * this.mesa.length);
        int c = (int) (Math.random() * this.mesa[0].length);
        this.mesa[f][c] = mos;
    }

    public void colocarMosca() {
        int f = (int) (Math.random() * this.mesa.length);
        int c = (int) (Math.random() * this.mesa[0].length);
        this.mesa[f][c] = new mosca();
    }

    public void revolotearMosca() {
        mosca m;
        for (int f = 0; f < this.mesa.length; f++) {
            for (int c = 0; c < this.mesa[0].length; c++) {
                if (this.mesa[f][c] != null) {
                    m = this.mesa[f][c];
                    this.mesa[f][c] = null;
                    colocarMosca(m);
                }
            }
        }

    }//fin metodo

    public int comprobarGolpe(int f, int c) {
        int resultado = 0;

        if (this.mesa[f][c] != null) {
            mosca m = this.mesa[f][c];
            m.quitarVida();
            revolotearMosca();
            resultado = 1;
        } else {
            for (int auxf = f - 1; auxf <= f + 1; auxf++) {
                for (int auxc = c - 1; auxc <= c + 1; auxc++) {
                    if (auxf >= 0 && auxf < this.mesa.length && auxc >= 0 && auxc < this.mesa[0].length) {
                        if (this.mesa[auxf][auxc] != null) {
                            resultado = 2;
                            revolotearMosca();
                            this.intentos--;
                        }
                    }
                }
            }
        }
        return resultado;
    }

    public void mostrarTablero() {
        for (int f = 0; f < this.mesa.length; f++) {
            for (int c = 0; c < this.mesa[0].length; c++) {
                if (this.mesa[f][c] != null) {
                    System.out.print("[M]");
                } else {
                    System.out.print("[ ]");
                }

            }
            System.out.println(" ");
        }
    }

    public boolean comprobarVidaMosca() {
        mosca m;
        boolean estado = true;
        for (int f = 0; f < this.mesa.length; f++) {
            for (int c = 0; c < this.mesa[0].length; c++) {
                if (this.mesa[f][c] != null) {
                    m = this.mesa[f][c];
                    estado = m.estaViva();
                }
            }
        }
        return estado;
    }

    public String nombreMosca() {
        String nombre = "";
        mosca m;

        for (int f = 0; f < this.mesa.length; f++) {
            for (int c = 0; c < this.mesa[0].length; c++) {
                if (this.mesa[f][c] != null) {
                    m = this.mesa[f][c];
                    nombre = m.getNombre();
                }
            }
        }
        return nombre;
    }

    /**
     * ****************
     * GET Y SET *
     *******************
     */

    public mosca[][] getMesa() {
        return mesa;
    }

    public int getIntentos() {
        return intentos;
    }

}
