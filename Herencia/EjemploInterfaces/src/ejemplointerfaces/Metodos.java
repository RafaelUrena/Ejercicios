/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerfaces;

/**
 *
 * @author faranzabe
 */
public interface Metodos {
    
    String NOMBRE="DAW1";
    public static final int VALOR = 10;
    
    public abstract void mostrar();
    public abstract void obligatorio(String cad);
    boolean loquesea();
}
