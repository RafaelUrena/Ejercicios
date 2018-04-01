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
public class Neo extends Personajes{
    
  private boolean esElegido;

    public Neo() {
        super("Neo");
        this.esElegido = eselElegido();
    }

    @Override
    public void generar() {
    }

    @Override
    public void mostrar() {
    }

    @Override
    public void pedir() {
    }
  
    public boolean eselElegido(){
        int alea = (int)(Math.random()*2);
        
        if(alea == 0){
            this.esElegido = true;
        }
        if(alea == 1){
            this.esElegido = false;
        }
        return this.esElegido;
    }
  
}
