/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejem_inicial;

import java.util.Scanner;

/**
 *
 * @author rafa
 */
public class Ejem_inicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro p = new Perro("Lasie");
        Perro p2 = new Perro();
        Perro p3 = new Perro();
        
        Scanner sc = new Scanner (System.in);
        
        //Comprobamos los constructores
        System.out.println("Nombre "+p.getNombre());
        System.out.println("Edad  "+p.getEdad());
        System.out.println("Raza "+p.getRaza());
        if(p.isVacunado()) System.out.println("Esta vacunado");
        else                System.out.println("No esta vacunado");
        
        //Comprobamos los gets y sets
        p.setEdad(23);
        p.setNombre("Pipo");
        p.setRaza("Pitbull");
        p.setVacunado(true);
        System.out.println("Nombre "+p.getNombre());
        System.out.println("Edad  "+p.getEdad());
        System.out.println("Raza "+p.getRaza());
        if(p.isVacunado()) System.out.println("Esta vacunado");
        else                System.out.println("No esta vacunado");
        
        p2.setEdad(105);
        p2.setNombre("Timmy");
        p2.setRaza("Chiguagua");
        p2.setVacunado(false);
        System.out.println("Nombre 2 "+p2.getNombre());
        System.out.println("Edad 2 "+p2.getEdad());
        System.out.println("Raza 2 "+p2.getRaza());
        if(p2.isVacunado()) System.out.println("Esta vacunado");
        else                System.out.println("No esta vacunado");
        
        System.out.println(p.toString());
        
        p3.pedirDatos();
        
        System.out.println(p3.toString());
    }
    
}
