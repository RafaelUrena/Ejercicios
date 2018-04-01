/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import animales.*;

/**
 *
 * @author rafa
 */
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Parque park = new Parque(10);
        int tiempo = 0;
        int alea;

        do {

            if (tiempo % 2 == 0) {
                park.accionHabitual();
            }

            if (tiempo % 10 == 0) {
                park.addAnimal();
            }

            if (tiempo % 15 == 0) {
                park.cambiarPosicion();
                System.out.println("Un animal cambio de posicion");
            }

            alea = (int) (Math.random() * 2);

            if (tiempo % 20 == 0) {

                if (alea == 1) {
                    park.abandonarParque();
                    System.out.println("Un animal abandono el parque");
                }

            }

            tiempo++;
            Thread.sleep(1000);
        } while (tiempo <= 60);

    }

}
