package Publicidad;

public class Dispositivo {
    String referencia;

    public Dispositivo(String referencia) {
        this.referencia = referencia;
    }
    public void encender(){
        System.out.println("Se encendio el dispositivo" + referencia);
    }
}
