/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4_objetos;

import java.util.Scanner;

/**
 *
 * @author rafa
 */
public class Ordenador {
    //************ Atributos *******************//
    private String procesador;
    private int ram;
    private String grafica;
    private int disco;
    private boolean lector;
    private int fuente;
    
    //*************** Constructores **********************//

    public Ordenador() {
        this.procesador="";
        this.grafica="";
    }

    public Ordenador(String procesador, int ram, String grafica, int disco, boolean lector, int fuente) {
        this.procesador = procesador;
        this.ram = ram;
        this.grafica = grafica;
        this.disco = disco;
        this.lector = lector;
        this.fuente = fuente;
    }
    
    //***************************** Get y Set *****************************//

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getGrafica() {
        return grafica;
    }

    public void setGrafica(String grafica) {
        this.grafica = grafica;
    }

    public int getDisco() {
        return disco;
    }

    public void setDisco(int disco) {
        this.disco = disco;
    }

    public boolean isLector() {
        return lector;
    }

    public void setLector(boolean lector) {
        this.lector = lector;
    }

    public int getFuente() {
        return fuente;
    }

    public void setFuente(int fuente) {
        this.fuente = fuente;
    }
    
    public void pedirDatos(){
        
       Scanner sc = new Scanner (System.in);
        System.out.println("Procesador: "); procesador = sc.nextLine();
        System.out.println("RAM: "); ram = sc.nextInt();
        System.out.println("Disco: ");  disco = sc.nextInt();
        System.out.println("Grafica: "); grafica = sc.nextLine();
        System.out.println("Fuente: "); fuente = sc.nextInt();
    }

    @Override
    public String toString() {
        String dv = "{Procesador: "+ procesador + ", RAM: "+ ram + ", Disco: "+ disco +", Grafica: "+ grafica +", Fuente: "+ fuente;
        
            if(!lector) dv = dv +" Sin lector }";
            else          dv = dv +" Con lector }";
            
        return dv;
    }
    
    
}
