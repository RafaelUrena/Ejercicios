/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package los_juegos_del_hambre;

/**
 *
 * @author the_d
 */
public class Jugador {
        //*************** Atributos *******************//
    private int fuerza;
    private int vida;
    
    //**************** Constructores *******************//

    public Jugador(int vida) {
        this.fuerza = IniciarFuerza();
        this.vida = 100;
    }

    @Override
    public String toString() {
        return "J: Fuerza=" + fuerza + ", vida=" + vida;
    }
    
    
    
    public int IniciarFuerza(){
        int alea;
        
        alea = (int)(Math.random()*10)+1;
        
        return alea;
        
    }
    
}
