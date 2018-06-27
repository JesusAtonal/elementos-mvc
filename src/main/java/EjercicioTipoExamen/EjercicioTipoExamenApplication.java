package EjercicioTipoExamen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjercicioTipoExamenApplication implements CommandLineRunner{
    
    
    @Autowired RepositorioCliente repoCliente;

	public static void main(String[] args) {
		SpringApplication.run(EjercicioTipoExamenApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
       
    }
}
