/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

/**
 *
 * @author rafa
 */
public class Elefante extends Mascota implements interfazanimal {

    @Override
    public void dormir() {
        System.out.println("El elefante esta durmiendo");
    }

    @Override
    public void comer() {
        System.out.println("El elefante esta comiendo");
    }

    @Override
    public void hacerRuido() {
        System.out.println("Prrrrrfff");
    }
    
}
