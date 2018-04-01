/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche_objetos;

import java.util.Scanner;

/**
 *
 * @author the_d
 */
public class Coche_objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Coche car = new Coche("Mustang","1969","Negro","5060-M");
        int vel;
        int ctie;
        int tiempo = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿A que velocidad punta quiere ir?(10-120)");
        vel = sc.nextInt();
        
        System.out.println("¿Cuanto tiempo?(seg)");
        ctie = sc.nextInt();
        
        car.arrancarMotor();
        
        do{
            car.marchaActual();
            System.out.println("La marcha actual es: "+ car.getMarcha());
            System.out.println("La velocidad actual es: "+ car.getVelocidad());
            car.setVelocidad(car.getVelocidad()+10);
            Thread.sleep(1000);
        }while(car.getVelocidad() < vel);
        
        while (tiempo <= ctie) {
                System.out.println("La marcha actual es " + car.getMarcha());
                System.out.println("La velocidad actual es " + car.getVelocidad());
                tiempo++;
                Thread.sleep(1000);
            }
        
        while (car.getVelocidad() > 0) {
                car.marchaActual();
                car.setVelocidad(car.getVelocidad() - 5);
                System.out.println("La marcha actual es " + car.getMarcha());
                System.out.println("La velocidad actual es " + car.getVelocidad());
                Thread.sleep(1000);
            }
        
        car.apagarMotor();
        System.out.println("El coche se ha apagado");
    }
    
}
