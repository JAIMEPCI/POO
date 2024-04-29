package Publicidad;

public class Celular extends Dispositivo implements Mensajero{
    public Celular(String referencia) {
        super(referencia);
    }
    public void llamar(){
        System.out.println("Llamando...");
    }
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviar MSN: '" + mensaje + "'");
    }
}
