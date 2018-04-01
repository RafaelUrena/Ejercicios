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
public class Alumno extends Comun implements Metodos {

    private float nota;

    public Alumno() {
        this.nombre="";
        this.tfno="";
    }

    public Alumno(String nombre, float nota) {
        super(nombre);
        this.nota = nota;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + ", tfno=" + tfno + ", nota=" + nota + '}';
    }
    
    @Override
    public void ejemploOverride(){
        System.out.println("Estoy en la clase alumno.");
    }
    
    //Ejemplo de sobrecarga
    public void ejemploOverride(String hola){
        System.out.println("Estoy en la clase alumno." + hola);
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obligatorio(String cad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean loquesea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
