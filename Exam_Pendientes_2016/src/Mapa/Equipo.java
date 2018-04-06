/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa;

import Personajes.*;

/**
 *
 * @author the_d
 */
public class Equipo {
    private String nombre;
    private Personaje personaje[];

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.personaje = new Personaje [2];
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
        
        for (int i = 0; i < this.personaje.length; i++) {
            
            switch ((int)(Math.random()*3)) {
            case 0:
                this.personaje[i] = new Humano();
                break;
            case 1:
                this.personaje[i] = new Elfo();
                break;
            case 2:
                this.personaje[i] = new Trasgo();
                break;
            }
        }
        
    }
    
    public void mostrarPersonajes(){
        
        System.out.println("Team name: " + nombre);
        
        for (int i = 0; i < this.personaje.length; i++) {
            
            System.out.println("Personajes: " + personaje[i]);
        }
        
    }
    
}
