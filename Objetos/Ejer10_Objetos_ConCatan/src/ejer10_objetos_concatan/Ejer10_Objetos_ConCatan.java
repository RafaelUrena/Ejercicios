/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer10_objetos_concatan;

import java.util.Scanner;

/**
 *
 * @author the_d
 */
public class Ejer10_Objetos_ConCatan {

    static public int dado(){
        int dado;
        
        dado = (int)(Math.random()*6)+1;
        
        return dado;
    }
    
    public static void main(String[] args) {
        Tablero tab = new Tablero();
        int pos_f, pos_c;
        int alea_f, alea_c;
        int casillas_ele = 0;
        int elegida;
        boolean ganar = false;
        boolean ganarM = false;
        int qhg;
        int d;
        Jugador ordenador = new Jugador();
        Jugador jugador = new Jugador();

        Scanner sc = new Scanner(System.in);

        tab.iniciarTablero();

        tab.mostrarTablero();

        do {
            do {

                System.out.println("¿Que casilla quieres (Fila)? Ej:0,1,2 ");
                pos_f = sc.nextInt();
                System.out.println("¿Que casilla quieres (Columna)? Ej:0,1,2,3 ");
                pos_c = sc.nextInt();

                elegida = tab.elegirPos(pos_f, pos_c);

                switch (elegida) {
                    case 0:
                        System.out.println("Has elegido la casilla " + pos_f + " / " + pos_c);
                        casillas_ele++;
                        break;
                    case 1:
                        System.out.println("Esta casilla ya esta elegida");
                        break;
                    case 2:
                        System.out.println("La posición no esta en el tablero");
                        break;
                    default:
                        throw new AssertionError();
                }
            } while (elegida != 0);

            do {
                alea_f = (int) (Math.random() * tab.getLength());
                alea_c = (int) (Math.random() * tab.getLengthdos());
                
                elegida = tab.elegirPosM(alea_f, alea_c);

                switch (elegida) {
                    case 0:
                        System.out.println("La máquina ha elegido la casilla " + alea_f + " / " + alea_c);
                        casillas_ele++;
                        break;
                    case 1:
                        System.out.println("Esta casilla ya esta elegida");
                        break;
                    case 2:
                        System.out.println("La posición no esta en el tablero");
                        break;
                    default:
                        throw new AssertionError();
                }

            } while (elegida != 0);

            tab.mostrarTablero();

        } while (casillas_ele <=11);
        
        do{
            
            d = dado();
            System.out.println("El dado es: "+d);
            
            qhg = tab.ha_ganado(d, jugador, ordenador);
            
            System.out.println("El Jugador lleva: "+jugador.getAlm_c()+" de carbón ,"+jugador.getAlm_m()+" de madera,"+jugador.getAlm_t()+" de trigo.");
            
            System.out.println("El Ordenador lleva: "+ordenador.getAlm_c()+" de carbón ,"+ordenador.getAlm_m()+" de madera,"+ordenador.getAlm_t()+" de trigo.");
            
            switch (qhg) {
                case 0:
                    System.out.println("No ha ganado nadie");
                    break;
                case 1:
                    System.out.println("Gana el Jugador");
                    ganar=true;
                    break;
                case 2:
                    System.out.println("Gana la Máquina");
                    ganarM = true;
                    break;
                default:
                    throw new AssertionError();
            }
            
        }while(!ganar && !ganarM);

    }

}
