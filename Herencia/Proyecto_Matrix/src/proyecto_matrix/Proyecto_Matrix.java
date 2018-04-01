/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_matrix;

import Mundo.*;

/**
 *
 * @author rafa
 */
public class Proyecto_Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
       
        Tablero tab = new Tablero();
        int t = 0;
        
        tab.generarTablero();
        
        System.out.println("---------------------------------------------");
        
        do {
            System.out.println(" ");
            tab.mostrarPersonajes();
            System.out.println(" ");
            tab.comprobarMueren();
            
            if(t % 2 == 0){
                tab.smithInfecta();
            }
            
            if(t % 5 == 0){
                if(tab.neoActua()){
                    System.out.println("Neo cree, y ataca a Smith");
                    
                }else{
                    System.out.println("Neo no cree y no ataca");
                }
                tab.neoVuela();
            }
            Thread.sleep(1000);
            t++;
        } while (t < 60);
        
    }
}