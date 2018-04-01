/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

import Personajes.Generico;

/**
 *
 * @author rafa
 */

public class Repo {
    private Generico re[];

    public Repo() {
        this.re = new Generico [200];
        this.generarRepo();
        
    }
    
    public void generarRepo(){
        for (int i = 0; i < this.re.length; i++) {
            this.re[i] = new Generico();
            Generico.P_CREADOS++;
        }
    }
    
    public void mostrarRepo(){
        for (int i = 0; i < this.re.length; i++) {
            System.out.println(this.re[i]);
        }
    }
    
    public Generico sacarPersonajes(){
        Generico aux = new Generico();
        int cont = 0;
        boolean hasalido = false;
        
        while(!hasalido && cont < this.re.length){
            if (this.re[cont] != null){
                hasalido = true;
                aux = this.re[cont];
                this.re[cont] = null;
                Generico.P_CREADOS--;
            }
            cont++;
        }
        return aux;
    }
}
