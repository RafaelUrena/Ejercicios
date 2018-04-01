/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj_objetos;

import static java.lang.Thread.sleep;

/**
 *
 * @author the_d
 */
public class Reloj {

    //************** atributos *****************//
    private int hora;
    private int minutos;
    private int segundos;
    private String modo;
    private int pila;
    
    
//************************* Constructores ************************//
    public Reloj(int hora, int minutos, int segundos, String modo) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
        this.modo = modo;
        this.pila = 100;
    }
//********************** Getters and Setters ***************************//
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public int getPila() {
        return pila;
    }

    public void setPila(int pila) {
        this.pila = pila;
    }

    //******************** To String ****************************//
    @Override
    public String toString() {
        return "Reloj{" + "hora=" + hora + ", minutos=" + minutos + ", segundos=" + segundos + '}';
    }

    public String toString(String modo) {
        return hora + " : " + minutos + " : " + segundos;
    }

    
    //*********************** Otros métodos ***********************//
    public int recargarReloj(char q_Rec) {

        
        if (q_Rec == 's' || q_Rec == 'S') {
                this.pila = 100;
        }
        else{
            System.out.println("La bateria se va agotar...");
        }
        return this.pila;
    }

    public void tictac() throws InterruptedException {

        if (this.segundos >= 60) {
            this.segundos = 0;
            this.minutos++;
        }
        if (this.minutos >= 60) {
            this.minutos = 0;
            this.hora++;
        }

        if (this.hora >= 24) {
            this.hora = 0;
        }

        this.segundos++;
        this.pila--;
        Thread.sleep(1000);

    }

    public int tictac(String modo) throws InterruptedException {

        if (this.segundos >= 60) {
            this.segundos = 0;
            this.minutos++;
        }
        if (this.minutos >= 60) {
            this.minutos = 0;
            this.hora++;
        }

        if (modo.equals("12h")) {
            if (this.hora >= 13) {
                this.hora = 0;
            }
        }
        if (modo.equals("24h")) {
            if (this.hora >= 24) {
                this.hora = 0;
            }
        }

        this.segundos++;
        this.pila--;
        Thread.sleep(1000);

        return this.pila;
    }

}
