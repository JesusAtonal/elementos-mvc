package unitec.elementosmvc;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElementosMvcApplication implements CommandLineRunner{

    @Autowired ServicioTarjeta servicio;
    @Autowired RepositorioMensaje repoMensaje;
    
	public static void main(String[] args) {
		SpringApplication.run(ElementosMvcApplication.class, args);
                
                
	}

    @Override
    public void run(String... args) throws Exception {
        // servicio.obtenerSaldo().obtenerSaldo();
         //LocalDate fecha=LocalDate.now();
         //repoMensaje.save(new Mensaje("hola",fecha,"cerdito"));
         
         //Buscar todos los mensajes ya 
         //for(Mensaje mensa: repoMensaje.findAll())
           //  System.out.println(mensa);
         
         //Buscar por Id
         //System.out.println(repoMensaje.findByCuerpo("cerdito"));
         
         //borrar
       //  Mensaje m= new Mensaje();
        // m.setId("hola");
         //repoMensaje.delete(m);
    }
}
