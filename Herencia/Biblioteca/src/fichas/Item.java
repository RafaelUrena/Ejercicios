/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichas;

/**
 *
 * @author rafa
 */
public class Item {
    protected int numero;
    protected String titulo;

    public Item(int numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }
    
    public Item(){
        this.numero = 0;
        this.titulo = "";
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Ficha{" + "numero=" + numero + ", titulo=" + titulo + '}';
    }
    
}
