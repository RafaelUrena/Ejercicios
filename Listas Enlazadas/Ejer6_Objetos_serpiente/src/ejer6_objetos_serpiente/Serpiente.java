/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer6_objetos_serpiente;

/**
 *
 * @author the_d
 */
public class Serpiente {

    //-----------------------Atributos-------------------------------//
    private char cuerpo[];
    private int edad;

    //*********Constructores*****************//
    public Serpiente() {
        this.cuerpo = new char[1];
        this.edad = 0;
        this.cuerpo[0] = this.asignarColor();
    }

    //************ Get y Set ********************//
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //***************** Otros métodos *********************//
    private char asignarColor() {
        char color = ' ';
        int alea = (int) (Math.random() * 3);

        switch (alea) {
            case 0:
                color = 'r';
                break;
            case 1:
                color = 'v';
                break;
            case 2:
                color = 'a';
                break;
            default:
                throw new AssertionError();
        }
        return color;
    }

    //********** métodos serpiente********************//
    public void crecerSerpiente() {
        char aux[] = new char[this.cuerpo.length + 1];

        for (int i = 0; i < this.cuerpo.length; i++) {
            aux[i] = this.cuerpo[i];
        }

        this.cuerpo = aux;
        this.edad++;
        this.cuerpo[this.cuerpo.length - 1] = asignarColor();

    }//Fin crecerSerpiente---------------------------------

    public void decrecerSerpiente() {
        char aux[] = new char[this.cuerpo.length - 1];

        for (int i = 0; i < aux.length; i++) {
            aux[i] = this.cuerpo[i];
        }
        this.cuerpo = aux;
        this.edad++;

    }

    public void mostrar() {

        for (int i = 0; i < this.cuerpo.length; i++) {
            System.out.print("[" + this.cuerpo[i] + "]");
        }
        System.out.println("");
    }

    public boolean estaMuerta() {
        return this.cuerpo == null;
    }

    public void matarSerpiente() {
            this.cuerpo = null;
        
    }

    public void mudarSerpiente() {
        for (int i = 0; i < this.cuerpo.length; i++) {
            this.cuerpo[i] = this.asignarColor();
        }
    }

}
