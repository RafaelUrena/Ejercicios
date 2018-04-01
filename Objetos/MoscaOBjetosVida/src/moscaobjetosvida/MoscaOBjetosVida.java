/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moscaobjetosvida;

import java.util.Scanner;

/**
 *
 * @author Miki
 */
public class MoscaOBjetosVida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tablero t = new tablero(3, 3);
        int f, c, result;
        String nombreMosca = "";
        Scanner sc = new Scanner(System.in);
        t.iniciarTablero();
        t.colocarMosca();
        t.mostrarTablero();

        do {
            do {
                System.out.println("Dime fila");
                f = sc.nextInt();
                System.out.println("Dime columna");
                c = sc.nextInt();
            } while (f < 0 && f > t.getMesa().length && c < 0 && c > t.getMesa().length);
            //result = t.comprobarGolpe(f, c);
            switch (t.comprobarGolpe(f, c)) {
                case 0:
                    System.out.println("No la has tocado");
                    break;
                case 1:
                    System.out.println("La golpeaste");
                    if (t.comprobarVidaMosca()) {
                        System.out.println("Aun esta Viva y revolotea");
                    }
                    ;
                    break;
                case 2:
                    System.out.println("UYYYYYYYY casi pero no le has dado y revolotea");

            }
            t.mostrarTablero();
        } while (t.getIntentos() > 0 && t.comprobarVidaMosca());

        if (t.getIntentos() == 0) {
            System.out.println("Has perdido te quedaste sin intentos");
        } else {
            nombreMosca = t.nombreMosca();
            System.out.println("Has ganado !! mataste a " + nombreMosca);
        }

    }

}
