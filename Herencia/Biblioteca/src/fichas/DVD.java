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
public class DVD extends Item{
    private String director;
    private int anio;
    private String tipo;

    public DVD(String director, int anio, String tipo) {
        super();
        this.director = director;
        this.anio = anio;
        this.tipo = tipo;
    }

    public DVD(String director, int anio, String tipo, int numero, String titulo) {
        super(numero, titulo);
        this.director = director;
        this.anio = anio;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "DVD{" + "director=" + director + ", anio=" + anio + ", tipo=" + tipo + '}';
    }
    
    public void rellenarDVD(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ponga el numero del DVD: ");
        this.numero = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Ponga el titulo del DVD: ");
        this.titulo = sc.nextLine();
        
        System.out.print("Ponga el director del DVD: ");
        this.director = sc.nextLine();
        
        System.out.print("Ponga el año del DVD: ");
        this.anio = sc.nextInt();
        
        System.out.print("Ponga el tipo del DVD: ");
        this.tipo = sc.nextLine();
    }
    
    
}
