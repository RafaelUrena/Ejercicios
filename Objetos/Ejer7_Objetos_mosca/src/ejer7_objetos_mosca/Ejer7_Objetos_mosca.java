/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer7_objetos_mosca;

import java.util.Scanner;

/**
 *
 * @author the_d
 */
public class Ejer7_Objetos_mosca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int posF,posC;
        int qhp;
        Tablero tab = new Tablero(4);
        
        Scanner sc = new Scanner (System.in);
        
        tab.iniciarTab();
        tab.colocarMosca();
        tab.mostrar();
        
        tab.mostrarMosca();
        
        do{
        
            System.out.println("Ponga la posicion del manotazo (Fila): ");
            posF = sc.nextInt();

            System.out.println("Ponga la posicion del manotazo (Columna): ");
            posC = sc.nextInt();

            qhp = tab.darManotazo(posF, posC);
            
            switch (qhp) {
                case 0:
                    System.out.println("Ni has rozado a la mosca");
                    break;
                case 1:
                    System.out.println("Ha salido revoloteando");
                    tab.revolotear();
                    break;
                case 2:
                    System.out.println("Le has dado pero salio volando");
                    tab.revolotear();
                    break;
                case 3:
                    System.out.println("Has matado a la mosca");
                    break;
                default:
                    throw new AssertionError();
            }
            
            tab.mostrar();
            
        }while(qhp!=3);
        
    }
    
}
