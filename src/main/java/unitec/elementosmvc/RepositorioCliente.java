
package unitec.elementosmvc;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepositorioCliente extends MongoRepository<Cliente, String>{

    public Cliente findByNombre(String nombre);
  
}
