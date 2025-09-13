
public class Consultorio {
    private String ubicacion;
    private int numero;

    public Consultorio(int numero, String ubicacion) {
        this.numero = numero;
        this.ubicacion = ubicacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }


    public String toString() {
        return "Consultorio[numero=" + numero + ", ubicacion=" + ubicacion + "]";
    }
}