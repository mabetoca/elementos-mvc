
package unitec.elementosmvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")  //Raíz de los servicios
@CrossOrigin             //Mantener origenes cruzados, app puede conectarse a otros servidores
public class ControladorMensaje {    //Clase controlador
    
    /*@GetMapping("/hola")
    public String algo(){
        return "hola mundo desde un controlador";
    }
    */
    
    @Autowired RepositorioMensaje repoMensa;
    
    //Caso a) Buscar todos
    
    @GetMapping("/mensaje")
    public List<Mensaje> buscarTodos(){
        
        return repoMensa.findAll();
    }  
    
    //Caso b) Buscar por id
    
    @GetMapping("/mensaje/{id}") // {} --> Significa que usuario necesita introducir valor
    public Mensaje buscarPorId(@PathVariable String id){ //String es tipo dato de id, id es id de arriba
        
        return repoMensa.findById(id).get();
    }
    
    //Caso c) Guardar
    @PostMapping("/mensaje")
    public Estatus guardar(@RequestBody String json)throws Exception{
        
        //Primero convertimos este String json a un objeto Java
        ObjectMapper maper=new ObjectMapper();
        Mensaje mensa=maper.readValue(json, Mensaje.class);
        repoMensa.save(mensa);
        
        System.out.println("Este objeto se convirtio: "+ mensa);
        
        Estatus estatus= new Estatus();
        estatus.setSuccess(true);
        estatus.setMensaje("Mensaje guardado con exito!!!");
        
        return estatus;
        
    }
    
}
