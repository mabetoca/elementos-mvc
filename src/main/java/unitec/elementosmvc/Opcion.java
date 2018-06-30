
package unitec.elementosmvc;


public class Opcion {
    
    private String opcion;
    private boolean status;

    public Opcion(String opcion, boolean status) {
        this.opcion = opcion;
        this.status = status;
    }

    public Opcion() {
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
    
}
