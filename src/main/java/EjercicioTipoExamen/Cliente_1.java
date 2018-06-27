/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioTipoExamen;

import org.springframework.data.annotation.Id;

/**
 *
 * @author T-107
 */
public class Cliente_1 {
    @Id
    String Id;
    String nombre;
    Tarjeta tarjeta;
    
    @Override
    public String toString() {
        return "Cliente{" + "id=" + Id + ", Nombre=" + nombre + ", Tarjeta=" + tarjeta + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Cliente_1(String nombre, Tarjeta tarjeta) {
        this.nombre = nombre;
        this.tarjeta = tarjeta;
    }

    public Cliente_1() {
    }
    
    
}
