package seresVivos;
public abstract class SerVivo {
    protected String nombre;
    protected SerVivo(String nombre){
        this.nombre=nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public abstract String alimentar ();

}
