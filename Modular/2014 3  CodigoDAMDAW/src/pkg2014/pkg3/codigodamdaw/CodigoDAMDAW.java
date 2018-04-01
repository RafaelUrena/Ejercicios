/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2014.pkg3.codigodamdaw;

import java.util.Scanner;

/**
 *
 * @author nuria
 */
public class CodigoDAMDAW {

    static int concatenar(int n1, int n2) {
        int sol, digis;

        digis = cuentacifras(n2);
        sol = (int) (n1 * Math.pow(10, digis)) + n2;
        return sol;
    }
    //FIN funcion**************************************************************

    static int cuentacifras(int n) {
        int sol = 0;

        while (n > 0) {
            sol++;
            n = n / 10;
        }
        return sol;
    }
    //FIN funcion**************************************************************

    /*
    *********************PROGRAMA PRINCIPAL************************************
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2, coordenada1, coordenada2, coordenada3, caso, d1, d2, d3, aux;

        System.out.println("Si quieres codificar escribe 1, si quiere decodificar escribe 2");
        caso = teclado.nextInt();
        switch (caso) {
            case 1:
                System.out.println("Dime una coordenada");
                coordenada1 = teclado.nextInt();
                System.out.println("Dime una coordenada");
                coordenada2 = teclado.nextInt();
                System.out.println("Dime una coordenada");
                coordenada3 = teclado.nextInt();

                d1 = cuentacifras(coordenada1);
                d2 = cuentacifras(coordenada2);
                d3 = cuentacifras(coordenada3);

                aux = concatenar(d2, d3);
                numero2 = concatenar(d1, aux);
                aux = concatenar(coordenada2, coordenada3);
                numero1 = concatenar(coordenada1, aux);

                System.out.println("Numero1 es " + numero1 + " numero2 es " + numero2);
                break;

            case 2:
                System.out.println("Dime numero 1");
                numero1 = teclado.nextInt();
                System.out.println("Dime numero 2");
                numero2 = teclado.nextInt();

                d3 = numero2 % 10;
                numero2 = numero2 / 10;
                d2 = numero2 % 10;
                numero2 = numero2 / 10;
                d1 = numero2;

                coordenada1 = numero1 / (int) Math.pow(10, (d2 + d3));
                numero1 = numero1 - (coordenada1 * (int) Math.pow(10, (d2 + d3)));
                coordenada2 = (int) (numero1 / Math.pow(10, (d3)));
                numero1 = numero1 - (coordenada2 * (int) Math.pow(10,d3));
                coordenada3 = numero1;
                System.out.println("Coordenada1 es " + coordenada1 + ", coordenada2 es " + coordenada2 + ", coordenada3 es " + coordenada3);
        }
    }

}
