package seresVivos;

public class Planta extends SerVivo{
    public Planta(String nombre) {
        super(nombre);
    }
    public String alimentar() {
        return "por fotosintesis";
    }
}
