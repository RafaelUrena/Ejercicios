/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escenario;

/**
 *
 * @author rafa
 */
public class Legion {
    private String nombre;
    private int numero;
    private String jefe;
    private String tribunos[];
    private Object tropa[];
    private int centurion;
    private int decurion;
    

    public Legion(String c,int n) {
        this.nombre = c + n;
        this.numero = n;
        this.jefe = "Legado";
        this.tribunos =  new String [2];
        this.tropa = new Object[(int)(Math.random()*3)+1];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    @Override
    public String toString() {
        return "Legion{" + "nombre=" + nombre + ", numero=" + numero + ", jefe=" + jefe + '}';
    }
    
    
    
    
}
