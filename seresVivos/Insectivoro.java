package seresVivos;
public class Insectivoro extends Animal{
    public Insectivoro(String nombre) {
        super(nombre);
    }
    public String alimentar(){
        return "de insectos";
    }
    public String desplazar(){
        return "volando";
    }
}
