/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa;

/**
 *
 * @author the_d
 */
public class Equipo {
    private String nombre;
    private Object personaje[];

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.personaje = new Object [2];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Team name: "+ nombre;
    }

    public void generarPersonaje(){
        
        
    }
    
    
}
