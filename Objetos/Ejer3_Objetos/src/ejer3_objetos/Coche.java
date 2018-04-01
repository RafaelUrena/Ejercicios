/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3_objetos;



/**
 *
 * @author rafa
 */
public class Coche {
    
    private String marca;
    private String color;
    private String modelo;
    private String matricula;
    private int velocidad;
    private int marcha;
    private boolean arrancado;
    
    
/**
 * Constructor
 */
    public Coche() {
        this.arrancado=false;
        this.marca="";
        this.color="";
        this.marcha=0;
        this.modelo="";
        this.velocidad=0;
        this.matricula="";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public boolean isArrancado() {
        return arrancado;
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }
    
    public boolean arrancar(){
        this.arrancado=true;
        return this.arrancado;
    }
    
    public int velocidadCrucero(){

    }
    
    
}
