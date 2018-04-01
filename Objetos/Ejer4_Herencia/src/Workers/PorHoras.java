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
public class PorHoras extends Trabajadores implements interfaz_tiempo{
    
    private int sueldohora;

    public PorHoras(int sueldohora, String nombre, String apellido) {
        super(nombre, apellido);
        this.sueldohora = sueldohora;
    }

    public int getSueldohora() {
        return sueldohora;
    }

    public void setSueldohora(int sueldohora) {
        this.sueldohora = sueldohora;
    }

    @Override
    public String toString() {
        return super.toString() + "PorHoras{" + "sueldohora=" + sueldohora + '}';
    }

    @Override
    public void calcularSalario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
