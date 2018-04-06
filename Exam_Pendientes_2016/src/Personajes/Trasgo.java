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
public class Trasgo extends Personaje {
    private int maldad;

    public Trasgo() {
        super(40, 1);
        this.nombre = nombreTrasgo();
        this.maldad = 15;
    }

    public Trasgo(int maldad) {
        this.maldad = maldad;
    }

    public int getMaldad() {
        return maldad;
    }

    public void setMaldad(int maldad) {
        this.maldad = maldad;
    }

    @Override
    public String toString() {
        return nombre + " Vida: " + vida + " Maldad: " + maldad;
    }

    public String nombreTrasgo(){
        
        switch ((int)(Math.random()*2)) {
            case 0:
                this.nombre = "Kakogz";
                break;
            case 1:
                this.nombre = "Fernangohz Aranzgg";
                break;
        }
        return this.nombre;
    }
    
    
    
    
    @Override
    public void mostrarEstado() {
        
    }
    
    
}
