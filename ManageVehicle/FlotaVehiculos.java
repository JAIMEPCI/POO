package ManageVehicle;
import java.io.Serializable;
import java.util.ArrayList;
public class FlotaVehiculos implements Serializable {
    private ArrayList<Vehiculo> flota;

    public FlotaVehiculos() {
        flota = new ArrayList<Vehiculo>();

    }
    public void agregarAuto(String pl,int m,int pr){
        flota.add(new Autos(pl,m,pr));
    }
    public void agregarVan(String pl,int m,int pr){
        flota.add(new Van(pl,m,pr));
    }
    public int costoFlota(){
        int a=0;
        for (Vehiculo i : flota) {
            a = a + i.calcularValor();
        }
        return a;
    }
    public String listado(){
        String a="El listado es: ";
        for (Vehiculo i : flota) {
            a = a + i.toString();
        }
        return a;
    }

    public String toString() {
        return "FlotaVehiculos{" +
                "flota=" + flota +
                '}';
    }
}
