/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_pendientes_2016;

import Mapa.*;
import Personajes.*;

/**
 *
 * @author the_d
 */
public class Exam_Pendientes_2016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Humano h = new Humano();
        Item c = new Item();
        Equipo e1 = new Equipo("DAW");
        Equipo e2 = new Equipo("DAM");
        Escenario mapa = new Escenario();
        
            
        h.mostrarEstado();
        
        System.out.println(c);
        
        e1.generarPersonaje();
        e2.generarPersonaje();
        
        e1.mostrarPersonajes();
        e2.mostrarPersonajes();
        
        mapa.generarEscenario();
        
        mapa.mostrarEscenario();
    }
    
}
