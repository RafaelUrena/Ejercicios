/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author Rafalaptop
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int num2;
        float real;
        int entera;
        int modulo;
        
        n = 7;
        num2 = 2;
        entera = n /num2;//Si los 2 número que está operando son enteros, y la división resultante se guarda como número entero
        
        real = (float) n / num2;//Para transformar la división a real, tenemos que hacerle Cast "(float)".
        
        modulo = n % num2;//Para realizar la división modular, es decir el resto.
                
        System.out.println("Resultado: "+real);
        System.out.println("Resultado: "+entera);
        System.out.println("Resultado: "+modulo);
        
    }
    
}
