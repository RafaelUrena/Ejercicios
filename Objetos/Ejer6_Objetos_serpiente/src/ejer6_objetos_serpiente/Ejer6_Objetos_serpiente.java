/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer6_objetos_serpiente;

/**
 *
 * @author the_d
 */
public class Ejer6_Objetos_serpiente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Serpiente s = new Serpiente();
        int alea,alea2;

        while (!s.estaMuerta()) {
            
            alea = (int)(Math.random()*10);
            alea2 = (int)(Math.random()*10);
            
            s.mostrar();
            
            if(alea <= 7 && s.getEdad() <= 10){
                s.crecerSerpiente();
                if(alea2<=1){
                    s.mudarSerpiente();
                    System.out.println("La serpiente ha mudado");
                }
            }
            
            if(alea <= 8 && s.getEdad() > 10){
                s.decrecerSerpiente();
                if(alea2==0){
                    s.mudarSerpiente();
                    System.out.println("La serpiente ha mudado");
                }
            }
            
            alea = (int)(Math.random()*100);
            
            if (alea <= 10) {
                s.matarSerpiente();
                System.out.println("Una mangosta a matado a la serpiente");
            }
            
        }
    }

}
