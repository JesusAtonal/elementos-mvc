/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.elementosmvc;

/**
 *
 * @author campitos
 */
public class Credito implements Tarjeta{

    @Override
    public void obtenerSaldo() {
        System.out.println("TU saludo es de 40,000");
    }
    
}