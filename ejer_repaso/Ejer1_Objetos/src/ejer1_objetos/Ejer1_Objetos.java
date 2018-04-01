/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1_objetos;

import java.util.Scanner;

/**
 *
 * @author the_d
 */
public class Ejer1_Objetos {
    
    
    static void limpiarPantalla(){
        for(int i=0;i<50;i++){
            System.out.println("");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Reloj re1 = new Reloj(12,10,27);
        
        Scanner sc = new Scanner (System.in);
        
        while(!re1.estaParado()){
            System.out.println(re1);
            re1.tictac();
            limpiarPantalla();
        
        }
    }
    
}
