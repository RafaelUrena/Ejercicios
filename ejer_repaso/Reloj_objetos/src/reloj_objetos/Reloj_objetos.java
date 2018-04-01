/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj_objetos;

import java.util.Scanner;

/**
 *
 * @author the_d
 */
public class Reloj_objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Reloj rlj;
        int h = 0, m = 0, s = 0;
        String modo = "";
        char qR='s';
        int pila;
        boolean correcto = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("**********Reloj************");

        do {
            System.out.println("¿Que modo desea usar?(12h/24h)");
            modo = sc.nextLine();

            if (modo.contains("12h") || modo.contains("24h")) {
                correcto = true;
            } else {
                System.out.println("Tiene que poner un formato, (12h) o (24h)");
            }

        } while (!correcto);

        correcto = false;

        if (modo.equals("12h")) {
            do {
                try {
                    do {
                        System.out.print("Ponga las horas del reloj: ");
                        h = sc.nextInt();
                    } while (h < 1 || h >= 13);

                    do {

                        System.out.print("Ponga los minutos del reloj: ");
                        m = sc.nextInt();

                    } while (m < 0 || m >= 60);

                    do {

                        System.out.print("Ponga los segundos del reloj: ");
                        s = sc.nextInt();

                    } while (s < 0 || s >= 60);

                    correcto = true;
                } catch (Exception exc) {
                    System.out.println("Ha fallado algo..." + exc.getMessage());
                    sc.nextLine();
                }
            } while (!correcto);
        }
        correcto = false;

        if (modo.equals("24h")) {
            do {
                try {
                    do {
                        System.out.print("Ponga las horas del reloj: ");
                        h = sc.nextInt();
                    } while (h < 0 || h >= 24);

                    do {

                        System.out.print("Ponga los minutos del reloj: ");
                        m = sc.nextInt();

                    } while (m < 0 || m >= 60);

                    do {

                        System.out.print("Ponga los segundos del reloj: ");
                        s = sc.nextInt();

                    } while (s < 0 || s >= 60);

                    correcto = true;
                } catch (Exception exc) {
                    System.out.println("Ha fallado algo..." + exc.getMessage());
                    sc.nextLine();
                }
            } while (!correcto);
        }

        rlj = new Reloj(h, m, s, modo);

        do {

            pila = rlj.tictac(modo);

            if (pila <= 10 && qR == 's' || qR=='S' ) {
                System.out.println("¿Desea recargar el reloj?(S/N)");
                qR = sc.next().charAt(0);
                pila = rlj.recargarReloj(qR);
            }
            System.out.println(rlj.toString(modo));

        } while (rlj.getPila() > 0);

    }

}
