/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_inicial;

import java.util.Scanner;

/**
 *
 * @author Rafalaptop
 */
public class Ejemplo_Inicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float base;
        float altura;
        float superficie;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Pon la base");
        base = entrada.nextFloat();
        System.out.println("Pon la altura");
        altura= entrada.nextFloat();
        
        superficie = base*altura;
        
        System.out.println(superficie);
                
    }
    
}
