/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1_objetos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author the_d
 */
public class Reloj {
    //************* Atributos *****************//
    private String marca;
    private int pila;
    private int horas;
    private int minutos;
    private int segundos;
    private boolean digital;
    
    //*************************** Métodos **************************//
    
            //************* Constructores ****************//
    
    //Constructor por defecto//
    public Reloj(){
        this.pila=10;
    }//Fin constructor por defecto

    public Reloj(String marca, int pila, int horas, int minutos, int segundos, boolean digital) {
        this.marca = "";
        this.pila = 10;
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        this.digital = digital;
    }

    public Reloj(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        this.pila = 10;
    }
    
    
    
    
    
    //************************ Get y Set *******************************//

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPila() {
        return pila;
    }

    public void setPila(int pila) {
        this.pila = pila;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
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

    public boolean isDigital() {
        return digital;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    
//*************************** To String ***************************//

    @Override
    public String toString() {
        String cad_dev="{"+"Marca: "+ marca +", pila: "+ pila +". "+ horas +":"+ minutos + ":" + segundos;
        if(digital) cad_dev = cad_dev + " Tiene formato 24 Horas}";
        else        cad_dev = cad_dev + " Tiene formato 12 Horas}";
        return  cad_dev;
    }
    
    //********************* Otros metodos *************************//
    
    public void tictac(){
        this.segundos++;
        if(this.segundos==60){
            this.minutos++;
            this.segundos=0;
        }
        
        if(this.minutos==60){
            this.horas++;
            this.minutos=0;
        }
        
        if(this.horas==24){
            this.horas=0;
        }
        this.pila--;
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Reloj.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//Fin tictac----------------------
    
    public boolean estaParado(){
        return (this.pila==0);
    }
    
    
}
