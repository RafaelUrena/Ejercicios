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
public class Perro {
    //************* Atributos *****************//
    private String nombre;
    private int edad;
    private String raza;
    private boolean vacunado;
    
    //*************************** Métodos **************************//
    
            //************* Constructores ****************//
    
    //Constructor por defecto//
    public Perro(){
        nombre = "";
        raza = "";
    }//Fin constructor por defecto
    
    //constructor para nombre(Parametrizado)
    public Perro(String no){
        nombre = no;
        raza = "";
    }//Fin constructor
    
    /**
     * Para referenciar a un atributo de la misma clase
     * tendremos que poner this."nombre_atributo", para saber
     * que nos referimos a el.
     */
    
    //-----------------------------get & set---------------------//
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int e){
        edad = e;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    @Override
    public String toString() {
        String cad_dev="{" + "nombre=" + nombre + ", edad=" + edad + ", raza=" + raza;
        if(!vacunado) cad_dev = cad_dev +" Sin vacunar }";
        else          cad_dev = cad_dev +" Vacunado }";
        return cad_dev;
    }
    
    public void pedirDatos(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nombre: "); nombre = sc.nextLine();
        System.out.println("Raza: "); raza = sc.nextLine();
        System.out.println("Edad: "); edad = sc.nextInt();
    }
    
    public boolean equals(Perro paux){
        boolean devol;
        
        return (this.nombre == nombre);
        
    }
    
}
