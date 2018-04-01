/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerfaces;

/**
 *
 * @author faranzabe
 */
public class Profesor extends Comun {
    
    private String cargo;

    public Profesor() {
        this.nombre="";
        this.tfno="";
        this.cargo="";
    }

    public Profesor(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", edad=" + edad + ", tfno=" + tfno + ", cargo=" + cargo + '}';
    }
    
   
    @Override
    public void ejemploOverride(){
        super.ejemploOverride();
        System.out.println("Soy la clase profesor.");
    }

 
    
}
