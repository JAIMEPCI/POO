package Publicidad;

public class PalomaMensajera extends Ave implements Mensajero{
    public PalomaMensajera(String nombre) {
        super(nombre);
    }
    public void volarRapido(){
        System.out.println(".....volando.....");
    }
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviar papelito con '" + mensaje+"'");
    }
}
