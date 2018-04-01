/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package los_juegos_del_hambre;

/**
 *
 * @author the_d
 */
public class Distrito {
    //*************** Atributos *******************//
    private int ndistrito;
    private Jugador j1;
    private Jugador j2;
    
    //****************** Constructores *****************//

    public Distrito() {
        this.ndistrito = ndistrito;
        this.j1 = j1;
        this.j2 = j2;
    }

    public Distrito(int ndistrito, Jugador j1, Jugador j2) {
        this.ndistrito = ndistrito;
        this.j1 = j1;
        this.j2 = j2;
    }

    public int getNdistrito() {
        return ndistrito;
    }

    public void setNdistrito(int ndistrito) {
        this.ndistrito = ndistrito;
    }

    public Jugador getJ1() {
        return j1;
    }

    public void setJ1(Jugador j1) {
        this.j1 = j1;
    }

    public Jugador getJ2() {
        return j2;
    }

    public void setJ2(Jugador j2) {
        this.j2 = j2;
    }

    @Override
    public String toString() {
        return "Distrito " + ndistrito + " Tiene: " + j1 + "," + j2 ;
    }
    
    //************* Otros métodos *********************************************//
    
    public void IniciarDistritos(){
        int aux;
        Jugador j1 = new Jugador(100);
        Jugador j2 = new Jugador(100);
        
        for (int i = 1; i < 5; i++) {
            
            this.ndistrito = i;
            this.j1 = j1;
            this.j2 = j2;
        }
        
        
    }
    
    
}
