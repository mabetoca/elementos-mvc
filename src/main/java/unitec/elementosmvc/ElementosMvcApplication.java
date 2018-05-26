package unitec.elementosmvc;

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
     
        servicio.obtenerSaldo().obtenerSaldo();
        repoMensaje.save(new Mensaje("Mi primer mensaje"));
    }
}
