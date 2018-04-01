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
public class InfanteriaLigera {

    private int n_hom;
    private int centurion;
    private int decurion;
    private int animo;

    public InfanteriaLigera() {
        this.n_hom = generarHombres();
        this.centurion = this.n_hom / 100;
        this.decurion = this.n_hom / 10;
        this.animo = (int) (Math.random() * 10) + 1;
    }

    public int getN_hom() {
        return n_hom;
    }

    public void setN_hom(int n_hom) {
        this.n_hom = n_hom;
    }

    public int getAnimo() {
        return animo;
    }

    public void setAnimo(int animo) {
        this.animo = animo;
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

    @Override
    public String toString() {
        return "Infanteria_Ligera{" + "n_hom=" + n_hom + ", centurion=" + centurion + ", decurion=" + decurion + ", animo=" + animo + '}';
    }
    
    public int calculateDecurion(){
        return this.n_hom / 10;
    }

    public int generarHombres() {
        return (int) (Math.random() * 200) + 50;
    }

    public void diezmar() {
        System.out.println("Verguenzam me dariam");
    }

}
