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
public class Item {
    private String tipo;
    private int nivel;
    private int cantidad;

    public Item() {
        this.tipo = generarTipo();
        this.nivel = (int)(Math.random()*3)+1;
        this.cantidad = (int)(Math.random()*5)+5;
    }

    public Item(String tipo, int nivel, int cantidad) {
        this.tipo = tipo;
        this.nivel = nivel;
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Objeto: " + tipo + " nivel: " + nivel + " cantidad: " + cantidad;
    }
    
    public String generarTipo(){
        
        switch ((int)(Math.random())*4) {
            case 0:
                this.tipo = "Comida";
                break;
            case 1:
                this.tipo = "Hechizos";
                break;
            case 2:
                this.tipo = "Materiales"; 
                break;
            case 3:
                this.tipo = "Pociones";
                break;
        }
        
        return this.tipo;
    }
    
}
