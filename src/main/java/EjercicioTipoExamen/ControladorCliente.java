/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioTipoExamen;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T-107
 */

@RestController
@RequestMapping("/api")
@CrossOrigin

public class ControladorCliente {
    
    @Autowired RepositorioCliente repoMensa;
//Caso a) --> Buscar todos

    @GetMapping("/cliente")
    public List<Cliente>buscarTodos()
    {
        return repoMensa.findAll();
    }
    
    //Caso b) Buscar por id
    @GetMapping("/cliente/{id}")
    public Cliente buscarPorId(@PathVariable String id)
    {
       return  repoMensa.findById(id).get();
    }
    
    
    //Caso c) Guardar
    @PostMapping("/cliente")
    public Estatus guardar(@RequestBody String json)throws Exception{
    
        //Primero convertimos este string json a un objeto java
        ObjectMapper maper=new ObjectMapper();
       Cliente mensa = maper.readValue(json, Cliente.class);
       repoMensa.save(mensa);
        System.out.println("Este objeto se convirtio: "+mensa);
        Estatus estatus = new Estatus();
        estatus.setSuccess(true);
        estatus.setMensaje("Mensaje guardado con exito !!!");
        return estatus;
    }
    
    @PutMapping("/cliente")
    public Estatus actualizar(@RequestBody String json)throws Exception{
    
        //Primero convertimos este string json a un objeto java
        ObjectMapper maper=new ObjectMapper();
       Cliente mensa = maper.readValue(json, Cliente.class);
       repoMensa.save(mensa);
        System.out.println("Este objeto se convirtio: "+mensa);
        Estatus estatus = new Estatus();
        estatus.setSuccess(true);
        estatus.setMensaje("Mensaje guardado con exito !!!");
        return estatus;
    }
    
    //Caso e)Borrar
    
    @DeleteMapping("/cliente/{id}")
    public Estatus borrarPorId(@PathVariable String id){
            Cliente mensa=new Cliente();
            repoMensa.deleteById(id);
            Estatus e=new Estatus();
            e.setSuccess(true);
            e.setMensaje("Mensaje borrado con exito!!");
            return e;
    
    }

}
