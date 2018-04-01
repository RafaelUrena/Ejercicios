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
public class AComision extends Trabajadores {
    
    private int porcentaje;
    private int ventas;

    public AComision(int porcentaje, int ventas, String nombre, String apellido) {
        super(nombre, apellido);
        this.porcentaje = porcentaje;
        this.ventas = ventas;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        return super.toString() + "AComision{" + "porcentaje=" + porcentaje + ", ventas=" + ventas + '}';
    }

    @Override
    public void calcularSalario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
