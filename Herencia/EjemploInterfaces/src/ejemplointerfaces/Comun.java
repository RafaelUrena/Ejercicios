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
public class Comun {
    protected String nombre;
    protected int edad;
    protected String tfno;
    protected String direccion;

    public Comun() {
        this.nombre="";
        this.tfno="";
    }

    public Comun(String nombre) {
        this.nombre = nombre;
        this.tfno="";
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public String getTfno() {
        return tfno;
    }

    public void setTfno(String tfno) {
        this.tfno = tfno;
    }

    @Override
    public String toString() {
        return "Comun{" + "nombre=" + nombre + ", edad=" + edad + ", tfno=" + tfno + '}';
    }
    
    public void ejemploOverride(){
        System.out.println("Estoy en la clase común.");
    }

    /*
    Este bloque de métodos lo puede tener la clase base pero no se le obliga
    de ninguna manera. Serán sobreescritos por las hijas que no serán obligadas.
    */
   
    
   
}
