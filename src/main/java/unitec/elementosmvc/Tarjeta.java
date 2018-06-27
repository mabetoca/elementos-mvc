
package unitec.elementosmvc;


public class Tarjeta {
    
    private int numero;
    private float saldo;
    private String nombre;

    public Tarjeta(float saldo, String nombre) {
        this.saldo = saldo;
        this.nombre = nombre;
    }

    public Tarjeta(String nombre) {
        this.nombre = nombre;
    }

    public Tarjeta(float saldo) {
        this.saldo = saldo;
    }

    public Tarjeta(int numero) {
        this.numero = numero;
    }

    public Tarjeta(int numero, float saldo, String nombre) {
        this.numero = numero;
        this.saldo = saldo;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "numero=" + numero + ", saldo=" + saldo + ", nombre=" + nombre + '}';
    }

    public Tarjeta() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
