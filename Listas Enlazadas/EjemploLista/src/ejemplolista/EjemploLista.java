/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolista;

/**
 *
 * @author faranzabe
 */
public class EjemploLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista miLista = new Lista();
//        miLista.insertarElemento(18);
//        miLista.insertarElemento(3);
//        miLista.insertarElemento(9);
//        miLista.insertarElemento(67);
//        miLista.insertarUltimo(18);
//        miLista.insertarUltimo(3);
//        miLista.insertarUltimo(9);
//        miLista.insertarUltimo(67);
//        
//        miLista.mostrarLista();
        
        ListaPersonas lp = new ListaPersonas();
        Persona p = new Persona("p1");
        lp.insertarUltimo(p);
        p = new Persona("p2");
        lp.insertarUltimo(p);
        p = new Persona("p3");
        lp.insertarUltimo(p);
        lp.mostrarLista();
    }
    
}
