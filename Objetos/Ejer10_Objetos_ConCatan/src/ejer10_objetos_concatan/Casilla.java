 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer10_objetos_concatan;

/**
 *
 * @author the_d
 */
public class Casilla {
    //********************** Atributos ***********************//
    
    private String elemento;
    private int num;
    private String owner;
    
    //******************** Constructores ********************//
   
    public Casilla(){
         int n1=(int)(Math.random()*3);
        switch (n1) {
            case 0:
                this.elemento="Trigo";
                break;
            case 1:
                this.elemento="Carbón";
                break;
            case 2:
                this.elemento="Madera";
                break;
        }
        
        this.owner="Vacio";

        int n2=(int)(Math.random()*6+1);
        switch (n2) {
            case 1:
                this.num=n2;
                break;
            case 2:
                this.num=n2;
                break;
            case 3:
                this.num=n2;
                break;
            case 4:
                this.num=n2;
                break;    
            case 5:
                this.num=n2;
                break;   
            case 6:
                this.num=n2;
                break; 
        }
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "[E=" + elemento + ", N=" + num + ", P=" + owner +']';
    }
  
}
