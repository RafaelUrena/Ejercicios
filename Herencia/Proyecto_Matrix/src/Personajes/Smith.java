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
public class Smith extends Personajes{
    private int cInfecc;

    public Smith() {
        super("Smith");
        this.cInfecc = generarInfeccion();
    }

    @Override
    public void generar() {
    }

    @Override
    public void mostrar() {
    }

    @Override
    public void pedir() {
    }
    
    public int generarInfeccion(){
        int alea = (int)(Math.random()*95)+1;
        
        return alea;
    }
    
}
