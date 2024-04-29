package seresVivos;
public abstract class Animal extends SerVivo {
    public Animal(String nombre) {
        super(nombre);
    }
    public abstract String alimentar();
    public abstract String desplazar();
}
