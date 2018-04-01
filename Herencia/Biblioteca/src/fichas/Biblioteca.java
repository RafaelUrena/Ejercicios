/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichas;

/**
 *
 * @author the_d
 */
public class Biblioteca {

    private Object alm[];

    public Biblioteca(int n) {
        this.alm = new Object[n];
    }

    @Override
    public String toString() {
        return "Biblioteca tiene " + alm.length + " Items ";
    }

    public boolean addLibro() {
        int cont = 0;
        boolean add = false;
        Libro l = new Libro("", "");

        while (!add && cont < this.alm.length) {
            if (this.alm[cont] == null) {
                l.rellenarLibro();
                this.alm[cont] = l;
                add = true;
            }
            cont++;
        }
        return add;
    }

    public boolean addDvd() {
        int cont = 0;
        boolean add = false;
        DVD d = new DVD("", 0, "");

        while (!add && cont < this.alm.length) {
            if (this.alm[cont] == null) {
                d.rellenarDVD();
                this.alm[cont] = d;
                add = true;
            }
            cont++;
        }
        return add;
    }

    public boolean addRevista() {
        int cont = 0;
        boolean add = false;
        Revista r = new Revista(0, 0);

        while (!add && cont < this.alm.length) {
            if (this.alm[cont] == null) {
                r.rellenarRevista();
                this.alm[cont] = r;
                add = true;
            }
            cont++;
        }
        return add;
    }

    public Object buscarItem(int n) {
        Object itemDevo = null;
        int cont = 0;
        boolean encontrado = false;

        do {
            if (this.alm[cont] instanceof Libro) {
                Libro l = (Libro) this.alm[cont];
                if (l.numero == n) {
                    encontrado = true;
                    itemDevo = this.alm[cont];
                }
            }

            if (this.alm[cont] instanceof DVD) {
                DVD d = (DVD) this.alm[cont];
                if (d.numero == n) {
                    encontrado = true;
                    itemDevo = this.alm[cont];
                }
            }

            if (this.alm[cont] instanceof Revista) {
                Revista r = (Revista) this.alm[cont];
                if (r.numero == n) {
                    encontrado = true;
                    itemDevo = this.alm[cont];
                }
            }

            cont++;
        } while (!encontrado && cont < this.alm.length);

        return itemDevo;
    }

    public void mostrarListado() {

        for (int i = 0; i < this.alm.length; i++) {
            if (this.alm[i] != null) {
                System.out.println(this.alm[i]);
            }
        }
        System.out.println("");
    }

    public boolean eliminarItem(int n) {
        boolean del = false;
        int cont = 0;

        do {

            if (this.alm[cont] instanceof Libro) {
                Libro l = (Libro) this.alm[cont];
                if (l.getNumero() == n) {
                    del = true;
                    this.alm[cont] = null;
                }
            }
            if (this.alm[cont] instanceof DVD) {
                DVD d = (DVD) this.alm[cont];
                if (d.getNumero() == n) {
                    del = true;
                    this.alm[cont] = null;
                }
            }
            if (this.alm[cont] instanceof Revista) {
                Revista r = (Revista) this.alm[cont];
                if (r.getNumero() == n) {
                    del = true;
                    this.alm[cont] = null;
                }
            }
            cont++;
        } while (!del && cont < this.alm.length);

        return del;
    }
}
