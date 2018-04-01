/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer7_objetos_mosca;

/**
 *
 * @author the_d
 */
public class Mosca {
    
    private String color;
    private int vidas;
    
    
    //Constructor

    public Mosca() {
        this.color = generarColor();
        this.vidas = generarVidas(this.color);
    }

    public Mosca(String color, int vidas) {
        this.color = color;
        this.vidas = vidas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    
    //Otros métodos
    
    private String generarColor(){
        int alea;
        
        alea = (int)(Math.random()*3);
        
        switch (alea) {
            case 0:
                this.color="Negro";
                break;
                
            case 1:
                this.color="Verde";
                break;
                
            case 2:
                this.color="Rojo";
                break;
            default:
                throw new AssertionError();
        }
        
        return this.color;
    }//Fin generarColor---------------------------------
    
    private int generarVidas(String color){
        
        switch (color) {
            case "Negro":
                this.vidas = 2;
                break;
                
            case "Verde":
                this.vidas = 4;
                break;
                
            case "Rojo":
                this.vidas = 6;
                break;
                
            default:
                throw new AssertionError();
        }
        
        
        return this.vidas;
    }

    @Override
    public String toString() {
        return "Mosca{" + "color=" + color + ", vidas=" + vidas + '}';
    }
    
    
    
    
    
}
