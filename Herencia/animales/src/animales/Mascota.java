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
public class Mascota {
    protected String nombre;
    protected int peso;
    protected String raza;
    protected String color;

    public Mascota() {
        this.nombre="";
        this.peso=0;
        this.raza="";
        this.color="";
    }

    public Mascota(String nombre, int peso, String raza, String color) {
        this.nombre = nombre;
        this.peso = peso;
        this.raza = raza;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", peso=" + peso + ", raza=" + raza + ", color=" + color + '}';
    }
    
    public void vacunar(){
        System.out.println("El animal esta vacunado");
    }
    
    public boolean hacerCaso(){
        boolean caso = false;
        return caso;
    }
    
    
    
}
