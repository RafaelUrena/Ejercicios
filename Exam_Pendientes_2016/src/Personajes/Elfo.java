/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

/**
 *
 * @author the_d
 */
public class Elfo extends Personaje{
    private int inmortalidad;

    public Elfo() {
        super(50,1);
        this.nombre = nombreElfo();
        this.inmortalidad = 10;
    }

    public Elfo(int inmortalidad) {
        this.inmortalidad = inmortalidad;
    }

    public int getInmortalidad() {
        return inmortalidad;
    }

    public void setInmortalidad(int inmortalidad) {
        this.inmortalidad = inmortalidad;
    }

    @Override
    public String toString() {
        return nombre + " Vida: " + vida + " Inmortalidad: " + inmortalidad;
    }
    
    public String nombreElfo(){
        
        switch ((int)(Math.random()*2)) {
            case 0:
                this.nombre = "Manüelis  Meniis";
                break;
            case 1:
                this.nombre = "Vactorüs Snow";
                break;
        }
        return this.nombre;
    }

    
    
    @Override
    public void mostrarEstado() {
        
    }
    
    
}
