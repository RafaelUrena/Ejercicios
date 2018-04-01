/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moscaobjetosvida;

/**
 *
 * @author Miki
 */
public class mosca {
    private int vida;
    private String nombre;

    public mosca() {
        this.vida = 30;
        this.nombre = "Gustav";
    }

    public mosca(int vida, String nombre) {
        this.vida = vida;
        this.nombre = nombre;
    }
    
    /**************************
            * Metodos *
    ***************************/
    public boolean estaViva(){
        boolean esta = true;
        if(this.vida==0){
            esta = false;
        }
        return esta;
    }
    
    public void quitarVida(){
        if(this.vida >0){
          this.vida-=10;
        }
        
    }

    public int getVida() {
        return vida;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "mosca{" + "vida=" + vida + ", nombre=" + nombre + '}';
    }
    
    
}
