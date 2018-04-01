/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2_modular;

import java.util.Scanner;

/**
 *
 * @author Bill Gate
 */
public class Ejer2_Modular {

    static float area(float r){
        float sol;
        
        sol = (float) (Math.PI*Math.pow(r, 2));
        
        return sol;
    }//Fin función area
    
    static float perimetro(float r){
        float sol;
        
        sol = (float) (2*Math.PI*r);
        
        return sol;
    }//Fin función perimetro
    
    public static void main(String[] args) {
        float radio;
        float peri,area;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Ponga el radio del circulo: ");
        radio = sc.nextFloat();
        
        peri = perimetro(radio);
        area = area(radio);
        
        System.out.println("El perimetro de la circunferencia es: "+peri);
        System.out.println("El área de la circunferencia es: "+area);
        
        
    }//Fin main
    
}
