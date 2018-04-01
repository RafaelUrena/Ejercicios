/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichas;

import java.util.Scanner;

/**
 *
 * @author rafa
 */
public class Revista extends Item{
    private int n_revista;
    private int ano_publica;

    public Revista(int n_revista, int ano_publica) {
        super();
        this.n_revista = n_revista;
        this.ano_publica = ano_publica;
    }

    public Revista(int n_revista, int ano_publica, int numero, String titulo) {
        super(numero, titulo);
        this.n_revista = n_revista;
        this.ano_publica = ano_publica;
    }

    @Override
    public String toString() {
        return super.toString() + "Revista{" + "n_revista=" + n_revista + ", ano_publica=" + ano_publica + '}';
    }
    
    
    public void rellenarRevista(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ponga el numero de la Revista: ");
        this.numero = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Ponga el titulo de la Revista: ");
        this.titulo = sc.nextLine();
        
        System.out.print("Ponga el numero del fanzine: ");
        this.n_revista = sc.nextInt();
        
        System.out.print("Ponga el año de la publicación: ");
        this.ano_publica = sc.nextInt();
    }
    
}
