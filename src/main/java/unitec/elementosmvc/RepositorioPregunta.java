
package unitec.elementosmvc;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepositorioPregunta extends MongoRepository<Pregunta, String>{
    
    public Pregunta findByPregunta(String pregunta);
    
}
