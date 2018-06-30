
package unitec.elementosmvc;
import unitec.elementosmvc.RepositorioCliente;
import com.fasterxml.jackson.databind.ObjectMapper;
//import ete.Cliente;

import java.util.ArrayList;
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


@RestController
@RequestMapping("/api")  //Raíz de los servicios
@CrossOrigin 

public class ControladorCliente {
    
    @Autowired RepositorioCliente repoClie;
    
    //Caso a) Buscar todos
    
    @GetMapping("/cliente")
    public List<Cliente> buscarTodos(){
        
        return repoClie.findAll();
    }  
    
    //Caso b) Buscar por id
    
    @GetMapping("/cliente/{id}") // {} --> Significa que usuario necesita introducir valor
    public Cliente buscarPorId(@PathVariable String id){ //String es tipo dato de id, id es id de arriba
        
        return repoClie.findById(id).get();
    }
    
    //Caso c) Guardar
    @PostMapping("/cliente")
    public Estatus guardar(@RequestBody String json)throws Exception{
        
        //Primero convertimos este String json a un objeto Java
        ObjectMapper maper=new ObjectMapper();
        Cliente mensa=maper.readValue(json, Cliente.class);
        repoClie.save(mensa);
        
        System.out.println("Este objeto se convirtio: "+ mensa);
        
        Estatus estatus= new Estatus();
        estatus.setSuccess(true);
        estatus.setMensaje("Mensaje guardado con exito!!!");
        
        return estatus;
        
    }
    
    // Caso d) Actualizar
    @PutMapping("/cliente")

    public Estatus actualizar(@RequestBody String json) throws Exception
    {
     //PRIMERO CONVETIMOS ESTE STRING JSON A UN OBJETO JAVA
        
        ObjectMapper map= new ObjectMapper();
        
        Cliente mens= map.readValue(json, Cliente.class);
        
        repoClie.save(mens);
        
        
        System.out.println("Este Objeto Se Convirtio: "+mens);
        
        Estatus est = new Estatus();
        
        est.setSuccess(true);
        est.setMensaje("Mensaje Actualizado Con Éxito");
        
        return est;
    }
    
    // Caso e) Borrar
    @DeleteMapping("/cliente/{id}")

    public Estatus borrarPorId(@PathVariable String id) throws Exception
    {
        Cliente clien=  new Cliente(); //mensa
        
        repoClie.deleteById(id);
        Estatus e = new Estatus();
        
        e.setSuccess(true);
        e.setMensaje("Mensaje Borrado Con Éxito");

        
        return e;
    }
    
    
    
}
