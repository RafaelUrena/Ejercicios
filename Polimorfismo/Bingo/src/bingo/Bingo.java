/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import java.util.Scanner;

/**
 *
 * @author rafa
 */
public class Bingo {

    static void inicializarBombo(int bom[]) {
        int n = 1;

        for (int i = 0; i < bom.length; i++) {
            bom[i] = n;
            n++;
        }
    }

    static void mostrarBombo(int b[]) {

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    static void sacarBolas(int b[], int b2[]) {
        int i = 0;
        int alea;

        while (i < b.length) {

            alea = (int) (Math.random() * 20);


                if (b2[alea] == 0) {
                    b2[alea] = b[i];
                    i++;
                }

        }

    }
    
    static void rellenarCartonJugador(int cj[]){
        int i=0;
        
        Scanner sc = new Scanner(System.in);
        
        while(i < cj.length){
            
            System.out.println("-->");
            cj[i] = sc.nextInt();
            i++;
            
        }
        
        
        
    }
    

    public static void main(String[] args) {
        int bombo[] = new int[20];
        int bombo2[] = new int[20];
        int cartonJugador[] = new int [5];
        int cartonMaquina[] = new int [5];
        
        
        inicializarBombo(bombo);

        mostrarBombo(bombo);

        sacarBolas(bombo, bombo2);

        System.out.println("----------------------");
        
        System.out.println("Eliga 5 números para su carton del 1-20 sin repetir");
        
        rellenarCartonJugador(cartonJugador);

        mostrarBombo(bombo2);
    }

}
