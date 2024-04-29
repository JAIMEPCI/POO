package ManageVehicle;

public class Autos extends Vehiculo{
    public Autos(String placa, int modelo, int precio) {
        super(placa, modelo, precio);
    }
    @Override
    public String toString() {
        return "\nAuto {" +super.toString()+'}';
    }

    @Override
    public int calcularValor() {
        int a = precio;
        for (int i = 0; i < 2022 - modelo; i++) {
            a = (int) (a * 0.90f);
        }
        return a;
    }
}
