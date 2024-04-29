package seresVivos;
public class Carnivoro extends Animal{
    public Carnivoro(String nombre) {
        super(nombre);
    }
    public String alimentar(){
        return "de carne";
    }
    public String desplazar(){
        return "caminando";
    }
}
