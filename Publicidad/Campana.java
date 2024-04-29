package Publicidad;

import java.util.ArrayList;

public class Campana {
    private ArrayList<Mensajero> trabajadores;
    public Campana(){
        trabajadores = new ArrayList<Mensajero>();
    }
    public void agregarTrabajador(Mensajero m){
        trabajadores.add(m);
    }
    public void ejecutarCampana(String mensaje){
        for (Mensajero m : trabajadores){
            m.enviarMensaje(mensaje);
        }
    }
}
