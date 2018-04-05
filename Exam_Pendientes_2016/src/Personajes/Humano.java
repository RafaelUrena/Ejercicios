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
public class Humano extends Personaje{
    private int escudo;
    private boolean tieneCaballo;

    public Humano() {
        super(60,1);
        this.nombre = nombreHumano();
        this.escudo = 100;
        this.tieneCaballo = loTiene();
    }

    public Humano(int escudo, boolean tieneCaballo) {
        this.escudo = escudo;
        this.tieneCaballo = tieneCaballo;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public boolean isTieneCaballo() {
        return tieneCaballo;
    }

    public void setTieneCaballo(boolean tieneCaballo) {
        this.tieneCaballo = tieneCaballo;
    }

    @Override
    public String toString() {
        return nombre + " Vida: " + vida + " Escudo: " + escudo + " Caballo: " + tieneCaballo + '}';
    }
    
    public String nombreHumano(){
        
        switch ((int)(Math.random()*2)) {
            case 0:
                this.nombre = "Rafaelord Angelus";
                break;
            case 1:
                this.nombre = "Guillermus Gallegus";
                break;
        }
        
        return this.nombre;
    }
    
    public boolean loTiene(){
        boolean respuesta = false;
        
        switch ((int)(Math.random()*2)) {
            case 0:
                respuesta = false;
                break;
            case 1:
                respuesta = true;
                break;
        }
        
        return respuesta;
    }
    
    
    
    @Override
    public void mostrarEstado() {
        String respuesta;
        
        if(isTieneCaballo()) respuesta = "Si";
        else respuesta = "No";
        
        System.out.println("Nombre: " + getNombre());
        System.out.println("Vida: " + getVida());
        System.out.println("Escudo: " + getEscudo());
        System.out.println("Caballo: " + respuesta);
        System.out.println("Objetos: ");
       
        mostrarMochila();
    }
    
}
