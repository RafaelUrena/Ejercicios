/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer8_objetos_buscaminas;

import java.util.Scanner;

/**
 *
 * @author the_d
 */
public class Ejer8_Objetos_Buscaminas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tablero tab;
        int tam;
        int minas;
        boolean expl = false;
        int destapadas=0;
        int cuantas;
        boolean ganar = false;
        int pos;
        int qhp;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿De que tamaño quieres el tablero?");
        tam = sc.nextInt();
        
        System.out.println("¿Cuantas minas quieres?");
        minas = sc.nextInt();
        
        cuantas = tam - minas;
        
        tab = new Tablero(tam,minas);
        
        tab.iniciarTab();
        
        tab.colocarMinas();
        
        tab.generarPistas();
        
        
        do{
            
            System.out.println("¿Que posición quieres destapar?(0-"+ (tam -1) +")");
            pos = sc.nextInt();
            
            qhp = tab.destapar(pos);
            
            System.out.println("--------------------");
            
            tab.mostrarJug(pos);
            
            switch (qhp) {
                case 0:
                    expl = true;
                    System.out.println("Has pisado la mina, has perdido");
                    //tab.mostrar();
                    break;
                case 1:
                    destapadas++;
                    break;
                default:
                    throw new AssertionError();
            }
            
            if(destapadas == cuantas){
                ganar = true;
            }
            
        }while(!expl && !ganar);
        
        if(ganar){
            System.out.println("----------------------------------------------");
            System.out.println("Has ganado");
            //tab.mostrar();
        }
        
    }
    
}
