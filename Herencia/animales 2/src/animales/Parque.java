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
public class Parque {

    private Object sector[];

    public Parque(int tam) {
        this.sector = new Object[tam];
    }

    public void addAnimal() {
        int alea;
        int i=0;
        boolean colocado = false;
        
        while(i < this.sector.length && !colocado){
            alea = (int) (Math.random() * 3);
            if (this.sector[i] == null) {
                switch (alea) {
                    case 0:
                        this.sector[i] = new Gato();
                        colocado = true;
                        break;
                    case 1:
                        this.sector[i] = new Perro();
                        colocado = true;
                        break;
                    case 2:
                        this.sector[i] = new Elefante();
                        colocado=true;
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            i++;
        }
    }

    public void accionHabitual() {
        int alea;
        Perro p;
        Gato g;
        Elefante e;

        for (int i = 0; i < this.sector.length; i++) {
            alea = (int) (Math.random() * 3);

            if (this.sector[i] != null) {

                if (this.sector[i] instanceof Gato) {
                    g = (Gato) this.sector[i];
                    switch (alea) {
                        case 0:
                            g.comer();
                            break;
                        case 1:
                            g.dormir();
                            break;
                        case 2:
                            g.hacerRuido();
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
                if (this.sector[i] instanceof Perro) {
                    p = (Perro) this.sector[i];
                    switch (alea) {
                        case 0:
                            p.comer();
                            break;
                        case 1:
                            p.dormir();
                            break;
                        case 2:
                            p.hacerRuido();
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
                if (this.sector[i] instanceof Elefante) {
                    e = (Elefante) this.sector[i];
                    switch (alea) {
                        case 0:
                            e.comer();
                            break;
                        case 1:
                            e.dormir();
                            break;
                        case 2:
                            e.hacerRuido();
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
            }
        }
    }
    
    public void cambiarPosicion(){
        for (int i = 0; i <this.sector.length; i++) {
            if(this.sector[i]!=null){
                if(i -1 > 0){
                    if(this.sector[i-1]==null){
                        this.sector[i-1]= this.sector[i];
                    }
                    if(i + 1 < this.sector.length){
                        if(this.sector[i+1]==null){
                            this.sector[i+1] = this.sector[i];
                        }
                    }
                }
            }
        }
    }
    
    public void abandonarParque(){
        boolean quitado = false;
        int i = 0;
        
        while(!quitado && i < this.sector.length){
            if(this.sector[i]!=null){
                this.sector[i] = null;
                quitado =true;
            }
            i++;
        }
    }
    
}
