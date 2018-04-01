/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

/**
 *
 * @author rafa
 */
public class Perro extends Mascota implements interfazanimal{
    
    private int ganaspasear;

    public Perro() {
        super();
        this.ganaspasear = (int) (Math.random()*100)+1;
    }

    public Perro(int ganaspasear, String nombre, int peso, String raza, String color) {
        super(nombre, peso, raza, color);
        this.ganaspasear = (int) (Math.random()*100)+1;
    }

    @Override
    public String toString() {
        return super.toString() +  "Perro{" + "ganaspasear=" + ganaspasear + '}';
    }
    
    @Override
     public boolean hacerCaso(){
        boolean caso = false;
        int alea = (int)(Math.random()*100)+1;
         if(alea >= 10){
             caso = true;
         }
        
         return caso;
    }
    
    @Override
    public void hacerRuido(){
        System.out.println("¡¡GUAU!!");
    }
    
    public void sacarPasear(){
        if(this.ganaspasear >= 50){
            System.out.println("El perro ha salido a pasear");
        }
        
    }

    @Override
    public void dormir() {
        System.out.println("El perro esta durmiendo");    
    }

    @Override
    public void comer() {
        System.out.println("El perro esta comiendo");
    }
    
    
    
    
    
}
