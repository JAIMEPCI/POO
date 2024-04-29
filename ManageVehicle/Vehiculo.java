package ManageVehicle;
import java.io.Serializable;
public abstract class Vehiculo implements Serializable{
    protected String placa;
    protected int modelo;
    protected int precio;
    public Vehiculo(String placa, int modelo, int precio) {
        this.placa = placa;
        this.modelo = modelo;
        this.precio = precio;
    }
    public String toString() {
        return "placa='" + placa + '\'' +
                ", modelo=" + modelo +
                ", precio=" + precio;
    }
    public String getPlaca() {
        return placa;
    }
    public int getModelo() {
        return modelo;
    }
    public int getPrecio() {
        return precio;
    }
    public abstract int calcularValor();
}
