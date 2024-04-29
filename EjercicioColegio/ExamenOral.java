package EjercicioColegio;
public class ExamenOral extends Examen{
    int tiempo;
    public ExamenOral(String titulo, String fecha,int tiempo) {
        super(titulo, fecha);
        this.tiempo=tiempo;
    }
    public boolean aprobo() {
        return tiempo <= 70;
    }
    public String toString() {
        return "ExamenOral{" +
                "titulo='" + titulo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", tiempo=" + tiempo +
                "} ";
    }
}
