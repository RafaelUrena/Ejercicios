/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soldados;

/**
 *
 * @author rafa
 */
public class Oficial {

    private String nombre;
    private int edad;
    private String rango;
    private int antigueda;

    public Oficial() {
        this.nombre = generarNombre();
        this.edad = generarEdad();
        this.rango = "";
        this.antigueda = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getAntigueda() {
        return antigueda;
    }

    public void setAntigueda(int antigueda) {
        this.antigueda = antigueda;
    }

    @Override
    public String toString() {
        return "Oficial - " + nombre + " edad " + edad + " rango " + rango + " antigueda " + antigueda ;
    }

    public String generarNombre() {
        String n = "";
        int alea = (int) (Math.random() * 4);

        switch (alea) {
            case 0:
                n = "Máximo Véctor";
                break;
            case 1:
                n = "Guillermus Yodae";
                break;
            case 2:
                n = "Carolus Décimo";
                break;
            case 3:
                n = "Nuria Nuriae";
                break;
            default:
                n = "Rafaelus Optimus";
        }

        return n;
    }

    public int generarEdad() {
        int e = (int)(Math.random()*50)+18;

        
        
        return e;
    }

}
