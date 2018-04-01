/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import fichas.*;
import java.util.Scanner;

/**
 *
 * @author rafa
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca(20);
        int usu;
        int usu2 = 0;
        int cod;
        Object a;
        boolean salir = false;
        boolean add = false;
        boolean del = false;
        Libro l = new Libro("", "");
        DVD d = new DVD("", 0, "");
        Revista r = new Revista(0, 0);

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("¿Que desea hacer?");
            System.out.println("---------------------------------------");
            System.out.println("1.- Añadir Item");
            System.out.println("2.- Buscar Item");
            System.out.println("3.- Eliminar Item");
            System.out.println("4.- Listado de la biblioteca");
            System.out.println("5.- Salir");
            System.out.println("---------------------------------------");

            usu = sc.nextInt();

            switch (usu) {
                case 1:
                    System.out.println("¿Que Item desea añadir?");
                    System.out.println("1.- Libro");
                    System.out.println("2.- DVD");
                    System.out.println("3.- Revista");
                    usu2 = sc.nextInt();
                    break;
                case 2:
                    System.out.println("Introduzca el código de búsqueda: ");
                    cod = sc.nextInt();
                    a = biblio.buscarItem(cod);
                    if (a != null) {
                        System.out.println(a);
                    } else {
                        System.out.println("El item no se ha encontrado");
                    }
                    break;
                case 3:
                    System.out.println("Introduzca el código de búsqueda: ");
                    cod = sc.nextInt();
                    del = biblio.eliminarItem(cod);
                    if (del) {
                        System.out.println("El objeto se ha borrado");
                    } else {
                        System.out.println("No se ha encontrado el item");
                    }
                    break;
                case 4:
                    biblio.mostrarListado();
                    break;
                case 5:
                    salir = true;
                    break;
            }
            if (usu != 0) {
                switch (usu2) {
                    case 1:
                        add = biblio.addLibro();
                        if (add) {
                            System.out.println("El Item a sido añadido");
                        } else {
                            System.out.println("No se pudo añadir el Item");
                        }
                        usu2 = 0;
                        break;
                    case 2:
                        add = biblio.addDvd();
                        if (add) {
                            System.out.println("El Item a sido añadido");
                        } else {
                            System.out.println("No se pudo añadir el Item");
                        }
                        usu2 = 0;
                        break;
                    case 3:
                        add = biblio.addRevista();
                        if (add) {
                            System.out.println("El Item a sido añadido");
                        } else {
                            System.out.println("No se pudo añadir el Item");
                        }
                        usu2 = 0;
                        break;
                }
            }
        } while (!salir);

        if (salir) {
            System.out.println("Adios");
        }
    }

}
