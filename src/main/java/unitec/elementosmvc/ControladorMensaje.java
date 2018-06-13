
package unitec.elementosmvc;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class ControladorMensaje {
    
    @GetMapping("/hola")
    public String algo(){
        return "hola mundo desde un controlador";
    }
    
    
    
}
