/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.elementosmvc;

import java.time.LocalDate;
import org.springframework.data.annotation.Id;

/**
 *
 * @author T-107
 */

public class Mensaje {
    
    @Id
    private String id;
    private LocalDate fecha;

    public Mensaje(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    public Mensaje(String cuerpo) {
        this.cuerpo = cuerpo;
    }
    private String cuerpo;

    Mensaje(LocalDate fecha, String mi_primer_mensaje) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Mensaje() {
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
}
