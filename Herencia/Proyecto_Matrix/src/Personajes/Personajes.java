/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

/**
 *
 * @author the_d
 */
public abstract class Personajes {

    protected String nombre;
    protected int latitud;
    protected int longitud;
    protected String ciudad;
    protected int edad;
    public static int P_CREADOS = 0;

    public Personajes() {
        this.nombre = generarNombre();
        this.latitud = 0;
        this.longitud = 0;
        this.ciudad = generarCiudad();
        this.edad = (int)(Math.random()*80)+1;
    }
    
    public Personajes(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getP_CREADOS() {
        return P_CREADOS;
    }

    public static void setP_CREADOS(int P_CREADOS) {
        Personajes.P_CREADOS = P_CREADOS;
    }
    
    @Override
    public String toString() {
        return "Personajes{" + "nombre=" + nombre + ", latitud=" + latitud + ", longitud=" + longitud + ", ciudad=" + ciudad + ", edad=" + edad + '}';
    }

    private String generarNombre() {
        int alea = (int) (Math.random() * 7);

        switch (alea) {
            case 0:
                this.nombre = "Pepe";
                break;
            case 1:
                this.nombre = "Juan";
                break;
            case 2:
                this.nombre = "Ana";
                break;
            case 3:
                this.nombre = "Sonia";
                break;
            case 4:
                this.nombre = "Pedro";
                break;
            case 5:
                this.nombre = "Chiquito";
                break;
            case 6:
                this.nombre = "Elena";
            default:
                this.nombre = "George";
        }
        return this.nombre;
    }

    private String generarCiudad() {
        int alea = (int) (Math.random() * 6);

        switch (alea) {
            case 0:
                this.ciudad = "New York";
                break;
            case 1:
                this.ciudad = "Pekín";
                break;
            case 2:
                this.ciudad = "Roma";
                break;
            case 3:
                this.ciudad = "Paris";
                break;
            case 4:
                this.ciudad = "Londres";
                break;
            case 5:
                this.ciudad = "Caracuel";
                break;
            default:
                this.ciudad = "Puertollano";
        }
        return this.ciudad;
    }
    
    public abstract void generar();
    
    public abstract void mostrar();
    
    public abstract void pedir();

}
