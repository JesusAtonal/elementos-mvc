/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioTipoExamen;

/**
 *
 * @author T-107
 */
public class Tarjeta_1 {
    
    private Integer numero;
    private float Saldo;
    private String nombre;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tarjeta_1(Integer numero, float Saldo, String nombre) {
        this.numero = numero;
        this.Saldo = Saldo;
        this.nombre = nombre;
    }
    
    
    
}
