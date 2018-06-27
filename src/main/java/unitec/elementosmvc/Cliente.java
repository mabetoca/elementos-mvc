
package unitec.elementosmvc;

import unitec.elementosmvc.Tarjeta;


public class Cliente {
    
    private String id;
    private String nombre;
    private Tarjeta tarjeta;

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", tarjeta=" + tarjeta + '}';
    }

    public Cliente(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Cliente(String id) {
        this.id = id;
    }

    public Cliente(String nombre, Tarjeta tarjeta) {
        this.nombre = nombre;
        this.tarjeta = tarjeta;
    }

    public Cliente(String id, String nombre, Tarjeta tarjeta) {
        this.id = id;
        this.nombre = nombre;
        this.tarjeta = tarjeta;
    }

    public Cliente() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    
}
