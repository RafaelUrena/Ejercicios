/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

import Personajes.*;

/**
 *
 * @author rafa
 */
public class Tablero {

    private Object tab[][];
    private Repo reposi;

    public Tablero() {
        this.tab = new Object[5][5];
        this.reposi = new Repo();
    }

    public void mostrarTablero() {

        for (int i = 0; i < this.tab.length; i++) {
            for (int j = 0; j < this.tab[0].length; j++) {
                System.out.println(this.tab[i][j]);
            }
        }
    }

    public void mostrarPersonajes() {

        for (int i = 0; i < this.tab.length; i++) {
            for (int j = 0; j < this.tab[0].length; j++) {
                if (this.tab[i][j] instanceof Generico) {
                    System.out.print("[P]");
                }
                if (this.tab[i][j] instanceof Neo) {
                    System.out.print("[N]");
                }
                if (this.tab[i][j] instanceof Smith) {
                    System.out.print("[S]");
                }
            }
            System.out.println("");
        }
    }

    public void generarTablero() {

        this.colocarNeo();
        this.colocarSmith();

        for (int i = 0; i < this.tab.length; i++) {
            for (int j = 0; j < this.tab[0].length; j++) {
                if (this.tab[i][j] == null) {
                    this.tab[i][j] = reposi.sacarPersonajes();
                }
            }

        }
    }

    public void colocarNeo() {
        int i, j;
        Neo n = new Neo();
        i = (int) (Math.random() * this.tab.length);
        j = (int) (Math.random() * this.tab[0].length);

        this.tab[i][j] = n;
    }

    public void colocarSmith() {
        int i, j;
        Smith s = new Smith();
        boolean colocado = false;

        do {
            i = (int) (Math.random() * this.tab.length);
            j = (int) (Math.random() * this.tab[0].length);

        } while (this.tab[i][j] != null);

        this.tab[i][j] = s;

    }

    public void comprobarMueren() {
        Generico aux = null;

        for (int i = 0; i < this.tab.length; i++) {
            for (int j = 0; j < this.tab[0].length; j++) {
                if (this.tab[i][j] instanceof Generico) {
                    aux = (Generico) this.tab[i][j];
                    if (aux.getpMorir() < 30) {
                        this.tab[i][j] = this.reposi.sacarPersonajes();
                    } else {
                        aux.setpMorir(aux.getpMorir() - 10);
                    }

                }

            }

        }
    }
    
    public void smithInfecta(){
        
        for (int i = 0; i < this.tab.length; i++) {
            for (int j = 0; j < this.tab[0].length; j++) {
                if(this.tab[i][j] instanceof Smith){
                    for (int k = -1; k <= 1; k++) {
                        for (int l = -1; l <= 1; l++) {
                            if(i + k >= 0 && i + k < this.tab.length && j + l >= 0 && j + l < this.tab[0].length){
                                if(this.tab[i + k][j + l] instanceof Generico){
                                   this.tab[i + k][j + l] = new Smith();
                                   Generico.P_CREADOS--;
                                }
                            }
                            
                        }
                        
                    }
                }
            }
            
        }
    }

    
    public boolean neoActua(){
        Neo n = new Neo();
        Generico g = new Generico();
        boolean actua = false;
        
        if(n.eselElegido()){
            actua = true;
            for (int i = 0; i < this.tab.length; i++) {
                for (int j = 0; j < this.tab[0].length; j++) {
                    if(this.tab[i][j] instanceof Neo){
                        for (int k = -1; k <= 1; k++) {
                            for (int l = -1; l <= 1; l++) {
                                if(i + k >=0 && i + k < this.tab.length && j + l >= 0 && j + l < this.tab[0].length){
                                    if(this.tab[i + k][j + l] instanceof Smith){
                                        this.tab[i + k][j + l] = this.reposi.sacarPersonajes();
                                    }
                                }
                                
                            }
                            
                        }
                    }
                    
                }
                
            }
        }
        return actua;
    }
    
    public void neoVuela(){
        Neo n = null;
        Generico g = null;
        int fi = 0,co = 0;
        
        int fila = (int)(Math.random()* this.tab.length);
        int colum = (int)(Math.random()* this.tab[0].length);
        
        for (int i = 0; i < this.tab.length; i++) {
            for (int j = 0; j < this.tab[0].length; j++) {
                if(this.tab[i][j] instanceof Neo){
                    n = (Neo) this.tab[i][j];
                    fi = i;
                    co = j;
                }
                
            }
            
        }
        
        if(this.tab[fila][colum] instanceof Smith){
            this.tab[fila][colum] = n;
            this.tab[fi][co] = reposi.sacarPersonajes();
        }
        if(this.tab[fila][colum] instanceof Generico){
            g = (Generico) this.tab[fila][colum];
            this.tab[fila][colum] = n;
            this.tab[fi][co] = g;
        }
    }
}


