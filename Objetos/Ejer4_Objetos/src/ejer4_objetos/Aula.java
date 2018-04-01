/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4_objetos;

/**
 *
 * @author the_d
 */
public class Aula {
    
    private Ordenador pcs[];
    private String nombre;
    private int clase;

    public Aula(int  n) {
        this.pcs = crearOrdenadores(n);
        this.nombre="";
        this.clase=0;
    }

    public Ordenador[] getPcs() {
        return pcs;
    }

    public void setPcs(Ordenador[] pcs) {
        this.pcs = pcs;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getClase() {
        return clase;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }
    
    
}
