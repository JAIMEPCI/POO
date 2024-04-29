package ManageVehicle;

public class Van extends Vehiculo{
    public Van(String placa, int modelo, int precio) {
        super(placa, modelo, precio);
    }
    @Override
    public String toString() {
        return "\nVan {" +super.toString()+'}';
    }

    @Override
    public int calcularValor() {
        int a = precio;
        for (int i = 0; i < 2022 - modelo; i++) {
            a = (int) (a * 0.94f);
        }
        return a;
    }
}
