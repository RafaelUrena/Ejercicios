/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Mapa.Item;

/**
 *
 * @author the_d
 */
public abstract class Personaje {
    protected int vida;
    protected String nombre;
    protected int nivel;
    protected Item mochila[];

    public Personaje(){
        this.nombre = "";
        this.vida = 0;
        this.nivel = 0;
        this.mochila = null;
        
    }
    
    public Personaje(int vida, int nivel) {
        this.vida = vida;
        this.nivel = nivel;
        this.mochila = new Item [0];
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return nombre + " Vida: " + vida + " Nivel: " + nivel ;
    }
    
    public void mostrarMochila(){
        
        for (int i = 0; i < this.mochila.length; i++) {
            if(this.mochila != null) System.out.print(this.mochila[i]);
        }
        System.out.println(" ");
    }
    

    public abstract void mostrarEstado();
    
    
    
}
