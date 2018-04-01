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
public class Gato extends Mascota implements interfazanimal{
    
    private int pasotismo;

    public Gato(int pasotismo, String nombre, int peso, String raza, String color) {
        super(nombre, peso, raza, color);
        this.pasotismo = (int) (Math.random()*100)+1;
    }

    public Gato() {
        super();//Esto llama al constructor de mascotas vacio.
        this.pasotismo = (int) (Math.random()*100)+1;
    }

    @Override
    public String toString() {
        return super.toString() + "Gato{" + "pasotismo=" + pasotismo + '}';
    }
    
    @Override
     public boolean hacerCaso(){
        boolean caso = false;
         if(this.pasotismo <= 5){
             caso = true;
         }
        
         return caso;
    }
    
    @Override
    public void hacerRuido(){
        System.out.println("¡¡MIAU!!");
    }
    
    public void escupirBola(){
            System.out.println("El gato escupio una bola de pelo");   
    }

    @Override
    public void dormir() {
        System.out.println("El gato esta duermiendo");
    }

    @Override
    public void comer() {
        System.out.println("El gato esta comiendo");
    }
    
    
    
}
