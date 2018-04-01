/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

/**
 *
 * @author faranzabe
 */
public class Conserje extends Comun {

    private int turno;

    @Override
    public void mostrar() {
        System.out.println("Esto es el mostrar del profesor");
    }

    @Override
    public void obligatorio(String cad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
