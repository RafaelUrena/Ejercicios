/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soldados;

/**
 *
 * @author rafa
 */
public class InfanteriaPesada {
    private int n_hom;
    private int centurion;
    private int decurion;
    private int edadmax;

    public InfanteriaPesada() {
        this.n_hom = generarHombres();
        this.centurion = this.n_hom / 100;
        this.decurion = this.n_hom / 10;
        this.edadmax = 30;
    }

    public int getN_hom() {
        return n_hom;
    }

    public void setN_hom(int n_hom) {
        this.n_hom = n_hom;
    }

    public int getCenturion() {
        return centurion;
    }

    public void setCenturion(int centurion) {
        this.centurion = centurion;
    }

    public int getDecurion() {
        return decurion;
    }

    public void setDecurion(int decurion) {
        this.decurion = decurion;
    }
    
    public int generarHombres() {
        return (int) (Math.random() * 200) + 50;
    }
    
    public int calcularMedia(int edadTotal){
        return edadTotal / this.n_hom;
    }
    
    public int diezmar() {
        int muertos = this.n_hom / 10;
        int total = this.n_hom - muertos;
        
        setN_hom(total);

        setDecurion(total / 10);
        setCenturion(total / 100);

        return muertos;
    }
}
