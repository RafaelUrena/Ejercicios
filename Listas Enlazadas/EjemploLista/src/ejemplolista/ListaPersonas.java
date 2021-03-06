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
public class ListaPersonas {

    //****************** Clase interna auxiliar ***************
    private class Nodo {

        private Persona dato;
        private Nodo sig;

        public Nodo(Persona d) {
            this.dato = d;
            this.sig = null;
        }
    }

    //******************* Atributos de la clase Lista *******************
    private Nodo l;
    
    //****************** Métodos de la clase lista **********************
    public ListaPersonas(){
        this.listaVacia();
    }
    
    public void listaVacia(){
        this.l = null;
    }
    
    public boolean estaVacia(){
        return (l==null);
    }
    
    public void insertarElemento(Persona e){
        Nodo nuevo = new Nodo(e);
        
        if (l==null){
            l = nuevo;
        }
        else {
            nuevo.sig = l;
            l = nuevo;
        }
    }
    
    public void insertarUltimo(Persona e){
        Nodo nuevo = new Nodo(e);
        Nodo aux;
       
        if(this.estaVacia()){
            this.l = nuevo;
        }
        else {
            aux=l;
            while(aux.sig!=null){
                aux = aux.sig;
            }
            aux.sig = nuevo;
        }
        
    }
    
    public void mostrarLista(){
        Nodo aux;
        aux = l;
        System.out.print("l --> ");
        while(aux!=null){
            System.out.print(aux.dato + " --> ");
            aux = aux.sig;
        }
        System.out.println(" null ");
        
    }
    
}
