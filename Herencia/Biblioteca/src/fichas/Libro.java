/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichas;

import java.util.Scanner;

/**
 *
 * @author rafa
 */
public class Libro extends Item{
    private String autor;
    private String editorial;

    public Libro(String autor, String editorial) {
        super();
        this.autor = autor;
        this.editorial = editorial;
    }

    public Libro(String autor, String editorial, int numero, String titulo) {
        super(numero, titulo);
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return super.toString() + "Libro{" + "autor=" + autor + ", editorial=" + editorial + '}';
    }
    
    public void rellenarLibro(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ponga el numero del Libro: ");
        this.numero = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Ponga el titulo del Libro: ");
        this.titulo = sc.nextLine();
        
        System.out.print("Ponga el autor del Libro: ");
        this.autor = sc.nextLine();
        
        System.out.print("Ponga la editorial del Libro: ");
        this.editorial = sc.nextLine();
    }
    
}
