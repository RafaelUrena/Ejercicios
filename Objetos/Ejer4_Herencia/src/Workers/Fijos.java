/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Workers;

/**
 *
 * @author rafa
 */
public class Fijos extends Trabajadores{
    
    private int sueldo;

    public Fijos(int sueldo, String nombre, String apellido) {
        super(nombre, apellido);
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "Fijos{" + "sueldo=" + sueldo + '}';
    }

    @Override
    public void calcularSalario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
