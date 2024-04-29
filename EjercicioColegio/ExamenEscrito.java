package EjercicioColegio;

public class ExamenEscrito extends Examen{
    float nota;
    public ExamenEscrito(String titulo, String fecha,float nota) {
        super(titulo, fecha);
        this.nota=nota;
    }

    public boolean aprobo() {
        return nota >= 3;
    }
    public String toString() {
        return "ExamenEscrito{" +
                "titulo='" + titulo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", nota=" + nota +
                "} ";
    }
}
