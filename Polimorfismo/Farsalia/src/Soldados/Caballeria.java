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
public class Caballeria {
    private int n_hom;
    private int centurion;
    private int decurion;
    private int caballosDisponibles;

    public Caballeria() {
        this.n_hom = generarHombres();
        this.centurion = this.n_hom / 100;
        this.decurion = this.n_hom / 10;
        this.caballosDisponibles = this.n_hom;
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

    public int getCaballosDisponibles() {
        return caballosDisponibles;
    }

    public void setCaballosDisponibles(int caballosDisponibles) {
        this.caballosDisponibles = caballosDisponibles;
    }

    @Override
    public String toString() {
        return "Caballeria{" + "n_hom=" + n_hom + ", centurion=" + centurion + ", decurion=" + decurion + ", caballosDisponibles=" + caballosDisponibles + '}';
    }
    
    public int generarHombres() {
        return (int) (Math.random() * 200) + 50;
    }
}
