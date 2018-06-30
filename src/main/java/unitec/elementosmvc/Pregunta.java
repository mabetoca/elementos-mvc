
package unitec.elementosmvc;

import java.util.*;

public class Pregunta {
    
    private String id;
    private String pregunta;
    private Opcion opciones;

    public Pregunta(String pregunta, Opcion opciones) {
        this.pregunta = pregunta;
        this.opciones = opciones;
    }

    public Pregunta(String id, String pregunta, Opcion opciones) {
        this.id = id;
        this.pregunta = pregunta;
        this.opciones = opciones;
    }

    public Pregunta() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public Opcion getOpciones() {
        return opciones;
    }

    public void setOpciones(Opcion opciones) {
        this.opciones = opciones;
    }

   
    
    
}
