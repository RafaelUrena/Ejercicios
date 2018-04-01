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
public class Generico extends Personajes{
    private int pMorir;

    public Generico() {
        super();
        this.pMorir = (int)(Math.random()*100)+1;
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

    public int getpMorir() {
        return pMorir;
    }

    public void setpMorir(int pMorir) {
        this.pMorir = pMorir;
    }

    
    
    
}
