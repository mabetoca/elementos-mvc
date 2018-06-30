
package unitec.elementosmvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")  
@CrossOrigin 

public class ControladorPregunta {
    
    @Autowired RepositorioPregunta repoPreg;
    
    //Guardar Pregunta con opciones
    @PostMapping("/pregunta")
    public Estatus guardar(@RequestBody String json)throws Exception{
        
        ObjectMapper maper=new ObjectMapper();
        Pregunta mensa=maper.readValue(json, Pregunta.class);
        repoPreg.save(mensa);
        
        System.out.println("Este objeto se convirtio: "+ mensa);
        
        Estatus estatus= new Estatus();
        estatus.setSuccess(true);
        estatus.setMensaje("Mensaje guardado con exito!!!");
        
        return estatus;
        
    }
    
    //Buscar Todas Preguntas
    @GetMapping("/pregunta")
    public List<Pregunta> buscarTodos(){
        
        return repoPreg.findAll();
    }  
    
}
