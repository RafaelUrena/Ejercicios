/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche_objetos;

/**
 *
 * @author the_d
 */
public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private String matricula;
    private int marcha;
    private int velocidad;
    private boolean motor;
    

    public Coche(String marca, String modelo, String color, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.marcha = 0;
        this.velocidad = 0;
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", matricula=" + matricula + ", marcha=" + marcha + ", velocidad=" + velocidad + ", motor=" + motor + '}';
    }
    
    public void arrancarMotor(){
        
        this.motor = true;
        this.marcha = 0;
        this.velocidad = 0;
        
    }
    
    public void apagarMotor(){
        
        this.motor = false;
        this.marcha = 0;
        this.velocidad = 0;
    }
    
    public void veloPunta(int velo){
        
        if(this.velocidad < velo){
            this.velocidad+=10;
        }
    }
    
    public void subirMarcha(){
        if(this.marcha <=4){
            this.marcha++;
        }
    }
    
     public void bajarMarcha(){
        if(this.marcha > 0){
            this.marcha--;
        }
    }
     
     public void marchaActual() {

        if (this.velocidad >= 0 && this.velocidad <= 30) {
            this.marcha = 1;
        }
        if (this.velocidad > 30 && this.velocidad <= 50) {
            this.marcha = 2;
        }
        if (this.velocidad > 50 && this.velocidad <= 70) {
            this.marcha = 3;
        }
        if (this.velocidad > 70 && this.velocidad <= 100) {
            this.marcha = 4;
        }
        if (this.velocidad > 100) {
            this.marcha = 5;
        }
    }
    
}
