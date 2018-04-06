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
public class Escenario {
    private Object escenario[][];

    public Escenario() {
        this.escenario = new Object[4][4];
    }
    
    public void generarEscenario(){
        
        for (int i = 0; i < this.escenario.length; i++) {
            
            for (int j = 0; j < this.escenario[0].length; j++) {
               Item item = new Item();
                this.escenario[i][j] = item;
            }
        }   
    }
    
    public void addEquipo(){
        
        
        
    }
    
    public void mostrarEscenario(){
        
        for (int i = 0; i < this.escenario.length; i++) {
            
            for (int j = 0; j < this.escenario[0].length; j++) {
                System.out.print("|_" + this.escenario[i][j] + "_|");
            }
            System.out.println(" ");
        }   
        
    }
    
}
